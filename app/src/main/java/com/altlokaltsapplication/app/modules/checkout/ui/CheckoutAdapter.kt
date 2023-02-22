package com.altlokaltsapplication.app.modules.checkout.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.databinding.RowCheckoutBinding
import com.altlokaltsapplication.app.modules.checkout.`data`.model.CheckoutRowModel
import kotlin.Int
import kotlin.collections.List

class CheckoutAdapter(
  var list: List<CheckoutRowModel>
) : RecyclerView.Adapter<CheckoutAdapter.RowCheckoutVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCheckoutVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_checkout,parent,false)
    return RowCheckoutVH(view)
  }

  override fun onBindViewHolder(holder: RowCheckoutVH, position: Int) {
    val checkoutRowModel = CheckoutRowModel()
    // TODO uncomment following line after integration with data source
    // val checkoutRowModel = list[position]
    holder.binding.checkoutRowModel = checkoutRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CheckoutRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: CheckoutRowModel
    ) {
    }
  }

  inner class RowCheckoutVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCheckoutBinding = RowCheckoutBinding.bind(itemView)
  }
}
