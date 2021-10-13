package com.ula.dynamicfeaturepoc.featureDeliery

import android.content.Context
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest

object FeatureDeliveryUtil {

    fun isModuleInstalled(context: Context, moduleName: String) =
        SplitInstallManagerFactory.create(context).installedModules.contains(moduleName)

    fun installModule(
        context: Context,
        moduleName: String,
        onSuccess: () -> Unit,
        onError: () -> Unit
    ) {
        val splitInstallRequest = SplitInstallRequest.newBuilder()
            .addModule(moduleName)
            .build()

        SplitInstallManagerFactory.create(context)
            .startInstall(splitInstallRequest)
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { onError() }
    }
}