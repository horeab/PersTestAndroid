package com.habapps;

import org.robovm.apple.foundation.NSBundle;

import libgdx.constants.GameIdEnum;

public enum GameProperties {

    skelgame(
            GameIdEnum.skelgame,
            NSBundle.getMainBundle().getLocalizedString("language","en","InfoPlist"),
            "The Big Five Personality Test",
            "ca-app-pub-9432399956064043~8530693221",
            "ca-app-pub-9432399956064043/5904529883",
            "ca-app-pub-9432399956064043/5712958192",
            "ca-app-pub-9432399956064043/2703651470",
            "1471197175");

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
