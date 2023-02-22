package com.altlokaltsapplication.app.modules.createrecipe.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.altlokaltsapplication.app.databinding.ActivityCreateRecipeBinding
import com.altlokaltsapplication.app.modules.createrecipe.`data`.viewmodel.CreateRecipeVM
import com.altlokaltsapplication.app.modules.onboarding.ui.OnboardingActivity
import com.altlokaltsapplication.app.modules.sharerecipe.ui.ShareRecipeDialog
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CreateRecipeActivity :
    BaseActivity<ActivityCreateRecipeBinding>(R.layout.activity_create_recipe) {
  private val viewModel: CreateRecipeVM by viewModels<CreateRecipeVM>()

  private val REQUEST_CODE_SHARE_RECIPE_DIALOG: Int = 333


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createRecipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtAddaphotoof.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.btnPublish.setOnClickListener {
      val destFragment = ShareRecipeDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, ShareRecipeDialog.TAG)
    }
    binding.imagePlus.setOnClickListener {
      Firebase.auth.signOut()
      logoutUser()
    }
    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  fun logoutUser(): Unit {
    val destIntent = OnboardingActivity.getIntent(this, null)
    destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    startActivity(destIntent)
  }

  companion object {
    const val TAG: String = "CREATE_RECIPE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateRecipeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
