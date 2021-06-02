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

    protected constructor(`in`: Parcel) {
        name = `in`.readString()
        remarks = `in`.readString()
        photo = `in`.readString()
        deskripsi = `in`.readString()
        penulis = `in`.readString()
        tahun = `in`.readString()
        halaman = `in`.readString()
    }

    constructor() {}

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, i: Int) {
        parcel.writeString(name)
        parcel.writeString(remarks)
        parcel.writeString(photo)
        parcel.writeString(deskripsi)
        parcel.writeString(penulis)
        parcel.writeString(tahun)
        parcel.writeString(halaman)
    }

    companion object CREATOR : Parcelable.Creator<rizal> {
        override fun createFromParcel(parcel: Parcel): rizal {
            return rizal(parcel)
        }

        override fun newArray(size: Int): Array<rizal?> {
            return arrayOfNulls(size)
        }
    }


}