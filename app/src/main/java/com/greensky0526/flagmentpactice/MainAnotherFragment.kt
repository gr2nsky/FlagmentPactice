package com.greensky0526.flagmentpactice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.greensky0526.flagmentpactice.databinding.FragmentMainAnotherBinding
import com.greensky0526.flagmentpactice.databinding.FragmentMainHomeBinding

class MainAnotherFragment : Fragment() {

    private var _binding: FragmentMainAnotherBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainAnotherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}