package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import co.kr.pm.pickme.JoinActivity
import co.kr.pm.pickme.R

class CommunityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)
    }

    fun comge(view: View) {
        val intent = Intent(this, Community2Activity::class.java)
        startActivity(intent)
    }


}