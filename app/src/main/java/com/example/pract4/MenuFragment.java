package com.example.pract4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pract4.databinding.FragmentMenuBinding;

public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMenuBinding.inflate(inflater, container, false);
        return binding.getRoot();
    } casuchasihc

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.subjectListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .replace(R.id.fragment_container, new LiewFragment())
                        .commit();
            }
        });
        binding.userListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .replace(R.id.fragment_container, new ReviewFragment())
                        .commit();
            }
        });
    }
}