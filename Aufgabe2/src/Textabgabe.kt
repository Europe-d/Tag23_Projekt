/*
Schreibe hier deine Antwort hin.
 komm auf die consola das println mit text plus i wo das jede komm mit name uns stelle
 */


fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}