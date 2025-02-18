package com.example.a225demo1

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log

class JobServicePlan: JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {

        Log.d("MyJobService","Job Started")
        Thread{
            Thread.sleep(5000)
            Log.d("My Job Service","Job finished")
            jobFinished(params, false)
        }.start()
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.d("My Job Service", "Job stopped")
        return false;
    }
}