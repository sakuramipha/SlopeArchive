.class public final Lcom/google/android/gms/internal/ads/zzfyn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzfyy;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private zzb:Lcom/google/android/gms/internal/ads/zzgmv;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private zzc:Lcom/google/android/gms/internal/ads/zzgmv;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private zzd:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzb:Lcom/google/android/gms/internal/ads/zzgmv;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzc:Lcom/google/android/gms/internal/ads/zzgmv;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfym;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzb:Lcom/google/android/gms/internal/ads/zzgmv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzc:Lcom/google/android/gms/internal/ads/zzgmv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgmv;)Lcom/google/android/gms/internal/ads/zzfyn;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzb:Lcom/google/android/gms/internal/ads/zzgmv;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzgmv;)Lcom/google/android/gms/internal/ads/zzfyn;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzc:Lcom/google/android/gms/internal/ads/zzgmv;

    return-object p0
.end method

.method public final zzc(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzfyn;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzfyy;)Lcom/google/android/gms/internal/ads/zzfyn;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzfyp;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzb:Lcom/google/android/gms/internal/ads/zzgmv;

    if-eqz v1, :cond_9

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzc:Lcom/google/android/gms/internal/ads/zzgmv;

    if-eqz v2, :cond_9

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zza()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgmv;->zza()I

    move-result v1

    if-ne v2, v1, :cond_8

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zzc()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzc:Lcom/google/android/gms/internal/ads/zzgmv;

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgmv;->zza()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zze()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zze()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    .line 15
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zzd()Lcom/google/android/gms/internal/ads/zzfyw;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfyw;->zzc:Lcom/google/android/gms/internal/ads/zzfyw;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_4

    new-array v0, v2, [B

    .line 9
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgmu;->zzb([B)Lcom/google/android/gms/internal/ads/zzgmu;

    move-result-object v0

    :goto_2
    move-object v5, v0

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zzd()Lcom/google/android/gms/internal/ads/zzfyw;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfyw;->zzb:Lcom/google/android/gms/internal/ads/zzfyw;

    const/4 v3, 0x5

    if-ne v0, v1, :cond_5

    .line 11
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgmu;->zzb([B)Lcom/google/android/gms/internal/ads/zzgmu;

    move-result-object v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zzd()Lcom/google/android/gms/internal/ads/zzfyw;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfyw;->zza:Lcom/google/android/gms/internal/ads/zzfyw;

    if-ne v0, v1, :cond_6

    .line 13
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgmu;->zzb([B)Lcom/google/android/gms/internal/ads/zzgmu;

    move-result-object v0

    goto :goto_2

    .line 9
    :goto_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfyp;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzb:Lcom/google/android/gms/internal/ads/zzgmv;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzc:Lcom/google/android/gms/internal/ads/zzgmv;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zzd:Ljava/lang/Integer;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzfyp;-><init>(Lcom/google/android/gms/internal/ads/zzfyy;Lcom/google/android/gms/internal/ads/zzgmv;Lcom/google/android/gms/internal/ads/zzgmv;Lcom/google/android/gms/internal/ads/zzgmu;Ljava/lang/Integer;Lcom/google/android/gms/internal/ads/zzfyo;)V

    return-object v0

    .line 12
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfyn;->zza:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfyy;->zzd()Lcom/google/android/gms/internal/ads/zzfyw;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unknown AesCtrHmacAeadParameters.Variant: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HMAC key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "AES key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
