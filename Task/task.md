**Matematikai Feladatjáték Java Nyelven**

**Feladatleírás:**
Készíts egy Java alapú matematikai játékot, amelyben a játékosok különböző nehézségi szinteken és műveletekben próbálhatják ki tudásukat. A játék célja minél több helyes választ adni, miközben a rendszer rögzíti a legjobb eredményt.

**Funkciók:**
1. **Játékosok száma:** A játék lehet egyjátékos vagy kétjátékos módú.
2. **Nehézségi szintek:** A játékos kiválaszthatja a következő nehézségi szintek egyikét:
   - Könnyű (1-10 közötti számok)
   - Közepes (1-20 közötti számok)
   - Nehéz (1-50 közötti számok)
3. **Matematikai műveletek:** A játékos eldöntheti, melyik művelettel kíván játszani:
   - Szorzás
   - Osztás
   - Összeadás
   - Kivonás
   - Kilépés
4. **Játékmenet:**
   - A rendszer generál két véletlenszámot a választott nehézségi szinten belül.
   - A kiválasztott művelet alapján létrehoz egy matematikai feladatot.
   - A játékos beírja a választ, és a program ellenőrzi a helyességet.
   - Helyes válasz esetén növeli a pontszámot és folytatódik a játék.
   - Ha a játékos elhibáz egy választ, lehetősége van kilépni vagy folytatni a játékot.
5. **Pontszám és rekord:**
   - A játék rögzíti az elért eredményt minden játékos számára.
   - Ha egy játékos túlszárnyalja az eddigi rekordot, az új rekordot elmenti egy fájlba („rekord.txt”).
   - A program a futtatás kezdetekor beolvassa a korábbi rekordot.
6. **Játék vége:**
   - A játék végén az elért eredmények kiírásra kerülnek.

**Elvárt működés:**
A program egy interaktív konzolos játék legyen, amely folyamatosan generál feladatokat, amíg a játékos helyes válaszokat ad vagy el nem ront egyet. A játékosok pontszáma és rekordja mentésre kerül, hogy újraindítás után is elérhető legyen.

**Osztályzás**

| Százalékolás | Jegy |
|----------|----------|
| 80-100%   | Jeles (5)   |
| 60-79%   | Jó (4)   |
| 40-59   | Közepes (3)   |
| 25-39%   | Elégséges (2)   |
| 0-24%   | Elégtelen (1)   |
