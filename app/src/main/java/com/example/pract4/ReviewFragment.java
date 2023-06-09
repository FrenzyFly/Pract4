package com.example.pract4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.pract4.databinding.FragmentReviewBinding;

import java.util.ArrayList;
import java.util.List;

public class ReviewFragment extends Fragment {

    private FragmentReviewBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentReviewBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        UserListReviewAdapter adapter = new UserListReviewAdapter(getContext(), initList());
        binding.userRcList.setAdapter(adapter);
    }

    private List<UserListItem> initList() {
        List<UserListItem> list = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            list.add(
                    new UserListItem(
                            R.drawable.ic_launcher_background,
                            getString(R.string.user_list_item_title, String.valueOf(i)))
            );
        }
        return list;
    }
}
