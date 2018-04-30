package calculadora.ejercicio1

//TODO sealed sirve para acotar las herencias de una clase a las indicadas, en este caso, en el mismo fichero
sealed class Coche {

    fun arrancar(){
        println("arrancando")
    }

    abstract fun circular()
}

class CocheElectrico: Coche() {
    override fun circular() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Todoterreno : Coche(){
    override fun circular() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


fun main(args:Array<String>){
    val ce = CocheElectrico()
    ce.arrancar()

    whenTest(ce)

    //TODO crear nested class (no necesita instanciar la clase padre)
    val demo = A.B().saludar()

    println(demo)

    //TODO crear inner class (necesita instanciar la clase padre)

    val demoInner = C().D().saludar()

    println(demoInner)
}

//TODO sealed: Se puede recibir la clase padre como parametro
fun whenTest(c:Coche){

    //TODO como es limitado no necesita el else
    when(c){
        is CocheElectrico -> {
            println("Electrico")
        }
        is Todoterreno -> {
            println("Todoterreno")
        }
    }
}

//nested clases
//inner clases

//TODO nested class
class A {
    var a = 1

    class B {
        fun saludar() = "hola"
    }
}

//TODO Inner class

class C {
    var c:Int = 1

    inner class D {
        fun saludar() = "Hola inner"
    }
}
