import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    if (age < 3) {
        return "Infancy"
    } else if (age < 12) {
        return "Childhood"
    } else if (age < 18) {
        return "Teenage"
    } else if (age < 60) {
        return "Adulthood"
    } else {
        return "Old age"

    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}