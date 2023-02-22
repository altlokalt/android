package com.altlokaltsapplication.app.appcomponents.utility

import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginResponseData
import com.google.gson.Gson
import java.lang.Exception
import kotlin.String

class PreferenceHelper {
  private val masterKeyAlias: String = createGetMasterKey()


  private val sharedPreference: SharedPreferences = EncryptedSharedPreferences.create(
  MyApp.getInstance().resources.getString(R.string.app_name),
  masterKeyAlias,
  MyApp.getInstance().applicationContext,
  EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
  EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
  )


  /**
   * Creates or gets the master key provided,
   * The encryption scheme is required fields to ensure that the type of encryption used is clear to
   * developers.
   *
   * @return the string value of encrypted key
   */
  private fun createGetMasterKey(): String = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)

  fun setTest(paramValue: CreateLoginResponseData?) {
    with(sharedPreference.edit()) {
      try {
        val jsonString = Gson().toJson(paramValue)
        this.putString("test", jsonString!!)
        apply()
      } catch(e:Exception) {
        //  TODO: Inconvertible type of data
        //  So better to wrap it inside try-catch
      }
    }
  }

  fun getTest(): CreateLoginResponseData? {
    val result = sharedPreference.getString("test", null)
    val convertedResult = try {
      Gson().fromJson(result, CreateLoginResponseData::class.java)
    } catch(e:Exception) {
      //  TODO: Inconvertible type of data
      //  So better to wrap it inside try-catch
      null
    }
    return convertedResult
  }
}
