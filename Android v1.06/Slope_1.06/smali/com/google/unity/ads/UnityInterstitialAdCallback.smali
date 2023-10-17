.class public interface abstract Lcom/google/unity/ads/UnityInterstitialAdCallback;
.super Ljava/lang/Object;
.source "UnityInterstitialAdCallback.java"

# interfaces
.implements Lcom/google/unity/ads/UnityPaidEventListener;
.implements Lcom/google/unity/ads/UnityFullScreenContentCallback;


# virtual methods
.method public abstract onInterstitialAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation
.end method

.method public abstract onInterstitialAdLoaded()V
.end method
