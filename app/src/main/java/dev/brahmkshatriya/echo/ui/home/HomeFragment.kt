package dev.brahmkshatriya.echo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.brahmkshatriya.echo.databinding.FragmentHomeBinding
import dev.brahmkshatriya.echo.handleMiniPlayer
import dev.brahmkshatriya.echo.ui.utils.autoCleared

class HomeFragment: Fragment() {

    private var binding: FragmentHomeBinding by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        handleMiniPlayer()
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

}