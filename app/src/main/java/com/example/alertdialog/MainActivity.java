package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final int DIALOG = 1;
    Button button, button2;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:

                pd = new ProgressDialog(this);
                pd.setTitle("Progressiv");
                pd.setMessage("Delete dick C:");
                pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pd.setIndeterminate(true);
                pd.setButton(-2, "NO", myClickListener);
                pd.setButton(-1, "ok", myClickListener);
                pd.setButton(-3, "NO", myClickListener);
                pd.show();
                break;
            case R.id.button:
                AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                b.setTitle("Alert!!!!!!!");
                b.setMessage("Do you realy want get out?");
                b.setPositiveButton("ok", myClickListener);
                b.setNeutralButton("Cancel", myClickListener);
                b.setNegativeButton("no", myClickListener);
                b.show();
                break;
        }
    }

    DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which){
                case Dialog.BUTTON_POSITIVE:

//                    Toast toast  = Toast.makeText(MainActivity.this,"ok ", Toast.LENGTH_LONG);
//                    toast.show();
                    break;
                case Dialog.BUTTON_NEGATIVE:
                    Toast toast1  = Toast.makeText(MainActivity.this,"No ", Toast.LENGTH_LONG);
                    toast1.show();
                    break;
                case Dialog.BUTTON_NEUTRAL:
                    Toast toast2  = Toast.makeText(MainActivity.this,"  ", Toast.LENGTH_SHORT);
                    toast2.show();
                    //finish();
                    break;

            }

        }


    };



}




