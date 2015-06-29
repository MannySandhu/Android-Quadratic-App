package com.sandhu.manny.quadraticsolverapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sandhu.manny.quadraticsolverapplication.R;

/**
 * Created by Manny S on 29/06/2015.
 */
public class QuizFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.quiz_fragment_layout, container, false);
        return v;
    }
}
