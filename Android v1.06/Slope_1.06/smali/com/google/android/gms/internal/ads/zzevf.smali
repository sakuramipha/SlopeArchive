.class public final Lcom/google/android/gms/internal/ads/zzevf;
.super Lcom/google/android/gms/internal/ads/zzeun;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcgw;Lcom/google/android/gms/internal/ads/zzeww;Lcom/google/android/gms/internal/ads/zzevd;Lcom/google/android/gms/internal/ads/zzezy;Lcom/google/android/gms/internal/ads/zzbzz;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/internal/ads/zzeun;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcgw;Lcom/google/android/gms/internal/ads/zzeww;Lcom/google/android/gms/internal/ads/zzevd;Lcom/google/android/gms/internal/ads/zzezy;Lcom/google/android/gms/internal/ads/zzbzz;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzcpa;Lcom/google/android/gms/internal/ads/zzcus;Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzcuo;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzevf;->zza:Lcom/google/android/gms/internal/ads/zzcgw;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzc()Lcom/google/android/gms/internal/ads/zzcoq;

    move-result-object p1

    .line 2
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzcoq;->zzd(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzcoq;

    .line 3
    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/zzcoq;->zzc(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzcoq;

    return-object p1
.end method
