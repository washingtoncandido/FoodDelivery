package com.example.projectfood.ViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfood.R

class ViewHolderCategory(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var categoryName: TextView
    var categoryPic: ImageView
    var mainLayout: ConstraintLayout

    init {
        categoryName = itemView.findViewById(R.id.category_name)
        categoryPic = itemView.findViewById(R.id.category_pic)
        mainLayout = itemView.findViewById(R.id.mainLayout)
    }
}