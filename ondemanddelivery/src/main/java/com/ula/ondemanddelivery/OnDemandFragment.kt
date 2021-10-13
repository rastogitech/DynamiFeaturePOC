package com.ula.ondemanddelivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.play.core.splitcompat.SplitCompat
import com.ula.ondemanddelivery.databinding.FragmentOnDemandBinding

class OnDemandFragment : Fragment() {

    private var _binding: FragmentOnDemandBinding? = null
    private val fragmentOnDemandBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SplitCompat.installActivity(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnDemandBinding.inflate(inflater, container, false)
        return fragmentOnDemandBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}