package com.lyf.collapsingtoolbarlayout.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.lyf.collapsingtoolbarlayout.R

class KotlinAdapter(private val mNames: List<String>) :
    RecyclerView.Adapter<KotlinAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: AppCompatTextView? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.textView = view.findViewById(R.id.tvName)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return mNames.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView?.text = mNames[position]
    }
}