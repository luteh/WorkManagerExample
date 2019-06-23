package com.luteh.workmanagerexample

import androidx.lifecycle.ViewModel
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.luteh.workmanagerexample.workers.BlurWorker
import java.util.concurrent.TimeUnit

/**
 * Created by Luthfan Maftuh on 6/23/2019.
 * Email luthfanmaftuh@gmail.com
 */
class MainViewModel : ViewModel() {

    private val workManager = WorkManager.getInstance()

    // OneTimeWorkRequest: A WorkRequest that will only execute once.
    // PeriodicWorkRequest: A WorkRequest that will repeat on a cycle.
    internal fun applyBlur(blurLevel: Int) {
//        workManager.enqueue(OneTimeWorkRequest.from(BlurWorker::class.java))
        workManager.enqueue(OneTimeWorkRequest.Builder(BlurWorker::class.java)
                .setInitialDelay(10, TimeUnit.SECONDS)
                .build())
    }
}