package com.slidingmenu.example;

import java.net.URLEncoder;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

import com.slidingmenu.example.LeftAndRightActivity;
import com.slidingmenu.example.anim.CustomScaleAnimation;
import com.slidingmenu.example.anim.CustomSlideAnimation;
import com.slidingmenu.example.anim.CustomZoomAnimation;
import com.slidingmenu.example.fragments.FragmentChangeActivity;
import com.slidingmenu.example.fragments.ResponsiveUIActivity;

public class ExampleListActivity extends PreferenceActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(R.string.app_name);
		
//		Crittercism.init(getApplicationContext(), "508ab27601ed857a20000003");
		this.addPreferencesFromResource(R.xml.main);
	}

	@Override
	public boolean onPreferenceTreeClick(PreferenceScreen screen, Preference pref) {
		Class<?> cls = null;
		String title = pref.getTitle().toString();
		if (title.equals(getString(R.string.properties))) {
			cls = PropertiesActivity.class;	
		} else if (title.equals(getString(R.string.attach))) {
			cls = AttachExample.class;
		} else if (title.equals(getString(R.string.changing_fragments))) {
			cls = FragmentChangeActivity.class;
		} else if (title.equals(getString(R.string.left_and_right))) {
			cls = LeftAndRightActivity.class;
		} else if (title.equals(getString(R.string.responsive_ui))) {
			cls = ResponsiveUIActivity.class;
		} else if (title.equals(getString(R.string.viewpager))) {
			cls = ViewPagerActivity.class;
		} else if (title.equals(getString(R.string.title_bar_slide))) {
			cls = SlidingTitleBar.class;
		} else if (title.equals(getString(R.string.title_bar_content))) {
			cls = SlidingContent.class;
		} else if (title.equals(getString(R.string.anim_zoom))) {
			cls = CustomZoomAnimation.class;
		} else if (title.equals(getString(R.string.anim_scale))) {
			cls = CustomScaleAnimation.class;
		} else if (title.equals(getString(R.string.anim_slide))) {
			cls = CustomSlideAnimation.class;
		}
		Intent intent = new Intent(this, cls);
		startActivity(intent);
		return true;
	}

	
	
}
