.class public final synthetic Lcom/google/android/gms/internal/ads/zzgbe;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgcy;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/ads/zzgbe;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbe;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgbe;->zza:Lcom/google/android/gms/internal/ads/zzgbe;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgen;Lcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzfxb;
    .locals 6

    sget v0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzgel;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgel;->zzg()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

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
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgiv;->zze(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzgiv;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgiv;->zza()I

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgax;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzgax;-><init>(Lcom/google/android/gms/internal/ads/zzgaw;)V

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgiv;->zzf()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgno;->zzd()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzgax;->zza(I)Lcom/google/android/gms/internal/ads/zzgax;

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgel;->zzc()Lcom/google/android/gms/internal/ads/zzgla;

    move-result-object v3

    .line 7
    sget-object v4, Lcom/google/android/gms/internal/ads/zzgla;->zza:Lcom/google/android/gms/internal/ads/zzgla;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgla;->ordinal()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    const/4 v5, 0x4

    if-ne v4, v5, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 17
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

    .line 15
    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/ads/zzgay;->zzc:Lcom/google/android/gms/internal/ads/zzgay;

    goto :goto_1

    .line 18
    :cond_2
    :goto_0
    sget-object v3, Lcom/google/android/gms/internal/ads/zzgay;->zzb:Lcom/google/android/gms/internal/ads/zzgay;

    goto :goto_1

    .line 7
    :cond_3
    sget-object v3, Lcom/google/android/gms/internal/ads/zzgay;->zza:Lcom/google/android/gms/internal/ads/zzgay;

    .line 8
    :goto_1
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzgax;->zzb(Lcom/google/android/gms/internal/ads/zzgay;)Lcom/google/android/gms/internal/ads/zzgax;

    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgax;->zzc()Lcom/google/android/gms/internal/ads/zzgba;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ads/zzgaq;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/zzgaq;-><init>(Lcom/google/android/gms/internal/ads/zzgap;)V

    .line 10
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzgaq;->zzc(Lcom/google/android/gms/internal/ads/zzgba;)Lcom/google/android/gms/internal/ads/zzgaq;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgiv;->zzf()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgno;->zzA()[B

    move-result-object v0

    .line 12
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/zzgmv;->zzb([BLcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzgmv;

    move-result-object p2

    .line 13
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/ads/zzgaq;->zzb(Lcom/google/android/gms/internal/ads/zzgmv;)Lcom/google/android/gms/internal/ads/zzgaq;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgel;->zzf()Ljava/lang/Integer;

    move-result-object p1

    .line 14
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzgaq;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzgaq;

    .line 15
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgaq;->zzd()Lcom/google/android/gms/internal/ads/zzgas;

    move-result-object p1

    return-object p1

    .line 18
    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Only version 0 keys are accepted"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzgpi; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Parsing AesGcmSivKey failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong type URL in call to AesGcmSivParameters.parseParameters"

    .line 2
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
