.class public final Lcom/google/android/gms/internal/ads/zzayb;
.super Lcom/google/android/gms/internal/ads/zzgow;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqh;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzayb;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Lcom/google/android/gms/internal/ads/zzgpf;

.field private zzg:I

.field private zzh:I

.field private zzi:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzayb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzayb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayb;->zzb:Lcom/google/android/gms/internal/ads/zzayb;

    const-class v1, Lcom/google/android/gms/internal/ads/zzayb;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgow;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzayb;->zze:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzayb;->zzaN()Lcom/google/android/gms/internal/ads/zzgpf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzayb;->zzf:Lcom/google/android/gms/internal/ads/zzgpf;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzayb;->zzg:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzayb;->zzh:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzayb;->zzi:I

    return-void
.end method

.method static synthetic zza()Lcom/google/android/gms/internal/ads/zzayb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzayb;->zzb:Lcom/google/android/gms/internal/ads/zzayb;

    return-object v0
.end method

.method public static zzc()Lcom/google/android/gms/internal/ads/zzayb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzayb;->zzb:Lcom/google/android/gms/internal/ads/zzayb;

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzayb;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzayb;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzayb;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzayb;->zze:Ljava/lang/String;

    return-void
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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzayb;->zzb:Lcom/google/android/gms/internal/ads/zzayb;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaya;

    .line 3
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzaya;-><init>(Lcom/google/android/gms/internal/ads/zzaxe;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzayb;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzayb;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    .line 2
    const-class p2, Lcom/google/android/gms/internal/ads/zzaxx;

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const/16 p2, 0x9

    const/4 v0, 0x7

    sget-object v1, Lcom/google/android/gms/internal/ads/zzayk;->zza:Lcom/google/android/gms/internal/ads/zzgpa;

    aput-object v1, p1, p3

    const/4 p3, 0x6

    const-string v2, "zzh"

    aput-object v2, p1, p3

    aput-object v1, p1, v0

    const/16 p3, 0x8

    const-string v0, "zzi"

    aput-object v0, p1, p3

    aput-object v1, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzayb;->zzb:Lcom/google/android/gms/internal/ads/zzayb;

    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u100c\u0001\u0004\u100c\u0002\u0005\u100c\u0003"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzayb;->zzaR(Lcom/google/android/gms/internal/ads/zzgqg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
