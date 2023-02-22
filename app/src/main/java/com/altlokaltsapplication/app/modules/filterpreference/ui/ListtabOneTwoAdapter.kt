package com.altlokaltsapplication.app.modules.filterpreference.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.databinding.RowListtabOneTwoBinding
import com.altlokaltsapplication.app.modules.filterpreference.`data`.model.ListtabOneTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListtabOneTwoAdapter(
  var list: List<ListtabOneTwoRowModel>
) : RecyclerView.Adapter<ListtabOneTwoAdapter.RowListtabOneTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtabOneTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtab_one_two,parent,false)
    return RowListtabOneTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListtabOneTwoVH, position: Int) {
    val listtabOneTwoRowModel = ListtabOneTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listtabOneTwoRowModel = list[position]
    holder.binding.listtabOneTwoRowModel = listtabOneTwoRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtabOneTwoRowModel>) {
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
      item: ListtabOneTwoRowModel
    ) {
    }
  }

  inner class RowListtabOneTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtabOneTwoBinding = RowListtabOneTwoBinding.bind(itemView)
  }
}
