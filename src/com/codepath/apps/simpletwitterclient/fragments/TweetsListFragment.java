package com.codepath.apps.simpletwitterclient.fragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.codepath.apps.simpletwitterclient.R;
import com.codepath.apps.simpletwitterclient.TweetsAdapter;
import com.codepath.apps.simpletwitterclient.models.Tweet;

public class TweetsListFragment extends Fragment {
	TweetsAdapter adapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_tweets_list, parent, false);
		
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
    	ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    	adapter = new TweetsAdapter(getActivity(), tweets);
    	ListView lv = (ListView) getActivity().findViewById(R.id.lvTweets);
    	lv.setAdapter(adapter);
	}

	public TweetsAdapter getAdapter() {
		return adapter;
	}
}
