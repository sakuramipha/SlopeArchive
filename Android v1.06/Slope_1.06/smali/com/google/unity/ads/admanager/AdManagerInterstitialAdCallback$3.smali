.class Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;
.super Lcom/google/android/gms/ads/FullScreenContentCallback;
.source "AdManagerInterstitialAdCallback.java"


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

    .line 75
    iput-object p1, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    iput-object p2, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->val$service:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Lcom/google/android/gms/ads/FullScreenContentCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic lambda$onAdClicked$4$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback$3()V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdDismissedFullScreenContent$2$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback$3()V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;->onAdDismissedFullScreenContent()V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback$3(Lcom/google/android/gms/ads/AdError;)V
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;->onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdImpression$3$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback$3()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;->onAdImpression()V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdShowedFullScreenContent$1$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback$3()V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->this$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->-$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;->onAdShowedFullScreenContent()V

    :cond_0
    return-void
.end method

.method public onAdClicked()V
    .locals 2

    .line 118
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->val$service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda0;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdDismissedFullScreenContent()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->val$service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda1;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "error"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->val$service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0, p1}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda4;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;Lcom/google/android/gms/ads/AdError;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdImpression()V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->val$service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda2;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdShowedFullScreenContent()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;->val$service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3$$ExternalSyntheticLambda3;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
