package com.altlokaltsapplication.app.modules.videoframe.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseFragment
import com.altlokaltsapplication.app.databinding.FragmentVideoframeBinding
import com.altlokaltsapplication.app.modules.videoframe.`data`.viewmodel.VideoframeVM
import kotlin.String
import kotlin.Unit

class VideoframeFragment : BaseFragment<FragmentVideoframeBinding>(R.layout.fragment_videoframe) {
  private val viewModel: VideoframeVM by viewModels<VideoframeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.videoframeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VIDEOFRAME_FRAGMENT"


    fun getInstance(bundle: Bundle?): VideoframeFragment {
      val fragment = VideoframeFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
