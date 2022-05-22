package isoul.safe.picturebook

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HummingbirdsActivity : AppCompatActivity() {
    lateinit var btnNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext= findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent=Intent(this,bird2Activity::class.java)
            startActivity(intent)
        }


    }

}