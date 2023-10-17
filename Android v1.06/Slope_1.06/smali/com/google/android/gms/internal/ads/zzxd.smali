.class public abstract Lcom/google/android/gms/internal/ads/zzxd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzxc;

.field private zzb:Lcom/google/android/gms/internal/ads/zzxl;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzh()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzxd;->zza:Lcom/google/android/gms/internal/ads/zzxc;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzxd;->zzb:Lcom/google/android/gms/internal/ads/zzxl;

    return-void
.end method

.method public zzi(Lcom/google/android/gms/internal/ads/zzk;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public zzl()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public abstract zzn([Lcom/google/android/gms/internal/ads/zzlf;Lcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzxe;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation
.end method

.method public abstract zzo(Ljava/lang/Object;)V
.end method

.method protected final zzp()Lcom/google/android/gms/internal/ads/zzxl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxd;->zzb:Lcom/google/android/gms/internal/ads/zzxl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final zzq(Lcom/google/android/gms/internal/ads/zzxc;Lcom/google/android/gms/internal/ads/zzxl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxd;->zza:Lcom/google/android/gms/internal/ads/zzxc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzxd;->zzb:Lcom/google/android/gms/internal/ads/zzxl;

    return-void
.end method

.method protected final zzr()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxd;->zza:Lcom/google/android/gms/internal/ads/zzxc;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzxc;->zzj()V

    :cond_0
    return-void
.end method
