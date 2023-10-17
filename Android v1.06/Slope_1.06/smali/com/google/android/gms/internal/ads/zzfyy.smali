.class public final Lcom/google/android/gms/internal/ads/zzfyy;
.super Lcom/google/android/gms/internal/ads/zzfyi;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:I

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfyw;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfyv;


# direct methods
.method synthetic constructor <init>(IIILcom/google/android/gms/internal/ads/zzfyw;Lcom/google/android/gms/internal/ads/zzfyv;Lcom/google/android/gms/internal/ads/zzfyx;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfyi;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzc:I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zze:Lcom/google/android/gms/internal/ads/zzfyv;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzfyy;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfyy;

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzfyy;->zza:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zza:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzfyy;->zzb:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzb:I

    if-ne v0, v2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfyy;->zzb()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfyy;->zzb()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfyy;->zze:Lcom/google/android/gms/internal/ads/zzfyv;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zze:Lcom/google/android/gms/internal/ads/zzfyv;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const-class v0, Lcom/google/android/gms/internal/ads/zzfyy;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zza:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzb:I

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzc:I

    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    const/4 v2, 0x4

    aput-object v0, v1, v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zze:Lcom/google/android/gms/internal/ads/zzfyv;

    const/4 v2, 0x5

    aput-object v0, v1, v2

    .line 4
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zze:Lcom/google/android/gms/internal/ads/zzfyv;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzc:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zza:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzb:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AesCtrHmacAead Parameters (variant: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hashType: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte tags, and "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte AES key, and "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte HMAC key)"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zza:I

    return v0
.end method

.method public final zzb()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfyw;->zzc:Lcom/google/android/gms/internal/ads/zzfyw;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzc:I

    add-int/lit8 v0, v0, 0x10

    return v0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfyw;->zza:Lcom/google/android/gms/internal/ads/zzfyw;

    if-eq v0, v1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfyw;->zzb:Lcom/google/android/gms/internal/ads/zzfyw;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzc:I

    add-int/lit8 v0, v0, 0x15

    return v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzb:I

    return v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzfyw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    return-object v0
.end method

.method public final zze()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyy;->zzd:Lcom/google/android/gms/internal/ads/zzfyw;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfyw;->zzc:Lcom/google/android/gms/internal/ads/zzfyw;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
