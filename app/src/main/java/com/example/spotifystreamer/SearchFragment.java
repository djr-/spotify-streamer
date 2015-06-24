package com.example.spotifystreamer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    private String artistQuery;
    ArrayAdapter<String> mArtistAdapter;

    public SearchFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_search, container, false);

        EditText queryText = (EditText)rootView.findViewById(R.id.edit_search);

        queryText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    artistQuery = v.getText().toString();
                    return true;
                } else {
                    return false;
                }
            }
        });

        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add(0, "test1");
        myStrings.add(1, "test2");

        mArtistAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_artists,
                R.id.list_item_artist_textview,
                myStrings);
        //new ArrayList<String>());

        final ListView listViewArtists = (ListView)rootView.findViewById(R.id.listview_artists);
        listViewArtists.setAdapter(mArtistAdapter);

        return rootView;
    }

}
