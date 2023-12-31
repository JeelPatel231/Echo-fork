package dev.brahmkshatriya.echo

import android.app.Activity
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetBehavior


private val Activity.getMiniPlayerBehavior: BottomSheetBehavior<View>?
    get() = findViewById<View>(R.id.bottom_player)?.let { BottomSheetBehavior.from(it) }

private val <T : View?> BottomSheetBehavior<T>.isExpanded: Boolean
    get() = state == BottomSheetBehavior.STATE_EXPANDED

fun Fragment.handleMiniPlayer() {
    val activity = requireActivity()
    activity.onBackPressedDispatcher.addCallback(this) {
        val behavior = activity.getMiniPlayerBehavior
        if (behavior != null && behavior.isExpanded) {
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        } else {
            isEnabled = false
            activity.onBackPressedDispatcher.onBackPressed()
            isEnabled = true
        }
    }
}