package com.xy.work.dep.task;



import com.xy.work.dep.service.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 系统定时任务
 */
@Service
public class JobService {
    @Resource
    UserService userService;

    @Scheduled(cron = "0 0 17 1 1-12 ? ")
    public void job(){

    }
}
