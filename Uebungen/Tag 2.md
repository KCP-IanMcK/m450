# Übung 1
|Nr |        Testfall         | Erwartetes Ergebnis|
|---|-------------------------|--------------------|
| 1 |      Preis < 15'000     | Rabatt = 0%        |
| 2 | 15'000 <= Preis < 20'000| Rabatt = 5%        |
| 3 |20'000 <= Preis < 25'0000| Rabatt = 7%        |
| 4 |    25'000 <= Preis      | Rabatt = 8.5%      |

|Nr | Testfall                | Erwartetes Ergebnis |
|---|-------------------------|---------------------|
| 1 | Preis = 14'999          | Preis = 14'999      |
| 2 | Preis = 19'999          | Preis = 18'999.05   |
| 3 | Preis = 24'999          | Preis = 23'249.07   |
| 4 | Preis = 25'000          | Preis = 22'875      |

# Übung 2
|Nr | Beschreibung          | Erwartetes Resultat  | Effektives Resultat | Status | Mögliche Ursache |
|---|-----------------------|----------------------|---------------------|--------|------------------|
| 1 | Datum auswahl ist möglich | Beim Klick auf das Datum, wird es eingefügt | Das Datum wird eingefügt | Funktioniert | - |
