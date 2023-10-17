.class public final Lcom/google/android/gms/internal/ads/zzatb;
.super Lcom/google/android/gms/internal/ads/zzatf;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzarr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzano;II)V
    .locals 7

    const-string v2, "CJ1WRc1PE+xR6/6qo7i2DCIPFySihC2gOkB+O3ToQfek8u0n5+HTKTUaxwoTaOup"

    const-string v3, "MdKUmuf6DBtYuVjgv6h8BEjHuBvX5PE/R2XdoeGNJT0="

    const/16 v6, 0x30

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzatf;-><init>(Lcom/google/android/gms/internal/ads/zzarr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzano;II)V

    return-void
.end method


# virtual methods
.method protected final zza()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzatb;->zze:Lcom/google/android/gms/internal/ads/zzano;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzag(I)Lcom/google/android/gms/internal/ads/zzano;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzatb;->zzf:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzatb;->zzb:Lcom/google/android/gms/internal/ads/zzarr;

    .line 2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzarr;->zzb()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzatb;->zze:Lcom/google/android/gms/internal/ads/zzano;

    .line 3
    monitor-enter v2

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzatb;->zze:Lcom/google/android/gms/internal/ads/zzano;

    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzag(I)Lcom/google/android/gms/internal/ads/zzano;

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzatb;->zze:Lcom/google/android/gms/internal/ads/zzano;

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzag(I)Lcom/google/android/gms/internal/ads/zzano;

    .line 6
    :goto_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
