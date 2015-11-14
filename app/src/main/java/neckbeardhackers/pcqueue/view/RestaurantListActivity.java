package neckbeardhackers.pcqueue.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import neckbeardhackers.pcqueue.R;
import neckbeardhackers.pcqueue.view.RestaurantInfoAdapter;

public class RestaurantListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This sets the focus on this class on a particular XML file
        setContentView(R.layout.activity_restaurant_list);

        // This will locate the toolbar in activity_restaurant_list and
        Toolbar toolbar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);


        //Testing to see if it will close the default action bar
        if (this.getSupportActionBar() != null)
            getSupportActionBar().setDisplayShowTitleEnabled(false);


    /* Load the restaurant list data */
        RestaurantInfoAdapter infoGetter = new RestaurantInfoAdapter(this);
        RecyclerView restaurantListRecycler = (RecyclerView) this.findViewById(R.id.RestaurantListRecycler);
        restaurantListRecycler.setHasFixedSize(true);
        restaurantListRecycler.setLayoutManager(new LinearLayoutManager(this));
        restaurantListRecycler.setAdapter(infoGetter);
    }
}