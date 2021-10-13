package com.ula.installtimedelivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ula.installtimedelivery.databinding.FragmentInstallTimeBinding

class InstallTimeFragment : Fragment() {

    private var _binding: FragmentInstallTimeBinding? = null
    private val fragmentInstallTimeBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInstallTimeBinding.inflate(inflater, container, false)
        return fragmentInstallTimeBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}