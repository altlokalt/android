package com.altlokaltsapplication.app.modules.filterpreference.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.databinding.RowListtabBinding
import com.altlokaltsapplication.app.modules.filterpreference.`data`.model.ListtabRowModel
import kotlin.Int
import kotlin.collections.List

class ListtabAdapter(
  var list: List<ListtabRowModel>
) : RecyclerView.Adapter<ListtabAdapter.RowListtabVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtabVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtab,parent,false)
    return RowListtabVH(view)
  }

  override fun onBindViewHolder(holder: RowListtabVH, position: Int) {
    val listtabRowModel = ListtabRowModel()
    // TODO uncomment following line after integration with data source
    // val listtabRowModel = list[position]
    holder.binding.listtabRowModel = listtabRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtabRowModel>) {
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
      item: ListtabRowModel
    ) {
    }
  }

  inner class RowListtabVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtabBinding = RowListtabBinding.bind(itemView)
  }
}
