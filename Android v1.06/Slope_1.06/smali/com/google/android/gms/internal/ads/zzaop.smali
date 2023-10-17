.class public final Lcom/google/android/gms/internal/ads/zzaop;
.super Lcom/google/android/gms/internal/ads/zzgow;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqh;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzaop;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/ads/zzgno;

.field private zzf:Lcom/google/android/gms/internal/ads/zzgno;

.field private zzg:Lcom/google/android/gms/internal/ads/zzgno;

.field private zzh:Lcom/google/android/gms/internal/ads/zzgno;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaop;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaop;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaop;->zzb:Lcom/google/android/gms/internal/ads/zzaop;

    const-class v1, Lcom/google/android/gms/internal/ads/zzaop;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgow;-><init>()V

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgno;->zzb:Lcom/google/android/gms/internal/ads/zzgno;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zze:Lcom/google/android/gms/internal/ads/zzgno;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgno;->zzb:Lcom/google/android/gms/internal/ads/zzgno;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzf:Lcom/google/android/gms/internal/ads/zzgno;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzg:Lcom/google/android/gms/internal/ads/zzgno;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzh:Lcom/google/android/gms/internal/ads/zzgno;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzaoo;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzaop;->zzb:Lcom/google/android/gms/internal/ads/zzaop;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaA()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaoo;

    return-object v0
.end method

.method static synthetic zzc()Lcom/google/android/gms/internal/ads/zzaop;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaop;->zzb:Lcom/google/android/gms/internal/ads/zzaop;

    return-object v0
.end method

.method public static zzd([BLcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzaop;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgpi;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzaop;->zzb:Lcom/google/android/gms/internal/ads/zzaop;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgow;->zzaI(Lcom/google/android/gms/internal/ads/zzgow;[BLcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzaop;

    return-object p0
.end method

.method static synthetic zzi(Lcom/google/android/gms/internal/ads/zzaop;Lcom/google/android/gms/internal/ads/zzgno;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaop;->zze:Lcom/google/android/gms/internal/ads/zzgno;

    return-void
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/ads/zzaop;Lcom/google/android/gms/internal/ads/zzgno;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzf:Lcom/google/android/gms/internal/ads/zzgno;

    return-void
.end method

.method static synthetic zzk(Lcom/google/android/gms/internal/ads/zzaop;Lcom/google/android/gms/internal/ads/zzgno;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzg:Lcom/google/android/gms/internal/ads/zzgno;

    return-void
.end method

.method static synthetic zzl(Lcom/google/android/gms/internal/ads/zzaop;Lcom/google/android/gms/internal/ads/zzgno;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzh:Lcom/google/android/gms/internal/ads/zzgno;

    return-void
.end method


# virtual methods
.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaop;->zzb:Lcom/google/android/gms/internal/ads/zzaop;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaoo;

    .line 3
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzaoo;-><init>(Lcom/google/android/gms/internal/ads/zzann;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaop;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaop;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    .line 2
    sget-object p2, Lcom/google/android/gms/internal/ads/zzaop;->zzb:Lcom/google/android/gms/internal/ads/zzaop;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u100a\u0002\u0004\u100a\u0003"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzaop;->zzaR(Lcom/google/android/gms/internal/ads/zzgqg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzgno;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zze:Lcom/google/android/gms/internal/ads/zzgno;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzgno;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzf:Lcom/google/android/gms/internal/ads/zzgno;

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzgno;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzh:Lcom/google/android/gms/internal/ads/zzgno;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/ads/zzgno;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaop;->zzg:Lcom/google/android/gms/internal/ads/zzgno;

    return-object v0
.end method
