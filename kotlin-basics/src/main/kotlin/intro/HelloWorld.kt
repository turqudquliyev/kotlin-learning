package intro

fun main() {
    println(sayHello("Turqud"))
    println(sayHello(""))
}

fun sayHello(name: String): String {
    return "Hello, ${if (name != "") name else "World"}!"
}