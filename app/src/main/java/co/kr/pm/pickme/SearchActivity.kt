package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }

    fun Search(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}