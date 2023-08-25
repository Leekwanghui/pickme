package co.kr.pm.pickme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun ontvSignUp(view: View) {
        val intent = Intent(this, JoinActivity::class.java)
        startActivity(intent)
    }

    fun ontvForgotPassword(view: View) {
        val intent = Intent(this, PassforgotActivity::class.java)
        startActivity(intent)
    }

    fun ontvForgotId(view: View){
        val intent = Intent(this, IdforgotActivity::class.java)
        startActivity(intent)
    }

    fun ontvLogin(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}