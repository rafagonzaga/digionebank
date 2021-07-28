package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Rafael"
     var cpf: String = "300.713.318-16"
    private set

//    constructor()

    fun pessoaInfo() = "$name e $cpf"
}

fun main() {
    val rafael = Pessoa()

    println(rafael.pessoaInfo())
}