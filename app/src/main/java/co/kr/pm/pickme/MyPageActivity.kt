package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MyPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)
    }

    fun mywrite(view: View) {
        val intent = Intent(this, WritecomActivity::class.java)
        startActivity(intent)
    }

    fun mywritedat (view: View) {
        val intent = Intent(this, WritegeActivity::class.java)
        startActivity(intent)
    }

    fun mylogout (view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}