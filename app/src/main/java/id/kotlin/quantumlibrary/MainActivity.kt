package id.kotlin.quantumlibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import java.util.*

class MainActivity : AppCompatActivity() {
    private var rvCategory: RecyclerView? = null
    private var list: ArrayList<rizal>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvCategory = findViewById<View>(R.id.rv_category) as RecyclerView
        rvCategory!!.setHasFixedSize(true)
        list = ArrayList()
        list!!.addAll(rizalData.listData)
        showRecylerCardView()
    }

    private fun showRecylerCardView() {
        rvCategory!!.layoutManager = LinearLayoutManager(this)
        val cardViewPresidentAdapter = CardViewRizalAdapter(this)
        cardViewPresidentAdapter.listRizal = list
        rvCategory!!.adapter = cardViewPresidentAdapter
    }
}