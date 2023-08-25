package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class IdforgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotid)
    }

    fun ontvfindid(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}