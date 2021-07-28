package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("Digione", 12)


    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy("Banco do Brasil", 1)

    println(banco2.info())
}