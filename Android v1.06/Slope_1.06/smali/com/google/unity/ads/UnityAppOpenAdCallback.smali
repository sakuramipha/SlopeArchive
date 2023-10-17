.class public interface abstract Lcom/google/unity/ads/UnityAppOpenAdCallback;
.super Ljava/lang/Object;
.source "UnityAppOpenAdCallback.java"

# interfaces
.implements Lcom/google/unity/ads/UnityFullScreenContentCallback;
.implements Lcom/google/unity/ads/UnityPaidEventListener;


# virtual methods
.method public abstract onAppOpenAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation
.end method

.method public abstract onAppOpenAdLoaded()V
.end method
