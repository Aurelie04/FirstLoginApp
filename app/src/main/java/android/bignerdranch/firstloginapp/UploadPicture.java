package android.bignerdranch.firstloginapp;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


//Add the following permissions in the manifest line 5--:
//<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
//<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
//<uses-permission android:name="android.permission.CAMERA"/>
//<uses-permission android:name="android.hardware.camera.autofocus"/>
public class UploadPicture extends AppCompatActivity {
    //private int REQUEST_CODE =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btnCamera = (Button) findViewById(R.id.btnCamera);
        ImageView profile = ( ImageView) findViewById(R.id.profile);

//        btnCamera.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                  if(ContextCompat.checkSelfPermission(UploadPicture.this,
//                          Manifest.permission.READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED){
//                      //Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                      //            startActivityForResult(galleryIntent, PICK_FROM_GALLERY);
//                      //Or display a toast
//                      Toast.makeText(UploadPicture.this,"The permission has been granted",Toast.LENGTH_SHORT);
//
//                  }else{
//                      requestStoragePermission();
//                  }
//            }
//        });




    }

//    private void requestStoragePermission() {
//        //
//        if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.READ_EXTERNAL_STORAGE)){
//         new AlertDialog.Builder(this)
//                 .setTitle("Reason")
//                 .setMessage("The permission is needes to upload a profile picture for the application.")
//                 .setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                     @Override
//                     public void onClick(DialogInterface dialogInterface, int i) {
//                         ActivityCompat.requestPermissions(UploadPicture.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_CODE);
//
//                     }
//                 })
//                 .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//                     @Override
//                     public void onClick(DialogInterface dialogInterface, int i) {
//                         dialogInterface.dismiss();
//                     }
//                 })
//                 .create().show();
//        }else{
//            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_CODE);
//        }
//    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == REQUEST_CODE) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                // Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                //startActivityForResult(galleryIntent, PICK_FROM_GALLERY);
//
//                Toast.makeText(this, "Permission grated", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
//
//            }
//        }
//    }
}
