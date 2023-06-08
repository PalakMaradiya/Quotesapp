package com.example.quoetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {



    String bg[] ={"#DB005B , #FDCEDF , #F9F5F6, #FDCEDF , #D2E9E9 , #D0F5BE  , #B0DAFF  , #D2E9E9  , #E06469 , #FFF8D6"};
    RecyclerView rcv;

    ArrayList <ModalClassCategory> categorylist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initview();
    }

    private void initview() {

        ModalClassCategory m1 = new ModalClassCategory();
        m1.setCatrgory("Happy");
        m1.setCatrgoryImage(R.drawable.happy);
        categorylist.add(m1);

        ModalClassCategory m2 = new ModalClassCategory();
        m2.setCatrgory("Sad");
        m2.setCatrgoryImage(R.drawable.sad);
        categorylist.add(m2);

        ModalClassCategory m3 = new ModalClassCategory();
        m3.setCatrgory("Attitude");
        m3.setCatrgoryImage(R.drawable.attuited);
        categorylist.add(m3);

        ModalClassCategory m4 = new ModalClassCategory();
        m4.setCatrgory("Angry");
        m4.setCatrgoryImage(R.drawable.angey);
        categorylist.add(m4);

        ModalClassCategory m5 = new ModalClassCategory();
        m5.setCatrgory("Friendship");
        m5.setCatrgoryImage(R.drawable.friendship);
        categorylist.add(m5);

        ModalClassCategory m6 = new ModalClassCategory();
        m6.setCatrgory("Love");
        m6.setCatrgoryImage(R.drawable.love);
        categorylist.add(m6);


        ModalClassCategory m7 = new ModalClassCategory();
        m7.setCatrgory("Motivational");
        m7.setCatrgoryImage(R.drawable.moti);
        categorylist.add(m7);


        ModalClassCategory m8 = new ModalClassCategory();
        m8.setCatrgory("Alone");
        m8.setCatrgoryImage(R.drawable.alone);
        categorylist.add(m8);


        ModalClassCategory m9 = new ModalClassCategory();
        m9.setCatrgory("Best");
        m9.setCatrgoryImage(R.drawable.best);
        categorylist.add(m9);


        ModalClassCategory m10 = new ModalClassCategory();
        m10.setCatrgory("Confidence");
        m10.setCatrgoryImage(R.drawable.confidition);
        categorylist.add(m10);


        CategoryIntreface categoryIntreface = new CategoryIntreface() {
            @Override
            public void CategoryClick(String catrgory) {

//                Toast.makeText(CategoryActivity.this, "your catregori is ==>"+catrgory, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(CategoryActivity.this,QuoetsActivity.class);
                i.putExtra("catrgory",catrgory);
                startActivity(i);


            }
        };

        rcv = findViewById(R.id.rcv);



        GridLayoutManager manager = new GridLayoutManager(CategoryActivity.this,2);
        CategoryAdapter adapter = new CategoryAdapter(CategoryActivity.this,categorylist,categoryIntreface);
        rcv.setLayoutManager(manager);
        rcv.setAdapter(adapter);



    }
}