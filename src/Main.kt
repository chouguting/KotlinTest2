fun main() {
    println("Hello World!")
    var a = 6;
    val b =7;
    b.printWithAAAA()

    println("$a + $b = ${a+b}")
    val animal = Animal("Billy", 70)
    animal.walk()
    animal.shout()
    animal.shout2()
    animal.name = "Bobby"
    animal.walk()
    Utils.printWithAAAA("Hello")
    val myName = "John"
    myName.printWithAAAA()

    val dog = when(a){
        5 -> "S"
        6 -> "M"
        else -> "T"
    }
    

    val myList = ArrayList<String>()
    myList.add("A")
    myList.add("B")
    myList.add("C")

    for(i in myList){
        println(i)
    }

    for(i in 1..<10){
        println(i)
    }

}

class Dog(var name:String = "");


class Animal(var name: String = "Animal", age:Int = 10) {

    init {
        if(age > 50){
            name = "Old $name"
        }
    }


    fun walk(): Int {
        println("$name is walking")
        return 0
    }

    fun shout(text:String = "AAAAAAAAAAA"): String {
        println("$name is shouting $text")
        return ""
    }

    fun shout2() = println("$name is shouting AAAAAAAAAAA")

}

class Utils {
    companion object {
        fun printWithAAAA(text: String) {
            println("AAAAAAAAAA $text AAAAAAAAAA")
        }
    }
}

fun String.printWithAAAA() {
    println("AAAAAAAAAA $this AAAAAAAAAA")
}

fun Int.printWithAAAA() {
    println("AAAAAAAAAA $this AAAAAAAAAA")
}




