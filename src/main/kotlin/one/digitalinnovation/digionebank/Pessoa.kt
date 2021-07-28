package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Rafael"
     var cpf: String = "300.713.318-16"
    private set


//    inner class Endereco {
//        var rua: String = "Rua Teste"
//    }

}

fun main() {
    val rafael = Pessoa()
//    rafael.cpf = "4567"

    println(rafael.name)
    println(rafael.cpf)

//    println(rafael.Endereco().rua)
}