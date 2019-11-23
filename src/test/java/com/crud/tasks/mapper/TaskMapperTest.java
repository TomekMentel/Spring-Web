package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskMapperTest {

    @Test
    public void mapToTask() {
        //Given
        TaskDto taskDto = new TaskDto(1L, "Title", "Content");
        TaskMapper taskMapper = new TaskMapper();
        //When
        Task task = taskMapper.mapToTask(taskDto);
        //Then
        Assert.assertEquals(1L,task.getId().longValue());
        Assert.assertEquals("Title",task.getTitle());
        Assert.assertEquals("Content",task.getContent());
    }

    @Test
    public void mapToTaskDto() {
        //Given
        Task task = new Task(1L, "Title", "Content");
        TaskMapper taskMapper = new TaskMapper();
        //When
        TaskDto taskDto = taskMapper.mapToTaskDto(task);
        //Then
        Assert.assertEquals(1L,taskDto.getId().longValue());
        Assert.assertEquals("Title",taskDto.getTitle());
        Assert.assertEquals("Content",taskDto.getContent());
    }

    @Test
    public void mapToTaskDtoList() {
       //Given
        List<Task> tasks=new ArrayList<>();
        Task task1 = new Task(1L, "Title1", "Content1");
        Task task2= new Task(2L, "Title2", "Content2");
        tasks.add(task1);
        tasks.add(task2);
        TaskMapper taskMapper=new TaskMapper();
        //When
        List<TaskDto> taskDtos=taskMapper.mapToTaskDtoList(tasks);
        //Then
        Assert.assertEquals(1L,taskDtos.get(0).getId().longValue());
        Assert.assertEquals("Title1",taskDtos.get(0).getTitle());
        Assert.assertEquals("Content1",taskDtos.get(0).getContent());

        Assert.assertEquals(2L,taskDtos.get(1).getId().longValue());
        Assert.assertEquals("Title2",taskDtos.get(1).getTitle());
        Assert.assertEquals("Content2",taskDtos.get(1).getContent());
    }
}