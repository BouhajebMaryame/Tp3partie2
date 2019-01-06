package com.example.maryamebouhajeb.tp3partie2;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nvActivity extends AppCompatActivity{

    TextView result=null;
    Button back=null;
    Button call=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nv);
        result = (TextView) findViewById(R.id.result);
        back=(Button)findViewById(R.id.back);
        call=(Button)findViewById(R.id.call);
        back.setOnClickListener(backListner);
        call.setOnClickListener(callListner);

        Intent i = getIntent();
        float mValue =i.getFloatExtra(MainActivity.EXTRA_VALEUR,0);
        result.setText("Le montant apres conversion: " + mValue);
    }
    private View.OnClickListener backListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent firstActivite = new Intent(nvActivity.this,MainActivity.class);
            startActivity(firstActivite);
        }
    };
    private View.OnClickListener callListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri telephone = Uri.parse("tel:0769345532");
            Intent ThirdActivite = new Intent(Intent.ACTION_DIAL, telephone);
            startActivity(ThirdActivite);
        }
    };
}
