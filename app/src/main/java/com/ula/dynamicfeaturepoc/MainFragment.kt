package com.ula.dynamicfeaturepoc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ula.dynamicfeaturepoc.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val fragmentMainBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return fragmentMainBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentMainBinding.btnInstallTime.setOnClickListener {
            findNavController().navigate(R.id.nav_install_time_fragment)
        }

        fragmentMainBinding.btnOnDemand.setOnClickListener {
            findNavController().navigate(R.id.nav_on_demand_fragment)
        }

        fragmentMainBinding.btnConditional.setOnClickListener {
            findNavController().navigate(R.id.nav_conditional_fragment)
        }
    }

}