package com.buildbrothers.androidjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokesFragment extends Fragment {

    public JokesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_jokes, container, false);

        TextView jokesTextView = root.findViewById(R.id.jokeTextView);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokesActivity.JOKE_EXTRA);
        if (joke != null && joke.length()!=0) {
            jokesTextView.setText(joke);
        }

        return root;
    }

}
