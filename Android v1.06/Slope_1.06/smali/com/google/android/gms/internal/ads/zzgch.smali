.class public final synthetic Lcom/google/android/gms/internal/ads/zzgch;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgcy;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/ads/zzgch;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgch;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgch;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgch;->zza:Lcom/google/android/gms/internal/ads/zzgch;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgen;Lcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzfxb;
    .locals 4

    sget v0, Lcom/google/android/gms/internal/ads/zzgci;->zza:I

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzgel;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgel;->zzg()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

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
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzglg;->zze(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzglg;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzglg;->zza()I

    move-result v1

    if-nez v1, :cond_4

    .line 6
    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgel;->zzc()Lcom/google/android/gms/internal/ads/zzgla;

    move-result-object v1

    .line 7
    sget-object v2, Lcom/google/android/gms/internal/ads/zzgla;->zza:Lcom/google/android/gms/internal/ads/zzgla;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgla;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgla;->zza()I

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

    .line 10
    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzgcc;->zzc:Lcom/google/android/gms/internal/ads/zzgcc;

    goto :goto_1

    .line 13
    :cond_2
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzgcc;->zzb:Lcom/google/android/gms/internal/ads/zzgcc;

    goto :goto_1

    .line 7
    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/ads/zzgcc;->zza:Lcom/google/android/gms/internal/ads/zzgcc;

    .line 8
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzglg;->zzf()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgno;->zzA()[B

    move-result-object v0

    .line 9
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/zzgmv;->zzb([BLcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzgmv;

    move-result-object p2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgel;->zzf()Ljava/lang/Integer;

    move-result-object p1

    .line 10
    invoke-static {v1, p2, p1}, Lcom/google/android/gms/internal/ads/zzgby;->zza(Lcom/google/android/gms/internal/ads/zzgcc;Lcom/google/android/gms/internal/ads/zzgmv;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzgby;

    move-result-object p1

    return-object p1

    .line 6
    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Only version 0 keys are accepted"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzgpi; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Parsing XChaCha20Poly1305Key failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters"

    .line 2
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
