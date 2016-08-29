package com.example.lahad.dakartrafic;

/**
 * Created by lahad on 22/08/2016.
 */
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class AProposActivity extends Fragment {

    private Button  btnBack;
    View     myView;
    public  AProposActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView =  inflater.inflate(R.layout.apropos, container, false);

        return myView;
    }
}
