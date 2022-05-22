package isoul.safe.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bird4Activity : AppCompatActivity() {
    lateinit var btnNext4: Button
    lateinit var btnPrevious3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird4)
        btnNext4= findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent= Intent(this,bird5Activity::class.java)
            startActivity(intent)
        }
        btnPrevious3= findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener {
            val intent= Intent(this,bird2Activity::class.java)
            startActivity(intent)
        }
    }
}