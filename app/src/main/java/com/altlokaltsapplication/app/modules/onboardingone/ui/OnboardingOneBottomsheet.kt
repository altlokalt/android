package com.altlokaltsapplication.app.modules.onboardingone.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.altlokaltsapplication.app.databinding.BottomsheetOnboardingOneBinding
import com.altlokaltsapplication.app.modules.editavatar.ui.EditAvatarActivity
import com.altlokaltsapplication.app.modules.myprofile.ui.MyProfileActivity
import com.altlokaltsapplication.app.modules.onboardingone.`data`.viewmodel.OnboardingOneVM
import com.altlokaltsapplication.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnboardingOneBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetOnboardingOneBinding>(R.layout.bottomsheet_onboarding_one)
    {
  private val viewModel: OnboardingOneVM by viewModels<OnboardingOneVM>()

  private val REQUEST_CODE_EDIT_AVATAR_ACTIVITY: Int = 171


  private val REQUEST_CODE_MY_PROFILE_ACTIVITY: Int = 974


  private val REQUEST_CODE_SETTING_ACTIVITY: Int = 629


  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.onboardingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignInWithFacebook.setOnClickListener {
      val destIntent = EditAvatarActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_EDIT_AVATAR_ACTIVITY)
      requireActivity().overridePendingTransition(R.anim.left_to_right ,R.anim.left_to_right )
      dismiss()
    }
    binding.btnSignInWithAppleOne.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_MY_PROFILE_ACTIVITY)
      requireActivity().overridePendingTransition(R.anim.slide_up ,R.anim.fade_out )
      dismiss()
    }
    binding.btnSignInWithPhoneOne.setOnClickListener {
      val destIntent = SettingActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_SETTING_ACTIVITY)
      requireActivity().overridePendingTransition(R.anim.fade_in ,R.anim.fade_out )
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_ONE_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): OnboardingOneBottomsheet {
      val fragment = OnboardingOneBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
