package com.habapps;

import org.robovm.apple.foundation.NSBundle;

import libgdx.constants.GameIdEnum;

public enum GameProperties {

    skelgame(
            GameIdEnum.perstest,
            NSBundle.getMainBundle().getLocalizedString("language","en","InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName","en","InfoPlist"),
            "ca-app-pub-9894292627655692~7529989512",
            "ca-app-pub-9894292627655692/4107472020",
            "ca-app-pub-9894292627655692/1591267123",
            "ca-app-pub-9894292627655692/2794390354",
            "1479288929");

    private GameIdEnum gameIdEnum;
    private String language;
    private String appName;
    private String adMobAppId;
    private String bannerAdId;
    private String interstitialAdId;
    private String rewardAdId;
    private String storeAppId;

    GameProperties(GameIdEnum gameIdEnum,
                   String language,
                   String appName,
                   String adMobAppId,
                   String bannerAdId,
                   String interstitialAdId,
                   String rewardAdId,
                   String storeAppId) {
        this.gameIdEnum = gameIdEnum;
        this.language = language;
        this.appName = appName;
        this.adMobAppId = adMobAppId;
        this.bannerAdId = bannerAdId;
        this.interstitialAdId = interstitialAdId;
        this.rewardAdId = rewardAdId;
        this.storeAppId = storeAppId;
    }

    public GameIdEnum getGameIdEnum() {
        return gameIdEnum;
    }

    public String getLanguage() {
        return language;
    }

    public String getAppName() {
        return appName;
    }

    public String getAdMobAppId() {
        return adMobAppId;
    }

    public String getBannerAdId() {
        return bannerAdId;
    }

    public String getInterstitialAdId() {
        return interstitialAdId;
    }

    public String getRewardAdId() {
        return rewardAdId;
    }

    public String getStoreAppId() {
        return storeAppId;
    }
}
