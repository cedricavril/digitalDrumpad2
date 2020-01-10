package fr.ddp.cesiwc1.digitaldrumpad;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by PierreB on 11/05/2017.
 */

public class HipHopFragment extends Fragment
{
    protected MediaPlayer kick ;
    protected  MediaPlayer clap ;
    protected  MediaPlayer bass;
    protected  MediaPlayer drumDelayA;
    protected  MediaPlayer drumDelayB;
    protected  MediaPlayer drumDelayC;
    protected  MediaPlayer playA;
    protected  MediaPlayer playB;
    protected  MediaPlayer playC;
    protected  MediaPlayer playD;
    protected  MediaPlayer playE;
    protected  MediaPlayer playF;

    protected Button playBass;
    protected Button playDrumkick;
    protected Button playDrumClap;
    protected Button playDrumDelayA;
    protected Button playDrumDelayB;
    protected Button playDrumDelayC;
    protected Button playDrumA;
    protected Button playDrumB;
    protected Button playDrumC;
    protected Button playDrumD;
    protected Button playDrumE;
    protected Button playDrumF;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View mainView = inflater.inflate(R.layout.fragment_electro, container,
                false);

        playDrumkick = (Button)mainView.findViewById(R.id.kick);
        playDrumClap = (Button)mainView.findViewById(R.id.clap);
        playBass = (Button)mainView.findViewById(R.id.soundBass);
        playDrumDelayA = (Button)mainView.findViewById(R.id.DrumDelayA);
        playDrumDelayB = (Button)mainView.findViewById(R.id.DrumDelayB);
        playDrumDelayC = (Button)mainView.findViewById(R.id.DrumDelayC);
        playDrumA = (Button)mainView.findViewById(R.id.soundDrumPadA);
        playDrumB = (Button)mainView.findViewById(R.id.soundDrumPadB);
        playDrumC = (Button)mainView.findViewById(R.id.soundDrumPadC);
        playDrumD = (Button)mainView.findViewById(R.id.soundDrumPadD);
        playDrumE = (Button)mainView.findViewById(R.id.soundDrumPadE);
        playDrumF = (Button)mainView.findViewById(R.id.soundDrumPadF);

        kick = MediaPlayer.create(getContext(), R.raw.kick);
        clap = MediaPlayer.create(getContext(), R.raw.clap);
        bass = MediaPlayer.create(getContext(), R.raw.bass);
        drumDelayA = MediaPlayer.create(getContext(),  R.raw.sounddrumdelaya);
        drumDelayB = MediaPlayer.create(getContext(),  R.raw.sounddrumdelayb);
        drumDelayC = MediaPlayer.create(getContext(),  R.raw.sounddrumdelayc);
        playA = MediaPlayer.create(getContext(), R.raw.sounddruma);
        playB = MediaPlayer.create(getContext(), R.raw.sounddrumb);
        playC = MediaPlayer.create(getContext(), R.raw.sounddrumc);
        playD = MediaPlayer.create(getContext(), R.raw.sounddrumd);
        playE = MediaPlayer.create(getContext(), R.raw.sounddrume);
        playF = MediaPlayer.create(getContext(), R.raw.sounddrumf);



        playDrumkick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (kick.isPlaying()) kick.seekTo(0);
                kick.start();
            }
        });

        playDrumClap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clap.isPlaying()) clap.seekTo(0);
                clap.start();
            }

        });

        playBass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bass.isPlaying()) bass.seekTo(0);
                bass.start();


            }

        });

        playDrumDelayA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (drumDelayA.isPlaying()) drumDelayA.seekTo(0);
                drumDelayA.start();

            }
        });

        playDrumDelayB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (drumDelayB.isPlaying()) drumDelayB.seekTo(0);
                drumDelayB.start();


            }
        });

        playDrumDelayC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drumDelayC.isPlaying()) drumDelayC.seekTo(0);
                drumDelayC.start();

            }
        });

        playDrumA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (playA.isPlaying()) playA.seekTo(0);
                playA.start();

            }
        });

        playDrumB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playB.isPlaying()) playB.seekTo(0);
                playB.start();
            }
        });

        playDrumC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playC.isPlaying()) playC.seekTo(0);
                playC.start();

            }
        });

        playDrumD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playD.isPlaying()) playD.seekTo(0);
                playD.start();


            }
        });

        playDrumE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playE.isPlaying()) playE.seekTo(0);
                playE.start();


            }
        });

        playDrumF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playF.isPlaying()) playF.seekTo(0);
                playF.start();;
            }
        });

        return mainView;
    }
    @Override
    public void onPause() {
        drumDelayA.pause();
        drumDelayB.pause();
        drumDelayC.pause();
        kick.pause();
        clap.pause();
        bass.pause();
        playA.pause();
        playB.pause();
        playC.pause();
        playD.pause();
        playE.pause();
        playF.pause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        drumDelayA = null;
        drumDelayB = null;
        drumDelayC = null;
        kick = null;
        clap = null;
        bass = null;
        playA = null;
        playB = null;
        playC = null;
        playD = null;
        playE = null;
        playF = null;

        super.onDestroy();
    }
}