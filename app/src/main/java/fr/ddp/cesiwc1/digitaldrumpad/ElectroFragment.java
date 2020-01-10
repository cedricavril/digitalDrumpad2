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

public class ElectroFragment extends Fragment
{
    protected MediaPlayer playSoundLoopMaster ;
    protected  MediaPlayer playDelayA ;
    protected  MediaPlayer payDelayB;
    protected  MediaPlayer playSoundA;
    protected  MediaPlayer playSoundB;
    protected  MediaPlayer playSoundC;
    protected  MediaPlayer playSoundD;
    protected  MediaPlayer playSoundE;
    protected  MediaPlayer playSoundF;
    protected  MediaPlayer playSoundG;
    protected  MediaPlayer playSoundH;
    protected  MediaPlayer playSoundI;

    protected Button loopMaster;
    protected Button soundElectroDelayA;
    protected Button soundElectroDelayB;
    protected Button playElectroA;
    protected Button playElectroB;
    protected Button playElectroC;
    protected Button playElectroD;
    protected Button playElectroE;
    protected Button playElectroF;
    protected Button playElectroG;
    protected Button playElectroH;
    protected Button playElectroI;


    String textViewString;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View mainView = inflater.inflate(R.layout.fragment_hiphop, container,
                false);


        loopMaster = (Button)mainView.findViewById(R.id.kick);
        soundElectroDelayA = (Button)mainView.findViewById(R.id.clap);
        soundElectroDelayB = (Button)mainView.findViewById(R.id.soundBass);
        playElectroA = (Button)mainView.findViewById(R.id.DrumDelayA);
        playElectroB = (Button)mainView.findViewById(R.id.DrumDelayB);
        playElectroC = (Button)mainView.findViewById(R.id.DrumDelayC);
        playElectroD = (Button)mainView.findViewById(R.id.soundDrumPadA);
        playElectroE = (Button)mainView.findViewById(R.id.soundDrumPadB);
        playElectroF = (Button)mainView.findViewById(R.id.soundDrumPadC);
        playElectroG = (Button)mainView.findViewById(R.id.soundDrumPadD);
        playElectroH = (Button)mainView.findViewById(R.id.soundDrumPadE);
        playElectroI = (Button)mainView.findViewById(R.id.soundDrumPadF);


        playSoundLoopMaster = MediaPlayer.create(getContext(), R.raw.loopmaster);
        playDelayA= MediaPlayer.create(getContext(), R.raw.delayelectrica);
        payDelayB = MediaPlayer.create(getContext(), R.raw.delayelectricb);
        playSoundA = MediaPlayer.create(getContext(),  R.raw.delayelectricc);
        playSoundB = MediaPlayer.create(getContext(),  R.raw.delayelectricd);
        playSoundC = MediaPlayer.create(getContext(),  R.raw.delayelectrice);
        playSoundD = MediaPlayer.create(getContext(), R.raw.soundfx);
        playSoundE = MediaPlayer.create(getContext(), R.raw.soundfxa);
        playSoundF = MediaPlayer.create(getContext(), R.raw.soundfxb);
        playSoundG = MediaPlayer.create(getContext(), R.raw.bassloop);
        playSoundH = MediaPlayer.create(getContext(), R.raw.guitardelay);
        playSoundI = MediaPlayer.create(getContext(), R.raw.bassloopb);



        loopMaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playSoundLoopMaster.isPlaying()) playSoundLoopMaster.seekTo(0);
                playSoundLoopMaster.start();


            }

        });

        soundElectroDelayA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playDelayA.isPlaying()) playDelayA.seekTo(0);
                playDelayA.start();
            }

        });

        soundElectroDelayB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (payDelayB.isPlaying()) payDelayB.seekTo(0);
                payDelayB.start();


            }

        });

        playElectroA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (playSoundA.isPlaying()) playSoundA.seekTo(0);
                playSoundA.start();

            }
        });

        playElectroB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (playSoundB.isPlaying()) playSoundB.seekTo(0);
                playSoundB.start();


            }
        });

        playElectroC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playSoundC.isPlaying()) playSoundC.seekTo(0);
                playSoundC.start();

            }
        });

        playElectroD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (playSoundD.isPlaying()) playSoundD.seekTo(0);
                playSoundD.start();

            }
        });

        playElectroE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playSoundE.isPlaying()) playSoundE.seekTo(0);
                playSoundE.start();
            }
        });

        playElectroF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playSoundF.isPlaying()) playSoundF.seekTo(0);
                playSoundF.start();

            }
        });

        playElectroG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playSoundG.isPlaying()) playSoundG.seekTo(0);
                playSoundG.start();

            }
        });

        playElectroH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playSoundH.isPlaying()) playSoundH.seekTo(0);
                playSoundH.start();

            }
        });

        playElectroI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playSoundI.isPlaying()) playSoundI.seekTo(0);
                playSoundI.start();

            }
        });


        return mainView;
    }

    @Override
    public void onPause() {
        playSoundLoopMaster.pause();
        playDelayA.pause();
        payDelayB.pause();
        playSoundA.pause();
        playSoundB.pause();
        playSoundC.pause();
        playSoundD.pause();
        playSoundE.pause();
        playSoundF.pause();
        playSoundG.pause();
        playSoundH.pause();
        playSoundI.pause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        playSoundLoopMaster = null;
        playDelayA = null;
        payDelayB = null;
        playSoundA = null;
        playSoundB = null;
        playSoundC = null;
        playSoundD = null;
        playSoundE = null;
        playSoundF = null;
        playSoundG = null;
        playSoundH = null;
        playSoundI = null;

        super.onDestroy();
    }

}