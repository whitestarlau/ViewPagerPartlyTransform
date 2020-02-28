package com.whitestar.viewpagerpartlytransform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whitestar.partlytransformlib.PartlyTransformer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPager.adapter = SimplePagerAdapter(
            supportFragmentManager,
            5
        )

        mViewPager.setPageTransformer(true,
            PartlyTransformer()
        )
    }
}
