package com.example.assingment.merchant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assingment.R
import com.example.assingment.business.businessData
import com.example.assingment.business.businessadapter

class merchantAdapter(items: List<merchantData>):
    RecyclerView.Adapter<merchantAdapter.ViewHolder>(){

    private var list = items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.merchant_box, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val detail = list[position]
        holder.profileDP.setImageResource(detail.dp)
        holder.profileName.text = detail.name
        holder.profileLoc.text = detail.location
//        holder.profileDis.text = detail.distance
        holder.profileTag.text = detail.tag
        holder.profileAbt.text = detail.about
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        var profileDP = itemView.findViewById<ImageView>(R.id.dp)
        var profileName = itemView.findViewById<TextView>(R.id.tv_name)
        var profileLoc = itemView.findViewById<TextView>(R.id.tv_location)
        //        var profileDis = itemView.findViewById<TextView>(R.id.tv_dis)
        var profileTag = itemView.findViewById<TextView>(R.id.tv_tag)
        var profileAbt = itemView.findViewById<TextView>(R.id.tv_abt)
    }
}