package com.ydnm4528.recfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ydnm4528.recfragment.R
import com.ydnm4528.recfragment.model.LatestArrival
import kotlinx.android.synthetic.main.item_latestarrival.view.*

class LatestAdapter (var arrivalList : ArrayList<LatestArrival>):
        RecyclerView.Adapter<LatestAdapter.LatestViewHolder>() {

    class LatestViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        fun bind(latestArrival: LatestArrival) {
            itemView.txtName.text = latestArrival.name
            itemView.txtCode.text = latestArrival.code
            itemView.txtBrand.text = latestArrival.barnd
            itemView.img.setImageResource(latestArrival.image)
            //itemView.discout.text = latestArrival.discount
            itemView.Price.text = latestArrival.price
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_latestarrival, parent, false)
        return LatestViewHolder(view)
    }

    override fun getItemCount(): Int = arrivalList.size

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.bind(arrivalList[position])
    }




}