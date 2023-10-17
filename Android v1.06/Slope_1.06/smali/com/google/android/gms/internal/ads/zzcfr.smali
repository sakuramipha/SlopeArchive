.class public final synthetic Lcom/google/android/gms/internal/ads/zzcfr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaww;


# instance fields
.field public final synthetic zza:Z

.field public final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcfr;->zza:Z

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzcfr;->zzb:I

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaym;)V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcfr;->zza:Z

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcfr;->zzb:I

    sget v2, Lcom/google/android/gms/internal/ads/zzcfu;->zza:I

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbas;->zza()Lcom/google/android/gms/internal/ads/zzbar;

    move-result-object v2

    .line 2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbar;->zzc()Z

    move-result v3

    if-eq v3, v0, :cond_0

    .line 3
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbar;->zza(Z)Lcom/google/android/gms/internal/ads/zzbar;

    .line 4
    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbar;->zzb(I)Lcom/google/android/gms/internal/ads/zzbar;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbas;

    .line 5
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaym;->zzj(Lcom/google/android/gms/internal/ads/zzbas;)Lcom/google/android/gms/internal/ads/zzaym;

    return-void
.end method
