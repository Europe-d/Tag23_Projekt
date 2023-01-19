/*
Schreibe hier deine Antwort hin.
wir haben ein list mit string als name erstellen  und ist  5 element und weil wir möchte richtig die nummer lessen
 muss wir -1 dazu geben und incht nur 0..5 weil er zehlen nicht alles und dann
  wie sagen in diese liste muss raus komm alle in die liste mit name lucas keanu und michael muss raus komm mit diese printli

  ich möchte geben eine else von die reste die nicht da ist aber hat nicht geklappt und dann habe ich mit if versuche
  hier meine fähler war wo komma gegeben und nicht || oder ..
 */

fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
        if (guests[i]  == "Paul"|| guests[i]  == "Hans"|| guests[i]  == "Marko")
            println("sind  nicht da")
        }


    }
