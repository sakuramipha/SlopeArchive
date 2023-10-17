.class final Lcom/google/android/gms/internal/ads/zzews;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfbm;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcup;

.field private final zzc:Ljava/util/concurrent/Executor;

.field private zzd:Lcom/google/android/gms/internal/ads/zzewr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfbm;Lcom/google/android/gms/internal/ads/zzcup;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzews;->zza:Lcom/google/android/gms/internal/ads/zzfbm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzews;->zzb:Lcom/google/android/gms/internal/ads/zzcup;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzews;->zzc:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzews;)Lcom/google/android/gms/internal/ads/zzewr;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzews;->zzd:Lcom/google/android/gms/internal/ads/zzewr;

    return-object p0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzews;)Lcom/google/android/gms/internal/ads/zzfbw;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzews;->zze()Lcom/google/android/gms/internal/ads/zzfbw;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzews;Lcom/google/android/gms/internal/ads/zzewr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzews;->zzd:Lcom/google/android/gms/internal/ads/zzewr;

    return-void
.end method

.method private final zze()Lcom/google/android/gms/internal/ads/zzfbw;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzews;->zzb:Lcom/google/android/gms/internal/ads/zzcup;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcup;->zzg()Lcom/google/android/gms/internal/ads/zzfaa;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzf:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzj:Lcom/google/android/gms/ads/internal/client/zzw;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzews;->zza:Lcom/google/android/gms/internal/ads/zzfbm;

    .line 2
    invoke-interface {v3, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzfbm;->zzc(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzw;)Lcom/google/android/gms/internal/ads/zzfbw;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final zzc()Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzews;->zzd:Lcom/google/android/gms/internal/ads/zzewr;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzewr;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzews;->zze()Lcom/google/android/gms/internal/ads/zzfbw;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/google/android/gms/internal/ads/zzewr;-><init>(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfbw;Lcom/google/android/gms/internal/ads/zzewq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzews;->zzd:Lcom/google/android/gms/internal/ads/zzewr;

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzews;->zzb:Lcom/google/android/gms/internal/ads/zzcup;

    .line 4
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcup;->zzb()Lcom/google/android/gms/internal/ads/zzcsm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzews;->zza:Lcom/google/android/gms/internal/ads/zzfbm;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzfbm;->zza()Lcom/google/android/gms/internal/ads/zzfbt;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcsm;->zze(Lcom/google/android/gms/internal/ads/zzfbt;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvi;->zzv(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfvi;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzewp;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzewp;-><init>(Lcom/google/android/gms/internal/ads/zzews;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzews;->zzc:Ljava/util/concurrent/Executor;

    .line 6
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzewo;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzewo;-><init>(Lcom/google/android/gms/internal/ads/zzews;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzews;->zzc:Ljava/util/concurrent/Executor;

    const-class v3, Lcom/google/android/gms/internal/ads/zzdwc;

    .line 7
    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzfvr;->zze(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    .line 3
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzewn;->zza:Lcom/google/android/gms/internal/ads/zzewn;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzews;->zzc:Ljava/util/concurrent/Executor;

    .line 8
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0

    .line 9
    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0
.end method
