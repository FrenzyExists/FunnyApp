package com.example.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.bumptech.glide.Glide

class FunnyActivity : AppCompatActivity(){
    private var anthem: MediaPlayer? = null
    private var fart: MediaPlayer? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny)
        // I couldn't find a way to trigger music :\
        fart = MediaPlayer.create(this, R.raw.fart)
        anthem = MediaPlayer.create(this, R.raw.national_anthem)
        anthem?.start()

        // Create a source from a drawable resource ID
//        var myGif = AppCompatResources.getDrawable(this, R.drawable.flagslowmotion)
//        ImageView imageView = (ImageView) findViewById(R.id.my_image_view);
        val imageview: ImageView = findViewById(R.id.flag)
        Glide.with(this).load(R.drawable.flagslowmotion).centerCrop().into(imageview)


        val handler = Handler(Looper.getMainLooper())
        // Post a lambda expression with a 3-second delay
        handler.postDelayed({
            // Print a log message
            Log.d("TAG", "This is executed after 3 seconds")
            anthem?.stop()
            fart?.start()
            val intent = Intent(this, PlzLetMeInActivity::class.java)
            startActivity(intent)
        }, 16500)

    }

    override fun onAttachedToWindow() {




    }
}