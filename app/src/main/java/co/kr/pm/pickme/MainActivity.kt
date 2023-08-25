package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import co.kr.pm.pickme.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Letsgo(view: View) {
        val intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }
}