import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList

/**Standard library**/

fun main(args: Array<String>){
    println("Hello, world")


    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3, 4.4, 5.5)

    val num: Int by lazy {
        503
    }

    val nums: MutableList<Int> = mutableListOf(1,2,3) //mutable list
    val readOnlyView: List<Int> = nums //immutable List
    println(nums)

    //append
    nums.add(4)
    //nums.add("s") can't do this since its type locked

    nums.clear()

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


    //With is a functional function that runs a piece of code with a param
    val i = 2
    with(i) {
        val numbers = 1..100

        //filter filters the iterable
        numbers.filter { it % 12 == 0 }
                .map { it * 20 }
                .forEach{println(it * i)}
    }
}