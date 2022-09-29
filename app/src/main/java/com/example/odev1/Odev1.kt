package com.example.odev1
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    val islemNo:Int = 729
    val ogrNo:Int = 1160501015
    var kitapNo:Int = 2282181
    val aTarih = LocalDate.of(1998, 23, 3)
    var vTarih = LocalDate.of(2022, 28, 9)
    var ogrAd:String = "Basri"
    val ogrSoyad:String = "Ayaz"
    var ogrCinsiyet:String = "Erkek"
    val dTarih:String = "23/03/1998"
    val sınıf:Int = 3
    var isbnNo: Long = 9789750726439
    val kitapAdi:String = "Simyacı"
    var yazarNo: Int = 1
    val turNo: Int = 24
    var sayfaSayisi : Int = 188
    var puan:Double = 9.8
    val turAdi:String = "Roman"

}