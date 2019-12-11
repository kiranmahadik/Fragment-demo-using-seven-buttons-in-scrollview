package in.kiran.fragmentdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mBtnOne, mBtnTwo, mBtnThree,mBtnFour, mBtnFive, mBtnSix, mBtnSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnOne = findViewById(R.id.Button1);
        mBtnTwo = findViewById(R.id.Button2);
        mBtnThree = findViewById(R.id.Button3);
        mBtnFour = findViewById(R.id.Button4);
        mBtnFive = findViewById(R.id.Button5);
        mBtnSix = findViewById(R.id.Button6);
        mBtnSeven = findViewById(R.id.Button7);


        mBtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(this);
        mBtnThree.setOnClickListener(this);
        mBtnFour.setOnClickListener(this);
        mBtnFive.setOnClickListener(this);
        mBtnSix.setOnClickListener(this);
        mBtnSeven.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.Button1 :
                FirstFragment firstFragment = new FirstFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.LinearLayout,firstFragment,firstFragment.getTag()).commit();
                break;

            case R.id.Button2:
                SecondFragment secondFragment = new SecondFragment();
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                fragmentManager1.beginTransaction().replace(R.id.LinearLayout,secondFragment,secondFragment.getTag()).commit();
                break;

            case R.id.Button3:
                ThirdFragment thirdFragment = new ThirdFragment();
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                fragmentManager2.beginTransaction().replace(R.id.LinearLayout,thirdFragment,thirdFragment.getTag()).commit();
                break;

            case R.id.Button4:
                FourthFragment fourthFragment = new FourthFragment();
                FragmentManager fragmentManager3 = getSupportFragmentManager();
                fragmentManager3.beginTransaction().replace(R.id.LinearLayout,fourthFragment,fourthFragment.getTag()).commit();
                break;

            case R.id.Button5:
                FifthFragment fifthFragment = new FifthFragment();
                FragmentManager fragmentManager4 = getSupportFragmentManager();
                fragmentManager4.beginTransaction().replace(R.id.LinearLayout,fifthFragment,fifthFragment.getTag()).commit();
                break;

            case R.id.Button6:
                SixthFragment sixthFragment = new SixthFragment();
                FragmentManager fragmentManager5 = getSupportFragmentManager();
                fragmentManager5.beginTransaction().replace(R.id.LinearLayout,sixthFragment,sixthFragment.getTag()).commit();
                break;

            case R.id.Button7:
                SeventhFragment seventhFragment = new SeventhFragment();
                FragmentManager fragmentManager6 = getSupportFragmentManager();
                fragmentManager6.beginTransaction().replace(R.id.LinearLayout,seventhFragment,seventhFragment.getTag()).commit();
                break;

        }
    }
}
