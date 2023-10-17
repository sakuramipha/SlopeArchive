.class final Lcom/google/android/gms/internal/ads/zzfsw;
.super Lcom/google/android/gms/internal/ads/zzfpt;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final transient zza:Lcom/google/android/gms/internal/ads/zzfpp;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzfpp;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfpt;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfsw;->zza:Lcom/google/android/gms/internal/ads/zzfpp;

    return-void
.end method


# virtual methods
.method protected final bridge synthetic zza()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsw;->zza:Lcom/google/android/gms/internal/ads/zzfpp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfpp;->zza()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method final zzj()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfqk;->zzk()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method final zzl()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfqk;->zzm()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
