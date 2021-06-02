package id.kotlin.quantumlibrary

import java.util.ArrayList

internal object rizalData {
    var data = arrayOf(
        arrayOf(
            "Book 1",
            "Technology",
            "https://upload.wikimedia.org/wikipedia/en/a/a2/The_7_Habits_of_Highly_Effective_People.jpg",
            "Deskripsi",
            "Tanggal",
            "Tanggal",
            "0"
        ), arrayOf(
            "Book 2",
            "Technology",
            "https://upload.wikimedia.org/wikipedia/en/a/a2/The_7_Habits_of_Highly_Effective_People.jpg",
            "Deskripsi",
            "Tanggal",
            "Tanggal",
            "0"
        ),
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