package com.altlokaltsapplication.app.modules.videoframe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.videoframe.`data`.model.VideoframeModel
import org.koin.core.KoinComponent

class VideoframeVM : ViewModel(), KoinComponent {
  val videoframeModel: MutableLiveData<VideoframeModel> = MutableLiveData(VideoframeModel())

  var navArguments: Bundle? = null
}
