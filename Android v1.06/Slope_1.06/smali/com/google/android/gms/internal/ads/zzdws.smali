.class public final Lcom/google/android/gms/internal/ads/zzdws;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfwc;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfwc;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdxn;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzgvi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfwc;Lcom/google/android/gms/internal/ads/zzfwc;Lcom/google/android/gms/internal/ads/zzdxn;Lcom/google/android/gms/internal/ads/zzgvi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdws;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdws;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdws;->zzc:Lcom/google/android/gms/internal/ads/zzdxn;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdws;->zzd:Lcom/google/android/gms/internal/ads/zzgvi;

    return-void
.end method


# virtual methods
.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzbto;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdws;->zzc:Lcom/google/android/gms/internal/ads/zzdxn;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzjS:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 3
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    .line 1
    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdxn;->zza(Lcom/google/android/gms/internal/ads/zzbto;J)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method final synthetic zzb(Lcom/google/android/gms/internal/ads/zzbto;ILcom/google/android/gms/internal/ads/zzdwc;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzdws;->zzd:Lcom/google/android/gms/internal/ads/zzgvi;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzgvi;->zzb()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/zzdyt;

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzdyt;->zzb(Lcom/google/android/gms/internal/ads/zzbto;I)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbto;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzbto;->zzf:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzy(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdwc;

    const/4 v1, 0x1

    const-string v2, "Ads service proxy force local"

    .line 3
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdwc;-><init>(ILjava/lang/String;)V

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdwp;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzdwp;-><init>(Lcom/google/android/gms/internal/ads/zzdws;Lcom/google/android/gms/internal/ads/zzbto;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdws;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzk(Lcom/google/android/gms/internal/ads/zzfux;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzdwq;->zza:Lcom/google/android/gms/internal/ads/zzdwq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdws;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    const-class v3, Ljava/util/concurrent/ExecutionException;

    .line 6
    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzf(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    .line 7
    :goto_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzdwr;

    invoke-direct {v2, p0, p1, v1}, Lcom/google/android/gms/internal/ads/zzdwr;-><init>(Lcom/google/android/gms/internal/ads/zzdws;Lcom/google/android/gms/internal/ads/zzbto;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdws;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    const-class v1, Lcom/google/android/gms/internal/ads/zzdwc;

    .line 8
    invoke-static {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzf(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
