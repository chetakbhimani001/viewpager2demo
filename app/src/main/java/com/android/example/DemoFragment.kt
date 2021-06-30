package com.android.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.animaldoppelganger.R
import kotlinx.android.synthetic.main.fragment_view.*

class DemoFragment : Fragment() {

  companion object {
    const val ARG_POSITION = "position"

    fun getInstance(position: Int): Fragment {
      val doppelgangerFragment = DemoFragment()
      val bundle = Bundle()
      bundle.putInt(ARG_POSITION, position)
      doppelgangerFragment.arguments = bundle
      return doppelgangerFragment
    }
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_view, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    val position = requireArguments().getInt(ARG_POSITION)
    val noOfFragment = arrayOf("abc","efg")
    name.text = noOfFragment[position]
  }
}
