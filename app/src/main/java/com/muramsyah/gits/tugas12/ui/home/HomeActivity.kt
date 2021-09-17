package com.muramsyah.gits.tugas12.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.muramsyah.gits.tugas12.adapter.HomeAdapter
import com.muramsyah.gits.tugas12.databinding.ActivityHomeBinding
import com.muramsyah.gits.tugas12.ui.detail.DetailActivity
import com.muramsyah.gits.tugas12.utils.DataHelper
import java.util.*

class HomeActivity : AppCompatActivity() {

    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = HomeAdapter(DataHelper.listData)

        with(binding.rvUniv) {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            this.adapter = adapter
            setHasFixedSize(true)
        }

        adapter.onItemClicked = { university ->
            val intent = Intent(this@HomeActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DATA, university)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}