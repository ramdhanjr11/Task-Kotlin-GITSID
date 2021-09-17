package com.muramsyah.gits.tugas12.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.muramsyah.gits.tugas12.R
import com.muramsyah.gits.tugas12.data.University
import com.muramsyah.gits.tugas12.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<University>(EXTRA_DATA)
        if (data != null) {
            showData(data)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun showData(data: University) {
        with(binding) {
            Glide.with(this@DetailActivity)
                .load(data.photo)
                .apply(RequestOptions().override(255, 255))
                .into(imgUniv)

            tvUnivName.text = data.name
            tvAddress.text = data.address
            tvWeb.text = data.web
            tvPhone.text = data.telphone
            tvSummary.text = data.summary
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}