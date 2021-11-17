package com.example.dashboard;

import android.view.View;
import android.view.ViewGroup;

import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardHolder> {

    private ArrayList<SetterGetter> listdata;

    public  DashboardAdapter(ArrayList<SetterGetter> listdata){
        this.listdata = listdata;
    }
    @NonNull
    @Override
    public DashboardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard,parent,false);
        DashboardHolder holder = new DashboardHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardHolder holder, int position) {

        final SetterGetter getdata = listdata.get(position);
        String titlemenu = getdata.getTitle();
        String logomenu = getdata.getImg();

        holder.titleMenu.setText(titlemenu);
        if(logomenu.equals("logomenu1")) {
            holder.imgMenu.setImageResource(R.drawable.download_removebg_preview);
        }else if(logomenu.equals("logomenu2")) {
            holder.imgMenu.setImageResource(R.drawable.pdam_removebg_preview);
        }else if(logomenu.equals("logomenu3")) {
            holder.imgMenu.setImageResource(R.drawable.pinjaman_onlin);
        }else if(logomenu.equals("logomenu4")) {
            holder.imgMenu.setImageResource(R.drawable.pln_logo_removebg_preview__2_);
        }else if(logomenu.equals("logomenu5")) {
            holder.imgMenu.setImageResource(R.drawable.png_transparent_shopping_cart_icon_shopping_cart_blue_orange_baby_products_removebg_preview__1_);
        }else if(logomenu.equals("logomenu6")) {
            holder.imgMenu.setImageResource(R.drawable.png_clipart_partnership_business_partner_computer_icons_business_angle_text_thumbnail_removebg_preview);
        }

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashboardHolder extends RecyclerView.ViewHolder {

        TextView titleMenu;
        ImageView imgMenu;
        public DashboardHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu = itemView.findViewById(R.id.tv_title_menu);
            imgMenu   = itemView.findViewById(R.id.iv_logo_menu);
        }
    }
}
