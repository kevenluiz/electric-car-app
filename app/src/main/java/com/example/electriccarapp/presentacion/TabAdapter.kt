package com.example.electriccarapp.presentacion

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when(position){
            1 -> CarFragment()
            2 -> CarFragment()
            else -> CarFragment()

       }
    }


override fun getItemCount(): Int {

        return 2
    }


}