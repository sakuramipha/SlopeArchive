.class Lcom/google/unity/ads/Banner$4$1;
.super Ljava/lang/Object;
.source "Banner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/Banner$4;->onPaidEvent(Lcom/google/android/gms/ads/AdValue;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/unity/ads/Banner$4;

.field final synthetic val$adValue:Lcom/google/android/gms/ads/AdValue;


# direct methods
.method constructor <init>(Lcom/google/unity/ads/Banner$4;Lcom/google/android/gms/ads/AdValue;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$1",
            "val$adValue"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 265
    iput-object p1, p0, Lcom/google/unity/ads/Banner$4$1;->this$1:Lcom/google/unity/ads/Banner$4;

    iput-object p2, p0, Lcom/google/unity/ads/Banner$4$1;->val$adValue:Lcom/google/android/gms/ads/AdValue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 268
    iget-object v0, p0, Lcom/google/unity/ads/Banner$4$1;->this$1:Lcom/google/unity/ads/Banner$4;

    iget-object v0, v0, Lcom/google/unity/ads/Banner$4;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/google/unity/ads/Banner$4$1;->this$1:Lcom/google/unity/ads/Banner$4;

    iget-object v0, v0, Lcom/google/unity/ads/Banner$4;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v0, v0, Lcom/google/unity/ads/Banner;->unityListener:Lcom/google/unity/ads/UnityAdListener;

    iget-object v1, p0, Lcom/google/unity/ads/Banner$4$1;->val$adValue:Lcom/google/android/gms/ads/AdValue;

    .line 270
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdValue;->getPrecisionType()I

    move-result v1

    iget-object v2, p0, Lcom/google/unity/ads/Banner$4$1;->val$adValue:Lcom/google/android/gms/ads/AdValue;

    .line 271
    invoke-virtual {v2}, Lcom/google/android/gms/ads/AdValue;->getValueMicros()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/unity/ads/Banner$4$1;->val$adValue:Lcom/google/android/gms/ads/AdValue;

    .line 272
    invoke-virtual {v4}, Lcom/google/android/gms/ads/AdValue;->getCurrencyCode()Ljava/lang/String;

    move-result-object v4

    .line 269
    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/unity/ads/UnityAdListener;->onPaidEvent(IJLjava/lang/String;)V

    :cond_0
    return-void
.end method
