package dev.brahmkshatriya.echo.ui.library

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.brahmkshatriya.echo.databinding.FragmentLibraryBinding
import dev.brahmkshatriya.echo.handleMiniPlayer
import dev.brahmkshatriya.echo.ui.utils.autoCleared

class LibraryFragment : Fragment() {

    private var binding: FragmentLibraryBinding by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        handleMiniPlayer()
        binding = FragmentLibraryBinding.inflate(inflater, container, false)
        return binding.root
    }

}