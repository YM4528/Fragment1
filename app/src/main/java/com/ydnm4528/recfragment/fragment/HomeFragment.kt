package com.ydnm4528.recfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ydnm4528.recfragment.R
import com.ydnm4528.recfragment.adapter.LatestAdapter
import com.ydnm4528.recfragment.model.LatestArrival
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var arrivalList = ArrayList<LatestArrival> ()
        arrivalList.add(LatestArrival(R.drawable.lv, "Hyde Park", "N41015", "LOUIS VUITION", "211000 Ks"))
        arrivalList.add(LatestArrival(R.drawable.gaga, "HORNS WHITE SHORT", "SLEEVE T SHIRT", "Lady Gaga", "72000 Ks"))
        arrivalList.add(LatestArrival(R.drawable.iphone, "i Phone", "i Phone Xs", "Apple", "211000 Ks"))


        var latestAdapter = LatestAdapter(arrivalList)
       LatestArrivalRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        LatestArrivalRecycler.adapter = latestAdapter

      //  LatestArrivalRecycler.layoutManager = GridLayoutManager(context, 3)


    }


}