package com.example.a225demo1

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class JobSchedule : AppCompatActivity() {
    val JOB_ID = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_job_scheduler)

        val jobbtn = findViewById<Button>(R.id.btn)
        jobbtn.setOnClickListener {
            schedulerJob();
        }
    }

    private fun schedulerJob(){
        val jobScheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
        val componentName = ComponentName(this,JobServicePlan::class.java)

        val jobInfo = JobInfo.Builder(JOB_ID, componentName)
            .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            .setRequiresCharging(true)
            .setPersisted(true)
            .build()
        val result = jobScheduler.schedule(jobInfo)

        if(result==JobScheduler.RESULT_SUCCESS){
            Log.d("Main Activity", "Job scheduled succesfully")
        }
        else{
            Log.d("Main Activity","Job scheduling failed")
        }
    }
}