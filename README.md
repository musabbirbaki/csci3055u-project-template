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

> _give some code snippet of the language_

*Let form*

```clojure
(let [x 10
      y 20]
  (+ x y))
```

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
```
val testList: List<String> = listOf("a","b","c","a","c","c")

println(frequency(testList))

println(frequencyFunctional(testList))
```

Functional Example:
```
fun frequencyFunctional(listString: List<String>): List<Pair<String, Int>>{
    return listString.groupBy { it }.map { Pair(it.key, it.value.count()) }
}
```

Procedural Example:
```
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

2. The ability to perform meta-programming such as macros

Meta

3. Symbol resolution and its support for closure

asdf

4. Scoping rules supported by the language: lexical vs dynamic scoping

asdfa

5. Functional programming constructs either as part of the language or supported by the standard library of the runtime.

asdf

6. Its type system: static vs dynamic types

sdf

7. Strengths and weaknesses of the language

sdf
