package com.example.helloworld
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PlzLetMeInActivity : AppCompatActivity() {
    private var media1: MediaPlayer? = null
    private var media2: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plz_let_me_in)
        val yesBtn = findViewById<Button>(R.id.Yesbutton)
        val noBtn = findViewById<Button>(R.id.Nobutton)

        media1 = MediaPlayer.create(this, R.raw.no)
        media2 = MediaPlayer.create(this, R.raw.yes)

        yesBtn.setOnClickListener {
            // Play funny yes sound
            media2?.start()
            Toast.makeText(
                this,
                getString(R.string.NO),
                Toast.LENGTH_SHORT
            ).show()
        }

        noBtn.setOnClickListener {
            // Play sadge no sound
            media1?.start()
            Toast.makeText(
                this,
                getString(R.string.YES),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}