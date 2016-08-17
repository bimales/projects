package org.bm;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzMain {

	public static void main(final String[] args) throws SchedulerException {

		final JobDetail job = JobBuilder.newJob(QuartzJob.class).build();
		final Trigger t1 = TriggerBuilder.newTrigger().withIdentity("SimpleTrigger").startNow().build();
		final Scheduler sc = StdSchedulerFactory.getDefaultScheduler();
		sc.start();
		sc.scheduleJob(job, t1);

	}

}
