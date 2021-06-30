package com.android.example

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.android.animaldoppelganger.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private lateinit var pizzaArray: Array<String>

  //TODO:4 Define page change callback here
  private var pizaaPageChangeCallback = object : OnPageChangeCallback() {
    override fun onPageSelected(position: Int) {
      Toast.makeText(this@MainActivity,
          "Selected position: $position",
          Toast.LENGTH_SHORT).show()
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    // Switch to AppTheme for displaying the activity
    setTheme(R.style.AppTheme)

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    pizzaArray =  arrayOf("abc","efg")

    //TODO:3 Wire DemoAdapter with ViewPager2 here
    val doppelgangerAdapter = DemoAdapter(this, pizzaArray.size)
    pizzaViewPager.adapter = doppelgangerAdapter

    //TODO:5 Register page change callback here
    pizzaViewPager.registerOnPageChangeCallback(pizaaPageChangeCallback)

    //TODO:7 Change ViewPager2 orientation here
//    doppelgangerViewPager.orientation = ORIENTATION_VERTICAL

    //TODO:11 Force to RTL mode
//    doppelgangerViewPager.layoutDirection = ViewPager2.LAYOUT_DIRECTION_RTL
//    tabLayout.layoutDirection = View.LAYOUT_DIRECTION_RTL
  }

  override fun onDestroy() {
    super.onDestroy()
    //TODO:6 Unregister page change callback here
    pizzaViewPager.unregisterOnPageChangeCallback(pizaaPageChangeCallback)
  }
}
