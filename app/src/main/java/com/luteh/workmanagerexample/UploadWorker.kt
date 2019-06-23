package com.luteh.workmanagerexample

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.work.*
import java.util.concurrent.TimeUnit

/**
 * Created by Luthfan Maftuh on 6/22/2019.
 * Email luthfanmaftuh@gmail.com
 */
/*
class UploadWorker(appContext: Context, workerParams: WorkerParameters)
    : Worker(appContext, workerParams) {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun doWork(): Result {
        try {
            // Get the input
            val imageUriInput = inputData.getString(Constants.KEY_IMAGE_URI)

            // Do the work
//            val response = upload(imageUriInput)

            // Create the output of the work
            val imageResponse = response.body()
            val imgLink = imageResponse.data.link

            // Create the Constraints
            val constraints = Constraints.Builder()
                .setRequiresBatteryNotLow(true)
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .setRequiresCharging(true)
                .setRequiresStorageNotLow(true)
                .setRequiresDeviceIdle(true)
                .build()

            // Define the input
            // workDataOf (part of KTX) converts a list of pairs to a [Data] object.
            val outputData = workDataOf(Constants.KEY_IMAGE_URI to imgLink)

            // Bring it all together by creating the WorkRequest; this also sets the back off criteria
            val uploadWorkRequest = OneTimeWorkRequestBuilder<UploadWorker>()
                .setInputData(outputData)
                .setConstraints(constraints)
                .setBackoffCriteria(
                    BackoffPolicy.LINEAR,
                    OneTimeWorkRequest.MIN_BACKOFF_MILLIS,
                    TimeUnit.MILLISECONDS)
                .build()

            // to tell WorkManager to schedule your work
            WorkManager.getInstance().enqueue(uploadWorkRequest)

            return Result.success(outputData)

        } catch (e: Exception) {
            return Result.failure()
        }
    }

    */
/*fun upload(imageUri: String): Response {
        TODO(“Webservice request code here”)
        // Webservice request code here; note this would need to be run
        // synchronously for reasons explained below.
    }*//*


}*/
