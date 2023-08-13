package com.example.electriccarapp.presentacion

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.electriccarapp.presentacion.adapter.FavoriteFragment

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
         return when(position) {
             0 -> CarFragment()
             1 -> FavoriteFragment()
             else -> CarFragment()
         }


    }


override fun getItemCount(): Int {

        return 2
    }


}