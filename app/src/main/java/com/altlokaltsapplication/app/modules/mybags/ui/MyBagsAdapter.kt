package com.altlokaltsapplication.app.modules.mybags.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.databinding.RowMyBagsBinding
import com.altlokaltsapplication.app.modules.mybags.`data`.model.MyBagsRowModel
import kotlin.Int
import kotlin.collections.List

class MyBagsAdapter(
  var list: List<MyBagsRowModel>
) : RecyclerView.Adapter<MyBagsAdapter.RowMyBagsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyBagsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_bags,parent,false)
    return RowMyBagsVH(view)
  }

  override fun onBindViewHolder(holder: RowMyBagsVH, position: Int) {
    val myBagsRowModel = MyBagsRowModel()
    // TODO uncomment following line after integration with data source
    // val myBagsRowModel = list[position]
    holder.binding.myBagsRowModel = myBagsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyBagsRowModel>) {
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
      item: MyBagsRowModel
    ) {
    }
  }

  inner class RowMyBagsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMyBagsBinding = RowMyBagsBinding.bind(itemView)
  }
}
