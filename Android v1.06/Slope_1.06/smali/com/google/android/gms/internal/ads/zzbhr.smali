.class final Lcom/google/android/gms/internal/ads/zzbhr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbii;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcfb;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzj()Lcom/google/android/gms/ads/internal/overlay/zzw;

    move-result-object p2

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/ads/internal/overlay/zzw;->zza(Lcom/google/android/gms/internal/ads/zzcfb;Landroid/content/Context;)V

    return-void
.end method
