.class public final Lcom/google/android/gms/internal/ads/zzbyt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    .line 1
    new-instance p2, Lcom/google/android/gms/internal/ads/zzcal;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/google/android/gms/internal/ads/zzbzm;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzm;->zzt(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbys;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbys;-><init>(Lcom/google/android/gms/internal/ads/zzbyt;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcal;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfwc;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-object p2
.end method
