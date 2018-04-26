package calculadora.ejercicio1

class Empleado(nombre:String, apellido:String, e:Int):Persona(nombre,apellido,e) {

    var salario = 0
    var tipo:Rol = Rol.INTERINO

    constructor(nombre:String, apellido:String, e:Int, rol:Rol) : this(nombre,apellido,e){
        tipo = rol
    }

    companion object {
        var base = 20;
        private val aumento = 150
    }

    fun subirSueldo() {
        salario +=  aumento
    }
    fun asignarSueldo() {
        salario = edad * base
    }
}