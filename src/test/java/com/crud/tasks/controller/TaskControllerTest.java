package com.crud.tasks.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TaskController.class)
public class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getTasks() {
    }

    @Test
    public void getTask() {
    }

    @Test
    public void deleteTask() {
    }

    @Test
    public void updateTask() {
    }

    @Test
    public void createTask() {
    }
}