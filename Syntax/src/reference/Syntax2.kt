package reference

fun main(args: Array<String>) {
    val people1: People = generatePeople()
    people1.age = 56454

    /*
    val people2: People = null
    println(people2.name) //NullPointerException
    */

    //Option
    val people3: People? = null

    //Elvis operator
    println(people3?.name)

    //Elvis "else"
    val name: String = people3?.name ?: "default name"

    //Smart cast
    if(people3 is People) {
        val age = people3.age //Here, people3 has the type People and not People?
    }

    /* Java 8 Optional
    if(people3.isPresent()) {
        People safePeople = people3.get()
        safePeople.getAge()...
    }
    */


    //Functional programming
    val serie = 1..7
    serie.map {  }
}
