package com.example.projectfood.Adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectfood.Activity.MainActivity
import com.example.projectfood.Activity.ShowDetailActivity
import com.example.projectfood.R
import com.example.projectfood.ViewHolder.ViewHolderPopular
import com.example.projectfood.model.FoodDomain

class PopularAdapter(val foodDomains: List<FoodDomain>) :
    RecyclerView.Adapter<ViewHolderPopular>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPopular {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
        return ViewHolderPopular(view)
    }

    override fun onBindViewHolder(holder: ViewHolderPopular, position: Int) {
        holder.title.setText(foodDomains.get(position).title)
        holder.fee.setText(foodDomains.get(position).fee.toString())


        val drawbleResoucerId = holder.itemView.context.resources.getIdentifier(
            foodDomains.get(position).pic,
            "drawable",
            holder.itemView.context.packageName
        )

        Glide.with(holder.itemView.context)
            .load(drawbleResoucerId)
            .into(holder.picPic)

        holder.addBtn.setOnClickListener {
            val intent = Intent(holder.itemView.context, ShowDetailActivity::class.java)
            Log.d("text", foodDomains.get(position).toString())
            intent.putExtra("object", foodDomains.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return foodDomains.size
    }


}