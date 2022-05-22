package isoul.safe.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bird2Activity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird2)
        btnNext2= findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent= Intent(this,bird3Activity::class.java)
            startActivity(intent)
        }
        btnPrevious= findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent=Intent(this,HummingbirdsActivity::class.java)
            startActivity(intent)
        }
    }
}