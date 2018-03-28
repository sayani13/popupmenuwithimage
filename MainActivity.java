package com.example.mahe.lab7q3;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends Activity {

    ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgButton = (ImageButton) findViewById(R.id.imageButton);


    }

    public void onClick(View v) {
        final int[] images= new int[]{ R.drawable.download,R.drawable.sample};
        final ImageView img=findViewById(R.id.imageView);
        //Creating the instance of PopupMenu
        PopupMenu popup = new PopupMenu(MainActivity.this, imgButton);
        //Inflating the Popup using xml file
        popup.getMenuInflater()
                .inflate(R.menu.popup, popup.getMenu());

        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
              switch (item.getItemId())
              {
                  case R.id.one:
                      img.setImageResource(images[0]);
                      return  true;

                  case R.id.two:
                      img.setImageResource(images[1]);
                      return true;
              }



                return true;
            }
        });

        popup.show(); //showing popup menu
    }
}




