package id.kotlin.quantumlibrary

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import id.kotlin.quantumlibrary.CardViewRizalAdapter.CardViewHolder
import java.util.*

class CardViewRizalAdapter(private val context: Context) : RecyclerView.Adapter<CardViewHolder>() {
    internal var listRizal: ArrayList<rizal>? = null
    private val activity: Activity? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_rizal, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val k = listRizal!![position]
        Glide.with(context).load(k.photo).override(350, 550).into(holder.imgPhoto)
        holder.tvname.text = k.name
        holder.tvremarks.text = k.remarks
        holder.rizal = k
        holder.btnsahre.setOnClickListener(CustomOnItemClickListener(position) { view, position ->
            Toast.makeText(
                context,
                "Share" + listRizal!![position as Int].name,
                Toast.LENGTH_SHORT
            ).show()
        })
    }

    override fun getItemCount(): Int {
        return listRizal!!.size
    }

    fun startactivity(intent: Intent?) {}
    inner class CardViewHolder(itemView: View) : ViewHolder(itemView), View.OnClickListener {
        var imgPhoto: ImageView
        var tvname: TextView
        var tvremarks: TextView
        var btndetail: Button
        var btnsahre: Button
        internal var rizal: rizal? = null
        override fun onClick(view: View) {
            val intent = Intent(context, DetailRizalActivity::class.java)
            intent.putExtra("key", rizal)
            context.startActivity(intent)
        }

        init {
            imgPhoto = itemView.findViewById<View>(R.id.img_item_photo) as ImageView
            tvname = itemView.findViewById<View>(R.id.tv_item_name) as TextView
            tvremarks = itemView.findViewById<View>(R.id.tv_item_remarks) as TextView
            btnsahre = itemView.findViewById<View>(R.id.btn_set_share) as Button
            btndetail = itemView.findViewById<View>(R.id.btn_set_detail) as Button
            btndetail.setOnClickListener(this)
        }
    }
}