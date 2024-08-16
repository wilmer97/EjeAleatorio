import kotlin.random.Random

fun main() {

    //Lanzamiento de moneda

    val resultados = mutableListOf<String>()
    val random = java.util.Random()

    for (i in 1..20) {
        val lanzamiento = if (random.nextBoolean()) "Cara" else "Cruz"
        resultados.add(lanzamiento)
    }

    println("Resultados de los 20 lanzamientos:")
    resultados.forEachIndexed { index, resultado ->
        println("Lanzamiento ${index + 1}: $resultado")
    }
}
