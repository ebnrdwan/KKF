
package com.example.android.kkf.UserManagement.CustomViews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.android.kkf.CircleTransformation;
import com.example.android.kkf.R;
import com.squareup.picasso.Picasso;

/**
 * Created by mxn on 2016/12/13.
 * MenuListFragment
 */

public class MenuListFragment extends Fragment {

    public ImageView ivMenuUserProfilePhoto;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        NavigationView vNavigation = (NavigationView) view.findViewById(R.id.vNavigation);
        View headerView = vNavigation.inflateHeaderView(R.layout.view_global_menu_header);
//        ivMenuUserProfilePhoto = (ImageView) view.findViewById(R.id.ivMenuUserProfilePhoto);
        ivMenuUserProfilePhoto = (ImageView) headerView.findViewById(R.id.ivMenuUserProfilePhoto);
        vNavigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                Toast.makeText(getActivity(),menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        }) ;
        setupHeader();
        return  view ;
    }

    private void setupHeader() {
        CircleTransformation circleTransformation = new CircleTransformation();
        int avatarSize = getResources().getDimensionPixelSize(R.dimen.global_menu_avatar_size);
        String profilePhoto = getResources().getString(R.string.user_profile_photo);
        Picasso.with(getActivity())
                .load(R.drawable.img_feed_center_2)
                .placeholder(R.drawable.img_feed_center_1)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(circleTransformation)
                .into(ivMenuUserProfilePhoto);
    }

}
