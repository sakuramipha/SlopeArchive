.class public final Lcom/google/android/gms/internal/ads/zzfro;
.super Lcom/google/android/gms/internal/ads/zzfrk;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzfrk;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrl;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzfrk;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrk;

    return-object p0
.end method

.method public final zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfro;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzfrk;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrk;

    return-object p0
.end method

.method public final varargs zzg([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfro;
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzfrk;->zzd([Ljava/lang/Object;I)V

    return-object p0
.end method

.method public final zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfro;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzfrk;->zzc(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfrl;

    return-object p0
.end method

.method public final zzi()Lcom/google/android/gms/internal/ads/zzfrr;
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzc:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zza:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzb:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfrr;->zzi([Ljava/lang/Object;I)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v0

    return-object v0
.end method
