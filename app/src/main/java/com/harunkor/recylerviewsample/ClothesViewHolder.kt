package com.harunkor.recylerviewsample

import android.widget.ImageView
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.recylerviewsample.databinding.RecyclerItemBinding

class ClothesViewHolder(
    val clothesBinding: ViewDataBinding
): RecyclerView.ViewHolder(clothesBinding.root) {

    fun onBind(clothesModel: ClothesModel) {
        val binding = clothesBinding as RecyclerItemBinding
         //binding.clothesModel = clothesModel
         binding.setVariable(BR.clothesModel,clothesModel)
    }

}