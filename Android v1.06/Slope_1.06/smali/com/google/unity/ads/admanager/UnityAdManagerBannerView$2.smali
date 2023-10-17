.class Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;
.super Ljava/lang/Object;
.source "UnityAdManagerBannerView.java"

# interfaces
.implements Lcom/google/android/gms/ads/OnPaidEventListener;


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

    .line 142
    iput-object p1, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic lambda$onPaidEvent$0$com-google-unity-ads-admanager-UnityAdManagerBannerView$2(Lcom/google/android/gms/ads/AdValue;)V
    .locals 4

    .line 147
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$1300(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->access$1400(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Lcom/google/unity/ads/UnityAdListener;

    move-result-object v0

    .line 149
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdValue;->getPrecisionType()I

    move-result v1

    .line 150
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdValue;->getValueMicros()J

    move-result-wide v2

    .line 151
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdValue;->getCurrencyCode()Ljava/lang/String;

    move-result-object p1

    .line 148
    invoke-interface {v0, v1, v2, v3, p1}, Lcom/google/unity/ads/UnityAdListener;->onPaidEvent(IJLjava/lang/String;)V

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

    .line 145
    iget-object v0, p0, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;->this$0:Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;

    invoke-static {v0}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;->-$$Nest$fgetservice(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2$$ExternalSyntheticLambda0;-><init>(Lcom/google/unity/ads/admanager/UnityAdManagerBannerView$2;Lcom/google/android/gms/ads/AdValue;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
