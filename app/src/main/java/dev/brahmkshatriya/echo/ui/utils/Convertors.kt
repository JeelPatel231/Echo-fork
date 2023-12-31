package dev.brahmkshatriya.echo.ui.utils

import android.content.res.Resources

val Int.pxToDp: Float get() = (this / Resources.getSystem().displayMetrics.density)
val Int.dpToPx: Int get() = (this * Resources.getSystem().displayMetrics.density).toInt()
