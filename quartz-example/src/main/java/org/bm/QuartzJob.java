package org.bm;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class QuartzJob implements Job{

	public void execute(final JobExecutionContext jobExecutionContext) throws JobExecutionException {
		System.out.println("Executing Quartz Job at " + new Date());

	}

}
