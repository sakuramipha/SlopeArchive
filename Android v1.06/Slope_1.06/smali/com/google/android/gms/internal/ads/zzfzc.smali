.class public final synthetic Lcom/google/android/gms/internal/ads/zzfzc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgcy;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/ads/zzfzc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfzc;->zza:Lcom/google/android/gms/internal/ads/zzfzc;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgen;Lcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzfxb;
    .locals 10

    sget v0, Lcom/google/android/gms/internal/ads/zzfzd;->zza:I

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzgel;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgel;->zzg()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2
    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgel;->zze()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoi;->zza()Lcom/google/android/gms/internal/ads/zzgoi;

    move-result-object v1

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzghr;->zze(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzghr;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzghr;->zza()I

    move-result v1

    if-nez v1, :cond_9

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfyu;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzfyu;-><init>(Lcom/google/android/gms/internal/ads/zzfyt;)V

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzghr;->zzf()Lcom/google/android/gms/internal/ads/zzghx;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzghx;->zzh()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgno;->zzd()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfyu;->zza(I)Lcom/google/android/gms/internal/ads/zzfyu;

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzghr;->zzg()Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgjj;->zzh()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgno;->zzd()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfyu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfyu;

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzghr;->zzg()Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgjj;->zzg()Lcom/google/android/gms/internal/ads/zzgjp;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfyu;->zzd(I)Lcom/google/android/gms/internal/ads/zzfyu;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzghr;->zzg()Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgjj;->zzg()Lcom/google/android/gms/internal/ads/zzgjp;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgjp;->zzg()I

    move-result v3

    .line 10
    sget-object v4, Lcom/google/android/gms/internal/ads/zzgla;->zza:Lcom/google/android/gms/internal/ads/zzgla;

    add-int/lit8 v4, v3, -0x2

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-eq v4, v5, :cond_1

    const/4 v9, 0x5

    if-ne v4, v9, :cond_0

    .line 25
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyv;->zzb:Lcom/google/android/gms/internal/ads/zzfyv;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgjg;->zza(I)I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse HashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyv;->zze:Lcom/google/android/gms/internal/ads/zzfyv;

    goto :goto_0

    :cond_2
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyv;->zzc:Lcom/google/android/gms/internal/ads/zzfyv;

    goto :goto_0

    :cond_3
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyv;->zzd:Lcom/google/android/gms/internal/ads/zzfyv;

    goto :goto_0

    .line 10
    :cond_4
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyv;->zza:Lcom/google/android/gms/internal/ads/zzfyv;

    .line 9
    :goto_0
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfyu;->zzb(Lcom/google/android/gms/internal/ads/zzfyv;)Lcom/google/android/gms/internal/ads/zzfyu;

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgel;->zzc()Lcom/google/android/gms/internal/ads/zzgla;

    move-result-object v3

    .line 11
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgla;->ordinal()I

    move-result v4

    if-eq v4, v8, :cond_8

    if-eq v4, v7, :cond_7

    if-eq v4, v6, :cond_6

    if-ne v4, v5, :cond_5

    goto :goto_1

    .line 23
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 24
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgla;->zza()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_6
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyw;->zzc:Lcom/google/android/gms/internal/ads/zzfyw;

    goto :goto_2

    :cond_7
    :goto_1
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyw;->zzb:Lcom/google/android/gms/internal/ads/zzfyw;

    goto :goto_2

    .line 11
    :cond_8
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfyw;->zza:Lcom/google/android/gms/internal/ads/zzfyw;

    .line 12
    :goto_2
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfyu;->zze(Lcom/google/android/gms/internal/ads/zzfyw;)Lcom/google/android/gms/internal/ads/zzfyu;

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfyu;->zzf()Lcom/google/android/gms/internal/ads/zzfyy;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfyn;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/zzfyn;-><init>(Lcom/google/android/gms/internal/ads/zzfym;)V

    .line 14
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzfyn;->zzd(Lcom/google/android/gms/internal/ads/zzfyy;)Lcom/google/android/gms/internal/ads/zzfyn;

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzghr;->zzf()Lcom/google/android/gms/internal/ads/zzghx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzghx;->zzh()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgno;->zzA()[B

    move-result-object v1

    .line 16
    invoke-static {v1, p2}, Lcom/google/android/gms/internal/ads/zzgmv;->zzb([BLcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzgmv;

    move-result-object v1

    .line 17
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzfyn;->zza(Lcom/google/android/gms/internal/ads/zzgmv;)Lcom/google/android/gms/internal/ads/zzfyn;

    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzghr;->zzg()Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgjj;->zzh()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgno;->zzA()[B

    move-result-object v0

    .line 19
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/zzgmv;->zzb([BLcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzgmv;

    move-result-object p2

    .line 20
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/ads/zzfyn;->zzb(Lcom/google/android/gms/internal/ads/zzgmv;)Lcom/google/android/gms/internal/ads/zzfyn;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgel;->zzf()Ljava/lang/Integer;

    move-result-object p1

    .line 21
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzfyn;->zzc(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzfyn;

    .line 22
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfyn;->zze()Lcom/google/android/gms/internal/ads/zzfyp;

    move-result-object p1

    return-object p1

    .line 26
    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Only version 0 keys are accepted"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzgpi; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Parsing AesCtrHmacAeadKey failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey"

    .line 2
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
