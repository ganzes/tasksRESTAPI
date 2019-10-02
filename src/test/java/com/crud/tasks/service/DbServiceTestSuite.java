package com.crud.tasks.service;

import com.crud.tasks.repository.TaskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DbServiceTestSuite {

    @InjectMocks
    private DbService dbService;

    @Mock
    private TaskRepository taskRepository;


    @Test
    public void getAllTasks() {


    }

    @Test
    public void getSingleTask() {
    }

    @Test
    public void saveTask() {
    }

    @Test
    public void getTask() {
    }

    @Test
    public void deleteTaskByID() {
    }
}