package com.example.e_buystart;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;


public class homepagefragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView imgmg;
    public homepagefragment() {
        // Required empty public constructor
    }




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
ImageView img;
ImageView imgmg;
        RelativeLayout layout_crocs;
        VideoView videoView;
View view=   inflater.inflate(R.layout.fragment_homepagefragment, container, false);
img=view.findViewById(R.id.imga);
img.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText( getActivity(), "hello", LENGTH_SHORT).show();
    }

});

imgmg=view.findViewById(R.id.imgmg);
layout_crocs=view.findViewById(R.id.layout_crocs);
imgmg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent i=new Intent(getContext(), crocs_home_onclick.class);
        startActivity(i);

    }
});



//String path ="android.resource://" + getActivity().getPackageName()+ "/raw/sale";

return view;

    }
}