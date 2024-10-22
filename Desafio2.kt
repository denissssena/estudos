class BankAccount(private var balance: Double, val accountHolder: String) {

    // Getter personalizado para balance
    fun getBalance(): Double {
        return balance
    }

    // Método para depositar um valor
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Depósito de R$$amount realizado com sucesso! Novo saldo: R$$balance")
        } else {
            println("Valor de depósito inválido.")
        }
    }

    // Método para sacar um valor
    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Saldo insuficiente para saque.")
        } else if (amount > 0) {
            balance -= amount
            println("Saque de R$$amount realizado com sucesso! Novo saldo: R$$balance")
        } else {
            println("Valor de saque inválido.")
        }
    }
}

// Exemplo de uso
fun main() {
    val account = BankAccount(1000.0, "João Silva")

    // Consultando o saldo
    println("Saldo inicial: R$${account.getBalance()}")

    // Realizando depósitos e saques
    account.deposit(500.0)
    account.withdraw(300.0)
    account.withdraw(1500.0)  // Tentativa de saque inválida
}
