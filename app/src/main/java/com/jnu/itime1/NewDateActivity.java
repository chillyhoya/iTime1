package com.jnu.itime1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NewDateActivity extends AppCompatActivity {

    private Button buttonBack,buttonGo;
    private EditText editTextTitle,editTextDsc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_date);

        buttonBack=(Button)findViewById(R.id.float_back);
        buttonGo=(Button)findViewById(R.id.float_go);
        editTextTitle=(EditText)findViewById(R.id.edit_text_title);
        editTextDsc=(EditText)findViewById(R.id.edit_text_dsc);
    }
}
