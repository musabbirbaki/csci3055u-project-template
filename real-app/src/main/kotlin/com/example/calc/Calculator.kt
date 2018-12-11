package com.example.calc

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import tornadofx.*
import javafx.scene.input.KeyEvent
import com.example.calc.Operator.*
import javafx.scene.control.Button

class Calculator: View(){
    override val root: VBox by fxml("./Calculator.fxml")

    @FXML lateinit var display: Label

    init {
        title = "Generic Calculator"

        //look up all button objects
        //set action listener of mouse clicked on each button b
        root.lookupAll(".button").forEach { b ->
            b.setOnMouseClicked {
                operator((b as Button).text)
            }
        }

        root.addEventFilter(KeyEvent.KEY_TYPED){
            operator(it.character.toUpperCase().replace("\r", "="))
        }
    }

    var state: Operator = add(0)

    fun onAction(fn: Operator){
        state = fn
        display.text = ""
    }

    val displayValue: Long
        get() = when(display.text){
            "" -> 0
            else -> display.text.toLong()
        }

    //Runing operation using x which comes from button click event
    private fun operator(x: String){
        if(Regex("[0-9]").matches(x)){
            display.text += x
        }else{
            when(x){
                "+" -> onAction(add(displayValue))
                "-" -> onAction(sub(displayValue))
                "/" -> onAction(div(displayValue))
                "%" -> {onAction(add(displayValue/100)); operator("=")}
                "X" -> onAction(mult(displayValue))
                "C" -> onAction(add(0))
                "+/-" -> {onAction(add(-1 * displayValue)); operator("=")}
                "=" -> display.text = state.calculate(displayValue).toString()
            }
        }
    }
}