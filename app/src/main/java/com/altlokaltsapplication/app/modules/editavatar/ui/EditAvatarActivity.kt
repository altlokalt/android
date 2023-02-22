package com.altlokaltsapplication.app.modules.editavatar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityEditAvatarBinding
import com.altlokaltsapplication.app.modules.editavatar.`data`.model.EditAvatarRowModel
import com.altlokaltsapplication.app.modules.editavatar.`data`.viewmodel.EditAvatarVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditAvatarActivity : BaseActivity<ActivityEditAvatarBinding>(R.layout.activity_edit_avatar) {
  private val viewModel: EditAvatarVM by viewModels<EditAvatarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val editAvatarAdapter = EditAvatarAdapter(viewModel.editAvatarList.value?:mutableListOf())
    binding.recyclerEditAvatar.adapter = editAvatarAdapter
    editAvatarAdapter.setOnItemClickListener(
    object : EditAvatarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EditAvatarRowModel) {
        onClickRecyclerEditAvatar(view, position, item)
      }
    }
    )
    viewModel.editAvatarList.observe(this) {
      editAvatarAdapter.updateData(it)
    }
    binding.editAvatarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerEditAvatar(
    view: View,
    position: Int,
    item: EditAvatarRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_AVATAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditAvatarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
