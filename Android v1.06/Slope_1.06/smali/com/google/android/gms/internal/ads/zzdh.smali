.class public final Lcom/google/android/gms/internal/ads/zzdh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzn;

.field private static final zzc:Ljava/lang/String;

.field private static final zzd:Ljava/lang/String;

.field private static final zze:Ljava/lang/String;

.field private static final zzf:Ljava/lang/String;


# instance fields
.field public final zzb:I

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcz;

.field private final zzh:[I

.field private final zzi:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x24

    .line 1
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdh;->zzc:Ljava/lang/String;

    const/4 v0, 0x1

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdh;->zzd:Ljava/lang/String;

    const/4 v0, 0x3

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdh;->zze:Ljava/lang/String;

    const/4 v0, 0x4

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdh;->zzf:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdg;->zza:Lcom/google/android/gms/internal/ads/zzdg;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdh;->zza:Lcom/google/android/gms/internal/ads/zzn;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcz;Z[I[Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzcz;->zzb:I

    const/4 p2, 0x1

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzg:Lcom/google/android/gms/internal/ads/zzcz;

    .line 2
    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzh:[I

    .line 3
    invoke-virtual {p4}, [Z->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzi:[Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdh;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzg:Lcom/google/android/gms/internal/ads/zzcz;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzdh;->zzg:Lcom/google/android/gms/internal/ads/zzcz;

    .line 2
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzcz;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzh:[I

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzdh;->zzh:[I

    .line 3
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzi:[Z

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdh;->zzi:[Z

    .line 4
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzg:Lcom/google/android/gms/internal/ads/zzcz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcz;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzh:[I

    .line 2
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    mul-int/lit16 v0, v0, 0x3c1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzi:[Z

    .line 3
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public final zza()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzg:Lcom/google/android/gms/internal/ads/zzcz;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzcz;->zzd:I

    return v0
.end method

.method public final zzb(I)Lcom/google/android/gms/internal/ads/zzam;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzg:Lcom/google/android/gms/internal/ads/zzcz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcz;->zzb(I)Lcom/google/android/gms/internal/ads/zzam;

    move-result-object p1

    return-object p1
.end method

.method public final zzc()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzi:[Z

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-boolean v5, v0, v3

    if-ne v5, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method public final zzd(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdh;->zzi:[Z

    aget-boolean p1, v0, p1

    return p1
.end method
