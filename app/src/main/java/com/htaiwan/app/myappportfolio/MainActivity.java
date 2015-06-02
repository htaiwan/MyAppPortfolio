package com.htaiwan.app.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MyActivity";

    private Button mbutton1;
    private Button mbutton2;
    private Button mbutton3;
    private Button mbutton4;
    private Button mbutton5;
    private Button mbutton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton1 = (Button)findViewById(R.id.button1);
        mbutton2 = (Button)findViewById(R.id.button2);
        mbutton3 = (Button)findViewById(R.id.button3);
        mbutton4 = (Button)findViewById(R.id.button4);
        mbutton5 = (Button)findViewById(R.id.button5);
        mbutton6 = (Button)findViewById(R.id.button6);

        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "button1 press");
                showMessage(1);
            }
        });

        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "button2 press");
                showMessage(2);
            }
        });

        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "button3 press");
                showMessage(3);
            }
        });

        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "button4 press");
                showMessage(4);
            }
        });

        mbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "button5 press");
                showMessage(5);
            }
        });

        mbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "button6 press");
                showMessage(6);
            }
        });
    }


    public void showMessage(int buttonIndex) {
        String msg = "";
        switch (buttonIndex) {
            case 1:
                msg = "This button will launch my Spotify Streamer App !!";
                break;
            case 2:
                msg = "This button will launch my Football Scores App !!";
                break;
            case 3:
                msg = "This button will launch my Library App !!";
                break;
            case 4:
                msg = "This button will launch my Build It Bigger App !!";
                break;
            case 5:
                msg = "This button will launch my XYZ Reader App !!";
                break;
            case 6:
                msg = "This button will launch my Capstone App !!";
                break;
            default:
                msg = "default";
                break;
        }

        Toast.makeText(MainActivity.this, msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
