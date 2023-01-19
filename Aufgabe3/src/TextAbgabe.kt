/*
Schreibe hier deine Antwort hin.
der fragt am day (das heist samstag oder sonntag wenn ist dann komm raus "am $day hab ich frei."

wenn nicht weil Mitwoch ist zubeispiel dann komm else muss ich arbeiten
 */


fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}