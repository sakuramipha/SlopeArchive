.class public final Lcom/google/android/gms/internal/ads/zzfaj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzezf;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzezi;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzebc;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfgj;

.field private final zze:Lcom/google/android/gms/internal/ads/zzffq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzebc;Lcom/google/android/gms/internal/ads/zzfgj;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;Lcom/google/android/gms/internal/ads/zzffq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zza:Lcom/google/android/gms/internal/ads/zzezf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zzc:Lcom/google/android/gms/internal/ads/zzebc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zzd:Lcom/google/android/gms/internal/ads/zzfgj;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zze:Lcom/google/android/gms/internal/ads/zzffq;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x2

    .line 2
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzfaj;->zzb(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final zzb(Ljava/lang/String;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zza:Lcom/google/android/gms/internal/ads/zzezf;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzaj:Z

    if-nez v0, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zzd:Lcom/google/android/gms/internal/ads/zzfgj;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zze:Lcom/google/android/gms/internal/ads/zzffq;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzfgj;->zzc(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzffq;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzebe;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzezi;->zzb:Ljava/lang/String;

    move-object v1, v0

    move-object v5, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzebe;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfaj;->zzc:Lcom/google/android/gms/internal/ads/zzebc;

    .line 3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzebc;->zzd(Lcom/google/android/gms/internal/ads/zzebe;)V

    return-void
.end method

.method public final zzc(Ljava/util/List;I)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/ads/zzfaj;->zzb(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
