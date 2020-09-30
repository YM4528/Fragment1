package com.ydnm4528.recfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.ydnm4528.recfragment.R
import com.ydnm4528.recfragment.adapter.CountryAdapter
import com.ydnm4528.recfragment.model.Country
import kotlinx.android.synthetic.main.fragment_country.*


class CountryFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var countryList = ArrayList<Country> ()
        countryList.add(Country(R.drawable.jp, "Japan"))
        countryList.add(Country(R.drawable.korea, "Korea"))
        countryList.add(Country(R.drawable.china, "China"))
        countryList.add(Country(R.drawable.international, "International"))


        var countryAdapter = CountryAdapter(countryList)
        CountryRecycler.layoutManager = GridLayoutManager(context, 2)
        CountryRecycler.adapter = countryAdapter

       // CountryRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)



    }


}