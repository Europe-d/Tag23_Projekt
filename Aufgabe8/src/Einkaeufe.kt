var shoppingList: MutableList<String> = mutableListOf(
    "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
    "Zitronen", "Eis", "Erdbeeren", "Torte"
)


fun main() {


    for (j in 0..shoppingList.size - 1) {
        println("$j." + "${shoppingList[j]}")
    }


}