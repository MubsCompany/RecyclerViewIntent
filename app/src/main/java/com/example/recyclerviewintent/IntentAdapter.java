package com.example.recyclerviewintent;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

class IntentAdapter extends RecyclerView.Adapter<IntentAdapter.IntentViewHolder> {
    Context context;
    String[] arrayCompany = {"BukaLapak", "Tokopedia", "blibli", "Traveloka", "Gojek"};
    int[] arrayImageCompany = {R.drawable.bukalapak, R.drawable.tokopediaa, R.drawable.bliblii, R.drawable.traveloka, R.drawable.gojek};

    public IntentAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public IntentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.tampilan_list_company, viewGroup, false );
        return new IntentViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull IntentViewHolder intentViewHolder, final int i) {
        intentViewHolder.tvCompany.setText( arrayCompany[i] );
        intentViewHolder.imgCompany.setImageResource( arrayImageCompany[i] );
        intentViewHolder.itemView.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent pindah = new Intent( context, DetailCompanyActivity.class );
                pindah.putExtra( "imageCompany",arrayImageCompany[i] );
                pindah.putExtra( "position", i );
                // putExtra untuk setTitle
                pindah.putExtra( "name",arrayCompany[i] );

                context.startActivity( pindah );
            }
        } );
    }

    @Override
    public int getItemCount() {
        return arrayCompany.length;
    }

    public class IntentViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCompany;
        TextView tvCompany;

        public IntentViewHolder(@NonNull View itemView) {
            super( itemView );

            imgCompany = itemView.findViewById( R.id.img_company );
            tvCompany = itemView.findViewById( R.id.tv_company );
        }
    }
}
