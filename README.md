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

```java
val a: Int = 10000
```

*Auto Type Declaration*

```java
val a = "10000"
```

*If statement*

```java
val i: Int = 2
if (i in 1..10){
    println("$i is in 1..10")
}else{
    println("$i isn't in the range")
}
```

*For loop*

```java
val items = listOf(1,2,3,4,5,6,7,7) //initialized before
for(i in items) println(i)
```

*While loop*

```java
z = 0
while(z <= 10){
    println(z)
    z++
}
```

*Functional Programming Syntax example*

```java
val items = listOf(1,2,3,4,5,6,7,7)
println(items.filter { it % 2 == 1 }) //this prints only the Odd numbers
```

*Function/Method*

```java
fun sum(x: Int, y:Int):Int{
    return = x + y
}
```

*Function Shortened*

```java
fun sum(x: Int, y:Int) = x + y
```

*Class Declaration*

```java
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

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

1. The style of programming supported by the language: functional vs procedural programming

Kotlin supports both functional and procedual programming

Example, this function just prints out the frequency of each string:
```java
val testList: List<String> = listOf("a","b","c","a","c","c")

println(frequency(testList))

println(frequencyFunctional(testList))
```

Functional Example:
```java
fun frequencyFunctional(listString: List<String>): List<Pair<String, Int>>{
    return listString.groupBy { it }.map { Pair(it.key, it.value.count()) }
}
```

Procedural Example:
```java
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

```java
Output:
{a=2, b=1, c=3}
[(a, 2), (b, 1), (c, 3)]
```

2. The ability to perform meta-programming such as macros

Since Kotlin has full JAVA support, it inherits JAVA's meta-programming capability.

Example Code:

```java
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
This uses the JAVA reflection API
```java
Output:
Student
Person
java.lang.Object
```

This piece of code was written by Ruwanka De Silva, it can be found in:
https://medium.com/@ruwanka/my-kotlin-diaries-part-2-metaprogramming-2120778d9811


3. Symbol resolution and its support for closure

asdf

4. Scoping rules supported by the language: lexical vs dynamic scoping

asdfa

5. Functional programming constructs either as part of the language or supported by the standard library of the runtime.

asdf

6. Its type system: static vs dynamic types

Kotline allows both

7. Strengths and weaknesses of the language

> - Pros:
>     - New Programming Language: Kotlin is fairly new, it has been growing in support and user in a really fast pace.
>     - Runtime and Performance: Since it uses the JVM, its runtime and Performance is at least as good as Java
>     - Functional: Kotlin is easy to learn, and has very easy to read code.
>     - Integration: Kotlin can be easily integrated with JavaScript and JAVA.
> - Cons:
>     - No Static Declaration: Kotlin doesn't support static handling modifiers like Java.
>     - Name space Declaration: Kotlin allows function declaration at the top-level. However, declaring same functions later on may prove some difficulty in understanding the code.
