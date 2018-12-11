# KOTLIN

- Musabbir Ahmed Baki
- musabbir.baki@uoit.net

## About the language

> _Description on language_
>
> History:
> - Kotlin is introduced by JetBrains, the designers of Intellij IDEA
> - First appeared in July of 2011
> - Named after Kotlin Island, near St. Petersburg

> Some interesting features:
> - High level Strongly Statically typed language that runs on JVM
> - Kotlin is functional and expressive language
> - Can be defined as: Kotlin = JAVA + new features, though not necessarily a replacement for JAVA.
> - It reduces lots of boiler plate code
> - Kotlin relies on existing Java Class library
> - Provides code safety like null safety
> - Good for server side coding
> - Don't need ; at the end of a line like Java
> - Java commands can be used in Kotlin
> - Kotlin can also be comiled to JavaScript codes
> - Kotlin is fully supported by Google for Android OS


## About the syntax

*Declaring Integer*

```kotlin
val a: Int = 10000
```

*Auto Type Declaration*

```kotlin
val a = "10000"
```

*If statement*

```kotlin
val i: Int = 2
if (i in 1..10){
    println("$i is in 1..10")
}else{
    println("$i isn't in the range")
}
```

*For loop*

```kotlin
val items = listOf(1,2,3,4,5,6,7,7) //initialized before
for(i in items) println(i)
```

*While loop*

```kotlin
z = 0
while(z <= 10){
    println(z)
    z++
}
```

*Functional Programming Syntax example*

```kotlin
val items = listOf(1,2,3,4,5,6,7,7)
println(items.filter { it % 2 == 1 }) //this prints only the Odd numbers
```

*Function/Method*

```kotlin
fun sum(x: Int, y:Int):Int{
    return = x + y
}
```

*Function Shortened*

```kotlin
fun sum(x: Int, y:Int) = x + y
```

*Class Declaration*

```kotlin
class Car
```

For more Snippets of Code and Syntax, please refer to the "basic-syntax" folder.


## About the tools

> _Description of the compiler or interpreter needed_:
> - Kotlin runs on JVM, so it requires at least the installation of JDK 8. After either Eclipse, Android studio, or Intellij can be used as an IDE to compile and run Kotlin projects.
> - Alternatively, Kotlin compiler can be installed and run directly from the command line.
> - When targeting JavaScript, Kotlin compiler will convert the .kt file into ES5.1 and generates compatible code for JS.
> - When targeting JAVA, Kotlin compiler creates JVM compatible byte code

## About the standard library

*Kotlin has its standard library imported by Default. The Default Imports include:*

```kotlin
kotlin.*
kotlin.collections.*
java.lang.* (JVM only)
//And many more.
```
*Example 1: The Hello World program uses two of these libraries, the kotlin.io and kotlin collections*

```kotlin
fun main(arg : Array<String>){
    println("Hello, World!")
}
```
*Example 2: Higher-order functions, (let, apply, use, run, etc)*

```kotlin
val someVal: Int = 1 + run{if(1 > 2) 3 else 5 }
```

## About open source library

Kotlin has many Open Source libraries, an example would be Koi. Koi has many extensions and functions that helps reduce boilerplate code in Android apps.

*Example File Read and Write*

```kotlin
fun fileReadWrite() {
    val directory = File("/Users/koi/workspace")
    val file = File("some.txt")

    val text1 = file.readText()
    val text2 = file.readString(Encoding.CHARSET_UTF_8)
    val list1 = file.readList()
    val list2 = file.readLines(Encoding.CHARSET_UTF_8)

    file.writeText("hello, world")
    file.writeList(list1)
    file.writeList(list2, Encoding.CHARSET_UTF_8)

    val v1 = file.relativeToOrNull(directory)
    val v2 = file.toRelativeString(directory)

    // clean files in directory
    directory.clean()


    val file1 = File("a.txt")
    val file2 = File("b.txt")
    file1.copyTo(file2, overwrite = false)
}
```

# Analysis of the language

#### 1. The style of programming supported by the language: functional vs procedural programming

Kotlin supports both functional and procedual programming

*Example, this function just prints out the frequency of each string:*

```kotlin
val testList: List<String> = listOf("a","b","c","a","c","c")

println(frequency(testList))

println(frequencyFunctional(testList))
```

*Functional Example:*

```kotlin
fun frequencyFunctional(listString: List<String>): List<Pair<String, Int>>{
    return listString.groupBy { it }.map { Pair(it.key, it.value.count()) }
}
```

*Procedural Example:*

```kotlin
fun frequency(listString: List<String>): HashMap<String, Int> {
    var counter = 0
    val results = hashMapOf<String, Int>()

    while (counter < listString.size){
        val element = results[listString[counter]]

        if(element != null){
            results[listString[counter]] = element + 1
        }else{
            results[listString[counter]] = 1
        }
        counter++
    }
    return results
}
```

```kotlin
Output:
{a=2, b=1, c=3}
[(a, 2), (b, 1), (c, 3)]
```

#### 2. The ability to perform meta-programming such as macros

Since Kotlin has full JAVA support, it inherits JAVA's meta-programming capability.

*Example Code:*

```kotlin
open class Person(val name: String, var age: Int)

class Student(name: String, age: Int, var school: String) : Person(name, age)

fun main(args: Array<String>) {
    printTypeHierarchy(Student::class.java)
}

private fun printTypeHierarchy(cls: Class<out Any>?) {
    var clazz = cls;
    while (clazz != null) {
        println(clazz.name)
        clazz = clazz.superclass as Class<out Any>?
    }
}
```

*This uses the JAVA reflection API*

```kotlin
Output:
Student
Person
java.lang.Object
```

*This piece of code was written by Ruwanka De Silva, it can be found in:*

https://medium.com/@ruwanka/my-kotlin-diaries-part-2-metaprogramming-2120778d9811


#### 3. Symbol resolution and its support for closure

Kotline supports similar Symbol resolution to Java.

Variables can be declared normally as Mutable and Immutable using the key words
*var* and *val*.

*Example 1:*

```kotlin
var x = 2 //Mutable
val y = 3 //Immutable
```

##### Closure

Kotlin also alows Global variables just like JAVA:

```kotlin
class MyApplication : Application() {
    var gVar = "Global Variable"
}
```

*In the Example 2:*

```kotlin
run{
  val x = 1
  val y = "y"

  run{
    val x = 2
    println("$x and $y")
  }

  println(x)
}
```

Each run function creates it's own scope. However, variable *y* is still accessible in it's corresponding sub scope while variable *x* was allowed to be reinitialized and override.

*Example 3:*

```kotlin
fun sum(x: Int, y:Int):Int{
    return = x + y
}
```

In Example 3, *x* and *y* inside the function are only accessible inside the function. These variables can not be accessed outside of the function's scope.

#### 4. Scoping rules supported by the language: lexical vs dynamic scoping

Kotlin supports both lexical and dynamic scoping.

*Example:*

```kotlin
run{
  val x = 1
  val y = "y"

  run{
    val x = 2
    println("$x and $y")
  }

  println(x)
}
```

```kotlin
Output:
2 and y
1
```
In the example above, the variable x is different in each scope while the variable y can still be accessed inside the inner scope like a dynamic variable.


#### 5. Functional programming constructs either as part of the language or supported by the standard library of the runtime.

Kotlin Supports Functional Programming. A lot of them are imported by Default by the Kotlin Standard Library.

*Example 1:*

```kotlin
run{
  val x = 1
  val y = "y"

  run{
    val x = 2
    println("$x and $y")
  }

  println(x)
}
```

*Example 2:*

```kotlin
val someVal: Int = 1 + run{if(1 > 2) 3 else 5 }
```

*Constructing Higher order function, Example 3:*

```kotlin
fun highOrder(f: (Int) -> Int){

}

highOrder {it + 1}
```


#### 6. Its type system: static vs dynamic types

Unlike Java, Kotlin does not have support for Static functions. Kotlin is also *Statically Typed*.

Kotlin supports Mutable and Immutable variables.

*Example 1:*

```kotlin
var x = 2 //Mutable
val y = 3 //Immutable
```

Kolin supports constants similar to Java

*Example 2:*

```kotlin
const val FOO = "foo"
```

*Example 3:*

```kotlin
val num: Int by lazy {
        503
}
```

In Example 3, the variable *num* is not initialized until it is called for the first time. This lazy initialization is thread safe, and it doesn't use any memory until its first call.

#### 7. Strengths and weaknesses of the language

> - Pros:
>     - New Programming Language: Kotlin is fairly new, it has been growing in support and user in a really fast pace.
>     - Runtime and Performance: Since it uses the JVM, its runtime and Performance is at least as good as Java
>     - Functional: Kotlin is easy to learn, and has very easy to read code.
>     - Integration: Kotlin can be easily integrated with JavaScript and JAVA.
> - Cons:
>     - No Static Declaration: Kotlin doesn't support static handling modifiers like Java.
>     - Name space Declaration: Kotlin allows function declaration at the top-level. However, declaring same functions later on may prove some difficulty in understanding the code.
