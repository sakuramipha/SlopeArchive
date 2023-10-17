.class Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;
.super Ljava/lang/Object;
.source "AdManagerInterstitialAdCallback.java"

# interfaces
.implements Lcom/google/android/gms/ads/OnPaidEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->onAdLoaded(Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

.field final synthetic val$service:Ljava/util/concurrent/ExecutorService;


# direct methods
.method constructor <init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;Ljava/util/concurrent/ExecutorService;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$service"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    iput-object p2, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;->val$service:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic lambda$onPaidEvent$0$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback$1(Lcom/google/android/gms/ads/AdValue;)V
    .locals 4

    .line 51
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    .line 53
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdValue;->getPrecisionType()I

    move-result v1

    .line 54
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdValue;->getValueMicros()J

    move-result-wide v2

    .line 55
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdValue;->getCurrencyCode()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-interface {v0, v1, v2, v3, p1}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;->onPaidEvent(IJLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onPaidEvent(Lcom/google/android/gms/ads/AdValue;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "adValue"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;->val$service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1$$ExternalSyntheticLambda0;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;Lcom/google/android/gms/ads/AdValue;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
