package com.ula.conditionaldelivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ula.conditionaldelivery.databinding.FragmentConditionalBinding

class ConditionalFragment : Fragment() {

    private var _binding: FragmentConditionalBinding? = null
    private val fragmentConditionalBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConditionalBinding.inflate(inflater, container, false)
        return fragmentConditionalBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}