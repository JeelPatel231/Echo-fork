package dev.brahmkshatriya.echo.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.brahmkshatriya.echo.databinding.FragmentSearchBinding
import dev.brahmkshatriya.echo.handleMiniPlayer
import dev.brahmkshatriya.echo.ui.utils.autoCleared

class SearchFragment : Fragment(){
    private var binding: FragmentSearchBinding by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        handleMiniPlayer()
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

}