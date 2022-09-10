package com.harunkor.recylerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.harunkor.recylerviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val list = listOf(
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
          ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
        ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
        ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
        ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
        ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),         ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),         ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress),
            ClothesModel("Fit and Flare","$120.99",R.drawable.fit_and_flare),
            ClothesModel("Empire Dress","$136.00",R.drawable.empire_dress),
            ClothesModel("Summer Vibes","$199.99",R.drawable.summer_dress),
            ClothesModel("Flora Fun","$150.99",R.drawable.flore_dress_2),
            ClothesModel("Fit and Fun","$123.99",R.drawable.empire_dress),
            ClothesModel("Summer Dress","$139.99",R.drawable.summer_dress)
        )

        val adapter = ClothesAdapter(list)
        val gridLayoutManager = GridLayoutManager(this,2)
        binding.apply {
            recyclerView.layoutManager = gridLayoutManager
            recyclerView.addItemDecoration(SpacesItemDecoration(20))
            setVariable(BR.adapter,adapter)
        }

        //binding.recyclerView.adapter = adapter



    }
}