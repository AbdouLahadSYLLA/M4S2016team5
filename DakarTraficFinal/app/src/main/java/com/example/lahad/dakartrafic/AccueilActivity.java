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
public class AccueilActivity extends Fragment {
    private Button btnMap,btnNotif;

    View     myView;
    public  AccueilActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      myView= inflater.inflate(R.layout.activity_accueil, container, false);

        btnMap = (Button)myView.findViewById(R.id.btn_map);
        btnNotif = (Button)myView.findViewById(R.id.btn_notif);

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MapLocation.class));
            }
        });
        return  myView;
    }
}
