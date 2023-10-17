.class public final Lcom/google/android/gms/internal/ads/zzcqs;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcww;
.implements Lcom/google/android/gms/internal/ads/zzcwc;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcfb;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzezf;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbzz;

.field private zze:Lcom/google/android/gms/internal/ads/zzfgo;

.field private zzf:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzbzz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzd:Lcom/google/android/gms/internal/ads/zzbzz;

    return-void
.end method

.method private final declared-synchronized zza()V
    .locals 12

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzU:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zza:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzebs;->zze(Landroid/content/Context;)Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzd:Lcom/google/android/gms/internal/ads/zzbzz;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzbzz;->zzb:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzbzz;->zzc:I

    new-instance v2, Ljava/lang/StringBuilder;

    .line 2
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzW:Lcom/google/android/gms/internal/ads/zzfad;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfad;->zza()Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzW:Lcom/google/android/gms/internal/ads/zzfad;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfad;->zzb()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 5
    sget-object v0, Lcom/google/android/gms/internal/ads/zzebt;->zzc:Lcom/google/android/gms/internal/ads/zzebt;

    .line 6
    sget-object v2, Lcom/google/android/gms/internal/ads/zzebu;->zzb:Lcom/google/android/gms/internal/ads/zzebu;

    :goto_0
    move-object v10, v0

    move-object v9, v2

    goto :goto_1

    .line 7
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzebt;->zza:Lcom/google/android/gms/internal/ads/zzebt;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzezf;->zzf:I

    if-ne v2, v1, :cond_4

    .line 8
    sget-object v2, Lcom/google/android/gms/internal/ads/zzebu;->zzc:Lcom/google/android/gms/internal/ads/zzebu;

    goto :goto_0

    .line 9
    :cond_4
    sget-object v2, Lcom/google/android/gms/internal/ads/zzebu;->zza:Lcom/google/android/gms/internal/ads/zzebu;

    goto :goto_0

    .line 10
    :goto_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    .line 11
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfb;->zzG()Landroid/webkit/WebView;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzam:Ljava/lang/String;

    const-string v6, ""

    const-string v7, "javascript"

    .line 12
    invoke-interface/range {v3 .. v11}, Lcom/google/android/gms/internal/ads/zzebs;->zza(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzebu;Lcom/google/android/gms/internal/ads/zzebt;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfgo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zze:Lcom/google/android/gms/internal/ads/zzfgo;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    if-eqz v0, :cond_5

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zze:Lcom/google/android/gms/internal/ads/zzfgo;

    check-cast v2, Landroid/view/View;

    invoke-interface {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzebs;->zzc(Lcom/google/android/gms/internal/ads/zzfgo;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zze:Lcom/google/android/gms/internal/ads/zzfgo;

    .line 14
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzcfb;->zzap(Lcom/google/android/gms/internal/ads/zzfgo;)V

    .line 15
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zze:Lcom/google/android/gms/internal/ads/zzfgo;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzebs;->zzd(Lcom/google/android/gms/internal/ads/zzfgo;)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzf:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    .line 16
    new-instance v1, Landroidx/collection/ArrayMap;

    invoke-direct {v1}, Landroidx/collection/ArrayMap;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzd(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized zzl()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzf:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcqs;->zza()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzU:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zze:Lcom/google/android/gms/internal/ads/zzfgo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    if-eqz v0, :cond_1

    .line 2
    new-instance v1, Landroidx/collection/ArrayMap;

    invoke-direct {v1}, Landroidx/collection/ArrayMap;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzd(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzn()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcqs;->zzf:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcqs;->zza()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
