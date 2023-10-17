.class public final synthetic Lcom/google/android/gms/internal/ads/zzfah;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbii;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdcw;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfgj;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzebc;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdcw;Lcom/google/android/gms/internal/ads/zzfgj;Lcom/google/android/gms/internal/ads/zzebc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfah;->zza:Lcom/google/android/gms/internal/ads/zzdcw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfah;->zzb:Lcom/google/android/gms/internal/ads/zzfgj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfah;->zzc:Lcom/google/android/gms/internal/ads/zzebc;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfah;->zza:Lcom/google/android/gms/internal/ads/zzdcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfah;->zzb:Lcom/google/android/gms/internal/ads/zzfgj;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfah;->zzc:Lcom/google/android/gms/internal/ads/zzebc;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcfb;

    .line 1
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/zzbih;->zzc(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzdcw;)V

    const-string v0, "u"

    .line 2
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p1, "URL missing from click GMSG."

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzbih;->zza(Lcom/google/android/gms/internal/ads/zzcfb;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfai;

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzfai;-><init>(Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzfgj;Lcom/google/android/gms/internal/ads/zzebc;)V

    .line 5
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzq(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V

    return-void
.end method
