.class final Lcom/google/android/gms/internal/ads/zzefy;
.super Lcom/google/android/gms/internal/ads/zzbpr;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeby;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzefz;Lcom/google/android/gms/internal/ads/zzeby;Lcom/google/android/gms/internal/ads/zzefx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbpr;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzefy;->zza:Lcom/google/android/gms/internal/ads/zzeby;

    return-void
.end method


# virtual methods
.method public final zze(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzefy;->zza:Lcom/google/android/gms/internal/ads/zzeby;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzedr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzedr;->zzi(ILjava/lang/String;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzefy;->zza:Lcom/google/android/gms/internal/ads/zzeby;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzedr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzedr;->zzh(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final zzg()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzefy;->zza:Lcom/google/android/gms/internal/ads/zzeby;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzedr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzedr;->zzo()V

    return-void
.end method
