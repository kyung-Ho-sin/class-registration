package com.steveleejava.push;

import java.util.Date;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduleTask {

	@Autowired
	private JobLauncher jobLauncher; 
	@Autowired
	private Job job;
	
	
	public ScheduleTask(JobLauncher jobLauncher, Job job) {
		this.jobLauncher = jobLauncher; this.job = job; 
	}
	
	public void runRegistrationsJob(Date date) throws Throwable {   
		System.out.println("Starting job at " + date.toString());
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder(); 
        jobParametersBuilder.addDate("date", date); 
        jobParametersBuilder.addString("input.file", "registrations"); 
        JobParameters jobParameters = jobParametersBuilder.toJobParameters(); 
        JobExecution jobExecution = jobLauncher.run(job, jobParameters); 
    }
	
	@Scheduled(fixedDelay = 1000 * 10) 
	public void runRegistrationsJobOnASchedule() throws Throwable { 
		runRegistrationsJob(new Date()); 
	}

}
