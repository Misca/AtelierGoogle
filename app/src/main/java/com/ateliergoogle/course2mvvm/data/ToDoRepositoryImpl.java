package com.ateliergoogle.course2mvvm.data;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.ateliergoogle.course2mvvm.presentation.todo.adaper.ToDoItemViewModel;

import java.util.List;

public class ToDoRepositoryImpl implements ToDoRepository {

    public ToDoRepositoryImpl(Context context) {
        //TODO construct local data provider, ROOM needs app context
    }

    @Override
    public LiveData<List<ToDoItemViewModel>> getToDos() {
        return null;
    }

    @Override
    public void saveToDos(List<ToDoItemViewModel> toDos) {

    }

}
