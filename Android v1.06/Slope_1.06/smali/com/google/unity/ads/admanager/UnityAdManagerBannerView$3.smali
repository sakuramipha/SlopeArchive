.class Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;
.super Ljava/lang/Object;
.source "UnityAdManagerBannerView.java"

# interfaces
.implements Lcom/google/android/gms/ads/admanager/AppEventListener;


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

    .line 159
    iput-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic lambda$onAppEvent$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$3(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$1500(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$1600(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    check-cast v0, Lcom/google/unity/ads/admanager/UnityAdManagerAdListener;

    invoke-interface {v0, p1, p2}, Lcom/google/unity/ads/admanager/UnityAdManagerAdListener;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "name",
            "data"
        }
    .end annotation

    .line 162
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3$$ExternalSyntheticLambda0;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$3;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
