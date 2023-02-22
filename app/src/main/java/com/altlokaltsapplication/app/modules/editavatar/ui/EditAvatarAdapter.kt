package com.altlokaltsapplication.app.modules.editavatar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.databinding.RowEditAvatarBinding
import com.altlokaltsapplication.app.modules.editavatar.`data`.model.EditAvatarRowModel
import kotlin.Int
import kotlin.collections.List

class EditAvatarAdapter(
  var list: List<EditAvatarRowModel>
) : RecyclerView.Adapter<EditAvatarAdapter.RowEditAvatarVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEditAvatarVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_edit_avatar,parent,false)
    return RowEditAvatarVH(view)
  }

  override fun onBindViewHolder(holder: RowEditAvatarVH, position: Int) {
    val editAvatarRowModel = EditAvatarRowModel()
    // TODO uncomment following line after integration with data source
    // val editAvatarRowModel = list[position]
    holder.binding.editAvatarRowModel = editAvatarRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EditAvatarRowModel>) {
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
      item: EditAvatarRowModel
    ) {
    }
  }

  inner class RowEditAvatarVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEditAvatarBinding = RowEditAvatarBinding.bind(itemView)
  }
}
