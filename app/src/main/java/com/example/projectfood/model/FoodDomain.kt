package com.example.projectfood.model

import java.io.Serializable

data class FoodDomain(
    val title:String,
    val pic:String,
    val description:String,
    val fee:Double,
    val numberInCard:Int?=null
) :Serializable{
}