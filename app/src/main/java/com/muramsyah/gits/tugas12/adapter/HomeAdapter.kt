package com.muramsyah.gits.tugas12.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.muramsyah.gits.tugas12.data.University
import com.muramsyah.gits.tugas12.databinding.ItemUniversityBinding

class HomeAdapter(private val universities: List<University>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemUniversityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(universities[position])
    }

    override fun getItemCount(): Int = universities.size

    inner class ViewHolder(private val binding: ItemUniversityBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(university: University) {
            with(binding) {

                Glide.with(binding.root)
                    .load(university.photo)
                    .apply(RequestOptions().override(255,255))
                    .into(imgUniv)

                tvUnivName.text = university.name
                tvAddress.text = university.address
            }
        }
    }

}