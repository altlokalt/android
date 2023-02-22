package com.altlokaltsapplication.app.modules.videos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.videos.`data`.model.VideosModel
import org.koin.core.KoinComponent

class VideosVM : ViewModel(), KoinComponent {
  val videosModel: MutableLiveData<VideosModel> = MutableLiveData(VideosModel())

  var navArguments: Bundle? = null
}
