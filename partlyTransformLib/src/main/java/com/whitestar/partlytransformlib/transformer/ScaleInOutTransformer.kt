package com.whitestar.partlytransformlib.transformer

import android.view.View
import com.whitestar.partlytransformlib.IPartlyTransformView

open class ScaleInOutTransformer : IPartlyTransformView {

    override fun onTransform(page: View, position: Float) {
        page.pivotX = (if (position < 0) 0 else page.width).toFloat()
        page.pivotY = page.height / 2f
        val scale = if (position < 0) 1f + position else 1f - position
        page.scaleX = scale
        page.scaleY = scale
    }

}
