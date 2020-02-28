package com.whitestar.partlytransformlib

import android.view.View

/**
 * @Author: LiuYiXin
 * @Date: 2020/2/27 17:01
 * @Description: ViewPager中局部特效控件接口。自定义控件继承此接口并设置
 */
interface IPartlyTransformView {
    fun onTransform(view: View, position: Float) {}
}