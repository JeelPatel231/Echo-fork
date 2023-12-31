package dev.brahmkshatriya.echo

import android.media.AudioManager
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.navigation.NavigationBarView
import dev.brahmkshatriya.echo.databinding.ActivityMainBinding
import dev.brahmkshatriya.echo.ui.utils.dpToPx

class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        volumeControlStream = AudioManager.STREAM_MUSIC

        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, insets -> insets }

        // setup Bottom navigation
        val navView = binding.navView as NavigationBarView
        val navHostFragment = binding.navHostFragment.getFragment<NavHostFragment>()
        val navController = navHostFragment.navController
        navView.setupWithNavController(navController)


        // setup bottom player behavior
        val bottomBehavior = BottomSheetBehavior.from(binding.bottomPlayer.root)
        bottomBehavior.setPeekHeight((160 + 16).dpToPx)
        bottomBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) { /* DO NOTHING */ }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                binding.navView.translationY = binding.navView.measuredHeight * slideOffset
            }

        })
    }
}


