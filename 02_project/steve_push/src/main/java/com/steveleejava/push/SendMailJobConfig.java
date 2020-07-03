package com.steveleejava.push;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import com.steveleejava.push.vo.*;

@Configuration
@EnableBatchProcessing
@EnableScheduling
@EnableAsync
@ComponentScan("...")
public class SendMailJobConfig {
	
		@Autowired
		private SqlSession sqlSession2;
		@Autowired
		private  JobBuilderFactory jobBuilderFactory;
		@Autowired
		private  StepBuilderFactory stepBuilderFactory;

	    private static final Logger LOGGER = LogManager.getLogger(SendMailJobConfig.class);

		
		@Bean 
		public ThreadPoolTaskScheduler taskScheduler() { 
			ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler(); 
			taskScheduler.setThreadGroupName("batch-scheduler");
			taskScheduler.setPoolSize(10); return taskScheduler; 		
		}

	
		// 아직 메일을 안보낸 회원들
	 	@Bean
	    public Job notSendUserJob() { //(1)
	        
	 		return jobBuilderFactory.get("notSendUserJob")
	               // .preventRestart() //(2)
	 				.incrementer(new RunIdIncrementer())
	                .start(notSendUserJobStep()) //(3)
	                .build();
	    }
	 	
	 	@Bean
	 	public Step notSendUserJobStep() {
	 	    return stepBuilderFactory.get("notSendUserJobStep") //(1)
	 	            .<PushUserVO, PushUserVO> chunk(10) //(2)
	 	            .reader(notSendUserReader()) //(3)
	 	            .processor(notSendUserProcessor())
	 	            .writer(mailPushWriter())
	 	            .build();
	 	}
	
	 	public QueueItemReader<PushUserVO> notSendUserReader() {
	 	  System.out.println("step 1");
	 	  HashMap<String, Object> searchMap = new HashMap<String, Object>();
	 	  searchMap.put("submit_yn", "N");
	 	  List<PushUserVO> notSendUsers = sqlSession2.selectList("payinfo.paylist",searchMap);
	 	  System.out.println("dddddd123"+notSendUsers);
	 	  LOGGER.info("notSendUsers" + notSendUsers); 
		  return new QueueItemReader<>(notSendUsers); //(3)
	 	}
	 	// 메일 송신
	 	public ItemProcessor<PushUserVO, PushUserVO> notSendUserProcessor() {
	 	    
	 		System.out.println("mail");
	 		PushUserVO push = new PushUserVO();
	 		push.setMail_id("ddd");
	 		return user2 -> push;

	 	}
	 	
	 	// db update (submit_yn)
	 	public ItemWriter<PushUserVO> mailPushWriter() {
	 	    System.out.println("finish");
	 	    HashMap<String, Object> requestMap = new HashMap<String, Object>();
	 	    requestMap.put("mail_id", "123@naver.com");
	 	    HashMap<String, Object> resultMap = new HashMap<String, Object>();
	 	    // insert 테스트
	 	   try {
				int count= sqlSession2.insert("payinfo.insertTest", requestMap);
				resultMap.put("result","1");		
			
			} catch(Exception e) {
				resultMap.put("result","2");
			}
	 	    return  user -> System.out.println("user :" +user);
	 	}
	 	
	 	
	
}
