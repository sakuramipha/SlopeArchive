.class public final Lcom/google/android/gms/internal/ads/zzahk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaao;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaav;


# instance fields
.field private zzb:Lcom/google/android/gms/internal/ads/zzaar;

.field private zzc:Lcom/google/android/gms/internal/ads/zzahs;

.field private zzd:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzahj;->zza:Lcom/google/android/gms/internal/ads/zzahj;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzahk;->zza:Lcom/google/android/gms/internal/ads/zzaav;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zze(Lcom/google/android/gms/internal/ads/zzaap;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "streamReader"
        }
        result = true
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzahm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzahm;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzahm;->zzb(Lcom/google/android/gms/internal/ads/zzaap;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzahm;->zza:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_1

    :cond_0
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzahm;->zze:I

    const/16 v2, 0x8

    .line 3
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 4
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v4

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaae;

    .line 5
    invoke-virtual {p1, v4, v3, v0, v3}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    .line 6
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result p1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_1

    .line 7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzk()I

    move-result p1

    const/16 v0, 0x7f

    if-ne p1, v0, :cond_1

    .line 8
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v4

    const-wide/32 v6, 0x464c4143

    cmp-long p1, v4, v6

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/zzahi;

    .line 15
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzahi;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzc:Lcom/google/android/gms/internal/ads/zzahs;

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 10
    :try_start_0
    invoke-static {v1, v2, v1}, Lcom/google/android/gms/internal/ads/zzabx;->zzd(ILcom/google/android/gms/internal/ads/zzfd;Z)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzce; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/zzahu;

    .line 14
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzahu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzc:Lcom/google/android/gms/internal/ads/zzahs;

    goto :goto_0

    :catch_0
    nop

    .line 11
    :cond_2
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 12
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzaho;->zzd(Lcom/google/android/gms/internal/ads/zzfd;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaho;

    .line 13
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaho;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzc:Lcom/google/android/gms/internal/ads/zzahs;

    :goto_0
    return v1

    :cond_3
    :goto_1
    return v3
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzabk;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzb:Lcom/google/android/gms/internal/ads/zzaar;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzc:Lcom/google/android/gms/internal/ads/zzahs;

    if-nez v0, :cond_1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzahk;->zze(Lcom/google/android/gms/internal/ads/zzaap;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Failed to determine bitstream type"

    .line 3
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object p1

    throw p1

    .line 4
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzd:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzb:Lcom/google/android/gms/internal/ads/zzaar;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 5
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzb:Lcom/google/android/gms/internal/ads/zzaar;

    .line 6
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzC()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzc:Lcom/google/android/gms/internal/ads/zzahs;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzb:Lcom/google/android/gms/internal/ads/zzaar;

    .line 7
    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/ads/zzahs;->zzh(Lcom/google/android/gms/internal/ads/zzaar;Lcom/google/android/gms/internal/ads/zzabr;)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzd:Z

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzc:Lcom/google/android/gms/internal/ads/zzahs;

    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzahs;->zze(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzabk;)I

    move-result p1

    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzaar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzb:Lcom/google/android/gms/internal/ads/zzaar;

    return-void
.end method

.method public final zzc(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahk;->zzc:Lcom/google/android/gms/internal/ads/zzahs;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzahs;->zzj(JJ)V

    :cond_0
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaap;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzahk;->zze(Lcom/google/android/gms/internal/ads/zzaap;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzce; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
