/*
Schreibe hier deine Antwort hin.
am anfang ich habe gedacht dann rechnen ab trauben bis zitrone raus aber hier steht lieblingsfrucht ist ädert
und ich habe nicht verstanden warum benutzen wir die liste for mit 3 downto 0 wenn wir die unsere liste ädert wollen
 */

fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "Erdbeere"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Banane") {
            lieblingsFrucht = "Banane"
        }
    }
    println(lieblingsFrucht)
}