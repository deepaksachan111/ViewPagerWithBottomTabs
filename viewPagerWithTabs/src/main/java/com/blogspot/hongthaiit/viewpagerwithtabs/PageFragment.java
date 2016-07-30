package com.blogspot.hongthaiit.viewpagerwithtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PageFragment extends Fragment {
	
	private TextView description;
	private ImageView image;
	
	public static PageFragment getInstance(String titles, int postion) {
		PageFragment f = new PageFragment();
		Bundle args = new Bundle();
		f.setArguments(args);
		args.putString("page_title", titles);
		args.putInt("position", postion);
		
		return f;
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout resource that'll be returned
		View rootView = inflater.inflate(R.layout.fragment_page, container,
				false);

		description = (TextView)rootView.findViewById(R.id.textView);
		image = (ImageView) rootView.findViewById(R.id.image);
		
		description.setText(getArguments().getString("page_title"));
		setImage();

		return rootView;
	}
	
	private void setImage() {
		int postion = getArguments().getInt("position");
		if (postion == 0) {
			image.setImageResource(R.drawable.ic_music);
		} else if (postion == 1) {
			image.setImageResource(R.drawable.ic_video);
		} else if (postion == 2) {
			image.setImageResource(R.drawable.ic_food);
		} else if (postion == 3) {
			image.setImageResource(R.drawable.ic_friend);
		}
	}
}
