package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import co.kr.pm.pickme.LoginActivity



class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)
    }

    fun onjoin(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}