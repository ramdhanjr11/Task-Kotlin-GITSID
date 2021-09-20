package com.muramsyah.gits.tugas12.ui.home

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.muramsyah.gits.tugas12.adapter.HomeAdapter
import com.muramsyah.gits.tugas12.data.University
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

        initShowDataUniversity(DataHelper.listData)
        binding.edtSearch.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val searcher = s.toString().lowercase()

                if (searcher.isNotEmpty()) {
                    val newData = ArrayList<University>()

                    DataHelper.listData.forEach {
                        if (it.name?.contains(searcher, ignoreCase = true) == true) {
                            newData.add(it)
                        }
                    }

                    initShowDataUniversity(newData)
                } else {
                    initShowDataUniversity(DataHelper.listData)
                }
            }

            override fun afterTextChanged(s: Editable?) {}

        })
    }

    private fun initShowDataUniversity(data: List<University>) {
        val adapter = HomeAdapter(data)
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