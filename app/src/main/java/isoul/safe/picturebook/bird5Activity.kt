package isoul.safe.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bird5Activity : AppCompatActivity() {

    lateinit var btnPrevious4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird5)
        btnPrevious4= findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            val intent= Intent(this,bird4Activity::class.java)
            startActivity(intent)

        }


    }
}