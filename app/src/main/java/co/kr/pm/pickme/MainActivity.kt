package co.kr.pm.pickme

//import android.content.Intent
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import androidx.appcompat.app.AppCompatActivity
//import co.kr.pm.pickme.LoginActivity
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//
//    fun Letsgo(view: View) {
//        val intent = Intent(this, SearchActivity::class.java)
//        startActivity(intent)
//    }
//}

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val bottomNav by lazy { findViewById<BottomNavigationView>(R.id.bottomNav) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_item_1 -> openActivity(MainActivity::class.java) // 예시로 MainActivity로 이동
                R.id.nav_item_2 -> openActivity(CommunityActivity::class.java) // CommunityActivity로 이동
                R.id.nav_item_3 -> openActivity(RecordActivity::class.java) // RecordActivity로 이동
                R.id.nav_item_4 -> openActivity(MyPageActivity::class.java) // MyPageActivity로 이동
            }
            true
        }
    }

    private fun openActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }

    fun Letsgo(view: View) {
        val intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }

    fun Letsfinish(view: View) {
        val intent = Intent(this, SearchPeopleActivity::class.java)
        startActivity(intent)
    }
}