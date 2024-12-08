package com.eyaghrd.tasktool.part2.controller;

import com.eyaghrd.tasktool.part2.entity.Task;
import com.eyaghrd.tasktool.part2.entity.TaskCategory;
import com.eyaghrd.tasktool.part2.entity.TaskPriority;
import com.eyaghrd.tasktool.part2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping
    List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping("/add")
    Task createTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }
    @PostMapping("/update")
    Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }
    @PostMapping("/{id}")
    Task getTaskById(@RequestParam long id) {
        return taskService.getTaskById(id);
    }
    @GetMapping("/{title}")
    Task getTaskByTitle(@RequestParam String title) {
        return taskService.getTaskByTitle(title);
    }
    @GetMapping("/tasks/{priority}")
    List<Task> findAllByTaskPriority(@RequestParam TaskPriority priority) {
        return taskService.findAllByTaskPriority( priority);
    }
    @GetMapping("/filter/{category}")
    List<Task> findTaskByCategory(@RequestParam TaskCategory category) {
        return taskService.findTasksByCategory(category);
    }
    @PostMapping("/delete")
    boolean deleteTask(@RequestParam String taskName) {
        return taskService.deleteTask(taskName);
    }
}
