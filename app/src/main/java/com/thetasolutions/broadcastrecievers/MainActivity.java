package com.thetasolutions.broadcastrecievers;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn_show_dialog);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //create a dialog
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        AlertDialog alertDialog =alertDialogBuilder.create();
        //set components of dialog
        alertDialog.setTitle("WARNING!");
        alertDialog.setMessage("Do you want to close application");
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,"YES",new DialogButtonsClickHandler()); // make yes button and implement a dialog click listener
        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"NO",new DialogButtonsClickHandler());
        alertDialog.show();
    }

    // class defined to handle click listener of dialog buttons
    public class DialogButtonsClickHandler implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            switch (i){
                case DialogInterface.BUTTON_POSITIVE:
                    //do something when positive button is clicked
                    break;
                case DialogInterface.BUTTON_NEGATIVE:
                    //do something when negative button is clicked
                    break;
            }
        }
    }
}
