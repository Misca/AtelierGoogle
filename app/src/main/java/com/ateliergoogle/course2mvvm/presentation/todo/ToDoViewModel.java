package com.ateliergoogle.course2mvvm.presentation.todo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.util.Log;

import com.ateliergoogle.course2mvvm.data.ToDoRepository;
import com.ateliergoogle.course2mvvm.presentation.todo.adaper.ToDoItemViewModel;

public class ToDoViewModel extends ViewModel implements LifecycleObserver {

    private static final String TAG = ToDoViewModel.class.getName();

    private ToDoRepository repository;

    public ObservableList<ToDoItemViewModel> items;

    public ToDoViewModel(ToDoRepository repository) {
        this.repository = repository;

        this.items = new ObservableArrayList<>();
    }

    public void onAddTaskClick() {
        Log.d("ToDoViewModel", "onAddTaskClick");
        items.add(new ToDoItemViewModel());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void fetchToDoList() {
        Log.d(TAG, "fetchToDoList()");
        repository.getToDos();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void saveToDoList() {
        Log.d(TAG, "saveToDoList()");
    }

}
