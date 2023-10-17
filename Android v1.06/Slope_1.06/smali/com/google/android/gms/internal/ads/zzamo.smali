.class public final Lcom/google/android/gms/internal/ads/zzamo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public static zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzalw;)Lcom/google/android/gms/internal/ads/zzall;
    .locals 3

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzalx;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzami;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzami;-><init>()V

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzalx;-><init>(Lcom/google/android/gms/internal/ads/zzalw;)V

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzamn;

    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzamn;-><init>(Landroid/content/Context;)V

    new-instance p0, Lcom/google/android/gms/internal/ads/zzall;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzame;

    const/high16 v2, 0x500000

    .line 4
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzame;-><init>(Lcom/google/android/gms/internal/ads/zzamd;I)V

    const/4 v0, 0x4

    .line 5
    invoke-direct {p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzall;-><init>(Lcom/google/android/gms/internal/ads/zzaks;Lcom/google/android/gms/internal/ads/zzalb;I)V

    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzall;->zzd()V

    return-object p0
.end method
