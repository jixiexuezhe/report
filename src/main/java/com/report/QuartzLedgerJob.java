package com.report;

import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/** 
 * 定时调度类 
 */  
@Component("quartzLedgerJob")  
public class QuartzLedgerJob {  
  
    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(QuartzLedgerJob.class);  
  
    @Autowired  
    private JobLauncher jobLauncher;  
  
//    @Autowired  
//    private Job startJob;  
  
    @Autowired  
    JobParametersBuilder jobParameterBulider;  
  
    private static long counter = 0l;  
    
    private static String national="hk";
    
    ApplicationContext context = new ClassPathXmlApplicationContext("/springbatch/triggers.xml");
    
    public static void setNational(String national) {
		QuartzLedgerJob.national = national;
	}

	/** 
     * 执行业务方法 
     * @throws Exception 
     */  
    public void execute() throws Exception {  
        /** 
         * Spring Batch Job同一个job instance，成功执行后是不允许重新执行的,  
         * 失败后是否允许重跑，可通过配置Job的restartable参数来控制，默认是true，如果需要重新执行，可以变通处理， 
         * 添加一个JobParameters构建类,以当前时间作为参数，保证其他参数相同的情况下是不同的job instance 
         */  
        LOG.debug(national+" start export report...");  
//        StopWatch stopWatch = new StopWatch();   
//        stopWatch.start();  
//        jobParameterBulider.addDate("date", new Date());  
//    	
//		Job startJob = (Job) context.getBean(national+"_startJob");
//
//		JobExecution result =jobLauncher.run(startJob, jobParameterBulider.toJobParameters()); 
//		System.out.println("zjj:"+result.toString());
//        stopWatch.stop();  
//        LOG.debug("Time elapsed:{},Execute quartz startJob:{}", stopWatch.prettyPrint(), ++counter);  
    }  
}  