.class public final synthetic Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;

.field public final synthetic f$3:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd;Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$0:Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd;

    iput-object p2, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$2:Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;

    iput-object p4, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$3:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$0:Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd;

    iget-object v1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$2:Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;

    iget-object v3, p0, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1;->f$3:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAd;->lambda$loadAd$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd(Ljava/lang/String;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)V

    return-void
.end method
