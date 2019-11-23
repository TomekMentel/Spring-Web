package com.crud.tasks.service;

import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbServiceTest {

    @InjectMocks
    private DbService dbService;
    @Mock
    private TaskRepository taskRepository;

    @Test
    public void getAllTasks() {
        //Given
        Task task1 = new Task(1L, "Title 1", "Content 1");
        Task task2 = new Task(1L, "Title 2", "Content 2");
        Task task3 = new Task(1L, "Title 3", "Content 3");
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        when(taskRepository.findAll()).thenReturn(tasks);
        //When
        List<Task> savedTasks = dbService.getAllTasks();
        //Then
        assertEquals(3, savedTasks.size());
    }

    @Test
    public void saveTask() {
        //Given
        Task task1 = new Task(1L, "Title 1", "Content 1");
        when(taskRepository.save(task1)).thenReturn(task1);
        //When
        Task savedTask = dbService.saveTask(task1);
        //Then
        assertEquals(task1.getId(), savedTask.getId());
        assertEquals(task1.getTitle(), savedTask.getTitle());
        assertEquals(task1.getContent(), savedTask.getContent());
    }

    @Test
    public void getTask() {
        //Given
        Task task1 = new Task(1L, "Title 1", "Content 1");
        when(taskRepository.findById(1L)).thenReturn(Optional.of(task1));
        //When
        Optional<Task> savedTask = dbService.getTask(1L);
        //Then
        assertNotNull(task1);
    }

    @Test
    public void deleteTask() {
        //Given
        Task task1 = new Task(1L, "Title 1", "Content 1");
        //When
        dbService.deleteTask(1L);
        //Then
        verify(taskRepository, times(1)).deleteById(1L);
    }
}