package app.ewtc.masterung.easyapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import app.ewtc.masterung.easyapp.R;

/**
 * Created by masterung on 7/10/2017 AD.
 */

public class MainFragment extends Fragment{

    //Explicit
    private ImageView imageView;
    private Button decButton, incButton;

    //My Constant
    private int[] imageInts = new int[]{
            R.drawable.icon1,
            R.drawable.icon2,
            R.drawable.icon3};
    private int indexAnInt = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Initial View
        initialView();

//        Increase Controller
        increaseController();

    }

    private void increaseController() {

        final String tag = "8octV1";

        incButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(tag, "Length of Array ==> " + imageInts.length);
                if (indexAnInt < imageInts.length-1) {
                    //Todo
                    indexAnInt += 1;
                } else {
                    indexAnInt = 0;
                }
                Log.d(tag, "Current index ==> " + indexAnInt);
                imageView.setImageResource(imageInts[indexAnInt]);

            }   // onClick
        });
    }

    private void initialView() {

        imageView = getView().findViewById(R.id.imvImage);
        decButton = getView().findViewById(R.id.btnDecrease);
        incButton = getView().findViewById(R.id.btnIncrease);
    }
}   // Main Class
