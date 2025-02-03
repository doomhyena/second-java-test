import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int rekord = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jatszik = true;

        rekord = betoltRekord();
        System.out.println("Jelenlegi rekord: " + rekord + " sikeres feladat.");

        System.out.println("Hány játékos szeretne játszani? (1 vagy 2):");
        int jatekosSzam = scanner.nextInt();
        scanner.nextLine();

        String[] jatekosok = new String[jatekosSzam];
        int[] pontszamok = new int[jatekosSzam];

        for (int i = 0; i < jatekosSzam; i++) {
            System.out.println("Add meg a(z) " + (i + 1) + ". játékos nevét:");
            jatekosok[i] = scanner.nextLine();
        }

        while (jatszik) {
            for (int jatekosIndex = 0; jatekosIndex < jatekosSzam; jatekosIndex++) {
                System.out.println("Játékos: " + jatekosok[jatekosIndex]);

                System.out.println("Válassz egy nehézségi szintet:");
                System.out.println("1. Könnyű (számok 1-10 között)");
                System.out.println("2. Közepes (számok 1-20 között)");
                System.out.println("3. Nehéz (számok 1-50 között)");

                int nehezsegiSzint = scanner.nextInt();
                int felsoHatar = 10;

                switch (nehezsegiSzint) {
                    case 1:
                        felsoHatar = 10;
                        break;
                    case 2:
                        felsoHatar = 20;
                        break;
                    case 3:
                        felsoHatar = 50;
                        break;
                    default:
                        System.out.println("Érvénytelen szint, alapértelmezett: Könnyű.");
                }

                System.out.println("Válassz egy opciót:");
                System.out.println("1. Szorzás");
                System.out.println("2. Osztás");
                System.out.println("3. Összeadás");
                System.out.println("4. Kivonás");
                System.out.println("5. Kilépés");

                int valasztas = scanner.nextInt();
                if (valasztas == 5) {
                    System.out.println("Kilépés a játékból. Viszlát!");
                    jatszik = false;
                    break;
                }

                int sikeresFeladatok = 0;

                while (true) {
                    int szam1 = random.nextInt(felsoHatar) + 1;
                    int szam2 = random.nextInt(felsoHatar) + 1;
                    int helyesValasz = 0;

                    switch (valasztas) {
                        case 1:
                            helyesValasz = szam1 * szam2;
                            System.out.printf("%d * %d = ", szam1, szam2);
                            break;
                        case 2:
                            if (szam2 == 0) szam2 = 1;
                            helyesValasz = szam1 / szam2;
                            System.out.printf("%d / %d = ", szam1, szam2);
                            break;
                        case 3:
                            helyesValasz = szam1 + szam2;
                            System.out.printf("%d + %d = ", szam1, szam2);
                            break;
                        case 4:
                            helyesValasz = szam1 - szam2;
                            System.out.printf("%d - %d = ", szam1, szam2);
                            break;
                        default:
                            System.out.println("Érvénytelen választás.");
                            continue;
                    }

                    int felhasznaloValasz = scanner.nextInt();
                    if (felhasznaloValasz == helyesValasz) {
                        sikeresFeladatok++;
                        pontszamok[jatekosIndex]++;

                        if (sikeresFeladatok % 5 == 0) {
                            System.out.println("Gratulálunk! Eddig " + sikeresFeladatok + " feladatot sikeresen megoldottál!");
                        }
                    } else {
                        System.out.println("Elrontottad! Sikeresen megoldott feladatok: " + sikeresFeladatok);
                        if (sikeresFeladatok > rekord) {
                            rekord = sikeresFeladatok;
                            mentRekord(rekord);
                        }

                        System.out.println("Szeretnél kilépni a programból? (i/n)");
                        String valasz = scanner.next();
                        if (valasz.equalsIgnoreCase("i")) {
                            System.out.println("Kilépés a játékból. Viszlát!");
                            jatszik = false;
                        } else {
                            System.out.println("Visszatérés a főmenühöz.");
                        }
                        break;
                    }
                }

                if (!jatszik) break;
            }
        }

        System.out.println("Játék vége! Eredmények:");
        for (int i = 0; i < jatekosSzam; i++) {
            System.out.println(jatekosok[i] + ": " + pontszamok[i] + " pont");
        }

        scanner.close();
    }

    private static void mentRekord(int rekord) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rekord.txt"))) {
            writer.write("Rekord feladatok száma: " + rekord);
        } catch (IOException e) {
            System.out.println("Hiba a rekord mentésekor.");
        }
    }

    private static int betoltRekord() {
        try (BufferedReader reader = new BufferedReader(new FileReader("rekord.txt"))) {
            String sor = reader.readLine();
            if (sor != null && sor.startsWith("Rekord feladatok száma: ")) {
                return Integer.parseInt(sor.replace("Rekord feladatok száma: ", ""));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Hiba a rekord betöltésekor, alapértelmezett rekord: 0.");
        }
        return 0;
    }
}