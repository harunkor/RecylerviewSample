package com.harunkor.recylerviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.recylerviewsample.databinding.RecyclerItemBinding

class ClothesAdapter( private val list: List<ClothesModel>,
 private val onItemClickHandler: (clothesModel: ClothesModel) -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val clothesBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),R.layout.recycler_item,parent,false
        )


        return ClothesViewHolder(clothesBinding,)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ClothesViewHolder).onBind(list.get(position),onItemClickHandler)
    }

    override fun getItemCount(): Int {
       return list.size
    }




}