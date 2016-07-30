package com.blogspot.hongthaiit.viewpagerwithtabs;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.viewpagerindicator.IconPagerAdapter;

public class CustomPagerAdapter extends FragmentPagerAdapter implements
		IconPagerAdapter {

	private ArrayList<Integer> listIcon;
	private ArrayList<String> pageContents;

	public CustomPagerAdapter(FragmentManager fm, ArrayList<Integer> list,
			ArrayList<String> content) {
		super(fm);
		this.listIcon = list;
		this.pageContents = content;
	}

	@Override
	public Fragment getItem(int position) {

		return PageFragment.getInstance(pageContents.get(position), position);
	}

	@Override
	public int getCount() {
		return 4;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		if (position == 0) {
			return "Music";
		} else if (position == 1) {
			return "Video";
		} else if (position == 2) {
			return "Food";
		} else
			return "Friend";
	}

	@Override
	public int getIconResId(int index) {
		return listIcon.get(index);
	}

}
