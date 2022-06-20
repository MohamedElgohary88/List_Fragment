package com.example.listfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle)
    :FragmentStateAdapter(fragmentManager,lifecycle){

    val frgmentList:ArrayList<Fragment> = ArrayList()
    val fragmentTittle:ArrayList<String> = ArrayList()


    override fun getItemCount(): Int {
        return frgmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return frgmentList[position]

    }
    fun addFragment(fragment: Fragment,tittle:String){
        frgmentList.add(fragment)
        fragmentTittle.add(tittle)
    }
}