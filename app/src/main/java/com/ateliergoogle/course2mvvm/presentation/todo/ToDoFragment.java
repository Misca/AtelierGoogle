package com.ateliergoogle.course2mvvm.presentation.todo;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ateliergoogle.course2mvvm.R;
import com.ateliergoogle.course2mvvm.data.ToDoRepository;
import com.ateliergoogle.course2mvvm.data.ToDoRepositoryImpl;
import com.ateliergoogle.course2mvvm.databinding.TodoFragmentBinding;

public class ToDoFragment extends Fragment {

    private ToDoViewModel mViewModel;

    public static ToDoFragment newInstance() {
        return new ToDoFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.todo_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViewModel();

        TodoFragmentBinding binding = TodoFragmentBinding.bind(view);

        binding.setViewmodel(mViewModel);

        //for those lifecycle callbacks in view model, like ON_CREATE
        getLifecycle().addObserver(mViewModel);
    }

    private void initViewModel() {
        ToDoRepository repository = new ToDoRepositoryImpl(getContext().getApplicationContext());
        ViewModelFactory factory = new ViewModelFactory(repository);
        mViewModel = ViewModelProviders.of(this, factory).get(ToDoViewModel.class);
    }

}
