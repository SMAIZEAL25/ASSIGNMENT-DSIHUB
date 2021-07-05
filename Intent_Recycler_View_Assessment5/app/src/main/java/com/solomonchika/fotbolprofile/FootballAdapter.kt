package com.oghenovo.fotbolprofile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FootballAdapter(
    private val context: Context,
    private val footballs: List<Football>,
    private val listener: (Football) -> Unit
) : RecyclerView.Adapter<FootballAdapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageSrc = view.findViewById<ImageView>(R.id._image)
        private val title = view.findViewById<TextView>(R.id._title)
               fun bindView(football: Football, listener: (Football) -> Unit) {
            imageSrc.setImageResource(football.imageSrc)
            title.text = football.firstName
                       itemView.setOnClickListener { listener(football) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image, parent, false))

    override fun getItemCount(): Int = footballs.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(footballs[position], listener)
    }
}