.class final Lcom/google/android/gms/internal/ads/zzftc;
.super Lcom/google/android/gms/internal/ads/zzfrr;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzftd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzftd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzftc;->zza:Lcom/google/android/gms/internal/ads/zzftd;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfrr;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftc;->zza:Lcom/google/android/gms/internal/ads/zzftd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzftd;->zzs(Lcom/google/android/gms/internal/ads/zzftd;)I

    move-result v0

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzfoz;->zza(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftc;->zza:Lcom/google/android/gms/internal/ads/zzftd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzftd;->zzt(Lcom/google/android/gms/internal/ads/zzftd;)[Ljava/lang/Object;

    move-result-object v1

    add-int/2addr p1, p1

    .line 2
    aget-object v1, v1, p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzftd;->zzt(Lcom/google/android/gms/internal/ads/zzftd;)[Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    .line 3
    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 4
    invoke-direct {v0, v1, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftc;->zza:Lcom/google/android/gms/internal/ads/zzftd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzftd;->zzs(Lcom/google/android/gms/internal/ads/zzftd;)I

    move-result v0

    return v0
.end method

.method public final zzf()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
