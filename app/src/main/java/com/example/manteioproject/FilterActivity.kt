package com.example.manteioproject

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ImageProcessor

class FilterActivity : AppCompatActivity() {

    // on below line we are creating variables.
    lateinit var oneIV: ImageView
    lateinit var twoIV: ImageView
    lateinit var threeIV: ImageView
    lateinit var fourIV: ImageView
    lateinit var fiveIV: ImageView
    lateinit var sixIV: ImageView
    lateinit var sevenIV: ImageView
    lateinit var eightIV: ImageView
    lateinit var nineIV: ImageView
    lateinit var tenIV: ImageView
    lateinit var originalIV: ImageView

    lateinit var bmp: Bitmap
    lateinit var onebmp: Bitmap
    lateinit var twobmp: Bitmap
    lateinit var threebmp: Bitmap
    lateinit var fourbmp: Bitmap
    lateinit var fivebmp: Bitmap
    lateinit var sixbmp: Bitmap
    lateinit var sevenbmp: Bitmap
    lateinit var eightbmp: Bitmap
    lateinit var ninebmp: Bitmap
    lateinit var tenbmp: Bitmap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        val processor = ImageProcessor()
        // initializing bitmap with our image resource.
        bmp = BitmapFactory.decodeResource(resources, R.drawable.meterimage)

        // on below line we are initializing
        // our variable with their ids.
        oneIV = findViewById(R.id.idIVOne);
        twoIV = findViewById(R.id.idIVTwo);
        threeIV = findViewById(R.id.idIVThree);
        fourIV = findViewById(R.id.idIVFour);
        fiveIV = findViewById(R.id.idIVFive);
        sixIV = findViewById(R.id.idIVSix);
        sevenIV = findViewById(R.id.idIVSeven);
        eightIV = findViewById(R.id.idIVEight);
        nineIV = findViewById(R.id.idIVNine);
        tenIV = findViewById(R.id.idIVTen);
        originalIV = findViewById(R.id.idIVOriginalImage);


    }
}