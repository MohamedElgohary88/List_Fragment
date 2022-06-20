package com.example.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_first.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        prepareList()
    }

    private fun prepareList() {
        val array:ArrayList<String> = ArrayList()
        for (i in 31..60){
            array.add("item $i")
        }
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            requireContext(), com.google.android.material.R.layout.support_simple_spinner_dropdown_item,array)

        listview?.adapter = arrayAdapter
    }
}