import com.faangx.ktp.basics.LcmHcfCalculatorMiniApp

fun getLCM(x: Int, y: Int): Int {
    return 0
}

fun getHCF(x: Int, y: Int): Int {
    var a = x
    var b = y
    while ( b != 0) {
        val rem = a%b
        a = b
        b = rem
    }
    return a
}

fun main() {
    LcmHcfCalculatorMiniApp(
        ::getLCM,
        ::getHCF
    )
}