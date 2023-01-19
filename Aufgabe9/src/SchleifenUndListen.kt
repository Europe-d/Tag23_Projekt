fun main() {
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")


    for (i in satz.reversed())
        print(i)
println()

   for (i in satz.size-2 downTo 0 step 2){
        print(satz[i])
   }
println()

    for (i in satz.size-1 downTo 3){
        print(satz[i])
    }

}

//ist sehr Tag
//Heute ist ein