package calculadora.ejercicio1

interface PlayerOne {
    fun playGame()
}

class ReadyPlayerOne(val data:String) : PlayerOne {
    override fun playGame() {
        println("Ready player one")
    }
}

class ReadyPlayerTwo(val data:String) : PlayerOne {
    override fun playGame() {
        println("Ready player one")
    }
}

class  BPlayer(val data: String) : PlayerOne {

    val player = ReadyPlayerOne(data)

    override fun playGame() {
        player.playGame()
    }
}

class BPlayer2(val data: String) : PlayerOne by ReadyPlayerOne(data) {

}

fun main(args: Array<String>) {
    var p = ReadyPlayerOne("data1").playGame()
    var p2 = BPlayer("data2").playGame()
}