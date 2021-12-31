package com.example.projectfood.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.projectfood.R
import com.example.projectfood.model.FoodDomain

class ShowDetailActivity : AppCompatActivity() {

    private lateinit var addTocardBtn: TextView
    private lateinit var titleTxt: TextView
    private lateinit var feeTxt: TextView
    private lateinit var descriptionTxt: TextView
    private lateinit var numberOrderTxt: TextView
    private lateinit var picFood: ImageView
    private lateinit var minusBtn: ImageView
    private lateinit var plusBtn: ImageView
    private var numberOrder = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_detail)




        initView()
        getBundle()
    }

    fun getBundle() {
        val dados = intent.extras?.getSerializable("object") as FoodDomain

        val identifier = this.resources.getIdentifier(dados.pic, "drawable", this.packageName)

        Glide.with(this)
            .load(identifier)
            .into(picFood)
        titleTxt.setText(dados.title)
        feeTxt.setText("$ ${dados.fee}")
        descriptionTxt.setText(dados.description)
        numberOrderTxt.setText(numberOrder.toString())

        plusBtn.setOnClickListener {
            numberOrder = numberOrder + 1
            numberOrderTxt.setText(numberOrder.toString())
        }

        minusBtn.setOnClickListener {
            if (numberOrder > 1) {
                numberOrder = numberOrder - 1
            }
            numberOrderTxt.setText(numberOrder.toString())
        }


    }


    fun initView() {
//        addTocardBtn = findViewById(R.id.addTocardBtn)
        titleTxt = findViewById(R.id.titleTxt)
        feeTxt = findViewById(R.id.priceTxt)
        descriptionTxt = findViewById(R.id.description)
        numberOrderTxt = findViewById(R.id.numberOrder)
        plusBtn = findViewById(R.id.plusBtn)
        minusBtn = findViewById(R.id.minusBtn)
        picFood = findViewById(R.id.foodPic)
    }
}