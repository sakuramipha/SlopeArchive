.class public Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;
.super Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAdLoadCallback;
.source "AdManagerInterstitialAdCallback.java"


# instance fields
.field private adManagerInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

.field private callback:Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;


# direct methods
.method static bridge synthetic -$$Nest$fgetcallback(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;
    .locals 0

    iget-object p0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->callback:Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    return-object p0
.end method

.method constructor <init>(Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "adManagerInterstitialAd",
            "callback"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAdLoadCallback;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->adManagerInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    .line 37
    iput-object p2, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->callback:Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    return-void
.end method


# virtual methods
.method public synthetic lambda$onAdLoaded$0$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback()V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->callback:Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;

    if-eqz v0, :cond_0

    .line 130
    invoke-interface {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerInterstitialAdCallback;->onInterstitialAdLoaded()V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ad"
        }
    .end annotation

    .line 42
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 43
    iput-object p1, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->adManagerInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    .line 45
    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;

    invoke-direct {v1, p0, v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$1;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;->setOnPaidEventListener(Lcom/google/android/gms/ads/OnPaidEventListener;)V

    .line 61
    iget-object p1, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->adManagerInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$2;

    invoke-direct {v1, p0, v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$2;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;->setAppEventListener(Lcom/google/android/gms/ads/admanager/AppEventListener;)V

    .line 74
    iget-object p1, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->adManagerInterstitialAd:Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    new-instance v1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;

    invoke-direct {v1, p0, v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$3;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 127
    new-instance p1, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$$ExternalSyntheticLambda0;-><init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)V

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "ad"
        }
    .end annotation

    .line 18
    check-cast p1, Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;

    invoke-virtual {p0, p1}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->onAdLoaded(Lcom/google/android/gms/ads/admanager/AdManagerInterstitialAd;)V

    return-void
.end method
