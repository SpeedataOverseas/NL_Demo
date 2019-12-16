package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import com.spd.mdm.MdmFunction;

public class MainActivity extends AppCompatActivity {

    private ToggleButton Drop_down_menu;
    private ToggleButton Navigation_bar;
    private MdmFunction mdmFunction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mdmFunction = new MdmFunction(this);

        Drop_down_menu = (ToggleButton)findViewById(R.id.drop_down_menu);
        Navigation_bar = (ToggleButton)findViewById(R.id.navigation_bar);

        Drop_down_menu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mdmFunction.setStatusBarPullEnable(false);
                    Toast.makeText(MainActivity.this,"Close the drop-down menu",Toast.LENGTH_SHORT).show();
                } else {
                    mdmFunction.setStatusBarPullEnable(true);
                    Toast.makeText(MainActivity.this,"Open the drop-down menu",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Navigation_bar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mdmFunction.setNavigationBarEnable(false);
                    Toast.makeText(MainActivity.this,"Close the Navigation bar",Toast.LENGTH_SHORT).show();
                } else {
                    mdmFunction.setNavigationBarEnable(true);
                    Toast.makeText(MainActivity.this,"Open the Navigation bar",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
