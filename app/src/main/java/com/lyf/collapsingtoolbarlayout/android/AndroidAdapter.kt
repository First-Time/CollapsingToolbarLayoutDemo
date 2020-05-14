package com.lyf.collapsingtoolbarlayout.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.lyf.collapsingtoolbarlayout.R

class AndroidAdapter(private val mNames: List<String>) :
    RecyclerView.Adapter<AndroidAdapter.ViewHolder>() {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var textView: AppCompatTextView? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        val holder = ViewHolder(view)
        holder.textView = view.findViewById(R.id.tvName)
        return holder
    }

    override fun getItemCount(): Int {
        return mNames.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView?.text = mNames[position]
    }
}