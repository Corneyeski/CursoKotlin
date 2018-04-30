package calculadora.ejercicio1

import java.util.function.Consumer

fun main (args:Array<String>){

    //TODO un array puede ser val ya que aunque val es inmutable, arrayList si que es mutable y te permitira añadir o quitar parametros, pero no cambiar el valor de la variable (empleados)
    val empleados:ArrayList<Empleado> = arrayListOf()


    empleados.add(Empleado("alan","vallve",21))
    empleados.add(Empleado("b","b",12))
    empleados.add(Empleado("c","c",43))
    empleados.add(Empleado("d","d",32))

    empleados.forEach(Consumer { e -> e.asignarSueldo(); println("El salario actual de ${e.nombre} es: ${e.salario}") })

    println("SUBIENDO SUELDO...")

    empleados.forEach(Consumer { e -> e.subirSueldo(); println("El salario actual de ${e.nombre} es: ${e.salario}") })

    println("SUBIENDO SUELDO...")

    //TODO si solo va a recivir un parametro, podemos utilizar la palabra it directamente
    empleados.forEach {it.subirSueldo(); println("El salario actual de ${it.nombre} es: ${it.salario}")}


    var listaNegra = arrayListOf<Empleado>()
    var despidos = arrayListOf<Empleado>()

    empleados.add(Empleado("d1","d1",56, Rol.INTERINO))
    empleados.add(Empleado("d2","d2",57, Rol.INTERINO))
    empleados.add(Empleado("d3","d3",58, Rol.INTERINO))
    empleados.add(Empleado("d4","d4",59, Rol.INTERINO))

    empleados.add(Empleado("f1","f1",56, Rol.FUNCIONARIO))
    empleados.add(Empleado("f2","f2",57, Rol.FUNCIONARIO))
    empleados.add(Empleado("f3","f3",58, Rol.FUNCIONARIO))
    empleados.add(Empleado("f4","f4",59, Rol.FUNCIONARIO))

    println("EMPLEADOS ACTUALES")
    empleados.forEach { println("Nombre: ${it.nombre} edad: ${it.edad} tipo: ${it.tipo}"); it.asignarSueldo() }

    empleados.forEach {
        if (it.edad > 55 && it.salario > 150){
            when (it.tipo) {
                Rol.INTERINO -> despidos.add(it)
                Rol.FUNCIONARIO -> listaNegra.add(it)
                else -> println("El boss is in da house")
            }
        }
    }

    despidos.removeAll(despidos)

    println("EMPLEADOS ACTUALES TRAS EL ERE")
    empleados.forEach { println("Nombre: ${it.nombre} edad: ${it.edad} tipo: ${it.tipo} sueldo: ${it.salario}") }

    println("EMPLEADOS ACTUALES EN LISTA NEGRA")
    listaNegra.forEach { println("Nombre: ${it.nombre} edad: ${it.edad} tipo: ${it.tipo} sueldo: ${it.salario}") }


    //TODO Si una funcion esta por encima de la otra a la que llama, esta sera incapaz de verla, tiene orden sequencial
    //TODO Unit es la version void de kotlin
    //TODO se puede recibir una funcion como parametro que cumpla las condiciones de: Recibir los mismos parametros y retornar el mismo tipo
    fun darFiniquito(despidos:ArrayList<Empleado>, fn:(Empleado) -> Unit){
        //TODO Hace lo que sea
    }

    fun despedir(){

        var despidos:List<Empleado> = empleados.filter { it.salario > 150 && it.tipo == Rol.INTERINO && it.edad > 55}

        //TODO Podemos poner la funcion dentro de los parametros de la llamada o fuera, lo mas habitual es verlo fuera
        darFiniquito(despidos as ArrayList<Empleado>,{
            val finiq = Finiquiter.obtenerFiniquito()
            it.finiquitar(finiq)
            println(it.tipo)
        })

        darFiniquito(despidos as ArrayList<Empleado>){
            println(it.tipo)
        }
    }
}