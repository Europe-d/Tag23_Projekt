import kotlin.random.Random

fun main() {
    val computerGuess = Random.nextInt(1, 100)


    println("bitte geben sie ein nummer :")
    var antwort = readln()



    if (antwort < computerGuess.toString()) {
        println("Zu klein!")
    }

    if (antwort > computerGuess.toString()) {
        println("zu groß")
    } else {
        antwort != computerGuess.toString()
        println("Du hast gewonnen!")
    }
    return main()
}

