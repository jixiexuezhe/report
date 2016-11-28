package com.report;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class WriteTasklet implements Tasklet {

    private String national;



	public void setNational(String national) {
		this.national = national;
	}

	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
            throws Exception {
        System.out.println(national);
        return RepeatStatus.FINISHED;
    }
}