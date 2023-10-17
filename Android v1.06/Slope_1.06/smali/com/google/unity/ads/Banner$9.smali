.class Lcom/google/unity/ads/Banner$9;
.super Ljava/lang/Object;
.source "Banner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/Banner;->destroy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/unity/ads/Banner;


# direct methods
.method constructor <init>(Lcom/google/unity/ads/Banner;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 365
    iput-object p1, p0, Lcom/google/unity/ads/Banner$9;->this$0:Lcom/google/unity/ads/Banner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "AdsUnity"

    const-string v1, "Calling destroy() on Android"

    .line 368
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 369
    iget-object v0, p0, Lcom/google/unity/ads/Banner$9;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    if-eqz v0, :cond_0

    .line 370
    iget-object v0, p0, Lcom/google/unity/ads/Banner$9;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->destroy()V

    .line 371
    iget-object v0, p0, Lcom/google/unity/ads/Banner$9;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 372
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 373
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/unity/ads/Banner$9;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v1, v1, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
