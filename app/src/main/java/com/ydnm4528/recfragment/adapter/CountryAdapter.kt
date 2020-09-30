package com.ydnm4528.recfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ydnm4528.recfragment.R
import com.ydnm4528.recfragment.model.Country
import kotlinx.android.synthetic.main.item_country.view.*
import kotlinx.android.synthetic.main.item_latestarrival.view.*

class CountryAdapter (var countryList : ArrayList<Country>):
    RecyclerView.Adapter<CountryAdapter.CountryVeiwHolder>() {

    class CountryVeiwHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(country: Country) {
            itemView.CountryImage.setImageResource(country.countryimage)
            itemView.txtCountry.text = country.country
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryVeiwHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryVeiwHolder(view)
    }

    override fun getItemCount(): Int = countryList.size

    override fun onBindViewHolder(holder: CountryVeiwHolder, position: Int) {
        holder.bind(countryList[position])
    }




}