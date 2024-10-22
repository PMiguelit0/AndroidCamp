class BankAccount(private var balance:Double, var accountHolder:String = ""){
    fun deposit(amount:Double){
        if(amount>0){
            println("Voce depositou o total de  ${amount} no seu banco")
            println("Saldo de:${balance+amount}")
            balance+=amount
        }else{
            println("Digite um valor valido")
        }
    }
    fun withdraw(amount: Double){
        if(amount<balance && amount>0.0){
            println("Voce retirou ${amount} do seu banco")
            println("Saldo restante de:${balance-amount}")
            balance-=amount
        }else{
            println("Saldo insuficiente ou valor invalido, tente outro valor")
        }
    }
    fun consultar_saldo(){
        println("Saldo de:${balance}")

    }
}
fun main(){
    val Pedro:BankAccount = BankAccount(1000.0,"Pedro")
    Pedro.consultar_saldo()
    Pedro.withdraw(900.0)
    Pedro.withdraw(-3.0)
    Pedro.deposit(-300.0)

}
