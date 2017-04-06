package reference

fun main(args: Array<String>) {
    //Val
    val language: String = "Kotlin"

    //Type inference
    val language2 = "Kotlin"

    //Immutability
    val javaVersion = 8
    //javaVersion = 9

    //Var
    var newJavaVersion = 8
    newJavaVersion = 9

    //println and syntax sugar
    println("Tonight language is " + language + "!")
    println("Tonight language is $language, and next version of java is $newJavaVersion!")

    //Immutable collections
    val list: List<Int> = listOf(0, 1, 12)
    val set: Set<Int> = hashSetOf(1, 5, 7, 7)
    val map: Map<Int, Boolean> = hashMapOf(5 to false, 12 to true)

    //Mutable collections
    val mutableList: MutableList<String> = mutableListOf("Scala", "Groovy")

    mutableList.add("Kotlin")
    mutableList.remove("Scala")
    println(mutableList)

    val luxembourg = City("Luxembourg", listOf("John", "Alfred"))
    println(luxembourg.getSummary())
    //luxembourg.name = "Leudelange"

    val john = People("John", 30)
    john.age++
    println(john)

    //Destructuring
    val (name, age) = john
    println("$name $age")

    PeopleSingleton.getPredefinedPeople()

    //Possibility to refactor the reference.City class with List<reference.People>

    //Naming parameter
    val newPeople: People = generatePeople(age = 40)
}


fun sayHello(name: String) {
    println("Hello $name")
}

//Pattern matching
fun fibonnaci(n: Int): Int = when (n) {
    0, 1 -> 0
    else -> fibonnaci(n - 1) + fibonnaci(n - 2)
}

//Simple class
class City(val name: String, val people: List<String>) {
    fun getSummary() = "Here in the city of $name, we are ${people.size} people."
}

//Data class, implements: toString, equals/hashCode, copy, componentN functions
data class People(val name: String, var age: Int)

//Object
object PeopleSingleton {
    fun getPredefinedPeople() = listOf(
            People("John", 30),
            People("Alfred", 40)
    )
}

//Default parameters
fun generatePeople(name: String = "John", age: Int = 30) = People(name, age)