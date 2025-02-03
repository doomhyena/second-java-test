# Matematikai Játék Program

## Áttekintés
Ez a Java program egy interaktív matematikai játék, amely támogatja az egy- vagy kétjátékos módot. A játék során a felhasználók különböző nehézségi szinteken választhatnak matematikai műveleteket, és próbára tehetik tudásukat. A program nyomon követi a rekordot (a legtöbb sikeresen megoldott feladatot), amelyet fájlban tárol.

---

## Funkciók
### 1. **Játék indítása**
- A program betölti a korábban elért rekordot egy fájlból (`rekord.txt`), ha elérhető.
- A játékosok száma megadható: 1 vagy 2.
- A játékosok nevét a program bekéri.

### 2. **Matematikai feladatok**
A játékosok kiválaszthatják:
- A nehézségi szintet:
    - Könnyű: 1–10 közötti számok.
    - Közepes: 1–20 közötti számok.
    - Nehéz: 1–50 közötti számok.
- A művelet típusát:
    - Szorzás
    - Osztás
    - Összeadás
    - Kivonás

### 3. **Rekordok kezelése**
- A sikeresen megoldott feladatok számát a program nyomon követi.
- Ha a játékos új rekordot ér el, a program menti azt a `rekord.txt` fájlba.

### 4. **Kilépési lehetőségek**
- A játékos bármikor kiléphet a játékból a menüből.
- Helytelen válasz után lehetőség van folytatni vagy kilépni.

---

## Fájlkezelés
### **Rekord mentése**
- A `mentRekord(int rekord)` metódus egy fájlba menti a rekordot.
- A fájl neve: `rekord.txt`.

### **Rekord betöltése**
- A `betoltRekord()` metódus megkísérli beolvasni a rekordot a fájlból.
- Ha a fájl nem létezik vagy hibás, az alapértelmezett rekord 0.

---

## Főbb osztályok és metódusok
### **Main osztály**
A fő osztály tartalmazza a program belépési pontját és a játékmenet logikáját.

#### `public static void main(String[] args)`
A program belépési pontja:
1. Betölti a rekordot.
2. Bekéri a játékosok nevét.
3. Interaktív játékmenetet biztosít.
4. A végén kiírja az eredményeket.

#### `private static void mentRekord(int rekord)`
Mentési funkció:
- Fájlba írja a rekordot.

#### `private static int betoltRekord()`
Betöltési funkció:
- Beolvassa a rekordot a fájlból.

---

## Hibakezelés
- **Rekord fájlkezelés**: Hiba esetén alapértelmezett értékek kerülnek használatra.
- **Input érvényesség**: A program alapértelmezett értékeket használ érvénytelen bemenet esetén (pl. érvénytelen nehézségi szint).

---

## Játékos élmény
- A játék folyamatos visszajelzést ad a játékosok teljesítményéről.
- Helytelen válasz esetén lehetőség van a játék folytatására vagy kilépésre.
- Többjátékos módban a játékosok felváltva játszanak, és a pontszámaik összehasonlíthatók.

---

## Példafutás
1. A játék indításakor a program kiírja az aktuális rekordot.
2. A játékos kiválasztja a nehézségi szintet és a műveletet.
3. A feladatokat megoldva a program nyomon követi a helyes válaszok számát.
4. Rekorddöntés esetén a program menti az új rekordot.
5. A játék végén az eredmények kiírásra kerülnek.

---

## Fejlesztési javaslatok
- További nehézségi szintek és műveletek bevezetése.
- Grafikus felhasználói felület (GUI) kialakítása.
- Online többjátékos mód támogatása.
- Statisztikák részletesebb mentése (pl. dátum, pontszámok).

---

## Futtatási követelmények
- Java Runtime Environment (JRE) telepítése.
- A `rekord.txt` fájl írási engedéllyel rendelkező könyvtárban.

