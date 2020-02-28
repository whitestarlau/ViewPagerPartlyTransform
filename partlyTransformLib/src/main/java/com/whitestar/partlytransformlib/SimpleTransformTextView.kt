package com.whitestar.partlytransformlib

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatTextView

/**
 * @Author: LiuYiXin
 * @Date: 2020/2/27 17:46
 * @Description: 一个最简单的局部动效控件例子。
 */
class SimpleTransformTextView : AppCompatTextView, IPartlyTransformView {
    companion object {
        const val TAG = "SimpleTransformTextView"
    }

    constructor(context: Context?)
            : this(context, null)

    constructor(context: Context?, attrs: AttributeSet?)
            : this(context, attrs, 0)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr)

    override fun onTransform(view: View, position: Float) {
        super.onTransform(view, position)
        Log.v(TAG, "${position}")

        val height = this.height.toFloat()
        val width = this.width.toFloat()
        val scale = min(if (position < 0) 1f else Math.abs(1f - position), 0.5f)

        this.scaleX = scale
        this.scaleY = scale
        this.pivotX = width * 0.5f
        this.pivotY = height * 0.5f
        this.translationX = if (position < 0) width * position else -width * position * 0.25f
    }

    fun min(value: Float, min: Float): Float {
        return if (value < min) min else value
    }
}