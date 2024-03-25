package com.example.calculator
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var operand1 = ""
    private var operand2 = ""
    private var operator = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }

    fun onNumberClick(view: View) {
        val button = view as Button
        val buttonText = button.text.toString()

        if (operator.isEmpty()) {
            operand1 += buttonText
        } else {
            operand2 += buttonText
        }

        updateResultText()
    }

    fun onOperatorClick(view: View) {
        val button = view as Button
        operator = button.text.toString()
        updateResultText()
    }

    fun onEqualClick(view: View) {
        if (operand1.isNotEmpty() && operand2.isNotEmpty() && operator.isNotEmpty()) {
            val num1 = operand1.toDouble()
            val num2 = operand2.toDouble()
            val result = performOperation(num1, num2, operator)
            resultTextView.text = result.toString()

            // Reset values for next calculation
            operand1 = result.toString()
            operand2 = ""
            operator = ""
        }
    }

    private fun updateResultText() {
        val text = if (operand2.isNotEmpty() && operator.isNotEmpty()) {
            "$operand1 $operator $operand2"
        } else {
            operand1
        }
        resultTextView.text = text
    }

    private fun performOperation(num1: Double, num2: Double, operator: String): Double {
        return when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> throw IllegalArgumentException("Invalid operator")
        }
    }
}
