.class public final Lcom/google/android/gms/internal/ads/zzgga;
.super Lcom/google/android/gms/internal/ads/zzgdh;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgee;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgfx;->zza:Lcom/google/android/gms/internal/ads/zzgfx;

    const-class v1, Lcom/google/android/gms/internal/ads/zzgfw;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgfp;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgee;->zzb(Lcom/google/android/gms/internal/ads/zzgec;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgee;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgga;->zza:Lcom/google/android/gms/internal/ads/zzgee;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/zzgef;

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgfy;

    const-class v2, Lcom/google/android/gms/internal/ads/zzfxs;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzgfy;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/ads/zzgjj;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/zzgdh;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/ads/zzgef;)V

    return-void
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzgjp;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgga;->zzo(Lcom/google/android/gms/internal/ads/zzgjp;)V

    return-void
.end method

.method public static zzh(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    new-instance p0, Lcom/google/android/gms/internal/ads/zzgga;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgga;-><init>()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzfyd;->zze(Lcom/google/android/gms/internal/ads/zzgdh;Z)V

    .line 2
    sget p0, Lcom/google/android/gms/internal/ads/zzggl;->zza:I

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgds;->zzb()Lcom/google/android/gms/internal/ads/zzgds;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzggl;->zza(Lcom/google/android/gms/internal/ads/zzgds;)V

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgdr;->zza()Lcom/google/android/gms/internal/ads/zzgdr;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgga;->zza:Lcom/google/android/gms/internal/ads/zzgee;

    .line 5
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzgdr;->zze(Lcom/google/android/gms/internal/ads/zzgee;)V

    return-void
.end method

.method public static final zzm(Lcom/google/android/gms/internal/ads/zzgjj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjj;->zza()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgms;->zzb(II)V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjj;->zzh()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgno;->zzd()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjj;->zzg()Lcom/google/android/gms/internal/ads/zzgjp;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgga;->zzo(Lcom/google/android/gms/internal/ads/zzgjp;)V

    return-void

    .line 3
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static bridge synthetic zzn(IIII)Lcom/google/android/gms/internal/ads/zzgdf;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgdf;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgjm;->zzc()Lcom/google/android/gms/internal/ads/zzgjl;

    move-result-object v1

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgjp;->zzc()Lcom/google/android/gms/internal/ads/zzgjo;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzgjo;->zzb(I)Lcom/google/android/gms/internal/ads/zzgjo;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzgjo;->zza(I)Lcom/google/android/gms/internal/ads/zzgjo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgjp;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(Lcom/google/android/gms/internal/ads/zzgjp;)Lcom/google/android/gms/internal/ads/zzgjl;

    .line 3
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzgjl;->zza(I)Lcom/google/android/gms/internal/ads/zzgjl;

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzgjm;

    invoke-direct {v0, p0, p3}, Lcom/google/android/gms/internal/ads/zzgdf;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static zzo(Lcom/google/android/gms/internal/ads/zzgjp;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjp;->zzg()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 14
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 4
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_3

    goto :goto_0

    .line 5
    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 8
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    .line 9
    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_7

    goto :goto_0

    .line 7
    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 12
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgjp;->zza()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    .line 13
    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2
    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzgdg;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/ads/zzgjm;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgfz;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzgfz;-><init>(Lcom/google/android/gms/internal/ads/zzgga;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzgjt;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgjt;->zzb:Lcom/google/android/gms/internal/ads/zzgjt;

    return-object v0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzgno;)Lcom/google/android/gms/internal/ads/zzgqg;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgpi;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoi;->zza()Lcom/google/android/gms/internal/ads/zzgoi;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzgjj;->zzf(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object p1

    return-object p1
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public final bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzgqg;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgjj;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgga;->zzm(Lcom/google/android/gms/internal/ads/zzgjj;)V

    return-void
.end method

.method public final zzf()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
