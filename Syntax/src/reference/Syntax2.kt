package reference

fun main(args: Array<String>) {
    val people1: People = generatePeople()
    people1.age = 50

    /*
    val people2: People = null
    println(people2.name) //Would throw NullPointerException in Java
    */

    //Option
    val people3: People? = null

    //Elvis operator
    println(people3?.name)

    //Elvis "else"
    val name: String = people3?.name ?: "default name"

    //Smart cast
    if (people3 is People) {
        val age = people3.age //Here, people3 has the type People and not People?
    }

    /* Java 8 Optional
    if(people3.isPresent()) {
        People safePeople = people3.get()
        safePeople.getAge()...
    }
    */


    //Functional programming
    val languages = listOf("Java", "Scala", "Kotlin")
    languages.forEach { language -> println(language) }
    languages.forEach { println(it) }

    println(languages.map { it.get(0) })
    println(languages.filter { it.toLowerCase().contains("k") })

    //Extensions
    println(generatePeople().toJson())
    println((1..10).map { it.isEven() })


    val result: Integer? = try {
        throw Exception("There is an error")
    } catch(e: Exception) {
        println("[ERROR] $e")
        null
    }

    repeat(3) { println("Kotlin is the best!")}
}

//Extensions
fun Int.isEven() = this % 2 == 0
fun People.toJson(): String = "{ name: ${this.name}, age: ${this.age} }"

fun <A, B> repeat(job: (A) -> B, times: Int) {
    (1..times).forEach { job }
}
