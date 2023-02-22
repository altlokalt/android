package com.altlokaltsapplication.app.modules.filterpreference.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.altlokaltsapplication.app.databinding.BottomsheetFilterPreferenceBinding
import com.altlokaltsapplication.app.modules.checkout.ui.CheckoutActivity
import com.altlokaltsapplication.app.modules.filterpreference.`data`.model.ListtabOneTwoRowModel
import com.altlokaltsapplication.app.modules.filterpreference.`data`.model.ListtabRowModel
import com.altlokaltsapplication.app.modules.filterpreference.`data`.viewmodel.FilterPreferenceVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FilterPreferenceBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetFilterPreferenceBinding>(R.layout.bottomsheet_filter_preference)
    {
  private val viewModel: FilterPreferenceVM by viewModels<FilterPreferenceVM>()

  private val REQUEST_CODE_CHECKOUT_ACTIVITY: Int = 686


  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listtabAdapter = ListtabAdapter(viewModel.listtabList.value?:mutableListOf())
    binding.recyclerListtab.adapter = listtabAdapter
    listtabAdapter.setOnItemClickListener(
    object : ListtabAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtabRowModel) {
        onClickRecyclerListtab(view, position, item)
      }
    }
    )
    viewModel.listtabList.observe(requireActivity()) {
      listtabAdapter.updateData(it)
    }
    val listtabOneTwoAdapter =
    ListtabOneTwoAdapter(viewModel.listtabOneTwoList.value?:mutableListOf())
    binding.recyclerListtabOneTwo.adapter = listtabOneTwoAdapter
    listtabOneTwoAdapter.setOnItemClickListener(
    object : ListtabOneTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtabOneTwoRowModel) {
        onClickRecyclerListtabOneTwo(view, position, item)
      }
    }
    )
    viewModel.listtabOneTwoList.observe(requireActivity()) {
      listtabOneTwoAdapter.updateData(it)
    }
    binding.filterPreferenceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = CheckoutActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_CHECKOUT_ACTIVITY)
      requireActivity().overridePendingTransition(R.anim.fade_in ,R.anim.slide_up )
      dismiss()
    }
  }

  fun onClickRecyclerListtab(
    view: View,
    position: Int,
    item: ListtabRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtabOneTwo(
    view: View,
    position: Int,
    item: ListtabOneTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FILTER_PREFERENCE_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): FilterPreferenceBottomsheet {
      val fragment = FilterPreferenceBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
