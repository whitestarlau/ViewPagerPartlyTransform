package com.whitestar.viewpagerpartlytransform

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_simple.*


class SimpleFragment : Fragment() {
    private val colorArray =
        intArrayOf(
            R.color.colorRed,
            R.color.colorBlue,
            R.color.colorOrigin,
            R.color.colorGreen,
            R.color.colorPrimary
        )

    private var position: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            position = it.getInt(POSITION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_simple, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        position?.let {
            positionTv.text = resources.getText(R.string.test_text)
            view.setBackgroundResource(colorArray[it])
        }

    }

    companion object {
        const val POSITION = "position"

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(position: Int) =
            SimpleFragment().apply {
                arguments = Bundle().apply {
                    putInt(POSITION, position)
                }
            }
    }
}
