package android.bignerdranch.firstloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView)  findViewById(R.id.password);
        CheckBox check = (CheckBox) findViewById(R.id.checkbox);

        MaterialButton loginBtn = (MaterialButton) findViewById(R.id.loginbtn);

        //Test the button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   if(username.getText().toString().equals("aurelie") && password.getText().toString().equals("helloWorld") ){
                       //Correct
                       Toast.makeText(MainActivity.this,"Login successful!",Toast.LENGTH_SHORT);

                   }else{
                       //Incorrect
                       Toast.makeText(MainActivity.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();

                   }
            }
        });
        //CheckBox. We use the compoundButton when the state changes to checked or not checked, the method below
        //helps us to have a boolean as a parameter to verify the condition
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
              if(isChecked){//The HideReturnsTransformationMethod returns any character to be hidden when displayingit
                  //The TransformationMethod replaces characters with dots
                      password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());//Display password


              }else{//Hide password
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
              }
            }
        });
    }
}