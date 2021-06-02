package id.kotlin.quantumlibrary

import android.view.View

class CustomOnItemClickListener(
    private val position: Int,
    private val onItemClickCallback: (Any, Any) -> Unit
) : View.OnClickListener {
    override fun onClick(view: View) {

    }

    interface OnItemClickCallback {
        fun onItemClicked(view: View?, position: Int)
    }
}

