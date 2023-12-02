package com.example.e_buystart;

import static android.app.ProgressDialog.show;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_explorepage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_explorepage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_explorepage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_explorepage.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_explorepage newInstance(String param1, String param2) {
        fragment_explorepage fragment = new fragment_explorepage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_explorepage, container, false);
        VideoView videoview,videoview2;
        ImageView nike_main_explore,airpods_explore,appleipad_explore,explore_men,womensfashion_explore,motoimg;
        videoview=view.findViewById(R.id.videoview);
        videoview2=view.findViewById(R.id.videoview2);
        nike_main_explore=view.findViewById(R.id.nike_main_explore);
        airpods_explore=view.findViewById(R.id.airpods_explore);
        appleipad_explore=view.findViewById(R.id.appleipad_explore);
        explore_men=view.findViewById(R.id.explore_men);
        womensfashion_explore=view.findViewById(R.id.womensfashion_explore);
        motoimg=view.findViewById(R.id.motoimg);
        String path ="android.resource://" + getActivity().getPackageName()+ "/raw/nikead";
        videoview.setVideoPath(path);
        videoview.start();

         videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }



        });
        String video2path ="android.resource://" + getActivity().getPackageName()+ "/raw/moto";
         videoview2.setVideoPath(video2path);
         videoview2.start();
        videoview2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }

        });

motoimg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String motourl ="https://www.motorola.in/smartphone-motorola-razr-40-ultra/p?skuId=344";
        Intent intent ;
        intent= new Intent(Intent.ACTION_VIEW, Uri.parse(motourl));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.android.chrome");
        Toast.makeText(getActivity(), "opening motorola", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
});
         nike_main_explore.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v){
                 String nikepageurl ="https://www.nike.com/in/sportswear";
                     Intent intent ;
                     intent= new Intent(Intent.ACTION_VIEW, Uri.parse(nikepageurl));
                     intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                     intent.setPackage("com.android.chrome");
                     Toast.makeText(getActivity(), "opening nike", Toast.LENGTH_SHORT).show();
                     startActivity(intent);
                 }
         });
         airpods_explore.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String appleurl="https://www.apple.com/airpods/";
                 Intent inext =new Intent(Intent.ACTION_VIEW,Uri.parse(appleurl));
                 inext.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                 inext.setPackage("com.android.chrome");
                 startActivity(inext);
             }
         });
         appleipad_explore.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String appleurl="https://www.apple.com/in/ipad/";
                 Intent inext =new Intent(Intent.ACTION_VIEW,Uri.parse(appleurl));
                 inext.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                 inext.setPackage("com.android.chrome");
                 startActivity(inext);
             }
         });
         explore_men.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getActivity(), "men", Toast.LENGTH_SHORT).show();
                 Intent inttent=new Intent(getContext(), explore_onlclick_toolbar.class);

                 startActivity(inttent);
             }
         });

        womensfashion_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "women", Toast.LENGTH_SHORT).show();
                Intent inttent=new Intent(getContext(), explore_onlclick_toolbar.class);
                startActivity(inttent);
            }
        });

         return view;
    }
}