package com.android.example

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class DemoAdapter(activity: AppCompatActivity, private val itemsCount: Int) :
    FragmentStateAdapter(activity) {

  override fun getItemCount(): Int {
    return itemsCount
  }

  override fun createFragment(position: Int): Fragment {
    return DemoFragment.getInstance(position)
  }
}
