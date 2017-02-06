package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chao on 06/02/2017.
 * @link https://spring.io/guides/gs/scheduling-tasks/
 */
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(
                                                    ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
                                                    "HH:mm:ss");

    // Scheduled annotation defines when a particular method runs
    // fixedRate: specifies the interval between method invocations measured
    //            from the start time of each invocation
    // fixedDelay: specifies the interval between invocations measured from the
    //             completion of the task
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
