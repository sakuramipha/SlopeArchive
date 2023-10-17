.class public Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;
.super Lcom/google/unity/ads/Banner;
.source "UnityAdManagerBannerView.java"


# instance fields
.field private final service:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static bridge synthetic -$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->service:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/google/unity/ads/admanager/UnityAdManagerAdListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "activity",
            "listener"
        }
    .end annotation

    .line 58
    invoke-direct {p0}, Lcom/google/unity/ads/Banner;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityPlayerActivity:Landroid/app/Activity;

    .line 60
    iput-object p2, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    .line 61
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->service:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic access$000(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Z
    .locals 0

    .line 45
    iget-boolean p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->hidden:Z

    return p0
.end method

.method static synthetic access$100(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$300(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$400(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$600(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$700(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$800(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method

.method static synthetic access$900(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    return-object p0
.end method


# virtual methods
.method protected createAdView(Ljava/lang/String;Lcom/google/android/gms/ads/AdSize;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "publisherId",
            "adSize"
        }
    .end annotation

    .line 66
    new-instance v0, Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    iget-object v1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityPlayerActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/admanager/AdManagerAdView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    .line 68
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/BaseAdView;->setBackgroundColor(I)V

    .line 69
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/BaseAdView;->setAdUnitId(Ljava/lang/String;)V

    .line 70
    iget-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/BaseAdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 71
    iget-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/BaseAdView;->setVisibility(I)V

    .line 72
    iget-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    const/high16 p2, 0x60000

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/BaseAdView;->setDescendantFocusability(I)V

    .line 73
    iget-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityPlayerActivity:Landroid/app/Activity;

    iget-object p2, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->getLayoutParams()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    iget-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    new-instance p2, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;

    invoke-direct {p2, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/BaseAdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 141
    iget-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    new-instance p2, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;

    invoke-direct {p2, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/BaseAdView;->setOnPaidEventListener(Lcom/google/android/gms/ads/OnPaidEventListener;)V

    .line 157
    iget-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    check-cast p1, Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    new-instance p2, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;

    invoke-direct {p2, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)V

    .line 158
    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/admanager/AdManagerAdView;->setAppEventListener(Lcom/google/android/gms/ads/admanager/AppEventListener;)V

    .line 171
    invoke-virtual {p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->setLayoutChangeListener()V

    return-void
.end method

.method public getAdSizes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/AdSize;",
            ">;"
        }
    .end annotation

    .line 188
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$$ExternalSyntheticLambda2;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 189
    iget-object v1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityPlayerActivity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 v1, 0x0

    new-array v2, v1, [Lcom/google/android/gms/ads/AdSize;

    .line 193
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/ads/AdSize;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 196
    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v1

    const-string v0, "Failed to get ad sizes: %s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AdsUnity"

    .line 195
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    :goto_1
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic lambda$getAdSizes$1$com-google-unity-ads-admanager-UnityAdManagerBannerView()[Lcom/google/android/gms/ads/AdSize;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    check-cast v0, Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/admanager/AdManagerAdView;->getAdSizes()[Lcom/google/android/gms/ads/AdSize;

    move-result-object v0

    return-object v0
.end method

.method public synthetic lambda$loadAd$0$com-google-unity-ads-admanager-UnityAdManagerBannerView(Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;)V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    check-cast v0, Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/admanager/AdManagerAdView;->loadAd(Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;)V

    return-void
.end method

.method public synthetic lambda$setAdSizes$2$com-google-unity-ads-admanager-UnityAdManagerBannerView(Ljava/util/List;)V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->adView:Lcom/google/android/gms/ads/BaseAdView;

    check-cast v0, Lcom/google/android/gms/ads/admanager/AdManagerAdView;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/google/android/gms/ads/AdSize;

    invoke-interface {p1, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/admanager/AdManagerAdView;->setAdSizes([Lcom/google/android/gms/ads/AdSize;)V

    return-void
.end method

.method public loadAd(Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "request"
        }
    .end annotation

    .line 180
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityPlayerActivity:Landroid/app/Activity;

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$$ExternalSyntheticLambda0;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setAdSizes(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "adSizes"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/ads/AdSize;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 220
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 224
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->unityPlayerActivity:Landroid/app/Activity;

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$$ExternalSyntheticLambda1;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 221
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The supported ad sizes must contain at least one valid ad size."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
