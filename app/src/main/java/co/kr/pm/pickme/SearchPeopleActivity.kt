package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SearchPeopleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchpeople)
    }

    fun bangje(view: View) {
        val intent = Intent(this, ChaActivity::class.java)
        startActivity(intent)
    }
}