package com.habapps.service;


import com.habapps.AndroidLauncher;
import com.habapps.R;

import libgdx.game.external.AppInfoService;

public class SkelGameAppInfoServiceImpl implements AppInfoService {

    private AndroidLauncher activity;

    @Override
    public boolean isPortraitMode() {
        return false;
    }

    public SkelGameAppInfoServiceImpl(AndroidLauncher activity) {
        this.activity = activity;
    }

    @Override
    public String getGameIdPrefix() {
        return activity.getResources().getString(R.string.game_id);
    }

    @Override
    public float gameScreenTopMargin() {
        return 0;
    }

    @Override
    public String getAppName() {
        return activity.getResources().getString(R.string.app_name);
    }

    @Override
    public String getStoreAppId() {
        return activity.getPackageName();
    }

    @Override
    public void showPopupAd() {
        activity.showPopupAd();
    }

    @Override
    public void showRewardedVideoAd() {
//        activity.showRewardedVideoAd();
    }

    @Override
    public String getLanguage() {
        return activity.getResources().getString(R.string.language);
    }

    @Override
    public boolean screenShotMode() {
        return false;
    }

    @Override
    public boolean googleFacebookLoginEnabled() {
        return activity.getResources().getBoolean(R.bool.google_facebook_login_enabled);
    }

    @Override
    public String getImplementationGameResourcesFolder() {
        return "";
    }

    @Override
    public String getResourcesFolder() {
        return "";
    }

    @Override
    public String getMainResourcesFolder() {
        return "";
    }

    @Override
    public String getProVersionStoreAppId() {
        return activity.getPackageName() + "Pro";
    }

    @Override
    public boolean isProVersion() {
        return false;
    }
}
