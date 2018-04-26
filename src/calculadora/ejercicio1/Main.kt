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



    //empleados.forEach { it ->  it.subirSueldo(); println("El salario actual de ${it.nombre} es: ${it.salario}")}
}