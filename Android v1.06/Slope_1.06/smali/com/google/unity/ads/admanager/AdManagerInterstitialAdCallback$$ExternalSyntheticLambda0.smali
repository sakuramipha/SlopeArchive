.class public final synthetic Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback$$ExternalSyntheticLambda0;->f$0:Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;

    invoke-virtual {v0}, Lcom/google/unity/ads/admanager/AdManagerInterstitialAdCallback;->lambda$onAdLoaded$0$com-google-unity-ads-admanager-AdManagerInterstitialAdCallback()V

    return-void
.end method
