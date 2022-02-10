package edu.rosehulman.alarmnotifier.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.rosehulman.alarmnotifier.databinding.FragmentOtherBinding

class OtherFragment : Fragment() {

    private lateinit var binding: FragmentOtherBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOtherBinding.inflate(inflater, container, false)
        return binding.root
    }
}