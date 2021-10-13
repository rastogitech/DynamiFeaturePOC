package com.ula.dynamicfeaturepoc.featureDeliery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment
import com.ula.dynamicfeaturepoc.databinding.FragmentFeatureDeliveryProgressBinding

/**
 * A custom screen to display when the Dynamic Feature module installation is in-progress.
 * You can override the progress fragment implementation for each navigation graph by setting
 * the "app:progressDestination" attribute to the ID of the destination you want to use for
 * handling installation progress.
 */
class FeatureDeliveryProgressFragment : AbstractProgressFragment() {

    private lateinit var fragmentFeatureDeliveryProgressBinding: FragmentFeatureDeliveryProgressBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentFeatureDeliveryProgressBinding = FragmentFeatureDeliveryProgressBinding.inflate(
            inflater,
            container, false
        )
        return fragmentFeatureDeliveryProgressBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentFeatureDeliveryProgressBinding.linearProgressIndicator.max = 100
        fragmentFeatureDeliveryProgressBinding.linearProgressIndicator.progress = 0
    }

    override fun onCancelled() {
        fragmentFeatureDeliveryProgressBinding.linearProgressIndicator.progress = 0
    }

    override fun onFailed(errorCode: Int) {
        fragmentFeatureDeliveryProgressBinding.txvMessage.text = "Error Code:${errorCode}"
    }

    override fun onProgress(status: Int, bytesDownloaded: Long, bytesTotal: Long) {
        val percent = bytesDownloaded * 100 / bytesTotal

        fragmentFeatureDeliveryProgressBinding.txvMessage.text = "${percent}%"
        fragmentFeatureDeliveryProgressBinding.linearProgressIndicator.progress = percent.toInt()
    }
}