package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")

    }
    // Outra forma de fazer, sem precisar nomear o elemento.
//    ClienteTipo.values().forEach {
//        println("${it.name} - $it")
//    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}