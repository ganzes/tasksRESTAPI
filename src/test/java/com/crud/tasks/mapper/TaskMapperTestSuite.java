package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class TaskMapperTestSuite {

    @Autowired
    private TaskMapper taskMapper;

    @Test
    public void testMapToTask() {
        //Given
        TaskDto taskDto = new TaskDto(1L, "testTaskDtoName01", "testTaskContentDto01");
        //When
        Task task = taskMapper.mapToTask(taskDto);
        //Then
        assertEquals("testTaskDtoName01", task.getTitle());
    }

    @Test
    public void testMapToTaskDto() {
        //Given
        Task task = new Task(1L, "testTaskName01", "testTaskContent01");
        //When
        TaskDto taskDto = taskMapper.mapToTaskDto(task);
        //Then
        assertEquals("testTaskName01", taskDto.getTitle());
    }

    @Test
    public void testMapToTaskDtoList() {
        //Given
        Task task1 = new Task(1L, "testTaskName01", "testTaskContent02");
        Task task2 = new Task(2L, "testTaskName02", "testTaskContent02");
        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        //When
        List<TaskDto> taskDtoList = taskMapper.mapToTaskDtoList(taskList);
        //Then
        assertEquals(2, taskDtoList.size());
    }
}
