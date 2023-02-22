package com.altlokaltsapplication.app.modules.sharerecipe.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.databinding.RowShareRecipeBinding
import com.altlokaltsapplication.app.modules.sharerecipe.`data`.model.ShareRecipeRowModel
import kotlin.Int
import kotlin.collections.List

class ShareRecipeAdapter(
  var list: List<ShareRecipeRowModel>
) : RecyclerView.Adapter<ShareRecipeAdapter.RowShareRecipeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowShareRecipeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_share_recipe,parent,false)
    return RowShareRecipeVH(view)
  }

  override fun onBindViewHolder(holder: RowShareRecipeVH, position: Int) {
    val shareRecipeRowModel = ShareRecipeRowModel()
    // TODO uncomment following line after integration with data source
    // val shareRecipeRowModel = list[position]
    holder.binding.shareRecipeRowModel = shareRecipeRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ShareRecipeRowModel>) {
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
      item: ShareRecipeRowModel
    ) {
    }
  }

  inner class RowShareRecipeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowShareRecipeBinding = RowShareRecipeBinding.bind(itemView)
  }
}
