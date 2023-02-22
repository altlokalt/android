package com.altlokaltsapplication.app.modules.sharerecipe.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseDialogFragment
import com.altlokaltsapplication.app.databinding.DialogShareRecipeBinding
import com.altlokaltsapplication.app.modules.cookexperimentfindreceipe.ui.CookExperimentFindReceipeActivity
import com.altlokaltsapplication.app.modules.sharerecipe.`data`.model.ShareRecipeRowModel
import com.altlokaltsapplication.app.modules.sharerecipe.`data`.viewmodel.ShareRecipeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShareRecipeDialog : BaseDialogFragment<DialogShareRecipeBinding>(R.layout.dialog_share_recipe)
    {
  private val viewModel: ShareRecipeVM by viewModels<ShareRecipeVM>()

  private val REQUEST_CODE_COOK_EXPERIMENT_FIND_RECEIPE_ACTIVITY: Int = 726

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val shareRecipeAdapter =
    ShareRecipeAdapter(viewModel.shareRecipeList.value?:mutableListOf())
    binding.recyclerShareRecipe.adapter = shareRecipeAdapter
    shareRecipeAdapter.setOnItemClickListener(
    object : ShareRecipeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ShareRecipeRowModel) {
        onClickRecyclerShareRecipe(view, position, item)
      }
    }
    )
    viewModel.shareRecipeList.observe(requireActivity()) {
      shareRecipeAdapter.updateData(it)
    }
    binding.shareRecipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSend.setOnClickListener {
      val destIntent = CookExperimentFindReceipeActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_COOK_EXPERIMENT_FIND_RECEIPE_ACTIVITY)
      requireActivity().overridePendingTransition(R.anim.left_to_right ,R.anim.right_to_left )
      dismiss()
    }
  }

  fun onClickRecyclerShareRecipe(
    view: View,
    position: Int,
    item: ShareRecipeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SHARE_RECIPE_DIALOG"


    fun getInstance(bundle: Bundle?): ShareRecipeDialog {
      val fragment = ShareRecipeDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
