.class public final Lcom/google/android/gms/internal/ads/zzghl;
.super Lcom/google/android/gms/internal/ads/zzgow;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqh;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/ads/zzghl;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/ads/zzgho;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzghl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzghl;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzghl;->zzb:Lcom/google/android/gms/internal/ads/zzghl;

    const-class v1, Lcom/google/android/gms/internal/ads/zzghl;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaU(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgow;-><init>()V

    return-void
.end method

.method public static zzc()Lcom/google/android/gms/internal/ads/zzghk;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzghl;->zzb:Lcom/google/android/gms/internal/ads/zzghl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaA()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzghk;

    return-object v0
.end method

.method static synthetic zzd()Lcom/google/android/gms/internal/ads/zzghl;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzghl;->zzb:Lcom/google/android/gms/internal/ads/zzghl;

    return-object v0
.end method

.method public static zze(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzghl;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgpi;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzghl;->zzb:Lcom/google/android/gms/internal/ads/zzghl;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgow;->zzaG(Lcom/google/android/gms/internal/ads/zzgow;Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzghl;

    return-object p0
.end method

.method static synthetic zzg(Lcom/google/android/gms/internal/ads/zzghl;I)V
    .locals 0

    const/16 p1, 0x20

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzghl;->zzd:I

    return-void
.end method

.method static synthetic zzh(Lcom/google/android/gms/internal/ads/zzghl;Lcom/google/android/gms/internal/ads/zzgho;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzghl;->zze:Lcom/google/android/gms/internal/ads/zzgho;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzghl;->zzd:I

    return v0
.end method

.method protected final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    .line 1
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzghl;->zzb:Lcom/google/android/gms/internal/ads/zzghl;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzghk;

    .line 3
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzghk;-><init>(Lcom/google/android/gms/internal/ads/zzghj;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzghl;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzghl;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    .line 2
    sget-object p2, Lcom/google/android/gms/internal/ads/zzghl;->zzb:Lcom/google/android/gms/internal/ads/zzghl;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzghl;->zzaR(Lcom/google/android/gms/internal/ads/zzgqg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzgho;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzghl;->zze:Lcom/google/android/gms/internal/ads/zzgho;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgho;->zze()Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v0

    :cond_0
    return-object v0
.end method
