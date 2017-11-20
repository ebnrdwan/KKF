package com.example.android.kkf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextSwitcher;

import mehdi.sakout.fancybuttons.FancyButton;


class FeedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private int itemsCount = 0;


    FeedAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.item_feed, parent, false);

        return new CellFeedViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        final CellFeedViewHolder holder = (CellFeedViewHolder) viewHolder;
        bindDefaultFeedItem(position, holder);
    }

    private void bindDefaultFeedItem(int position, CellFeedViewHolder holder) {
        int colors[]= {R.color.paint_color,R.color.brown,R.color.cardview_dark_background,R.color.colorPrimary};
        int images[]={R.drawable.add,R.drawable.ic_global_menu_feed,R.drawable.basic_data};

        String color2[]={"#6abaef","#4dccc1","#dc4244","#f7ab33"};

        holder.icon.setIconResource(Drawable.createFromPath("@drawable/user_icon"));
        holder.icon.setBackgroundColor(Color.parseColor(color2[position]));
        holder.icon.setFocusBackgroundColor(Color.parseColor("#ffffff"));
        holder.icon.setBorderColor(R.color.brown);
        holder.icon.setText("");

        if (position % 2 == 0) {
//            holder.ivFeedCenter.setImageResource(R.drawable.img_feed_center_1);
//            holder.ivFeedBottom.setImageResource(R.drawable.img_feed_bottom_1);
        } else {
//            holder.ivFeedCenter.setImageResource(R.drawable.img_feed_center_2);
//            holder.ivFeedBottom.setImageResource(R.drawable.img_feed_bottom_2);
        }



    }

    void updateItems() {
        itemsCount = 4;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    @Override
    public int getItemCount() {
        return itemsCount;
    }

    private static class CellFeedViewHolder extends RecyclerView.ViewHolder {

        FancyButton icon;
        TextSwitcher tsLikesCounter;
        ImageView ivUserProfile;
        FrameLayout vImageRoot;

        CellFeedViewHolder(View view) {
            super(view);

            icon = (FancyButton) view.findViewById(R.id.item_icon);
//            ivFeedCenter = (ImageView) view.findViewById(R.id.ivFeedCenter);
//            ivFeedBottom = (ImageView) view.findViewById(R.id.ivFeedBottom);
//            btnComments = (ImageButton) view.findViewById(R.id.btnComments);
//            btnLike = (ImageButton) view.findViewById(R.id.btnLike);
//            btnMore = (ImageButton) view.findViewById(R.id.btnMore);
//            tsLikesCounter = (TextSwitcher) view.findViewById(R.id.tsLikesCounter);
//            ivUserProfile = (ImageView) view.findViewById(R.id.ivUserProfile);
//            vImageRoot = (FrameLayout) view.findViewById(R.id.vImageRoot);
        }
    }


}
