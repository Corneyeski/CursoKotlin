package calculadora.domain

//TODO Kotlin permite añadir implementacion a las funciones de una interfaz
interface ICalculadora{
    fun calcular():Double
    fun test() = "Test de calculadora desde Icalculadora"
}

interface IImprimible{
    fun imprimir():Double
}

//TODO el contructor esta en el nombre de la clase, ademas puedes crear constructores dentro de la estructura
//TODO todas las clases en Kotlin son final, si queremos hacer herencia, tenemos que indicar que son de tipo final
//TODO tambien puedes implementar multiples Interfaces
open class Calculadora(op1:Double, op2:Double) :ICalculadora, IImprimible{

    //TODO implementacion de la interfaz
    override fun calcular(): Double {
        return 9.9
    }

    override fun imprimir(): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val operando1:Double = op1
    val operando2:Double = op2;
    var operador:String = "";

    //TODO se utiliza la palabra field para indicar la variable a la que afecta el set/get
    var test:Double = 0.0
        set(valor) {
            field = valor;
        }
    get() = field;


    //TODO para sobreescribir variables tambien hay que declararlas open
    open var testOpen:String = "";

    //TODO si creamos un segundo contructor tendremos que llamar al constructor padre con this()
    constructor(op1:Double, op2:Double, ope:String):this(op1,op2){
        this.operador = ope
    }

    //TODO para hacer override de una clase tambien hay que indicarla que es open
    open fun sumar():Double = this.operando1 + this.operando2;
    fun restar():Double = this.operando1 - this.operando2;
}

//TODO herencia con kotlin
class CalculadoraCientifica(op1: Double, op2: Double) : Calculadora(op1, op2) {

    var operando3:Double = 0.0;

    //TODO la mayoria de las clases basicas de Java estan incluidas en la libreria base de kotlin
    fun potencial(op1:Double, op2:Double) = Math.pow(op1,op2);
    fun potencial() = Math.pow(operando1,operando2);

    //TODO override
    override fun sumar():Double = 1.1;


    //TODO constructor en herencia
    constructor(op1:Double, ope2:Double, op3:Double) : this(op1,ope2) {
        operando3 = op3
    }
}

//TODO funcion extendida
fun CalculadoraCientifica.raizCuadrada() = Math.sqrt(operando1)




fun main (args:Array<String>){

    val array = arrayListOf(1.1,2.2,"+");

    val arrayTipo:ArrayList<Any> = arrayListOf();

    arrayTipo.add(1);
    arrayTipo.add(12);
    arrayTipo.add('+');

    //val resultado = calcular(array);

    //TODO Probando clase normal
    val calculadora = Calculadora(array[0] as Double, array[1] as Double, array[2] as String);

    println("El resultado es ${calculadora.restar()}")


    //TODO Probando clase con herencia
    var calculadoraCientifica = CalculadoraCientifica(array[0] as Double, array[1] as Double);
    println(calculadoraCientifica.potencial())
    println(calculadoraCientifica.potencial(5.1,9.2))

    var calculadoraCientifica2 = CalculadoraCientifica(array[0] as Double, array[1] as Double, 3.3);
    println(calculadoraCientifica2.operando3)

    //TODO Utiliza la funcion extendida a pesar de que no esta dentro de la clase
    val raiz = calculadoraCientifica.raizCuadrada()

    println("El resultado de la raiz es: $raiz")


}