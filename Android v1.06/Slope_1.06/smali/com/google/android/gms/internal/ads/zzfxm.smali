.class public final Lcom/google/android/gms/internal/ads/zzfxm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Ljava/util/List;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzggx;

.field private zzc:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zza:Ljava/util/List;

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzggx;->zza:Lcom/google/android/gms/internal/ads/zzggx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zzb:Lcom/google/android/gms/internal/ads/zzggx;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zzc:Z

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzfxm;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfxm;->zzd()V

    return-void
.end method

.method private final zzd()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zza:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfxk;

    const/4 v2, 0x0

    .line 2
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfxk;->zzj(Lcom/google/android/gms/internal/ads/zzfxk;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxm;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfxk;->zzg(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxm;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfxk;->zzk(Lcom/google/android/gms/internal/ads/zzfxk;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfxm;->zzd()V

    .line 4
    :cond_0
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzfxk;->zzi(Lcom/google/android/gms/internal/ads/zzfxk;Lcom/google/android/gms/internal/ads/zzfxm;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zza:Ljava/util/List;

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 1
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Entry has already been added to a KeysetHandle.Builder"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfxp;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zzc:Z

    if-nez v0, :cond_10

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zzc:Z

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgkh;->zzd()Lcom/google/android/gms/internal/ads/zzgke;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zza:Ljava/util/List;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 3
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ge v4, v5, :cond_2

    .line 4
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzfxk;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzfxk;->zzf(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxl;->zza()Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v6

    if-ne v5, v6, :cond_1

    add-int/lit8 v5, v4, 0x1

    .line 5
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzfxk;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzfxk;->zzf(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxl;->zza()Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v6

    if-ne v5, v6, :cond_0

    goto :goto_1

    .line 40
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 5
    :cond_2
    new-instance v2, Ljava/util/HashSet;

    .line 6
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zza:Ljava/util/List;

    .line 7
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zzfxk;

    .line 8
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zzb(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxg;

    .line 9
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zzf(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v7

    if-eqz v7, :cond_d

    .line 10
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zzf(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxl;->zza()Lcom/google/android/gms/internal/ads/zzfxl;

    move-result-object v8

    const/4 v9, 0x3

    const/4 v10, 0x4

    if-ne v7, v8, :cond_6

    const/4 v7, 0x0

    :goto_3
    if-eqz v7, :cond_4

    .line 11
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 12
    :cond_4
    new-instance v7, Ljava/security/SecureRandom;

    .line 13
    invoke-direct {v7}, Ljava/security/SecureRandom;-><init>()V

    new-array v8, v10, [B

    const/4 v11, 0x0

    :goto_4
    if-nez v11, :cond_5

    .line 14
    invoke-virtual {v7, v8}, Ljava/security/SecureRandom;->nextBytes([B)V

    aget-byte v11, v8, v3

    and-int/lit8 v11, v11, 0x7f

    aget-byte v12, v8, v0

    and-int/lit16 v12, v12, 0xff

    const/4 v13, 0x2

    aget-byte v13, v8, v13

    and-int/lit16 v13, v13, 0xff

    aget-byte v14, v8, v9

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v11, v11, 0x18

    shl-int/lit8 v12, v12, 0x10

    or-int/2addr v11, v12

    shl-int/lit8 v12, v13, 0x8

    or-int/2addr v11, v12

    or-int/2addr v11, v14

    goto :goto_4

    :cond_5
    move v7, v11

    goto :goto_3

    .line 15
    :cond_6
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zzf(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxl;

    const/4 v7, 0x0

    .line 16
    :cond_7
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 17
    invoke-interface {v2, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zza(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxb;

    .line 19
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zzh(Lcom/google/android/gms/internal/ads/zzfxk;)Lcom/google/android/gms/internal/ads/zzfxt;

    move-result-object v11

    .line 20
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zzc()Lcom/google/android/gms/internal/ads/zzfxg;

    move-result-object v12

    sget-object v13, Lcom/google/android/gms/internal/ads/zzfxg;->zza:Lcom/google/android/gms/internal/ads/zzfxg;

    .line 21
    invoke-virtual {v13, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_5

    .line 32
    :cond_8
    sget-object v9, Lcom/google/android/gms/internal/ads/zzfxg;->zzb:Lcom/google/android/gms/internal/ads/zzfxg;

    .line 22
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/4 v9, 0x4

    goto :goto_5

    :cond_9
    sget-object v9, Lcom/google/android/gms/internal/ads/zzfxg;->zzc:Lcom/google/android/gms/internal/ads/zzfxg;

    .line 23
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/4 v9, 0x5

    .line 19
    :goto_5
    check-cast v11, Lcom/google/android/gms/internal/ads/zzgdk;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzgdk;->zza()Lcom/google/android/gms/internal/ads/zzgem;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzgem;->zzb()Lcom/google/android/gms/internal/ads/zzgjz;

    move-result-object v11

    .line 24
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzfyd;->zza(Lcom/google/android/gms/internal/ads/zzgjz;)Lcom/google/android/gms/internal/ads/zzgju;

    move-result-object v11

    .line 25
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgkg;->zzd()Lcom/google/android/gms/internal/ads/zzgkf;

    move-result-object v12

    .line 26
    invoke-virtual {v12, v7}, Lcom/google/android/gms/internal/ads/zzgkf;->zzb(I)Lcom/google/android/gms/internal/ads/zzgkf;

    .line 27
    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/zzgkf;->zzd(I)Lcom/google/android/gms/internal/ads/zzgkf;

    .line 28
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzgkf;->zza(Lcom/google/android/gms/internal/ads/zzgju;)Lcom/google/android/gms/internal/ads/zzgkf;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzgem;->zzb()Lcom/google/android/gms/internal/ads/zzgjz;

    move-result-object v7

    .line 29
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzgjz;->zze()Lcom/google/android/gms/internal/ads/zzgla;

    move-result-object v7

    invoke-virtual {v12, v7}, Lcom/google/android/gms/internal/ads/zzgkf;->zzc(Lcom/google/android/gms/internal/ads/zzgla;)Lcom/google/android/gms/internal/ads/zzgkf;

    .line 30
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/ads/zzgkg;

    .line 31
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzgke;->zza(Lcom/google/android/gms/internal/ads/zzgkg;)Lcom/google/android/gms/internal/ads/zzgke;

    .line 32
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfxk;->zzk(Lcom/google/android/gms/internal/ads/zzfxk;)Z

    move-result v6

    if-eqz v6, :cond_3

    if-nez v5, :cond_a

    move-object v5, v8

    goto/16 :goto_2

    .line 35
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Two primaries were set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown key status"

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is used twice in the keyset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "No ID was set (with withFixedId or withRandomId)"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    if-eqz v5, :cond_f

    .line 38
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzgke;->zzb(I)Lcom/google/android/gms/internal/ads/zzgke;

    .line 39
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzgkh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfxm;->zzb:Lcom/google/android/gms/internal/ads/zzggx;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfxp;->zzb(Lcom/google/android/gms/internal/ads/zzgkh;Lcom/google/android/gms/internal/ads/zzggx;)Lcom/google/android/gms/internal/ads/zzfxp;

    move-result-object v0

    return-object v0

    .line 37
    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "No primary was set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1
    :cond_10
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "KeysetHandle.Builder#build must only be called once"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
