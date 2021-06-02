package id.kotlin.quantumlibrary

import java.util.ArrayList

internal object rizalData {
    var data = arrayOf(
  
    )
    val listData: ArrayList<rizal>
        get() {
            var rizal: rizal? = null
            val list = ArrayList<rizal>()
            for (i in data.indices) {
                rizal = rizal()
                rizal.name = data[i][0]
                rizal.remarks = data[i][1]
                rizal.photo = data[i][2]
                rizal.deskripsi = data[i][3]
                rizal.penulis = data[i][4]
                rizal.tahun = data[i][5]
                rizal.halaman = data[i][6]
                list.add(rizal)
            }
            return list
        }
}