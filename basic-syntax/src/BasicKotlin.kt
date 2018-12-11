/**Kotlin Basics**/

fun main(arg : Array<String>){
    //printing hello world
    println("Hello, World!")

    //variables()

//    run{
//        run{
//            val x = 2
//            println("$x and $y")
//        }
//        println(x)
//    }
}

fun variables(){
    //---------------Variables---------------
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 100000000004
    val s: Short = 10
    val b: Byte = 1

    //auto type setting
    val someVariable = 1231231
    var something = "Something"
    println(something + someVariable)

    //can use $val to refer to the variable
    //use of ; is optional
    println("$a , $d , $f, $l, $s, " + b);

    //Character
    val letter: Char = 'A'
    println("This is a letter: $letter inside a string.")
    println(letter)

    //String, immutable (val) and mutable (var)
    var rawString: String = "Rawstring\n"
    rawString = "newstring"
    val sstr : String = "another"
    //sstr = "not another" can't reassign val
    println(rawString + sstr)

    //---------------Arrays---------------
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(numbers[0])

    //---------------Collections---------------
    //There are immutable and mutable collections
    val nums: MutableList<Int> = mutableListOf(1,2,3) //mutable list
    val readOnlyView: List<Int> = nums //immutable List
    println(nums)

    //append
    nums.add(4)
    //nums.add("s") can't do this since its type locked

    nums.clear()
    //readOnlyView.clear() will give error

    //first, last, filter
    val items = listOf(1,2,3,4,5,6,7,7)
    println(items.first())
    println(items.last())
    println("Odd Nums: " + items.filter { it % 2 == 1 })

    //hashmap
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) //get by value function
    println(readWriteMap.get("bar"))

    val strs = hashSetOf("a", "b", "c")
    println("My set " + strs)

    //Ranges
    for (j in 1..4)
        println("--" + j) //prints from inclusive 1 to inclusive 4
    //println(j) this will give error

    //if, else statment
    val i: Int = 2
    if (i in 1..10){
        println("$i is in 1..10")
    }else{
        println("$i isn't in the range")
    }

    //when statement
    var z:Int = 5
    when (z) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 or 4")
        else -> {println("I can do a lot with $z == 5")}
    }

    //for loop
    //val items = listOf(1,2,3,4,5,6,7,7) initialized before
    for(i in items) println(i)

    //for loop print with index
    for((index, value) in items.withIndex()){
        println("$index with value $value")
    }

    for(q in items.withIndex()){
        println(q)
        //Example: IndexedValue(index=0, value=1)
    }


    //while loop
    z = 0
    while(z <= 10){
        println(z)
        z++
    }

    //do while loop
    z = 0
    do{
        z+=10
        println(z)
    }while(z <= 50)

}

//Function with return statment
fun doubling(x:Int):Int{
    return 2*x
}

//More Syntax
class Customer//class syntax

fun printMessage(value: String): Unit{//unit is an object (Almost like void in Java), Assumed Unit if nothing there.
    println("$value")
}

fun sum(x: Int, y:Int) = x + y

infix fun String.isSameAs(value: String) = this == value
//can run this by running: "me" isSameAs "me"