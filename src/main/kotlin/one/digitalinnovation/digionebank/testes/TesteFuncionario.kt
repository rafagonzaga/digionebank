package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val rafael = Pessoa(nome="Rafael Gonzaga", cpf="30071331816")
    println(rafael.nome)
    println(rafael.cpf)

    val joao = Funcionario("Rafael Gonzaga", "30071331816", BigDecimal.valueOf(2500.00))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}