package com.ateliergoogle.course2mvvm.presentation.todo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.ateliergoogle.course2mvvm.data.ToDoRepository;

public class ViewModelFactory implements ViewModelProvider.Factory {

    private ToDoRepository repository;

    public ViewModelFactory(ToDoRepository repository) {
        this.repository = repository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {

        if (modelClass.isAssignableFrom(ToDoViewModel.class)) {
            return (T) new ToDoViewModel(repository);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}