import java.text.DecimalFormat

fun main() {

    fun Atividade1() {
        class Pessoa(val nome: String, val idade: Int, val altura: Double, val estudante: Boolean)

        val pessoa1 = Pessoa("Guilherme", 19, 1.70, true)
        val pessoa2 = Pessoa("Emer", 19, 1.70, true)

        fun somaidade(): Int {
            return pessoa1.idade + pessoa2.idade
        }

        fun fatorarAltura(): String {
            return ("${pessoa1.altura * 2}m")
        }

        fun saudacao(): String {
            return ("Olá ${pessoa1.nome} e ${pessoa2.nome}")
        }

        fun impressoes() {
            println(saudacao())
            println("Nomes: ${pessoa1.nome} e ${pessoa2.nome}")
            println("Alturas: ${pessoa1.altura} e ${pessoa2.altura}")
            println("Idades: ${pessoa1.idade} e ${pessoa2.idade}")
            println("São estudantes: ${pessoa1.estudante} e ${pessoa2.estudante}")
            println("Soma das Idades: ${somaidade()}")
            println("Altura Dobrada: ${fatorarAltura()}")
        }
        impressoes()
    }

    Atividade1()

    println("")
}

