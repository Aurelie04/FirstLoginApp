package android.bignerdranch.firstloginapp;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;

import android.Manifest;
import android.bignerdranch.firstloginapp.databinding.ActivityMainBinding;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.security.Permissions;
import java.security.acl.Permission;

public class UploadPicture extends AppCompatActivity {
    ActivityMainBinding binding;
    ActivityResultLauncher<String> choosePicture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btnCamera =  findViewById(R.id.btnCamera);
        ImageView profile = findViewById(R.id.profile);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        choosePicture = registerForActivityResult(//To use ActivityResultContracts and ActivityResultCallback and returns an ActivityResultLauncher
        //Which is to set the profile or the picture
                new ActivityResultContracts.GetContent(),//To prompt the user to pick one or more pieces of content, receiving a content;
                new ActivityResultCallback<Uri>() {//Uri is for each piece of content that allows you to use android.
                    @Override
                    public void onActivityResult(Uri result){

                        profile.setImageURI(result);
                    }
                }
    
        );
      btnCamera.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              choosePicture.launch("image/*");
          }
      });

    }


}
