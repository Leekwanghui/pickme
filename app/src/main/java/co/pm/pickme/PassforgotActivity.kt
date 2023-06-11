package co.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import co.kr.pm.pickme.JoinActivity
import co.kr.pm.pickme.LoginActivity
import co.kr.pm.pickme.R

class PassforgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpw)
    }

    fun ontvfindpw(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}