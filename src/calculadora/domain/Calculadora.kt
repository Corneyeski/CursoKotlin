package calculadora.domain

import calculadora.calcular

//TODO el contructor esta en el nombre de la clase, ademas puedes crear constructores dentro de la estructura
class Calculadora(op1:Double, op2:Double){

    val operando1:Double = op1
    val operando2:Double = op2;
    var operador:String = "";

    var test:Double = 0.0
        set(valor) {

        }
    get() = field;

    //TODO si creamos un segundo contructor tendremos que llamar al constructor padre con this()
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