package com.example.spotifystreamer;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class SearchActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //@Nullable
    //@Override
    //public View onCreateView(String name, Context context, AttributeSet attrs) {
        //return super.onCreateView(name, context, attrs);
  //      View rootView = super.onCreateView(name, context, attrs);

        //setContentView(R.layout.activity_search);

//        final ListView listViewArtists = (ListView)rootView.findViewById(R.id.listview_artists);
//        if (listViewArtists == null)
//            Log.e("TESTING", "listViewArtists is null!?");
        //else
            //Log.e("TESTING", "omg there's something there");

        //return rootView;
/*
        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add(0, "test1");
        myStrings.add(1, "test2");

        mArtistAdapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item_artists,
                R.id.list_item_artist_textview,
                myStrings);
                //new ArrayList<String>());

        setContentView(R.layout.activity_search);

        final ListView listViewArtists = (ListView)findViewById(R.id.listview_artists);

        if (mArtistAdapter == null)
            Log.e("TESTING", "mArtistAdapter is null!?");

        if (listViewArtists == null)
            Log.e("TESTING", "listViewArtists is null!?");

        listViewArtists.setAdapter(mArtistAdapter);

        listViewArtists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String artist = mArtistAdapter.getItem(position);

                /*Intent intent = new Intent(getCallingActivity(), SearchActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, artist);

                startActivity(intent);*/
            //}
        //});

        /*
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ListView listViewForecast = (ListView)rootView.findViewById(R.id.listview_forecast);
        listViewForecast.setAdapter(mForecastAdapter);

        listViewForecast.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String forecast = mForecastAdapter.getItem(position);

                Intent intent = new Intent(getActivity(), DetailActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, forecast);
                startActivity(intent);
            }
        });

        return rootView;*/

        //return superView;
    //}
}
