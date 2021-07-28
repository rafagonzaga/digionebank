package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Rafael"
    var cpf: String = "300.713.318-16"
}

fun main() {
    val rafael = Pessoa()

    println(rafael.name)
    println(rafael.cpf)
}