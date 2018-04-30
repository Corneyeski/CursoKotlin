package calculadora.ejercicio1


interface Player {
    fun play()
}

fun playWith(p:Player){
    p.play()
}

open class VideoPlayer {
    fun play(){
        println("Play video...")
    }
}

//TODO Crear objetos anonimos
fun main(args: Array<String>) {

    val data = object {
        var size = 1
        fun calcular() = this.size * this.size
    }

    println(data.calcular())

    //TODO videoPlayer ya implementa el metodo play en el object
    val player = object : VideoPlayer(), Player {

    }

    playWith(player)
}