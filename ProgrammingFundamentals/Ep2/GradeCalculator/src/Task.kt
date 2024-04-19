import com.faangx.ktp.basics.GradeCalculatorMiniApp

fun gradeFor(m1: Int, m2: Int, m3: Int, m4: Int, m5: Int): String {
    val average = (m1 + m2 + m3 + m4 + m5) / 50f

    if (average >= 9f && average <= 10f) {
        return "A+"
    } else if (average >= 8f && average < 9f) {
        return "A"
    } else if (average >= 7f && average < 8f) {
        return "B"
    } else if ( average >= 6f && average < 7f) {
        return "C"
    } else if (average >= 5f && average < 6f) {
        return "D"
    } else if (average >= 4f && average < 5f) {
        return "E"
    } else {
        return "Fail"
    }
}

fun main() {
    GradeCalculatorMiniApp(::gradeFor)
}