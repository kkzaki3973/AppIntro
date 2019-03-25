package com.github.appintro.example.ui.mainTabs;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.github.appintro.example.R;
import com.github.appintro.example.ui.mainTabs.intro.DefaultIntro2;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by andrew on 11/17/16.
 */

public class DefaultLayout2Intro extends Fragment {

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button demo = getView().findViewById(R.id.intro2);
        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity().getBaseContext(), DefaultIntro2.class));
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_default_intro2, container, false);
    }
}