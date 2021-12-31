package com.example.projectfood.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectfood.R
import com.example.projectfood.ViewHolder.ViewHolderCategory
import com.example.projectfood.model.Category

class CategoryAdapter(val categorys: List<Category>) : RecyclerView.Adapter<ViewHolderCategory>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCategory {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolderCategory(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCategory, position: Int) {
        holder.categoryName.setText(categorys.get(position).title)
        var picUrl = ""
        when (position) {
            0 -> {
                picUrl = "cat_1"
                holder.mainLayout.setBackground(
                    ContextCompat.getDrawable(
                        holder.itemView.getContext(),
                        R.drawable.category_back
                    )
                )
            }
            1 -> {
                picUrl = "cat_2"
                holder.mainLayout.setBackground(
                    ContextCompat.getDrawable(
                        holder.itemView.getContext(),
                        R.drawable.category_back2
                    )
                )
            }
            2 -> {
                picUrl = "cat_3"
                holder.mainLayout.setBackground(
                    ContextCompat.getDrawable(
                        holder.itemView.getContext(),
                        R.drawable.category_back3
                    )
                )
            }
            3 -> {
                picUrl = "cat_4"
                holder.mainLayout.setBackground(
                    ContextCompat.getDrawable(
                        holder.itemView.getContext(),
                        R.drawable.category_back4
                    )
                )
            }
            4-> {
                picUrl = "cat_5"
                holder.mainLayout.setBackground(
                    ContextCompat.getDrawable(
                        holder.itemView.getContext(),
                        R.drawable.category_back5
                    )
                )
            }

        }
           val drawbleResoucerId= holder.itemView.context.resources.getIdentifier(picUrl,"drawable",holder.itemView.context.packageName)

        Glide.with(holder.itemView.context)
            .load(drawbleResoucerId)
            .into(holder.categoryPic)
    }

    override fun getItemCount(): Int {
        return categorys.size
    }


}