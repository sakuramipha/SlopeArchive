.class final Lcom/google/android/gms/internal/ads/zzegq;
.super Lcom/google/android/gms/internal/ads/zzbvg;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzcxo;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcvg;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcwp;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzddf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzegr;Lcom/google/android/gms/internal/ads/zzcxo;Lcom/google/android/gms/internal/ads/zzcvg;Lcom/google/android/gms/internal/ads/zzcwp;Lcom/google/android/gms/internal/ads/zzddf;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzegq;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzb:Lcom/google/android/gms/internal/ads/zzcvg;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzc:Lcom/google/android/gms/internal/ads/zzcwp;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzd:Lcom/google/android/gms/internal/ads/zzddf;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbvg;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzb:Lcom/google/android/gms/internal/ads/zzcvg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcvg;->onAdClicked()V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegq;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzcxo;->zzf(I)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/dynamic/IObjectWrapper;I)V
    .locals 0

    return-void
.end method

.method public final zzh(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzc:Lcom/google/android/gms/internal/ads/zzcwp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcwp;->zzb()V

    return-void
.end method

.method public final zzi(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    return-void
.end method

.method public final zzj(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegq;->zza:Lcom/google/android/gms/internal/ads/zzcxo;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcxo;->zzb()V

    return-void
.end method

.method public final zzk(Lcom/google/android/gms/dynamic/IObjectWrapper;I)V
    .locals 0

    return-void
.end method

.method public final zzl(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    return-void
.end method

.method public final zzm(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzbvi;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzd:Lcom/google/android/gms/internal/ads/zzddf;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzddf;->zza(Lcom/google/android/gms/internal/ads/zzbvi;)V

    return-void
.end method

.method public final zzn(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzc:Lcom/google/android/gms/internal/ads/zzcwp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcwp;->zze()V

    return-void
.end method

.method public final zzo(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegq;->zzd:Lcom/google/android/gms/internal/ads/zzddf;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzddf;->zzc()V

    return-void
.end method
