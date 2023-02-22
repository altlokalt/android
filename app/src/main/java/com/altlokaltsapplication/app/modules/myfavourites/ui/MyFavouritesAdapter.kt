package com.altlokaltsapplication.app.modules.myfavourites.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.databinding.RowMyFavouritesBinding
import com.altlokaltsapplication.app.modules.myfavourites.`data`.model.MyFavouritesRowModel
import kotlin.Int
import kotlin.collections.List

class MyFavouritesAdapter(
  var list: List<MyFavouritesRowModel>
) : RecyclerView.Adapter<MyFavouritesAdapter.RowMyFavouritesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyFavouritesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_favourites,parent,false)
    return RowMyFavouritesVH(view)
  }

  override fun onBindViewHolder(holder: RowMyFavouritesVH, position: Int) {
    val myFavouritesRowModel = MyFavouritesRowModel()
    // TODO uncomment following line after integration with data source
    // val myFavouritesRowModel = list[position]
    holder.binding.myFavouritesRowModel = myFavouritesRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyFavouritesRowModel>) {
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
      item: MyFavouritesRowModel
    ) {
    }
  }

  inner class RowMyFavouritesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMyFavouritesBinding = RowMyFavouritesBinding.bind(itemView)
    init {
      binding.btnSeeAll.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MyFavouritesRowModel())
      }
    }
  }
}
