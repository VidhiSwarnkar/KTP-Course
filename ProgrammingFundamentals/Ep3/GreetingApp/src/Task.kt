import com.faangx.ktp.basics.GreetingMiniApp

fun greet(name: String): String {
    return "namaste $name"
}

fun main() {
    GreetingMiniApp(::greet)
}