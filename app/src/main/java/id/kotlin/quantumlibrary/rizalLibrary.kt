package id.kotlin.quantumlibrary

import android.os.Parcel
import android.os.Parcelable


internal class rizal : Parcelable {
    var name: String? = null
    var remarks: String? = null
    var photo: String? = null
    var deskripsi: String? = null
    var penulis: String? = null
    var tahun: String? = null
    var halaman: String? = null
    

    companion object CREATOR : Parcelable.Creator<rizal> {
        override fun createFromParcel(parcel: Parcel): rizal {
            return rizal(parcel)
        }

        override fun newArray(size: Int): Array<rizal?> {
            return arrayOfNulls(size)
        }
    }


}