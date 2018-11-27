package com.ateliergoogle.course2mvvm.presentation.todo.adaper;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ateliergoogle.course2mvvm.databinding.TodoItemBinding;

import java.util.ArrayList;
import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.TaskViewHolder> {

    private List<ToDoItemViewModel> taskModelList;

    public ToDoAdapter() {
        this.taskModelList = new ArrayList<>();
    }

    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TodoItemBinding binder = TodoItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);

        return new TaskViewHolder(binder);
    }

    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position) {
        holder.binding.setViewmodel(taskModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return taskModelList.size();
    }

    public void setItems(List<ToDoItemViewModel> blogList) {
        taskModelList = blogList;
        notifyDataSetChanged();
    }


    public class TaskViewHolder extends RecyclerView.ViewHolder {
        final TodoItemBinding binding;

        public TaskViewHolder(TodoItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}