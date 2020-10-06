package edu.xja.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 25140
 */
@Component
public class MySchedule {
    @Scheduled(fixedDelay = 1000)
    public void fixedDelay(){
        System.out.println("fixed delya:"+new Date());
    }
    @Scheduled(fixedRate = 2000)
    public void fixedRate(){
        System.out.println("fixed rate:"+new Date());
    }
    @Scheduled(initialDelay = 1000,fixedRate = 2000)
    public void initialDelay(){
        System.out.println("initial delay:"+new Date());
    }
    @Scheduled(cron="0 */1 * * * ?")
    public void cron(){
        System.out.println("cron: "+new Date());
    }
}