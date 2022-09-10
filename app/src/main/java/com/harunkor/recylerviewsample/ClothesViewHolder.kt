package com.harunkor.recylerviewsample

import android.widget.ImageView
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.recylerviewsample.databinding.RecyclerItemBinding

class ClothesViewHolder(
    val clothesBinding: ViewDataBinding,
): RecyclerView.ViewHolder(clothesBinding.root) {

    fun onBind(clothesModel: ClothesModel, onItemClickHandler: (clothesModel: ClothesModel) -> Unit) {
        val binding = clothesBinding as RecyclerItemBinding
         //binding.clothesModel = clothesModel
         binding.root.setOnClickListener{onItemClickHandler(clothesModel)}
         val clothesModelClicked = ClothesModel("right bottom clicked","right bottom clicked",0)
         binding.imageButton.setOnClickListener { onItemClickHandler(clothesModelClicked) }

         binding.setVariable(BR.clothesModel,clothesModel)
    }

}