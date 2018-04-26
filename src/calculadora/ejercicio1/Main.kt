package calculadora.ejercicio1

import java.util.function.Consumer

fun main (args:Array<String>){

    var empleados:ArrayList<Empleado> = arrayListOf()

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
}