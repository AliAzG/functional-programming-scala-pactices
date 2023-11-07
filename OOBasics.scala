class Person(val name: String, age: Int) {
    val allCaps = name.toUpperCase()

    def greet(name: String): String =
    s"${this.name} says: Hi, $name"
}

val aPerson = new Person("Ali", 29)
val ali = aPerson.name
val caps = aPerson.allCaps
val sayshi = aPerson.greet("Gholi")

println(ali, caps, sayshi) // (Ali,ALI,Ali says: Hi, Gholi)