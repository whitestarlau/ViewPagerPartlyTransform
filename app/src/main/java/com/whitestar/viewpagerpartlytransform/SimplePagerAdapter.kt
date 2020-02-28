package com.whitestar.viewpagerpartlytransform

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * @Author: LiuYiXin
 * @Date: 2020/2/27 16:11
 * @Description: 适配器
 */

class SimplePagerAdapter(fm: FragmentManager?, private val totalCount: Int) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return SimpleFragment.newInstance(position)
    }

    override fun getCount(): Int {
        return totalCount
    }
}