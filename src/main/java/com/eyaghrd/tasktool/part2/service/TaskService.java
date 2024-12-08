package com.eyaghrd.tasktool.part2.service;

import com.eyaghrd.tasktool.part2.entity.Task;
import com.eyaghrd.tasktool.part2.entity.TaskCategory;
import com.eyaghrd.tasktool.part2.entity.TaskPriority;
import com.eyaghrd.tasktool.part2.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public Task addTask(Task task) {
        Task createdTask = new Task();
        createdTask.setId(task.getId());
        createdTask.setTitle(task.getTitle());
        createdTask.setDescription(task.getDescription());
        createdTask.setPriority(task.getPriority());
        taskRepository.save(createdTask);
        return task;
    }
    public boolean deleteTask(String taskName) {
       Task task = taskRepository.findByTaskByTitle(taskName);
       if(task != null) {
           taskRepository.delete(task);
           return true;
       }
       return false;
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public Task getTaskByTitle(String title) {
        return taskRepository.findByTaskByTitle(title);
    }
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
    public List<Task> findAllByTaskPriority(TaskPriority priority) {
        return taskRepository.findTasks().stream().toList().stream().filter(
                task -> task.getPriority() == priority
        ).toList();
    }
    public Task updateTask(Task task) {
        return taskRepository.updateTask(task);
    }
    public List<Task> findTasksByCategory(TaskCategory category) {
        return taskRepository.findTasks().stream().toList().stream().filter(
                task -> task.getCategory() == category
        ).toList();
    }

}
