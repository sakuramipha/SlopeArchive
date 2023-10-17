.class public final Lcom/google/android/gms/internal/ads/zzdyj;
.super Lcom/google/android/gms/internal/ads/zzbtr;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfwc;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdzb;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcmi;

.field private final zze:Ljava/util/ArrayDeque;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfft;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbus;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdyy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfwc;Lcom/google/android/gms/internal/ads/zzbus;Lcom/google/android/gms/internal/ads/zzcmi;Lcom/google/android/gms/internal/ads/zzdzb;Ljava/util/ArrayDeque;Lcom/google/android/gms/internal/ads/zzdyy;Lcom/google/android/gms/internal/ads/zzfft;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbtr;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbbk;->zza(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzg:Lcom/google/android/gms/internal/ads/zzbus;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzc:Lcom/google/android/gms/internal/ads/zzdzb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzd:Lcom/google/android/gms/internal/ads/zzcmi;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zze:Ljava/util/ArrayDeque;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzh:Lcom/google/android/gms/internal/ads/zzdyy;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzf:Lcom/google/android/gms/internal/ads/zzfft;

    return-void
.end method

.method private final declared-synchronized zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdyg;
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zze:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzdyg;

    .line 4
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzdyg;->zzc:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzbmy;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbmv;->zza:Lcom/google/android/gms/internal/ads/zzbms;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzdya;->zza:Lcom/google/android/gms/internal/ads/zzdya;

    const-string v2, "AFMA_getAdDictionary"

    .line 2
    invoke-virtual {p2, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbmy;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)Lcom/google/android/gms/internal/ads/zzbmo;

    move-result-object p2

    .line 3
    invoke-static {p0, p4}, Lcom/google/android/gms/internal/ads/zzffp;->zzd(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfdx;->zzg:Lcom/google/android/gms/internal/ads/zzfdx;

    .line 5
    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/ads/zzfdv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p0

    .line 6
    invoke-static {p0, p3, p4}, Lcom/google/android/gms/internal/ads/zzffp;->zzc(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    return-object p0
.end method

.method private static zzm(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzeri;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdxu;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzdxu;-><init>(Lcom/google/android/gms/internal/ads/zzeri;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/zzdxv;->zza:Lcom/google/android/gms/internal/ads/zzdxv;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfdx;->zze:Lcom/google/android/gms/internal/ads/zzfdx;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzbug;->zza:Landroid/os/Bundle;

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lcom/google/android/gms/internal/ads/zzfdv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p0

    .line 4
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p0

    return-object p0
.end method

.method private final declared-synchronized zzn(Lcom/google/android/gms/internal/ads/zzdyg;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdyj;->zzo()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zze:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized zzo()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zzd:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zze:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    if-lt v1, v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zze:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final zzp(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbuc;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdyd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzdyd;-><init>(Lcom/google/android/gms/internal/ads/zzdyj;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdyf;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zzdyf;-><init>(Lcom/google/android/gms/internal/ads/zzdyj;Lcom/google/android/gms/internal/ads/zzbuc;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 3
    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzq(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 8

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Split request is disabled."

    .line 2
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzi:Lcom/google/android/gms/internal/ads/zzfbt;

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Pool configuration missing from request."

    .line 4
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzfbt;->zzc:I

    if-eqz v1, :cond_3

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzfbt;->zzd:I

    if-nez v0, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/google/android/gms/internal/ads/zzbmp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbzz;->zza()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzf:Lcom/google/android/gms/internal/ads/zzfft;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmp;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfft;)Lcom/google/android/gms/internal/ads/zzbmy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzd:Lcom/google/android/gms/internal/ads/zzcmi;

    .line 8
    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzcmi;->zzp(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzeri;

    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeri;->zzc()Lcom/google/android/gms/internal/ads/zzfed;

    move-result-object v1

    .line 10
    invoke-static {p1, v1, p2}, Lcom/google/android/gms/internal/ads/zzdyj;->zzm(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzeri;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v5

    .line 11
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeri;->zzd()Lcom/google/android/gms/internal/ads/zzffq;

    move-result-object p2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    const/16 v3, 0x9

    .line 12
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v7

    .line 13
    invoke-static {v5, v1, v0, p2, v7}, Lcom/google/android/gms/internal/ads/zzdyj;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzbmy;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v4

    .line 14
    sget-object p2, Lcom/google/android/gms/internal/ads/zzfdx;->zzy:Lcom/google/android/gms/internal/ads/zzfdx;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/zzfwb;

    const/4 v2, 0x0

    aput-object v5, v0, v2

    const/4 v2, 0x1

    aput-object v4, v0, v2

    .line 15
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/ads/zzfdv;->zza(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdl;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdxz;

    move-object v2, v0

    move-object v3, p0

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzdxz;-><init>(Lcom/google/android/gms/internal/ads/zzdyj;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 16
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzfdl;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p1

    return-object p1

    .line 4
    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Caching is disabled."

    .line 5
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 13

    .line 1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/google/android/gms/internal/ads/zzbmp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbzz;->zza()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzf:Lcom/google/android/gms/internal/ads/zzfft;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmp;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfft;)Lcom/google/android/gms/internal/ads/zzbmy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzd:Lcom/google/android/gms/internal/ads/zzcmi;

    .line 3
    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzcmi;->zzp(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzeri;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/zzdyi;->zza:Lcom/google/android/gms/internal/ads/zzbmr;

    .line 4
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbmv;->zzb:Lcom/google/android/gms/internal/ads/zzbmq;

    const-string v4, "google.afma.response.normalize"

    .line 5
    invoke-virtual {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmy;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)Lcom/google/android/gms/internal/ads/zzbmo;

    move-result-object v2

    .line 6
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbdk;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    .line 7
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzj:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "Request contained a PoolKey but split request is disabled."

    .line 8
    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzh:Ljava/lang/String;

    .line 10
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/zzdyj;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdyg;

    move-result-object v4

    if-nez v4, :cond_1

    const-string v3, "Request contained a PoolKey but no matching parameters were found."

    .line 11
    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    :cond_1
    :goto_0
    if-nez v4, :cond_2

    .line 8
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    const/16 v5, 0x9

    .line 12
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v3

    goto :goto_1

    .line 48
    :cond_2
    iget-object v3, v4, Lcom/google/android/gms/internal/ads/zzdyg;->zze:Lcom/google/android/gms/internal/ads/zzfff;

    .line 13
    :goto_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeri;->zzd()Lcom/google/android/gms/internal/ads/zzffq;

    move-result-object v5

    .line 14
    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzbug;->zza:Landroid/os/Bundle;

    const-string v7, "ad_types"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzffq;->zzd(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/zzffq;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzdza;

    .line 15
    iget-object v7, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzg:Ljava/lang/String;

    invoke-direct {v6, v7, v5, v3}, Lcom/google/android/gms/internal/ads/zzdza;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    .line 16
    iget-object v8, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzb:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzbzz;->zza:Ljava/lang/String;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzg:Lcom/google/android/gms/internal/ads/zzbus;

    new-instance v10, Lcom/google/android/gms/internal/ads/zzdyx;

    invoke-direct {v10, v7, v8, v9, p2}, Lcom/google/android/gms/internal/ads/zzdyx;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbus;I)V

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeri;->zzc()Lcom/google/android/gms/internal/ads/zzfed;

    move-result-object p2

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    const/16 v8, 0xb

    .line 18
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v7

    const/16 v8, 0xa

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x2

    if-nez v4, :cond_3

    .line 19
    invoke-static {p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzdyj;->zzm(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzeri;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    .line 20
    invoke-static {p1, p2, v0, v5, v3}, Lcom/google/android/gms/internal/ads/zzdyj;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzbmy;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    .line 21
    invoke-static {v1, v8}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v1

    .line 22
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfdx;->zzi:Lcom/google/android/gms/internal/ads/zzfdx;

    new-array v4, v12, [Lcom/google/android/gms/internal/ads/zzfwb;

    aput-object v0, v4, v11

    aput-object p1, v4, v9

    .line 23
    invoke-virtual {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzfdv;->zza(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdl;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzdxx;

    invoke-direct {v4, p1, v0}, Lcom/google/android/gms/internal/ads/zzdxx;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;)V

    .line 24
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfdl;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v3

    .line 25
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzffl;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzffl;-><init>(Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 26
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v3

    .line 27
    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object v3

    .line 29
    invoke-static {v3, v5, v1}, Lcom/google/android/gms/internal/ads/zzffp;->zza(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 30
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/ads/zzffp;->zzd(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfff;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfdx;->zzk:Lcom/google/android/gms/internal/ads/zzfdx;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/ads/zzfwb;

    aput-object p1, v4, v11

    aput-object v0, v4, v9

    aput-object v3, v4, v12

    .line 31
    invoke-virtual {p2, v1, v4}, Lcom/google/android/gms/internal/ads/zzfdv;->zza(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdl;

    move-result-object p2

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdxy;

    invoke-direct {v1, v3, p1, v0}, Lcom/google/android/gms/internal/ads/zzdxy;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;)V

    .line 32
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzfdl;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 33
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p1

    goto :goto_2

    .line 49
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzdyz;

    iget-object v0, v4, Lcom/google/android/gms/internal/ads/zzdyg;->zzb:Lorg/json/JSONObject;

    iget-object v1, v4, Lcom/google/android/gms/internal/ads/zzdyg;->zza:Lcom/google/android/gms/internal/ads/zzbuj;

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzdyz;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzbuj;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    .line 35
    invoke-static {v0, v8}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v0

    .line 36
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfdx;->zzi:Lcom/google/android/gms/internal/ads/zzfdx;

    .line 37
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/ads/zzfdv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 38
    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/zzffl;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzffl;-><init>(Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 39
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 40
    invoke-virtual {p1, v10}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p1

    .line 42
    invoke-static {p1, v5, v0}, Lcom/google/android/gms/internal/ads/zzffp;->zza(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 43
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    .line 44
    invoke-static {p1, v7}, Lcom/google/android/gms/internal/ads/zzffp;->zzd(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfff;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfdx;->zzk:Lcom/google/android/gms/internal/ads/zzfdx;

    new-array v3, v12, [Lcom/google/android/gms/internal/ads/zzfwb;

    aput-object p1, v3, v11

    aput-object v0, v3, v9

    .line 45
    invoke-virtual {p2, v1, v3}, Lcom/google/android/gms/internal/ads/zzfdv;->zza(Ljava/lang/Object;[Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdl;

    move-result-object p2

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdyc;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzdyc;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;)V

    .line 46
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzfdl;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 47
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p1

    .line 49
    :goto_2
    invoke-static {p1, v5, v7}, Lcom/google/android/gms/internal/ads/zzffp;->zza(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    return-object p1
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 6

    .line 1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/google/android/gms/internal/ads/zzbmp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbzz;->zza()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzf:Lcom/google/android/gms/internal/ads/zzfft;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmp;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfft;)Lcom/google/android/gms/internal/ads/zzbmy;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbdp;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Signal collection disabled."

    .line 4
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzd:Lcom/google/android/gms/internal/ads/zzcmi;

    .line 5
    invoke-interface {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzcmi;->zzp(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzeri;

    move-result-object p2

    .line 6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeri;->zza()Lcom/google/android/gms/internal/ads/zzeqt;

    move-result-object v1

    .line 7
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbmv;->zza:Lcom/google/android/gms/internal/ads/zzbms;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzbmv;->zzb:Lcom/google/android/gms/internal/ads/zzbmq;

    const-string v4, "google.afma.request.getSignals"

    .line 8
    invoke-virtual {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmy;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)Lcom/google/android/gms/internal/ads/zzbmo;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zza:Landroid/content/Context;

    const/16 v3, 0x16

    .line 9
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v2

    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeri;->zzc()Lcom/google/android/gms/internal/ads/zzfed;

    move-result-object v3

    .line 11
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfdx;->zzl:Lcom/google/android/gms/internal/ads/zzfdx;

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zzbug;->zza:Landroid/os/Bundle;

    .line 12
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzfdv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzffl;

    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/ads/zzffl;-><init>(Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 13
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzdyb;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzdyb;-><init>(Lcom/google/android/gms/internal/ads/zzeqt;)V

    .line 14
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/ads/zzfdx;->zzm:Lcom/google/android/gms/internal/ads/zzfdx;

    .line 15
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfdu;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object v0

    .line 18
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeri;->zzd()Lcom/google/android/gms/internal/ads/zzffq;

    move-result-object p2

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzbug;->zza:Landroid/os/Bundle;

    const-string v1, "ad_types"

    .line 19
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzffq;->zzd(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/zzffq;

    .line 20
    invoke-static {v0, p2, v2}, Lcom/google/android/gms/internal/ads/zzffp;->zzb(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 21
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbdd;->zze:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzc:Lcom/google/android/gms/internal/ads/zzdzb;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdxw;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzdxw;-><init>(Lcom/google/android/gms/internal/ads/zzdzb;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-object v0
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzbuc;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzdyj;->zzb(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdyj;->zzp(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbuc;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzbuc;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzdyj;->zzd(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdyj;->zzp(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbuc;)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzbuc;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzdyj;->zzc(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdyj;->zzp(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbuc;)V

    .line 4
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbdd;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzc:Lcom/google/android/gms/internal/ads/zzdzb;

    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdxw;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzdxw;-><init>(Lcom/google/android/gms/internal/ads/zzdzb;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdyj;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    return-void
.end method

.method public final zzh(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbuc;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzdyj;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdyj;->zzp(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbuc;)V

    return-void
.end method

.method public final zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Split request is disabled."

    .line 2
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdye;

    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzdye;-><init>(Lcom/google/android/gms/internal/ads/zzdyj;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzdyj;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdyg;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "URL to be removed not found for cache key: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1

    .line 6
    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method final synthetic zzj(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfff;)Ljava/io/InputStream;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfwb;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbuj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbuj;->zzc()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzfwb;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lorg/json/JSONObject;

    .line 3
    iget-object v4, p3, Lcom/google/android/gms/internal/ads/zzbug;->zzh:Ljava/lang/String;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdyg;

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfwb;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzbuj;

    move-object v1, p2

    move-object v5, v0

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzdyg;-><init>(Lcom/google/android/gms/internal/ads/zzbuj;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfff;)V

    .line 5
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzdyj;->zzn(Lcom/google/android/gms/internal/ads/zzdyg;)V

    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzfol;->zzc:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object p1
.end method
