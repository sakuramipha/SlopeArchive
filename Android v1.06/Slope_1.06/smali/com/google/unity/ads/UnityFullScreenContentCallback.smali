.class public interface abstract Lcom/google/unity/ads/UnityFullScreenContentCallback;
.super Ljava/lang/Object;
.source "UnityFullScreenContentCallback.java"


# virtual methods
.method public abstract onAdClicked()V
.end method

.method public abstract onAdDismissedFullScreenContent()V
.end method

.method public abstract onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation
.end method

.method public abstract onAdImpression()V
.end method

.method public abstract onAdShowedFullScreenContent()V
.end method
