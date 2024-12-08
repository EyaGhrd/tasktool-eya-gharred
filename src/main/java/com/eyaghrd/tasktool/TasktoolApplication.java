package com.eyaghrd.tasktool;

import com.eyaghrd.tasktool.part1.TaskManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasktoolApplication {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        boolean reesult = taskManager.task("Complete the project report");
        System.out.println(reesult);
        SpringApplication.run(TasktoolApplication.class, args);
    }

}
