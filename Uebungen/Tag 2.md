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
| 2 | Alle Suchfelder müssen ausgefüllt sein | Wenn nicht alle Suchfelder eingegeben sind, wird darauf hingewiesen | Eine Meldung erscheint | Funktioniert | - |
| 3 | Wenn alle Felder ausgefüllt sind, kann man suchen | Man kann suchen | Es findet Resultate | Funktioniert | - |
| 4 | Wenn zuerst das Datum und dann der Ort eingegeben wird, bleibt das Datum gespeichert | Das Datum muss nicht zweimal eingegeben werden | Das Datum wird gelöscht | Fehler | Durch das automatische Wechseln zum nächsten Feld, wird es zurüchgesetzt |
| 5 | Man kann Details zum Auto anschauen | Beim Klick auf ein Auto werden dessen Details angezeigt | Es erscheint ein Popup mit Details | Funktioniert | - |

# Übung 3
## Blackbox Testing
|Nr | Beschreibung | Erwartetes Resultat | Effektives Resultat | Status |
|---|--------------|---------------------|---------------------|--------|
| 1 | Das Programm ist ausführbar | Das Programm startet | Das Programm startet | Funktioniert |
| 2 | Man kann alle Konten ansehen | Bei Eingabe von "a" werden alle Konten angezeigt | Alle Konten werden angezeigt | Funktioniert |
| 3 | Man kann den Wechselkurs abfragen | Bei Eingabe von "w" (und den Währungen) wird der Wechselkurs angezeigt | Der Wechselkurs wird angezeigt | Funktioniert |
| 4 | Man kann das Programm beenden | Bei Eingabe von "q" wird das Programm beendet | Das Programm wird beendet | Funktioniert |
| 5 | Man kann ein Konto bearbeiten | Bei Eingabe von "1" wird das entsprechende Konto angezeigt und man verschiedene Bearbeitungsoptionen | Das Konto wird angezeigt und die Optionen erscheinen |

## Whitebox Testing
