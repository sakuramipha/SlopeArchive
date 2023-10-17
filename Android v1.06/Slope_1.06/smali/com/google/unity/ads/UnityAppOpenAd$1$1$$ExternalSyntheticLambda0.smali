.class public final synthetic Lcom/google/unity/ads/UnityAppOpenAd$1$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/google/unity/ads/UnityAppOpenAd$1$1;

.field public final synthetic f$1:Lcom/google/android/gms/ads/AdValue;


# direct methods
.method public synthetic constructor <init>(Lcom/google/unity/ads/UnityAppOpenAd$1$1;Lcom/google/android/gms/ads/AdValue;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/unity/ads/UnityAppOpenAd$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/UnityAppOpenAd$1$1;

    iput-object p2, p0, Lcom/google/unity/ads/UnityAppOpenAd$1$1$$ExternalSyntheticLambda0;->f$1:Lcom/google/android/gms/ads/AdValue;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/unity/ads/UnityAppOpenAd$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/UnityAppOpenAd$1$1;

    iget-object v1, p0, Lcom/google/unity/ads/UnityAppOpenAd$1$1$$ExternalSyntheticLambda0;->f$1:Lcom/google/android/gms/ads/AdValue;

    invoke-virtual {v0, v1}, Lcom/google/unity/ads/UnityAppOpenAd$1$1;->lambda$onPaidEvent$0$com-google-unity-ads-UnityAppOpenAd$1$1(Lcom/google/android/gms/ads/AdValue;)V

    return-void
.end method
