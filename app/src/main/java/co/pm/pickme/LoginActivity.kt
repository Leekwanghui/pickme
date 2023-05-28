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
//임시로 확인하기 위해 연결해둔거지 여기에 연결할 거 아님
    fun ontvForgotPassword(view: View) {
        val intent = Intent(this, CommunityActivity::class.java)
        startActivity(intent)
    }
}