package calculadora

import javafx.beans.binding.When

var op:Char = 'a';

fun main (args:Array<String>){

    val array = arrayListOf(1,2,'+');

    val arrayTipo:ArrayList<Any> = arrayListOf();

    arrayTipo.add(1);
    arrayTipo.add(12);
    arrayTipo.add('+');

    val resultado = calcular(array);

}

fun calcular(array:ArrayList<Any>){

    for(a in array){
        /*if (a is Char){
            if (a == '+') suma(array[0] as Double,array[1] as Double);
            else
                if (a == '-') suma(array[0] as Double,array[1] as Double);
                else
                    if (a == '*') suma(array[0] as Double,array[1] as Double);
                    else
                        if (a == '/') suma(array[0] as Double,array[1] as Double);
        }*/

        if (a is Char){
            op = a;
        }

        when(a) {
            1 -> {

            }

            is Char -> {

            }
        }
    }

    when(op){
        '+' -> suma(array[0] as Double,array[1] as Double);
        '-' -> resta(array[0] as Double,array[1] as Double);
        '*' -> mult(array[0] as Double,array[1] as Double);
        '/' -> div(array[0] as Double,array[1] as Double);
    }

    System.out.println();
}

fun suma(op1:Double, op2:Double):Double = op1 + op2;

fun resta(op1:Double, op2:Double):Double = op1 - op2;

fun div(op1:Double, op2:Double):Double = op1 * op2;

fun mult(op1:Double, op2:Double):Double = op1 / op2;