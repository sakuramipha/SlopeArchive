.class final Lcom/google/android/gms/internal/ads/zzbkb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/common/internal/BaseGmsClient$BaseConnectionCallbacks;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzcal;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbkd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbkd;Lcom/google/android/gms/internal/ads/zzcal;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbkb;->zzb:Lcom/google/android/gms/internal/ads/zzbkd;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbkb;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbkb;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbkb;->zzb:Lcom/google/android/gms/internal/ads/zzbkd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbkd;->zzb(Lcom/google/android/gms/internal/ads/zzbkd;)Lcom/google/android/gms/internal/ads/zzbjq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbjq;->zzp()Lcom/google/android/gms/internal/ads/zzbjx;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzcal;->zzd(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbkb;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcal;->zze(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbkb;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onConnectionSuspended: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcal;->zze(Ljava/lang/Throwable;)Z

    return-void
.end method
