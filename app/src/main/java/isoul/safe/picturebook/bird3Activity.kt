package isoul.safe.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bird3Activity : AppCompatActivity() {
    lateinit var btnNext3:Button
    lateinit var btnPrevious2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird3)
        btnNext3= findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent= Intent(this,bird4Activity::class.java)
            startActivity(intent)
        }
        btnPrevious2= findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            val intent= Intent(this,bird2Activity::class.java)
            startActivity(intent)
        }
    }
}