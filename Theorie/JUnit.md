# JUnit Features
## @Test
Kennzeichnet eine Methode als Testfall.

```java
@Test
void testAddition() {
  assertEquals(4, 2 + 2);
}
```
## Assertions
Stellt sicher, dass erwartete und tatsächliche Werte übereinstimmen.

```java
@Test
void test() {
  assertEquals(1, 1);
  assertTrue(true);
  assertFalse(false);
  assertNull(null);
  assertThrows(Exception.class, () -> {
  throw new Exception("");
  });
}
```
## @BeforeEach, @BeforeAll
Führt Vorbereitungsaufgaben für die Nachfolgenden Tests aus. Zb. Initialisierung von Variablen.

```java
var i;
var counter;

@BeforeAll
void setUp() {
  i = 1;
}

@BeforeEach
void setUpEach() {
  counter = 0;
}
```
## @AfterEach, @AfterAll
Führt Nachbearbeitung für vorangegangene Tests durch. "Räumt auf"

```java
@AfterEach
void tearDown() {
  db.disconnect();
}

@AfterAll
void tearDownAll() {
  connection.close();
}
```
## @DisplayName
Ändert den Anzeigename eines Tests

```java
@DisplayName("Teste Addition mit positiven Zahlen")
@Test
void testAddition() {
  assertEquals(2, 1 + 1);
}
```
## @ParameterizedTest
Führt einen Test mit verschiedenen Parameterns aus.

```java
@ParameterizedTest
@ValueSource(ints = {1, 2, 3})
void testWithParams(int input) {
    assertTrue(input > 0);
}
```
