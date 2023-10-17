.class public final Lcom/google/android/gms/internal/ads/zzewi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeww;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfbm;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfvn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfbm;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzewg;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzewg;-><init>(Lcom/google/android/gms/internal/ads/zzewi;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzewi;->zzc:Lcom/google/android/gms/internal/ads/zzfvn;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzewi;->zza:Lcom/google/android/gms/internal/ads/zzfbm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzewi;->zzb:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzcup;Lcom/google/android/gms/internal/ads/zzewr;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzewr;->zzb:Lcom/google/android/gms/internal/ads/zzfbw;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzewr;->zza:Lcom/google/android/gms/internal/ads/zzbug;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzewi;->zza:Lcom/google/android/gms/internal/ads/zzfbm;

    .line 2
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzfbm;->zzb(Lcom/google/android/gms/internal/ads/zzfbw;)Lcom/google/android/gms/internal/ads/zzfbv;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v0, :cond_1

    .line 3
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    if-eqz p2, :cond_2

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzb()Lcom/google/android/gms/internal/ads/zzcsm;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcsm;->zzh(Lcom/google/android/gms/internal/ads/zzbug;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzewi;->zzc:Lcom/google/android/gms/internal/ads/zzfvn;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzewi;->zzb:Ljava/util/concurrent/Executor;

    .line 5
    invoke-static {p1, v1, v3}, Lcom/google/android/gms/internal/ads/zzfvr;->zzq(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzewh;

    invoke-direct {p1, v0, p2, v2}, Lcom/google/android/gms/internal/ads/zzewh;-><init>(Lcom/google/android/gms/internal/ads/zzfbw;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfbv;)V

    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/internal/ads/zzewv;Lcom/google/android/gms/internal/ads/zzcup;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzews;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzewi;->zza:Lcom/google/android/gms/internal/ads/zzfbm;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewi;->zzb:Ljava/util/concurrent/Executor;

    invoke-direct {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzews;-><init>(Lcom/google/android/gms/internal/ads/zzfbm;Lcom/google/android/gms/internal/ads/zzcup;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzews;->zzc()Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvi;->zzv(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfvi;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzewe;

    invoke-direct {p2, p0, p3}, Lcom/google/android/gms/internal/ads/zzewe;-><init>(Lcom/google/android/gms/internal/ads/zzewi;Lcom/google/android/gms/internal/ads/zzcup;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzewi;->zzb:Ljava/util/concurrent/Executor;

    .line 3
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzewf;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzewf;-><init>(Lcom/google/android/gms/internal/ads/zzewi;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzewi;->zzb:Ljava/util/concurrent/Executor;

    const-class v0, Ljava/lang/Exception;

    .line 4
    invoke-static {p1, v0, p2, p3}, Lcom/google/android/gms/internal/ads/zzfvr;->zze(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/internal/ads/zzewv;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 0

    const/4 p3, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzewi;->zzb(Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/internal/ads/zzewv;Lcom/google/android/gms/internal/ads/zzcup;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic zzd()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
