package com.example.projectfood.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfood.Adapter.CategoryAdapter
import com.example.projectfood.Adapter.PopularAdapter
import com.example.projectfood.R
import com.example.projectfood.model.Category
import com.example.projectfood.model.FoodDomain

class MainActivity : AppCompatActivity() {
    lateinit var recyclerViewCategory: RecyclerView
    lateinit var recyclerViewPopular: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rectclerViewCategory()
        rectclerViewPopular()

    }
    private fun rectclerViewPopular() {
        recyclerViewPopular = findViewById(R.id.list_category_popular)
        recyclerViewPopular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val popular: List<FoodDomain> = listOf(
            FoodDomain("Pizza de Pimenta","pizza2","A Pizza Baiana Picante é um dos sabores de pizza da Sertão na Lenha Pizzaria, considerada uma das melhores pizzarias em Salvador, e assada em forno à lenha.\n A pizza leva molho, mussarela, calabresa moída e pimenta como ingredientes.\n O preparo da pizza leva aproximadamente 20 min e, para muitos, é a melhor pizza de Salvador e está entre os sabores de pizza preferido dentre os clientes da Sertão na Lenha Pizzaria.\n A Pizza Baiana Picante é um sabor de pizza tradicional e se diferencia das pizzas doces, pizzas light e pizzas especiais devido a utilização de recheios tipicamente tradicionais.",38.56),
            FoodDomain("Suco de Morango","drink","",6.00),
            FoodDomain("Pizza de Mussarela","pizza","A Pizza de Mussarela é coberta com molho de tomate, queijo tipo mussarela, azeitonas pretas e orégano e massa com fermentação natural, oferece mais sabor e qualidade à sua mesa.",33.00),
            FoodDomain("Morango","sorvete","",12.00),
        )
        recyclerViewPopular.adapter = PopularAdapter(popular)
    }

    private fun rectclerViewCategory() {
        recyclerViewCategory = findViewById(R.id.list_category)
        recyclerViewCategory.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)


        val products: List<Category> = listOf(
            Category("Pizza", "cat_1"),
            Category("Burgerza", "cat_2"),
            Category("Hotdog", "cat_3"),
            Category("Ice cream","cat_4"),
            Category("Drink", "cat_5"),


            )

        recyclerViewCategory.adapter = CategoryAdapter(products)


    }
}