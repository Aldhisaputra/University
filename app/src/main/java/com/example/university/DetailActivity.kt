package com.example.university

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val universityName = "uni_name"
        const val universityDetail = "uni_detail"
        const val universityImage = "uni_photo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Detail"


        val nama = intent.getStringExtra(universityName)
        val detail = intent.getStringExtra(universityDetail)
        val photo = intent.getIntExtra(universityImage,0)



       nama_University.text = nama
        deskripsi_University.text =detail
        photo_University.setImageResource(photo)
    }


}