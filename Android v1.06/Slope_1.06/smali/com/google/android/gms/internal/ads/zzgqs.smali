.class final Lcom/google/android/gms/internal/ads/zzgqs;
.super Lcom/google/android/gms/internal/ads/zzgng;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzgqw;

.field zzb:Lcom/google/android/gms/internal/ads/zzgni;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzgqy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgqy;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zzc:Lcom/google/android/gms/internal/ads/zzgqy;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgng;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgqw;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzgqw;-><init>(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgqv;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zza:Lcom/google/android/gms/internal/ads/zzgqw;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgqs;->zzb()Lcom/google/android/gms/internal/ads/zzgni;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zzb:Lcom/google/android/gms/internal/ads/zzgni;

    return-void
.end method

.method private final zzb()Lcom/google/android/gms/internal/ads/zzgni;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zza:Lcom/google/android/gms/internal/ads/zzgqw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgqw;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgqw;->zza()Lcom/google/android/gms/internal/ads/zzgnj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgno;->zzs()Lcom/google/android/gms/internal/ads/zzgni;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zzb:Lcom/google/android/gms/internal/ads/zzgni;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zzb:Lcom/google/android/gms/internal/ads/zzgni;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgni;->zza()B

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zzb:Lcom/google/android/gms/internal/ads/zzgni;

    .line 3
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzgni;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgqs;->zzb()Lcom/google/android/gms/internal/ads/zzgni;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzgqs;->zzb:Lcom/google/android/gms/internal/ads/zzgni;

    :cond_0
    return v0

    .line 1
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
