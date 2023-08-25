package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

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