package com.example.university

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.university.DetailActivity.Companion.universityDetail
import com.example.university.DetailActivity.Companion.universityImage
import com.example.university.DetailActivity.Companion.universityName

class ListUniversityAdapter(private val listUniversity: ArrayList<University>,private val context: Context) :RecyclerView.Adapter<ListUniversityAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_university, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listUniversity.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val university = listUniversity[position]
        Glide.with(holder.itemView.context)
            .load(university.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = university.name
        holder.tvDescription.text = university.description


        holder.itemView.setOnClickListener {
            val pergiKeDetail = Intent(it.context, DetailActivity::class.java)
            pergiKeDetail.putExtra(universityName, university.name)
            pergiKeDetail.putExtra(universityDetail, university.description)
            pergiKeDetail.putExtra(universityImage, university.photo)
            context.startActivity(pergiKeDetail)


        }
    }
}