package com.onurdemir.composekisilerapp.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.onurdemir.composekisilerapp.entity.Kisiler

class KisilerDaoRepository {
    var kisilerListesi = MutableLiveData<List<Kisiler>>()

    init {
        kisilerListesi = MutableLiveData()
    }

    fun kisilerGetir():MutableLiveData<List<Kisiler>> {
        return kisilerListesi
    }

    fun tumKisileriAl() {
        val liste = mutableListOf<Kisiler>()

        val k1 = Kisiler(1, "Ahmet", "11111")
        val k2 = Kisiler(2,"Veli", "22222")
        val k3 = Kisiler(3,"Ali", "33333")
        val k4 = Kisiler(4,"Mehmet", "44444")
        val k5 = Kisiler(5,"Onur", "55555")


        liste.add(k1)
        liste.add(k2)
        liste.add(k3)
        liste.add(k4)
        liste.add(k5)

        kisilerListesi.value = liste
    }
    fun kisiAra(aramaKelimesi:String) {
        Log.e("Kişi Arama", aramaKelimesi)
    }

    fun kisiKayit(kisi_ad:String, kisi_tel:String) {
        Log.e("Kişi Kayıt","$kisi_ad - $kisi_tel")
    }

    fun kisiGuncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String) {
        Log.e("Kişi Güncelle","$kisi_id, $kisi_ad, $kisi_tel")
    }

    fun kisiSil(kisi_id:Int) {
        Log.e("Kişi Sil","$kisi_id")
    }
}
