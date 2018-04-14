package omy.boston.mybostonradiolist;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tekst = (TextView) findViewById(R.id.textView);
        final RadioButton one = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton two = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton three = (RadioButton) findViewById(R.id.radioButton3);
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroup);

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton){
                            tekst.setText(R.string.kentucky_fried_chicken);
                        }else if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton2){
                            tekst.setText(R.string.pepsy_twist);
                        }else if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton3){
                            tekst.setText(R.string.quirrito);
                        }else {
                            Toast tost = Toast.makeText(MainActivity.this, "Odaberi", Toast.LENGTH_LONG);
                            tost.show();
                        }
                    }
                }
        );







    }// onCreate the end!

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**Metoda za puvratak podataka**/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        qLog("Zabilježena je metoda - onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**Spremanje podataka**/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        qLog("Zabilježena je metoda - onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //Pračenje loga
    private void qLog(String logTekst){
        Log.d("napravi Log", logTekst);
    }
}
