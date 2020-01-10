package fr.ddp.cesiwc1.digitaldrumpad;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity
{
    int currentFragmentIndex =-1;
    Fragment    newFragment;
    Fragment[] fragmentArray;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFragments();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switchNewFragment();
                setNewFragment();
            }
        });

    }

    protected void setFragments()
    {
        HipHopFragment hipHopFragment = new HipHopFragment();
        ElectroFragment fragment2 = new ElectroFragment();
        fragmentArray = new Fragment[]{hipHopFragment,fragment2};
        newFragment = hipHopFragment;
        setNewFragment();
    }


    protected void switchNewFragment()
    {
        if (currentFragmentIndex!=1)
        {
            currentFragmentIndex =1;
        }
        else
        {
            currentFragmentIndex=0;
        }
        newFragment = fragmentArray[currentFragmentIndex];
    }

    protected void setNewFragment()
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentView, newFragment);
        // Committing the transaction
        fragmentTransaction.commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }


}