.class Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;
.super Lcom/google/android/gms/ads/AdListener;
.source "UnityAdManagerBannerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->createAdView(Ljava/lang/String;Lcom/google/android/gms/ads/AdSize;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;


# direct methods
.method constructor <init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 75
    iput-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic lambda$onAdClicked$5$com-google-unity-ads-admanager-UnityAdManagerBannerView$1()V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$100(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$200(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/UnityAdListener;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdClosed$3$com-google-unity-ads-admanager-UnityAdManagerBannerView$1()V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$500(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$600(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/UnityAdListener;->onAdClosed()V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdFailedToLoad$1$com-google-unity-ads-admanager-UnityAdManagerBannerView$1(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$900(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$1000(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/unity/ads/UnityAdListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdImpression$4$com-google-unity-ads-admanager-UnityAdManagerBannerView$1()V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$300(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$400(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/UnityAdListener;->onAdImpression()V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdLoaded$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$1()V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$1100(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$1200(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/UnityAdListener;->onAdLoaded()V

    :cond_0
    return-void
.end method

.method public synthetic lambda$onAdOpened$2$com-google-unity-ads-admanager-UnityAdManagerBannerView$1()V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$700(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$800(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/unity/ads/UnityAdListener;->onAdOpened()V

    :cond_0
    return-void
.end method

.method public onAdClicked()V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda0;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda1;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "error"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0, p1}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda5;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;Lcom/google/android/gms/ads/LoadAdError;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdImpression()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda2;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$000(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-virtual {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->show()V

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda3;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAdOpened()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1$$ExternalSyntheticLambda4;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
