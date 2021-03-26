fun main() {
    println("Я загадал число от 0 до 100")
    println("Отгадайте. У Вас 7 попыток")
    val hiddenNumber = (0..100).random()
    var enteredNumber = 1

    for (i in 1..7) {
        try {
            val a = readLine()!!
            enteredNumber = a.toInt()

            if (enteredNumber !in 0..100) {
                println("Число не входит в диапазон от 0 до 100")
            } else if (enteredNumber == hiddenNumber) {
                println("Вы угадали")
                break
            } else if (enteredNumber > hiddenNumber) {
                println("Загаданное число меньше")
            } else {
                println("Загаданное число больше")
            }
        } catch (e: NumberFormatException) {
            println("Введите целое число")
        }
    }
    if (enteredNumber != hiddenNumber)
        println("Вы не угадали. Я загадал число $hiddenNumber")
}

