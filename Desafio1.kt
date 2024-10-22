// Classe base abstrata Animal
abstract class Animal(val name: String) {
    // Método abstrato
    abstract fun makeSound()
}

// Classe filha Dog que herda de Animal
class Dog(name: String) : Animal(name) {
    // Sobrescrevendo o método makeSound
    override fun makeSound() {
        println("Woof!")
    }
}

// Classe filha Cat que herda de Animal
class Cat(name: String) : Animal(name) {
    // Sobrescrevendo o método makeSound
    override fun makeSound() {
        println("Meow!")
    }
}

// Função para invocar o método makeSound de uma lista de animais
fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        animal.makeSound()
    }
}

// Exemplo de uso
fun main() {
    val animals = listOf(Dog("Rex"), Cat("Whiskers"))
    animalSounds(animals)
}
