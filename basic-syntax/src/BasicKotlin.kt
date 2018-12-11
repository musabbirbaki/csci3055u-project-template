/**Kotlin Basics**/

fun main(arg : Array<String>){
    //printing hello world
    println("Hello, World!")

    variables()

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





}