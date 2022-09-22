package com.example.odin_1_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open class Animals() {
            open fun outPrint() : String {
                return "Вывод информации о животных"
            }
        }

        class Herbivores(types: String, color: String) : Animals() {
            val myTypes = types
            val myColor = color

            val outText: String = types + " " + color + "\n"

            override fun outPrint() : String {
                return this.outText
            }

        }

        class Predators(height: String, weight: String) : Animals() {
            val myHeight = height
            val myWeight = weight

            val outText: String = myHeight + " " + myWeight + "\n"

            override fun outPrint() : String {
                return this.outText
            }

        }

        val herbivores_1 = Herbivores("sheep", "white")
        val herbivores_2 = Herbivores("cow", "black")
        val predators_1 = Predators("50", "20")
        val predators_2 = Predators("70", "30")

        val myList = mutableListOf<Animals>()

        myList.add(herbivores_1)
        myList.add(herbivores_2)
        myList.add(predators_1)
        myList.add(predators_2)

        var result: String = ""
        for (item in myList) {
            result = result + item.outPrint()
        }

        val myText: TextView
        myText = findViewById(R.id.myText)

        myText.text = result

    }
}