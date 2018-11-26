package com.ateliergoogle.course2mvvm.data;

import android.arch.lifecycle.LiveData;

import com.ateliergoogle.course2mvvm.presentation.todo.adaper.ToDoItemViewModel;

import java.util.List;

public interface ToDoRepository {

    LiveData<List<ToDoItemViewModel>> getToDos();

    void saveToDos(List<ToDoItemViewModel> toDos);
}
