package com.example.recyclerviewintent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailCompanyActivity extends AppCompatActivity {
TextView tvUrl, tvPhone, tvEmail;
ImageView imgDetailCompany;

    String[] emailCompany = {"admin@any.com","admin@any.com","admin@any.com","admin@any.com","admin@any.com"};
    int[] phoneCompany = {12345,14141,14781,19467,12441};
    String[] arrayUrl = {"https://www.bukalapak.com","https://www.tokopedia.com","https://www.blibli.com","https://www.traveloka.com","https://www.go-jek.com/"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail_company );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        tvPhone = findViewById( R.id.tv_phone_detail );
        tvUrl = findViewById( R.id.tv_url_detail );
        tvEmail = findViewById( R.id.tv_email_detail );
        imgDetailCompany = findViewById( R.id.img_detail_company );

        int position = getIntent().getIntExtra( "position",1 );
        tvUrl.setText( arrayUrl[position] );
        tvEmail.setText( emailCompany[position] );
        tvPhone.setText( String.valueOf( phoneCompany[position] ) );
        imgDetailCompany.setImageResource( getIntent().getIntExtra( "imageCompany",1 ) );

        // titlenya ngeget dari arrayCompany
        setTitle(  getIntent().getStringExtra( "name" ));


        FloatingActionButton fab = (FloatingActionButton) findViewById( R.id.fab );
        fab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make( view, "Replace with your own action", Snackbar.LENGTH_LONG )
                        .setAction( "Action", null ).show();
            }
        } );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );



    }
}
