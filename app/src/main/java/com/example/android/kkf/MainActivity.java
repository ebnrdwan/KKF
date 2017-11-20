package com.example.android.kkf;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.android.kkf.APIutilities.AppController;
import com.example.android.kkf.UserManagement.CustomViews.MenuListFragment;
import com.mxn.soul.flowingdrawer_core.ElasticDrawer;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFeed;
    private FlowingDrawer mDrawer;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = (TextView) findViewById(R.id.name);


//        rvFeed = (RecyclerView) findViewById(R.id.rvFeed);
        mDrawer = (FlowingDrawer) findViewById(R.id.drawerlayout);

//        rvFeed = (RecyclerView) findViewById(R.id.rvFeed);
        mDrawer = (FlowingDrawer) findViewById(R.id.drawerlayout);
        mDrawer.setTouchMode(ElasticDrawer.TOUCH_MODE_BEZEL);
        setupToolbar();
//        setupFeed();
        setupMenu();
        String s = buildMyUrl("getworker", "workerid", "2160");
        makeStringReq("getworker", "workerid", "2160");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    protected void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.ic_menu_white);
        toolbar.setPopupTheme(R.style.AppTheme_PopupOverlay);
        toolbar.bringToFront();
        toolbar.setTitle("");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.toggleMenu();
            }
        });
    }

    private void setupFeed() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this) {
            @Override
            protected int getExtraLayoutSpace(RecyclerView.State state) {
                return 300;
            }
        };
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        rvFeed.setLayoutManager(gridLayoutManager);
        FeedAdapter feedAdapter = new FeedAdapter(this);
        rvFeed.setAdapter(feedAdapter);
        feedAdapter.updateItems();
    }

    private void setupMenu() {
        FragmentManager fm = getSupportFragmentManager();
        MenuListFragment mMenuFragment = (MenuListFragment) fm.findFragmentById(R.id.id_container_menu);
        if (mMenuFragment == null) {
            mMenuFragment = new MenuListFragment();
            fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment).commit();
        }
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isMenuVisible()) {
            mDrawer.closeMenu();
        } else {
            super.onBackPressed();
        }
    }


    String buildMyUrl(String methodName, String field, String value) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("http")
                .authority("192.168.20.25/MasicAPI/Service.asmx")
                .appendPath(methodName)
                .appendQueryParameter(field, value);
        String myrul = builder.toString();
        return myrul;
    }

    private void makeStringReq(String mehtod, String field, String value) {

String url =buildMyUrl(mehtod, field, value);
        StringRequest strReq = new StringRequest(Request.Method.GET,
              url  , new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {


                Toast.makeText(MainActivity.this, handleResponse(response), Toast.LENGTH_SHORT).show();


            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        // Adding request to request queue

        AppController.getInstance().addToRequestQueue(strReq, "TAG");
//       RequestQueue mRequestQueue = Volley.newRequestQueue(getApplicationContext());
//       mRequestQueue.add(strReq);

    }

    String handleResponse(String response) {
        String regx = "<[^>]+>";
        response = response.replaceAll(regx, "");

        response = response.replaceAll(String.format("Date"), "");

        return response;
    }

}
