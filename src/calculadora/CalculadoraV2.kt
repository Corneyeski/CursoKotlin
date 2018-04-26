package calculadora

import javafx.beans.binding.When
//TODO Punto y coma no necesario
var op:Char = 'a';

fun main (args:Array<String>){

    //TODO Val puede cambiar el contenido de sus datos pero no la direccion de memoria a la que apunta
    val array = arrayListOf(1,2,'+');

    val arrayTipo:ArrayList<Any> = arrayListOf();

    arrayTipo.add(1);
    arrayTipo.add(12);
    arrayTipo.add('+');

    val resultado = calcular(array);

}

fun calcular(array:ArrayList<Any>){

    for(a in array){
        //TODO is sustituye a InstanceOf() en Java
        if (a is Char){
            op = a;
        }

        //TODO Sustituye al switch/case en Java
        when(a) {
            1 -> {

            }

            is Char -> {

            }
        }
    }

    when(op){

        //TODO Puedes cambiar el orden en el que se reciben los parametros indicando el nombre de la variable en la funcion
        '+' -> suma(op2= array[0] as Double, op1= array[1] as Double);
        '-' -> resta(array[0] as Double,array[1] as Double);
        '*' -> mult(array[0] as Double,array[1] as Double);
        '/' -> div(array[0] as Double,array[1] as Double);
        //TODO else sustituye a default
        else -> println("nada")
    }

    /*TODO System.out.println() para a ser simplemente println()
        TODO ademas las variables ya no ahce falta concatenarlas, puedes usar el signo $ y si son varias variables, ${}
     */
    println("hey $op ${array}");
}

fun suma(op1:Double, op2:Double):Double = op1 + op2;

fun resta(op1:Double, op2:Double):Double = op1 - op2;

fun div(op1:Double, op2:Double):Double = op1 * op2;

fun mult(op1:Double, op2:Double):Double = op1 / op2;