package com.davidpedroza.nanodegree.sunshine.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.davidpedroza.nanodegree.sunshine.R;

public class DetailActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.detail, menu);

        MenuItem item = menu.findItem(R.id.menu_share);

        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);

        return true;

    }

    // Call to update the share intent
    private void setShareIntent(Intent shareIntent) {
        if (shareActionProvider != null) {
            shareActionProvider.setShareIntent(shareIntent);
        }
    }

    public void share(MenuItem item) {
        //TODO
        setShareIntent(new Intent());
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

            Bundle bundle = getActivity().getIntent().getExtras();
            String data = bundle.getString(Intent.EXTRA_TEXT);

            TextView textView = (TextView) rootView.findViewById(R.id.text);
            textView.setText(data);

            return rootView;
        }


    }

}
