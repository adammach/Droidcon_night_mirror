package org.opencv.samples.tutorial1;

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
public class NightMirrorFragment extends Fragment {

    public NightMirrorFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_night_mirror, container, false);
        Button startBtn = (Button) v.findViewById(R.id.button);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mirrorIntent = new Intent(getActivity(), NightModeActivity.class);
                getActivity().startActivity(mirrorIntent);
            }
        });
        return v;
    }
}
