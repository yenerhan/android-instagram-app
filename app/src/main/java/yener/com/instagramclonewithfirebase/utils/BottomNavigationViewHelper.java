package yener.com.instagramclonewithfirebase.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import yener.com.instagramclonewithfirebase.R;
import yener.com.instagramclonewithfirebase.alert.AlertActivity;
import yener.com.instagramclonewithfirebase.circle.CircleActivity;
import yener.com.instagramclonewithfirebase.home.HomeActivity;
import yener.com.instagramclonewithfirebase.profile.ProfileActivity;
import yener.com.instagramclonewithfirebase.search.SearchActivity;


/**
 * Created by erhan.yener on 26.12.2019.
 */

public class BottomNavigationViewHelper {

    public static void enableNavigation(final Context context, BottomNavigationView bottomNavigationView) {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Intent intent = null;
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        intent = new Intent(context, HomeActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.navigation_search:
                        intent = new Intent(context, SearchActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.navigation_circle:
                        intent = new Intent(context, CircleActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.navigation_alert:
                        intent = new Intent(context, AlertActivity.class);
                        context.startActivity(intent);
                        break;
                    case R.id.navigation_profile:
                        intent = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent);
                        break;
                }
                return false;
            }
        });
    }
}
