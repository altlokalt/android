package com.altlokaltsapplication.app.appcomponents.di

import android.app.Application
import com.altlokaltsapplication.app.appcomponents.network.RetrofitProvider
import com.altlokaltsapplication.app.appcomponents.utility.PreferenceHelper
import com.altlokaltsapplication.app.network.repository.NetworkRepository
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.MutableList
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class MyApp : Application() {
  private fun prepareNetworkModules(): List<Module> {
    val repoModules =
    module {
      single {
        	NetworkRepository()
      }
    }
    val serviceModules =
    module {
      single {
        RetrofitProvider().getService()
      }
    }
    return repoModules + serviceModules
  }

  public override fun onCreate(): Unit {
    super.onCreate()
    instance = this
    startKoin {
      androidLogger()
      androidContext(this@MyApp)
      loadKoinModules(getKoinModules())
    }
  }

  /**
   * method which prepares [PreferenceHelper]s koin module
   * @return [Module] - the koin module
   */
  private fun preferenceModule(): Module {
    val prefsModule = module {
      single {
        PreferenceHelper()
      }
    }
    return prefsModule
  }

  /**
   * method which returns the list of koin module to register
   * @return MutableList<Module> - list of koin modules
   */
  private fun getKoinModules(): MutableList<Module> {
    val koinModules = mutableListOf<Module>()
    koinModules.add(preferenceModule())
    koinModules.addAll(prepareNetworkModules())
    return koinModules
  }

  companion object {
    private lateinit var instance: MyApp

    /**
     * method to get instance of application object
     */
    public fun getInstance(): MyApp = instance
  }
}
