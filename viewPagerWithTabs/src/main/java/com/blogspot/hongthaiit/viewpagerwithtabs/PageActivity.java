package com.blogspot.hongthaiit.viewpagerwithtabs;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.TabPageIndicator;

public class PageActivity extends FragmentActivity {

	private CustomPagerAdapter customPagerAdapter;
	private ViewPager pager;
	private TabPageIndicator indicator;
	private ArrayList<Integer> listIcon;
	private ArrayList<String> fragmentContents;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pager);

		getTabsIcon();
		customPagerAdapter = new CustomPagerAdapter(
				getSupportFragmentManager(), listIcon, fragmentContents);

		pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(customPagerAdapter);

		indicator = (TabPageIndicator) findViewById(R.id.tabs);
		indicator.setTabIconLocation(TabPageIndicator.LOCATION_UP);
		indicator.setViewPager(pager);
	}

	private void getTabsIcon() {
		listIcon = new ArrayList<Integer>();

		listIcon.add(R.drawable.music);
		listIcon.add(R.drawable.video);
		listIcon.add(R.drawable.food);
		listIcon.add(R.drawable.friends);

		fragmentContents = new ArrayList<String>();
		fragmentContents.add("This is Musics Page");
		fragmentContents.add("This is Videos Page");
		fragmentContents.add("This is Foods Page");
		fragmentContents.add("This is Friends Page");
	}
}
