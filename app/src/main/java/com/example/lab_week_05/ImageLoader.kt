package com.example.lab_week_05

import android.widget.ImageView
import retrofit2.http.Url

interface ImageLoader {
    fun loadImage(imageUrl: String, imageView: ImageView)
}