.class public final synthetic Lcom/google/unity/ads/UnityAppOpenAd$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/google/unity/ads/UnityAppOpenAd;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/google/android/gms/ads/AdRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/google/unity/ads/UnityAppOpenAd;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/unity/ads/UnityAppOpenAd$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/UnityAppOpenAd;

    iput-object p2, p0, Lcom/google/unity/ads/UnityAppOpenAd$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/unity/ads/UnityAppOpenAd$$ExternalSyntheticLambda0;->f$2:Lcom/google/android/gms/ads/AdRequest;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/unity/ads/UnityAppOpenAd$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/UnityAppOpenAd;

    iget-object v1, p0, Lcom/google/unity/ads/UnityAppOpenAd$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/unity/ads/UnityAppOpenAd$$ExternalSyntheticLambda0;->f$2:Lcom/google/android/gms/ads/AdRequest;

    invoke-virtual {v0, v1, v2}, Lcom/google/unity/ads/UnityAppOpenAd;->lambda$loadAd$0$com-google-unity-ads-UnityAppOpenAd(Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;)V

    return-void
.end method
