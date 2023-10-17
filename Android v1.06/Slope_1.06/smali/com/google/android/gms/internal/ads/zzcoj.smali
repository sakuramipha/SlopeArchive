.class public final Lcom/google/android/gms/internal/ads/zzcoj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaty;


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzcfb;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcnv;

.field private final zzd:Lcom/google/android/gms/common/util/Clock;

.field private zze:Z

.field private zzf:Z

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcny;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcnv;Lcom/google/android/gms/common/util/Clock;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zze:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzf:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcny;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcny;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzg:Lcom/google/android/gms/internal/ads/zzcny;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzb:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzc:Lcom/google/android/gms/internal/ads/zzcnv;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzd:Lcom/google/android/gms/common/util/Clock;

    return-void
.end method

.method private final zzg()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzc:Lcom/google/android/gms/internal/ads/zzcnv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzg:Lcom/google/android/gms/internal/ads/zzcny;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcnv;->zza(Lcom/google/android/gms/internal/ads/zzcny;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zza:Lcom/google/android/gms/internal/ads/zzcfb;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzb:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcoi;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzcoi;-><init>(Lcom/google/android/gms/internal/ads/zzcoj;Lorg/json/JSONObject;)V

    .line 2
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call video active view js"

    .line 3
    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zze:Z

    return-void
.end method

.method public final zzb()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zze:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcoj;->zzg()V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzatx;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzg:Lcom/google/android/gms/internal/ads/zzcny;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzf:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/zzatx;->zzj:Z

    .line 1
    :goto_0
    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzcny;->zza:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzd:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzcny;->zzd:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzg:Lcom/google/android/gms/internal/ads/zzcny;

    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zzcny;->zzf:Lcom/google/android/gms/internal/ads/zzatx;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zze:Z

    if-eqz p1, :cond_1

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcoj;->zzg()V

    :cond_1
    return-void
.end method

.method final synthetic zzd(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zza:Lcom/google/android/gms/internal/ads/zzcfb;

    const-string v1, "AFMA_updateActiveView"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzl(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final zze(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zzf:Z

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzcfb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcoj;->zza:Lcom/google/android/gms/internal/ads/zzcfb;

    return-void
.end method
