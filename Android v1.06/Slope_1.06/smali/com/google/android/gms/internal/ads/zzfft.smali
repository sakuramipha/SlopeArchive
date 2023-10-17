.class public final Lcom/google/android/gms/internal/ads/zzfft;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final zza:Ljava/lang/Object;

.field public static zzb:Ljava/lang/Boolean;

.field private static final zzc:Ljava/lang/Object;

.field private static final zzd:Ljava/lang/Object;


# instance fields
.field private final zze:Landroid/content/Context;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzffy;

.field private zzh:Ljava/lang/String;

.field private zzi:I

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdnu;

.field private final zzk:Ljava/util/List;

.field private zzl:Z

.field private final zzm:Lcom/google/android/gms/internal/ads/zzdyy;

.field private final zzn:Lcom/google/android/gms/internal/ads/zzbus;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfft;->zza:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfft;->zzc:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfft;->zzd:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzdnu;Lcom/google/android/gms/internal/ads/zzdyy;Lcom/google/android/gms/internal/ads/zzbus;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfgb;->zzc()Lcom/google/android/gms/internal/ads/zzffy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzg:Lcom/google/android/gms/internal/ads/zzffy;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzh:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzl:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zze:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzj:Lcom/google/android/gms/internal/ads/zzdnu;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzm:Lcom/google/android/gms/internal/ads/zzdyy;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzn:Lcom/google/android/gms/internal/ads/zzbus;

    .line 2
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzin:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zzs;->zzd()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzk:Ljava/util/List;

    return-void

    .line 5
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzk:Ljava/util/List;

    return-void
.end method

.method public static zza()Z
    .locals 7

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfft;->zza:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfft;->zzb:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbcw;->zzb:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfft;->zzb:Ljava/lang/Boolean;

    goto :goto_0

    .line 5
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbcw;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 4
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v5

    cmpg-double v1, v5, v3

    if-gez v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzfft;->zzb:Ljava/lang/Boolean;

    .line 2
    :cond_2
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfft;->zzb:Ljava/lang/Boolean;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfft;->zza()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfft;->zzc:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzg:Lcom/google/android/gms/internal/ads/zzffy;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzffy;->zza()I

    move-result v1

    if-nez v1, :cond_1

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzg:Lcom/google/android/gms/internal/ads/zzffy;

    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfgb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgmx;->zzax()[B

    move-result-object v6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzg:Lcom/google/android/gms/internal/ads/zzffy;

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzffy;->zzc()Lcom/google/android/gms/internal/ads/zzffy;

    .line 7
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdyv;

    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzih:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 9
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 10
    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    const v4, 0xea60

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v7, "application/x-protobuf"

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzdyv;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zze:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzbzz;->zza:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzn:Lcom/google/android/gms/internal/ads/zzbus;

    .line 11
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    new-instance v5, Lcom/google/android/gms/internal/ads/zzdyx;

    invoke-direct {v5, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzdyx;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbus;I)V

    .line 12
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/ads/zzdyx;->zzb(Lcom/google/android/gms/internal/ads/zzdyv;)Lcom/google/android/gms/internal/ads/zzdyw;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catchall_0
    move-exception v1

    .line 7
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v0

    .line 13
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzdtz;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/zzdtz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdtz;->zza()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    const-string v1, "CuiMonitor.sendCuiPing"

    .line 14
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/google/android/gms/internal/ads/zzbzc;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbzc;->zzt(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :catchall_1
    move-exception v1

    .line 4
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzffj;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzffs;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzffs;-><init>(Lcom/google/android/gms/internal/ads/zzfft;Lcom/google/android/gms/internal/ads/zzffj;)V

    .line 2
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfwc;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method

.method final synthetic zzc(Lcom/google/android/gms/internal/ads/zzffj;)V
    .locals 9

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfft;->zzd:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzl:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 44
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzl:Z

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfft;->zza()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    monitor-exit v0

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zze:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzn(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzh:Ljava/lang/String;

    .line 5
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailabilityLight;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfft;->zze:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/GoogleApiAvailabilityLight;->getApkVersion(Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzi:I

    .line 6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzii:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 6
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 8
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcag;->zzd:Ljava/util/concurrent/ScheduledExecutorService;

    int-to-long v6, v1

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v3, p0

    move-wide v4, v6

    .line 9
    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfft;->zza()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    if-nez p1, :cond_3

    return-void

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfft;->zzc:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzg:Lcom/google/android/gms/internal/ads/zzffy;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzffy;->zza()I

    move-result v0

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbk;->zzij:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v2

    .line 14
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_4

    .line 15
    monitor-exit v1

    return-void

    .line 16
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzffw;->zza()Lcom/google/android/gms/internal/ads/zzffv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzl()I

    move-result v2

    .line 17
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzt(I)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzk()Z

    move-result v2

    .line 18
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzp(Z)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzb()J

    move-result-wide v2

    .line 19
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzffv;->zzg(J)Lcom/google/android/gms/internal/ads/zzffv;

    const/4 v2, 0x3

    .line 20
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzv(I)Lcom/google/android/gms/internal/ads/zzffv;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzbzz;->zza:Ljava/lang/String;

    .line 21
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzh:Ljava/lang/String;

    .line 22
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 23
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzq(I)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzn()I

    move-result v2

    .line 25
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzu(I)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zza()I

    move-result v2

    .line 26
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzj(I)Lcom/google/android/gms/internal/ads/zzffv;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzi:I

    int-to-long v2, v2

    .line 27
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzffv;->zze(J)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzm()I

    move-result v2

    .line 28
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzs(I)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzd()Ljava/lang/String;

    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzf()Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzf(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzg()Ljava/lang/String;

    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzh(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzj:Lcom/google/android/gms/internal/ads/zzdnu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzg()Ljava/lang/String;

    move-result-object v3

    .line 32
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzdnu;->zzc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 33
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzh()Ljava/lang/String;

    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zze()Ljava/lang/String;

    move-result-object v2

    .line 35
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzj()Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzi()Ljava/lang/String;

    move-result-object v2

    .line 37
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzffv;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffj;->zzc()J

    move-result-wide v2

    .line 38
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzffv;->zzo(J)Lcom/google/android/gms/internal/ads/zzffv;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzin:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 39
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzk:Ljava/util/List;

    .line 41
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzffv;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzffv;

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfft;->zzg:Lcom/google/android/gms/internal/ads/zzffy;

    .line 42
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfga;->zza()Lcom/google/android/gms/internal/ads/zzffz;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzffz;->zza(Lcom/google/android/gms/internal/ads/zzffv;)Lcom/google/android/gms/internal/ads/zzffz;

    .line 43
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzffy;->zzb(Lcom/google/android/gms/internal/ads/zzffz;)Lcom/google/android/gms/internal/ads/zzffy;

    .line 44
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 10
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
