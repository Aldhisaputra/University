package com.example.university

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvUniversity: RecyclerView
    private val list = ArrayList<University>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUniversity = findViewById(R.id.rv_University)
        rvUniversity.setHasFixedSize(true)

        list.addAll(getListUniversity())
        showRecyclerList()
    }

    private fun getListUniversity(): ArrayList<University> {
        val dataName = resources.getStringArray(R.array.name_univerity)
        val dataDescription = resources.getStringArray(R.array.description_university)
        val dataPhoto = resources.obtainTypedArray(R.array.photo_university)
        val listHero = ArrayList<University>()
        for (i in dataName.indices) {
            val hero = University(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listHero.add(hero)
        }
        return listHero
    }

    private fun showRecyclerList() {
        rvUniversity.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListUniversityAdapter(list)
        rvUniversity.adapter = listHeroAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profilku -> {
                val profilku = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(profilku)
            }
        }
    }
}