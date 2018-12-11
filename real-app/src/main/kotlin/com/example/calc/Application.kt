package com.example.calc

import javafx.stage.Stage
import tornadofx.*

class MyCalculator: App(){
    override val primaryView = Calculator::class

    override fun start(stage: Stage) {
        super.start(stage)
    }
}