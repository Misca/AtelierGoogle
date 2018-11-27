package com.ateliergoogle.course2mvvm.presentation.todo.adaper;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class ToDoItemViewModel {

    public ObservableBoolean isChecked;
    public ObservableField<String> taskName;

    public ToDoItemViewModel() {
        isChecked = new ObservableBoolean();
        taskName = new ObservableField<>();
    }

}
