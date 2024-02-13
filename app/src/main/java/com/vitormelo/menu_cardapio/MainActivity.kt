package com.vitormelo.menu_cardapio

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vitormelo.menu_cardapio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    var checkboxPrices = hashMapOf<Int, Float>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
        binding.buttonOrder.setOnClickListener(this)

        checkboxPrices[R.id.check_French_Fries] = 7.30f
        checkboxPrices[R.id.check_Nachos] = 5.40f
        checkboxPrices[R.id.check_Mini_Pastries] = 6.50f
        checkboxPrices[R.id.check_Bruschettas] = 7.40f
        checkboxPrices[R.id.check_Chicken_Breast] = 16.80f
        checkboxPrices[R.id.check_Barbecue] = 19.90f
        checkboxPrices[R.id.check_Steak_In_Sauce] = 19.00f
        checkboxPrices[R.id.check_Salpicao] = 16.40f
        checkboxPrices[R.id.check_Coca_Cola] = 3.80f
        checkboxPrices[R.id.check_Pepsi] = 3.50f
        checkboxPrices[R.id.check_Orange_Juice] = 2.50f
        checkboxPrices[R.id.check_Acerola_Juice] = 2.50f
        checkboxPrices[R.id.check_Mineral_Water] = 2.00f
        checkboxPrices[R.id.check_Pudding] = 2.50f
        checkboxPrices[R.id.check_Lemon_Pie] = 3.50f
        checkboxPrices[R.id.check_Brigadeiro] = 3.00f
        checkboxPrices[R.id.check_Lemon_Mousse] = 3.50f
        checkboxPrices[R.id.check_Strawberry_Mousse] = 3.50f
    }

    override fun onClick(view: View) {
        var observationsText = findViewById<EditText>(R.id.edit_Observations).text.toString()
        var validCalculate = 0

        if (view.id == R.id.button_Calculate) {
            calculatePriceTotal()
            validCalculate += 1 // Validando para garantir que o botão calcular seja clicado primeiro
        }

        if (view.id == R.id.button_Order && validCalculate != 1) {
            if (checkboxSelected()) {
                if (observationsText.isEmpty()) {
                    Toast.makeText(this, R.string.Msg_Order_Placed, Toast.LENGTH_LONG)
                        .show()
                } else {
                    Toast.makeText(this, R.string.Msg_Order_Observations, Toast.LENGTH_LONG)
                        .show()
                }
            } else {
                Toast.makeText(this, R.string.Validation_NoOrder, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun calculatePriceTotal() {
        var totalPrice = 0.00f
        for ((checkboxId, price) in checkboxPrices) {
            var checkboxItem = findViewById<CheckBox>(checkboxId)
            if (checkboxItem.isChecked) {
                totalPrice += price
            }
        }

        binding.textLabelTotal.text = "R$ ${"%.2f".format(totalPrice)}"
        if (totalPrice == 0.00f) {//Tratamento de erro do botão calcular (nenhum pedido selecionado)
            Toast.makeText(this, R.string.Validation_NoOrder, Toast.LENGTH_SHORT).show()
        }

    }

    private fun checkboxSelected(): Boolean {//Tratamento de erro do botão pedido
        for ((checkboxId, _) in checkboxPrices) {
            var checkboxValid = findViewById<CheckBox>(checkboxId)
            if (checkboxValid.isChecked) {
                return true
            }
        }
        return false
    }

}


    

