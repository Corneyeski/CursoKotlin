package calculadora.domain

import calculadora.calcular

class Calculadora(op1:Double, op2:Double){

    val operando1:Double = op1;
    val operando2:Double = op2;
    var operador:String = "";

    constructor(op1:Double, op2:Double, ope:String):this(op1,op2){
        this.operador = ope
    }

    fun sumar():Double = this.operando1 + this.operando2;
    fun restar():Double = this.operando1 - this.operando2;
}

fun main (args:Array<String>){

    val array = arrayListOf(1,2,'+');

    val arrayTipo:ArrayList<Any> = arrayListOf();

    arrayTipo.add(1);
    arrayTipo.add(12);
    arrayTipo.add('+');

    //val resultado = calcular(array);

    val calculadora = Calculadora(array[0] as Double, array[1] as Double, array[2] as String);


    println("El resultado es ${calculadora.restar()}")
}