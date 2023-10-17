.class public final Lcom/google/android/gms/internal/ads/zzdi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzdi;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzn;

.field private static final zzc:Ljava/lang/String;


# instance fields
.field private final zzd:Lcom/google/android/gms/internal/ads/zzfrr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdi;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzdi;-><init>(Ljava/util/List;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdi;->zza:Lcom/google/android/gms/internal/ads/zzdi;

    const/4 v0, 0x0

    const/16 v1, 0x24

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdi;->zzc:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdf;->zza:Lcom/google/android/gms/internal/ads/zzdf;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdi;->zzb:Lcom/google/android/gms/internal/ads/zzn;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfrr;->zzj(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdi;->zzd:Lcom/google/android/gms/internal/ads/zzfrr;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdi;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdi;->zzd:Lcom/google/android/gms/internal/ads/zzfrr;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdi;->zzd:Lcom/google/android/gms/internal/ads/zzfrr;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfrr;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdi;->zzd:Lcom/google/android/gms/internal/ads/zzfrr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfrr;->hashCode()I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/ads/zzfrr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdi;->zzd:Lcom/google/android/gms/internal/ads/zzfrr;

    return-object v0
.end method

.method public final zzb(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdi;->zzd:Lcom/google/android/gms/internal/ads/zzfrr;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfrr;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdi;->zzd:Lcom/google/android/gms/internal/ads/zzfrr;

    .line 2
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzfrr;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzdh;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdh;->zzc()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdh;->zza()I

    move-result v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method
