.class public final Lcom/google/android/gms/internal/ads/zzffw;
.super Lcom/google/android/gms/internal/ads/zzgow;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqh;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgpc;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzffw;


# instance fields
.field private zzA:I

.field private zzB:J

.field private zzC:I

.field private zzD:Ljava/lang/String;

.field private zzE:Ljava/lang/String;

.field private zzF:Ljava/lang/String;

.field private zzG:Ljava/lang/String;

.field private zzH:Ljava/lang/String;

.field private zzI:Ljava/lang/String;

.field private zzJ:Ljava/lang/String;

.field private zzK:Ljava/lang/String;

.field private zzL:Ljava/lang/String;

.field private zzM:Ljava/lang/String;

.field private zzN:Ljava/lang/String;

.field private zzO:J

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:J

.field private zzh:J

.field private zzi:J

.field private zzj:Lcom/google/android/gms/internal/ads/zzgpb;

.field private zzk:Z

.field private zzl:J

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:I

.field private zzq:Ljava/lang/String;

.field private zzr:Ljava/lang/String;

.field private zzs:Ljava/lang/String;

.field private zzt:Ljava/lang/String;

.field private zzu:Ljava/lang/String;

.field private zzv:I

.field private zzw:Ljava/lang/String;

.field private zzx:Ljava/lang/String;

.field private zzy:Lcom/google/android/gms/internal/ads/zzgpe;

.field private zzz:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzffu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzffu;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzffw;->zzb:Lcom/google/android/gms/internal/ads/zzgpc;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzffw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzffw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzffw;->zzd:Lcom/google/android/gms/internal/ads/zzffw;

    const-class v1, Lcom/google/android/gms/internal/ads/zzffw;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgow;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzf:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzffw;->zzaJ()Lcom/google/android/gms/internal/ads/zzgpb;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzj:Lcom/google/android/gms/internal/ads/zzgpb;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzq:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzr:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzs:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzt:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzu:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzw:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzx:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzffw;->zzaL()Lcom/google/android/gms/internal/ads/zzgpe;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzy:Lcom/google/android/gms/internal/ads/zzgpe;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzD:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzE:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzF:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzG:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzH:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzI:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzJ:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzK:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzL:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzM:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzN:Ljava/lang/String;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzffv;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzffw;->zzd:Lcom/google/android/gms/internal/ads/zzffw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaA()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzffv;

    return-object v0
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/ads/zzffw;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzffw;->zzd:Lcom/google/android/gms/internal/ads/zzffw;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzN:Ljava/lang/String;

    return-void
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/ads/zzffw;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzk:Z

    return-void
.end method

.method static synthetic zzf(Lcom/google/android/gms/internal/ads/zzffw;J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzl:J

    return-void
.end method

.method static synthetic zzg(Lcom/google/android/gms/internal/ads/zzffw;J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzm:J

    return-void
.end method

.method static synthetic zzh(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzq:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzi(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzt:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzu:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzk(Lcom/google/android/gms/internal/ads/zzffw;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzv:I

    return-void
.end method

.method static synthetic zzl(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzy:Lcom/google/android/gms/internal/ads/zzgpe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgpe;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaM(Lcom/google/android/gms/internal/ads/zzgpe;)Lcom/google/android/gms/internal/ads/zzgpe;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzy:Lcom/google/android/gms/internal/ads/zzgpe;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzy:Lcom/google/android/gms/internal/ads/zzgpe;

    .line 3
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgmx;->zzav(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic zzm(Lcom/google/android/gms/internal/ads/zzffw;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzA:I

    return-void
.end method

.method static synthetic zzn(Lcom/google/android/gms/internal/ads/zzffw;J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzB:J

    return-void
.end method

.method static synthetic zzo(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzD:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzp(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzE:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzq(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzI:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzr(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzJ:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzs(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzK:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzt(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzL:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzu(Lcom/google/android/gms/internal/ads/zzffw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzM:Ljava/lang/String;

    return-void
.end method

.method static synthetic zzv(Lcom/google/android/gms/internal/ads/zzffw;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zze:I

    return-void
.end method

.method static synthetic zzw(Lcom/google/android/gms/internal/ads/zzffw;I)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzp:I

    return-void
.end method

.method static synthetic zzx(Lcom/google/android/gms/internal/ads/zzffw;I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    add-int/lit8 p1, p1, -0x2

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzz:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static synthetic zzy(Lcom/google/android/gms/internal/ads/zzffw;I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    add-int/lit8 p1, p1, -0x2

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzffw;->zzC:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    .line 1
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzffw;->zzd:Lcom/google/android/gms/internal/ads/zzffw;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzffv;

    .line 3
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzffv;-><init>(Lcom/google/android/gms/internal/ads/zzffu;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzffw;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzffw;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x25

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzk"

    aput-object v3, p1, p2

    const-string p2, "zzl"

    aput-object p2, p1, v2

    const-string p2, "zzp"

    aput-object p2, p1, v1

    const-string p2, "zzq"

    aput-object p2, p1, v0

    const-string p2, "zzt"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzu"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzv"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzz"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzA"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzB"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzC"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzD"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzE"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzI"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzJ"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzK"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzL"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzM"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzN"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zzw"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zzx"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zzy"

    aput-object p3, p1, p2

    const/16 p2, 0x19

    const-string p3, "zzF"

    aput-object p3, p1, p2

    const/16 p2, 0x1a

    const-string p3, "zzG"

    aput-object p3, p1, p2

    const/16 p2, 0x1b

    const-string p3, "zzH"

    aput-object p3, p1, p2

    const/16 p2, 0x1c

    const-string p3, "zzO"

    aput-object p3, p1, p2

    const/16 p2, 0x1d

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const/16 p2, 0x1e

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const/16 p2, 0x1f

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/16 p2, 0x20

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/16 p2, 0x21

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x22

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0x23

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0x24

    const-string p3, "zzj"

    aput-object p3, p1, p2

    .line 2
    sget-object p2, Lcom/google/android/gms/internal/ads/zzffw;->zzd:Lcom/google/android/gms/internal/ads/zzffw;

    const-string p3, "\u0000%\u0000\u0000\u0001%%\u0000\u0002\u0000\u0001\u000c\u0002\u0007\u0003\u0002\u0004\u000c\u0005\u0208\u0006\u0208\u0007\u0208\u0008\u0004\t\u000c\n\u0004\u000b\u0002\u000c\u000c\r\u0208\u000e\u0208\u000f\u0208\u0010\u0208\u0011\u0208\u0012\u0208\u0013\u0208\u0014\u0208\u0015\u0208\u0016\u0208\u0017\u0208\u0018\u0208\u0019%\u001a\u0208\u001b\u0208\u001c\u0208\u001d\u0002\u001e\u0208\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzffw;->zzaR(Lcom/google/android/gms/internal/ads/zzgqg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
