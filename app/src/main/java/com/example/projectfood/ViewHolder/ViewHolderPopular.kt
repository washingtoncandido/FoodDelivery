package com.example.projectfood.ViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfood.R

class ViewHolderPopular(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var title: TextView
    var picPic: ImageView
    var addBtn: TextView
    var fee:TextView


    init {
        title = itemView.findViewById(R.id.item_title_popular)
        picPic = itemView.findViewById(R.id.item_imag_popular)
        fee = itemView.findViewById(R.id.item_price)
        addBtn = itemView.findViewById(R.id.add_Product)
    }
}