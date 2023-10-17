.class Lcom/google/unity/ads/Banner$8;
.super Ljava/lang/Object;
.source "Banner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/Banner;->hide()V
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

    .line 351
    iput-object p1, p0, Lcom/google/unity/ads/Banner$8;->this$0:Lcom/google/unity/ads/Banner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "AdsUnity"

    const-string v1, "Calling hide() on Android"

    .line 354
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 355
    iget-object v0, p0, Lcom/google/unity/ads/Banner$8;->this$0:Lcom/google/unity/ads/Banner;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/unity/ads/Banner;->hidden:Z

    .line 356
    iget-object v0, p0, Lcom/google/unity/ads/Banner$8;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/BaseAdView;->setVisibility(I)V

    .line 357
    iget-object v0, p0, Lcom/google/unity/ads/Banner$8;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->pause()V

    return-void
.end method
