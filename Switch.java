
package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class about extends AppCompatActivity {

private Switch mSwitch;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
           mSwitch = (Switch) findViewById(R.id.myswitch);
        mSwitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
        }
    }
}
