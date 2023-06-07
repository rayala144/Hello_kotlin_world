class Greeting (private val greet1: String, private val greet2: String) {

    fun greet1() = greet1
    fun greet2() = greet2
}

fun main(args: Array<String>) {
    println("Hello World!")
    val greeting = Greeting("Hello", "Fuck off")
    val greeting2: String = greeting.greet2()
    val greeting1: String = greeting.greet1()

    println("Hiiiii...$greeting1")
    println("Now $greeting2")
    
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}