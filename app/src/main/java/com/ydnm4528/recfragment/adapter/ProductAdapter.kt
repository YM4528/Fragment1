package com.ydnm4528.recfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ydnm4528.recfragment.R
import com.ydnm4528.recfragment.model.Product
import kotlinx.android.synthetic.main.item_popularproduct.view.*


class ProductAdapter (var popularList : ArrayList<Product>):
        RecyclerView.Adapter<ProductAdapter.ProductViewHolder> () {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.txtnew.text = product.status
            itemView.txtoff.text = product.off
            itemView.txtnameProduct.text = product.productname
            itemView.txtbrandProduct.text = product.prductbrand
            itemView.txtPriceProduct.text = product.productprice
            itemView.imagePopular.setImageResource(product.productimage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_popularproduct, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int = popularList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(popularList[position])
    }


}