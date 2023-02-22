package com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.`annotation`.LayoutRes
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.`data`.model.AutoCompTxtRecipeyModel
import java.util.Locale
import kotlin.Int
import kotlin.collections.List

class AutoCompTxtRecipeyAdapter(
  private val mContext: Context,
  @LayoutRes
  private val layoutResource: Int,
  private val allItems: List<AutoCompTxtRecipeyModel>
) : ArrayAdapter<AutoCompTxtRecipeyModel>(mContext, layoutResource, allItems), Filterable {
  var mItem: List<AutoCompTxtRecipeyModel> = allItems

  override fun getCount(): Int = mItem.size

  override fun getItem(position: Int): AutoCompTxtRecipeyModel = mItem[position]

  override fun getView(
    position: Int,
    convertView: View?,
    parent: ViewGroup
  ): View {
    var view = convertView
    if (view == null) {
      view = LayoutInflater.from(mContext).inflate(
      layoutResource, parent, false
      )
    }
    val textViewName: TextView = view!!.findViewById(R.id.txtTitle)
    val items: AutoCompTxtRecipeyModel? = getItem(position)
    if (items != null) {
      textViewName.text = items.itemName
    }
    return view
  }

  override fun getFilter(): Filter {
    val filterObj = object : Filter() {
      override fun publishResults(charSequence: CharSequence?,filterResults: Filter.FilterResults) {
        mItem = filterResults.values as List<AutoCompTxtRecipeyModel>
        notifyDataSetChanged()
      }
      override fun performFiltering(charSequence: CharSequence?): Filter.FilterResults {
        val queryString = charSequence?.toString()?.toLowerCase(Locale.getDefault())
        val filterResults = Filter.FilterResults()
        filterResults.values = if (queryString == null || queryString.isEmpty())
        allItems
        else
        allItems.filter {
          it.itemName.toLowerCase(Locale.getDefault()).contains(queryString)
        }
        return filterResults
      }
      override fun convertResultToString(resultValue: Any?): CharSequence {
        return (resultValue as AutoCompTxtRecipeyModel).itemName
      }
    }
    return filterObj
  }
}
