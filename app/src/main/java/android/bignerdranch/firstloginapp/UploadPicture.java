package android.bignerdranch.firstloginapp;


import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;


import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.security.Permission;


//Add the following permissions in the manifest line 5--:
//External storage permission
public class UploadPicture extends AppCompatActivity {

    Button btnCamera;
    ImageView profile;
    ActivityResultLauncher<String> mGetContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCamera = (Button) findViewById(R.id.btnCamera);
        profile = (ImageView) findViewById(R.id.profile);

        mGetContent = registerForActivityResult(new ActivityResultContracts.GetContent(),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri result) {
                     profile.setImageURI(result);
                    }
                });
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGetContent.launch("image/*");
            }
        });

//        btnCamera.setOnClickListener(this);
//        handlePermission();
//    }
//
//    void handlePermission() {
//        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
//            return;
//        }
//        if (!(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PermissionChecker.PERMISSION_GRANTED)) {
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, SELECT_IMAGE);
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        switch(requestCode){
//            case SELECT_IMAGE:
//                for(int i = 0; i<permissions.length;i++) {
//                    String permission = permissions[i];
//                    if (grantResults[i] == PackageManager.PERMISSION_DENIED) {
//                        boolean showRationale = ActivityCompat.shouldShowRequestPermissionRationale(this,permission);
//                    if(showRationale){
//                        //Show your message
//                    }else{
//                        //User tapped never ask again
//                        showSettingAlert();
//                    }
//                    }else{
//                        // we are good
//                    }
//                }
//
//        }
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//    }
//
//    private void showSettingAlert() {
//
//    }
//    void openImageChooser(){
//        Intent intent = new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//        startActivityR
//    }
//
//    @Override
//    public void onClick(View view) {
//
//    }
    }
}

