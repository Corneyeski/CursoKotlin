package calculadora.ejercicio1

//TODO crear map en Kotlin
//TODO los mapas son Interfaces, no podermos hacer = Map<X,Y>
//TODO utilizamos mutable para poder cambiar sus valores
var empleados:MutableMap<String,Empleado> = mutableMapOf()

//TODO nullables
//TODO para poder trabajar con nullables hay que añadir el interrogante
var s:String? = null

var listaNegra:Map<String,Empleado>? = null

fun main (args:Array<String>){

    //TODO dos formas de crear un Par
    var emp =  Empleado("Alan","Vallve",21)
    var parDNIEmpleado = Pair("26061070T",emp)
    var emp2 =  Empleado("Alan2","Vallve2",56)
    var parDNIEmpleado2 = "26061070T2" to emp2
    var emp3 =  Empleado("Alan3","Vallve3",87)
    var parDNIEmpleado3 = Pair("26061070T3",emp3)
    var emp4 =  Empleado("Alan4","Vallve4",55)
    var parDNIEmpleado4 = "26061070T4" to emp4
    var emp5 =  Empleado("Alan5","Vallve5",62, Rol.FUNCIONARIO)
    var parDNIEmpleado5 = "26061070T4" to emp5
    var emp6 =  Empleado("Alan6","Vallve6",66, Rol.FUNCIONARIO)
    var parDNIEmpleado6 = "26061070T4" to emp6

    empleados = mutableMapOf(parDNIEmpleado, parDNIEmpleado2, parDNIEmpleado3, parDNIEmpleado4, parDNIEmpleado5, parDNIEmpleado6)

    veerEmpleados()

    fun init(){

        //TODO para evitar errores de ejecucion en nullables, podemos añadir el simbolo ? que actua como si fuese un if, para saber si funcionara o no
        //TODO ?: llamada anotacion Elvis, sirve para ejecutar otra parte en caso de que sea null una variable, parecido a un ternario
        println(s?.length ?: 0)


        //TODO para hacer un foreach en un map con it, tenemos que indicar si queremos usar el value o la key
        empleados.forEach{it.value.asignarSueldo()}


        var despidos:List<Empleado> = empleados.filter {
            it.value.salario > 150 && it.value.edad > 55 && it.value.tipo == Rol.INTERINO
        }.map {
            it.value
        }

        despidos.forEach {println("en despidos: ${it.nombre} salario: ${it.salario}") }

        //empleados.forEach { k, v -> if(despidos.contains(v)) empleados.remove(k) }

        listaNegra = empleados.filter {
            it.value.salario > 150 && it.value.edad > 55 && it.value.tipo == Rol.FUNCIONARIO
        }

        listaNegra?.forEach { k, v ->  println("Empleado en lista negra: ${v.nombre}")}
    }


    init()
}

fun veerEmpleados(){
    //TODO Recorrer map con for
    for ((clave,valor) in empleados){
        println("DNI: $clave nombre: ${valor.nombre}")
    }
}