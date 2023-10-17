.class public interface abstract Lcom/google/unity/ads/UnityRewardedAdCallback;
.super Ljava/lang/Object;
.source "UnityRewardedAdCallback.java"

# interfaces
.implements Lcom/google/unity/ads/UnityPaidEventListener;
.implements Lcom/google/unity/ads/UnityFullScreenContentCallback;


# virtual methods
.method public abstract onRewardedAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation
.end method

.method public abstract onRewardedAdLoaded()V
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
