.class Lcom/google/unity/ads/Banner$7;
.super Ljava/lang/Object;
.source "Banner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/Banner;->show()V
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

    .line 336
    iput-object p1, p0, Lcom/google/unity/ads/Banner$7;->this$0:Lcom/google/unity/ads/Banner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "AdsUnity"

    const-string v1, "Calling show() on Android"

    .line 339
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 340
    iget-object v0, p0, Lcom/google/unity/ads/Banner$7;->this$0:Lcom/google/unity/ads/Banner;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/unity/ads/Banner;->hidden:Z

    .line 341
    iget-object v0, p0, Lcom/google/unity/ads/Banner$7;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/BaseAdView;->setVisibility(I)V

    .line 342
    iget-object v0, p0, Lcom/google/unity/ads/Banner$7;->this$0:Lcom/google/unity/ads/Banner;

    invoke-static {v0}, Lcom/google/unity/ads/Banner;->-$$Nest$mupdatePosition(Lcom/google/unity/ads/Banner;)V

    .line 343
    iget-object v0, p0, Lcom/google/unity/ads/Banner$7;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->adView:Lcom/google/android/gms/ads/BaseAdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->resume()V

    return-void
.end method
