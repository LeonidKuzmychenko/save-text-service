package com.example.savetextservice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WebScheduler {

    @Scheduled(fixedRate = 15000)
    public void myTask() {
        System.out.println("Выполнение задачи каждые 15 секунд...");
    }
}
