package com.ateliergoogle.course2mvvm.presentation.bindings;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ateliergoogle.course2mvvm.presentation.todo.adaper.ToDoAdapter;
import com.ateliergoogle.course2mvvm.presentation.todo.adaper.ToDoItemViewModel;

import java.util.List;

public class RecyclerBindings {

    public final static int ADAPTER_TYPE_FEED = 1;

    @BindingAdapter({"adapterType"})
    public static void addFeedItems(RecyclerView recyclerView,  int adapterType) {

        switch (adapterType) {
            case ADAPTER_TYPE_FEED:
                ToDoAdapter taskAdapter = new ToDoAdapter();
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                recyclerView.setAdapter(taskAdapter);
                break;
        }
    }

    @BindingAdapter({"items"})
    public static void addFeedItems(RecyclerView recyclerView, List<ToDoItemViewModel> tasks) {
        ToDoAdapter adapter = (ToDoAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.setItems(tasks);
        }
    }
}
