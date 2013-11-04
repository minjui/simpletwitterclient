package com.codepath.apps.simpletwitterclient.fragments;

import org.json.JSONArray;

import com.codepath.apps.simpletwitterclient.SimpleTwitterApp;
import com.codepath.apps.simpletwitterclient.models.Tweet;
import com.loopj.android.http.JsonHttpResponseHandler;

import android.os.Bundle;

public class MentionsFragment extends TweetsListFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SimpleTwitterApp.getRestClient().getMentions( new JsonHttpResponseHandler() {
	    	@Override
	    	public void onSuccess(JSONArray jsonTweets) {
	    		getAdapter().addAll(Tweet.fromJson(jsonTweets));
	    	}
	    });
	}
}
