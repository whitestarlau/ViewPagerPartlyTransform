package com.whitestar.partlytransformlib

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.whitestar.partlytransformlib.transformer.LazySlideTransformer

/**
 * @Author: LiuYiXin
 * @Date: 2020/2/27 17:46
 * @Description: 一个简单的局部动效控件例子。使用委托模式将工作委托给预置好的Transformer
 */
class DelegatesTransformTextView(
    context: Context?,
    attrs: AttributeSet?,
    defStyleAttr: Int
) : AppCompatTextView(
    context,
    attrs,
    defStyleAttr
),
    IPartlyTransformView by LazySlideTransformer() {

    companion object {
        const val TAG = "SimpleTransformTextView"
    }

    constructor(context: Context?)
            : this(context, null)

    constructor(context: Context?, attrs: AttributeSet?)
            : this(context, attrs, 0)

//    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int)
//            : super(context, attrs, defStyleAttr)

}