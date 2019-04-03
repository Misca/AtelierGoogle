package com.ateliergoogle.course2mvvm.presentation.todo;

import com.ateliergoogle.course2mvvm.data.ToDoRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class ToDoViewModelTest {

    private ToDoViewModel viewModel;

    @Mock
    ToDoRepository repository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        viewModel = new ToDoViewModel(repository);
    }

    @Test
    public void fetchToDoList_whenOnCreate_shouldCallGetToDosOnRepo() {
        viewModel.fetchToDoList();

        Mockito.verify(repository).getToDos();
    }
}
