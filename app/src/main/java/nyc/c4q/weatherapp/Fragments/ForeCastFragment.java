package nyc.c4q.weatherapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;

import nyc.c4q.weatherapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ForeCastFragment extends Fragment{
    View view;



    public ForeCastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_fore_cast, container, false);



        return view;
    }


}
