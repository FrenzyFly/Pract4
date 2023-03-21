package com.example.pract4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pract4.databinding.FragmentLiewBinding;

import java.util.ArrayList;
import java.util.List;

public class LiewFragment extends Fragment {

    private FragmentLiewBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentLiewBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SubjectListAdapter adapter = new SubjectListAdapter(requireContext(), R.layout.item_subject_list, initList());
        binding.subjectList.setAdapter(adapter);
    }

    private List<SubjectListItem> initList() {
        List<SubjectListItem> list = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            list.add(
                    new SubjectListItem(
                            R.drawable.ic_launcher_background,
                            getString(R.string.user_list_subject_title, String.valueOf(i)),
                            "Desc")
            );
        }
        return list;
    }
}
