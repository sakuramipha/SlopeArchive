.class public final Lcom/google/android/gms/internal/ads/zzasp;
.super Lcom/google/android/gms/internal/ads/zzatf;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zzi:Lcom/google/android/gms/internal/ads/zzarj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzarr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzano;IILcom/google/android/gms/internal/ads/zzarj;)V
    .locals 7

    const-string v2, "u0deiS9oYmD364nfSsTKCoaogh75qkGLLRLBySCBi52jAL+3CKcuH0JuOgAzQyxJ"

    const-string v3, "All9dLPTMel/eCIBoDimh2kew7aPoVe9eZ80kN1esN4="

    const/16 v6, 0x5e

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzatf;-><init>(Lcom/google/android/gms/internal/ads/zzarr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzano;II)V

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzasp;->zzi:Lcom/google/android/gms/internal/ads/zzarj;

    return-void
.end method


# virtual methods
.method protected final zza()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzasp;->zzf:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzasp;->zzi:Lcom/google/android/gms/internal/ads/zzarj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzarj;->zza()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzasp;->zze:Lcom/google/android/gms/internal/ads/zzano;

    .line 2
    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzasp;->zze:Lcom/google/android/gms/internal/ads/zzano;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoc;->zza(I)I

    move-result v0

    .line 3
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzano;->zzae(I)Lcom/google/android/gms/internal/ads/zzano;

    .line 4
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
