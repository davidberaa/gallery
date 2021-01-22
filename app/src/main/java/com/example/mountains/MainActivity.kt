package com.example.mountains

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        val photosList = ArrayList<Photos>()
        photosList.add(Photos(1, "https://images.hdqwalls.com/wallpapers/snowy-blue-mountains-4k-e5.jpg"))
        photosList.add(Photos(2, "https://i.redd.it/5oxq3tjlfo821.jpg"))
        photosList.add(Photos(3, "https://wallpapercave.com/wp/wp4853030.jpg"))
        photosList.add(Photos(4, "https://www.pixel4k.com/wp-content/uploads/2019/03/nature-landscape-mountains-4k_1551644850.jpg"))
        photosList.add(Photos(1, "https://www.teahub.io/photos/full/201-2010520_3840x2160-snow-topped-uhd-4k-mountains-wallpaper-snow.jpg"))
        photosList.add(Photos(2, "https://i.pinimg.com/originals/a6/36/90/a6369031735a011ba907c0dd6425de02.jpg"))
        photosList.add(Photos(3, "https://wallpaperaccess.com/full/38581.jpg"))
        photosList.add(Photos(4, "https://c4.wallpaperflare.com/wallpaper/218/264/7/reine-norway-lake-mountains-wallpaper-preview.jpg"))
        photosList.add(Photos(1, "https://i.pinimg.com/originals/33/1e/66/331e666c45e5156462de78063cce9868.jpg"))
        photosList.add(Photos(2, "https://images.hdqwalls.com/wallpapers/peyto-lake-canada-mountains-4k-tj.jpg"))
        photosList.add(Photos(3, "https://besthqwallpapers.com/Uploads/19-1-2018/37819/thumb2-mountains-4k-art-cloud-mountains-peaks.jpg"))
        photosList.add(Photos(4, "https://i.ytimg.com/vi/18nZ7zUz84U/maxresdefault.jpg"))
        val photosAdapter = PhotosAdapter(photosList)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = photosAdapter
    }
}