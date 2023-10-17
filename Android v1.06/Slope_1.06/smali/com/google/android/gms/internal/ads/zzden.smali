.class public final Lcom/google/android/gms/internal/ads/zzden;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcxo;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdcm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcxo;Lcom/google/android/gms/internal/ads/zzdcm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzden;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzden;->zzb:Lcom/google/android/gms/internal/ads/zzdcm;

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzden;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcxo;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzden;->zzb:Lcom/google/android/gms/internal/ads/zzdcm;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdcm;->zzb()V

    return-void
.end method

.method public final zzbF()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzden;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcxo;->zzbF()V

    return-void
.end method

.method public final zzbo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzden;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcxo;->zzbo()V

    return-void
.end method

.method public final zzby()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzden;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcxo;->zzby()V

    return-void
.end method

.method public final zze()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzden;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcxo;->zze()V

    return-void
.end method

.method public final zzf(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzden;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcxo;->zzf(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzden;->zzb:Lcom/google/android/gms/internal/ads/zzdcm;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdcm;->zza()V

    return-void
.end method
