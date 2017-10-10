package edu.sdmesa.mesacollege;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.Manifest;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button buttonMesa;
    Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMesa = (Button) findViewById(R.id.buttonMesa);
        buttonMesa.setOnClickListener(this);

        callButton=(Button) findViewById(R.id.callButton);
        callButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonMesa:
                Intent m = new Intent(this, MesaCollegeActivity.class);
                startActivity(m);
            break;

            case R.id.callButton:
                String number="619-388-2600";
                Intent callI= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +number));
//                callI.setData(Uri.parse("tel:" +number));
//                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
//                {
//                    return;
//                }
                startActivity(callI);
            break;
        }


    }
}