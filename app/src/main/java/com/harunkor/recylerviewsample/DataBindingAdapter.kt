package com.harunkor.recylerviewsample

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class DataBindingAdapter {

   /* fun ImageView.setImageResource(resource: Int){
        setImageResource(resource)
    }*/

    companion object {
        @JvmStatic @BindingAdapter("patikaResource")
        fun setImageResource(imageView: ImageView,resource: Int){
            imageView.setImageResource(resource)
        }
    }
}