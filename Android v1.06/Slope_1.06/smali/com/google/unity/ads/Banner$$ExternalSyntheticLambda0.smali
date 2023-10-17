.class public final synthetic Lcom/google/unity/ads/Banner$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lcom/google/unity/ads/Banner;


# direct methods
.method public synthetic constructor <init>(Lcom/google/unity/ads/Banner;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/unity/ads/Banner$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/Banner;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/unity/ads/Banner$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/Banner;

    invoke-virtual {v0}, Lcom/google/unity/ads/Banner;->lambda$getResponseInfo$0$com-google-unity-ads-Banner()Lcom/google/android/gms/ads/ResponseInfo;

    move-result-object v0

    return-object v0
.end method
