package com.onurdemir.composekisilerapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.onurdemir.composekisilerapp.repository.KisilerDaoRepository

class KisiKayitSayfaViewModel : ViewModel() {
    var krepo = KisilerDaoRepository()

    fun kayit(kisi_ad:String, kisi_tel:String) {
        krepo.kisiKayit(kisi_ad, kisi_tel)
    }
}