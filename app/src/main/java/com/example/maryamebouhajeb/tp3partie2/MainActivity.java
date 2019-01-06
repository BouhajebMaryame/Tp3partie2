package com.example.maryamebouhajeb.tp3partie2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_VALEUR="com.example.lass.Tp3partie2.EXTRA_VALEUR";
    Button b_convert = null;
    EditText montant = null;
    RadioGroup group = null;
    TextView result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_convert = (Button) findViewById(R.id.convert);
        montant = (EditText) findViewById(R.id.montant);
        group = (RadioGroup) findViewById(R.id.group);
        result = (TextView) findViewById(R.id.result);
        b_convert.setOnClickListener(convertirListener);


    }
    private View.OnClickListener convertirListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String m = montant.getText().toString();
            float mValue = Float.valueOf(m);
            if(group.getCheckedRadioButtonId() == R.id.Dinar)
                mValue*= 1/2.2216;
            else mValue*=2.2216 ;
            result.setText("Le montant apres conversion: " + String.valueOf(mValue));
            Intent secondeActivite = new Intent(MainActivity.this, nvActivity.class);
            secondeActivite.putExtra(EXTRA_VALEUR,mValue);
            startActivity(secondeActivite);
        }



    };

}
