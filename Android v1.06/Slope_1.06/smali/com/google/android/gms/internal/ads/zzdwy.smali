.class public final Lcom/google/android/gms/internal/ads/zzdwy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfwc;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfwc;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdxq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfwc;Lcom/google/android/gms/internal/ads/zzfwc;Lcom/google/android/gms/internal/ads/zzdxq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zzc:Lcom/google/android/gms/internal/ads/zzdxq;

    return-void
.end method


# virtual methods
.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzbtk;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zzc:Lcom/google/android/gms/internal/ads/zzdxq;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzjR:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 1
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdxq;->zza(Lcom/google/android/gms/internal/ads/zzbtk;J)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbtk;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzbtk;->zzb:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzy(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzdwc;

    const/4 v0, 0x1

    const-string v1, "Ads signal service force local"

    .line 3
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzdwc;-><init>(ILjava/lang/String;)V

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdwu;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzdwu;-><init>(Lcom/google/android/gms/internal/ads/zzdwy;Lcom/google/android/gms/internal/ads/zzbtk;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 5
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzk(Lcom/google/android/gms/internal/ads/zzfux;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdwv;->zza:Lcom/google/android/gms/internal/ads/zzdwv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    const-class v2, Ljava/util/concurrent/ExecutionException;

    .line 6
    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzf(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    .line 7
    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvi;->zzv(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfvi;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdww;->zza:Lcom/google/android/gms/internal/ads/zzdww;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    const-class v2, Lcom/google/android/gms/internal/ads/zzdwc;

    .line 8
    invoke-static {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzf(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdwx;->zza:Lcom/google/android/gms/internal/ads/zzdwx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdwy;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
