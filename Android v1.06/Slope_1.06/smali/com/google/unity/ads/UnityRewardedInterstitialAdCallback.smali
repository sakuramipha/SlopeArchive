.class public interface abstract Lcom/google/unity/ads/UnityRewardedInterstitialAdCallback;
.super Ljava/lang/Object;
.source "UnityRewardedInterstitialAdCallback.java"

# interfaces
.implements Lcom/google/unity/ads/UnityPaidEventListener;
.implements Lcom/google/unity/ads/UnityFullScreenContentCallback;


# virtual methods
.method public abstract onRewardedInterstitialAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation
.end method

.method public abstract onRewardedInterstitialAdLoaded()V
.end method

.method public abstract onUserEarnedReward(Ljava/lang/String;F)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "type",
            "amount"
        }
    .end annotation
.end method
