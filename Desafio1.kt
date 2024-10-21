// Desafio 1 :
abstract class Animal(val name:String){
    abstract fun makeSound():String
}
class Dog(name: String):Animal(name){
    override fun makeSound():String {
        return("Woof!")
    }
}
class Cat(name:String):Animal(name){
    override fun makeSound():String {
        return ("Meow!")
    }
}
fun animalSounds(input: List<Animal>){
    for(animal in input){
        println(animal.makeSound())
    }
}
fun main(){
    var cachorro = Dog("Cachorro")
    var gato = Cat("Gato")
    var input: List<Animal> = listOf(cachorro,gato)
    animalSounds(input)
}
