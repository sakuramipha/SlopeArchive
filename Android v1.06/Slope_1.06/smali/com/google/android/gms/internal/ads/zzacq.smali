.class public final Lcom/google/android/gms/internal/ads/zzacq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaao;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaav;


# instance fields
.field private final zzb:[B

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzaaw;

.field private zze:Lcom/google/android/gms/internal/ads/zzaar;

.field private zzf:Lcom/google/android/gms/internal/ads/zzabr;

.field private zzg:I

.field private zzh:Lcom/google/android/gms/internal/ads/zzca;

.field private zzi:Lcom/google/android/gms/internal/ads/zzabb;

.field private zzj:I

.field private zzk:I

.field private zzl:Lcom/google/android/gms/internal/ads/zzaco;

.field private zzm:I

.field private zzn:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzacp;->zza:Lcom/google/android/gms/internal/ads/zzacp;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzacq;->zza:Lcom/google/android/gms/internal/ads/zzaav;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzacq;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x2a

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzb:[B

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    const v0, 0x8000

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>([BI)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaaw;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaaw;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzd:Lcom/google/android/gms/internal/ads/zzaaw;

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    return-void
.end method

.method private final zze(Lcom/google/android/gms/internal/ads/zzfd;Z)J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    .line 9
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzc()I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v1

    add-int/lit8 v1, v1, -0x10

    if-gt v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzk:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzd:Lcom/google/android/gms/internal/ads/zzaaw;

    .line 2
    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzaax;->zzc(Lcom/google/android/gms/internal/ads/zzfd;Lcom/google/android/gms/internal/ads/zzabb;ILcom/google/android/gms/internal/ads/zzaaw;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzd:Lcom/google/android/gms/internal/ads/zzaaw;

    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/zzaaw;->zza:J

    return-wide p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_5

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result p2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzj:I

    sub-int/2addr p2, v1

    if-gt v0, p2, :cond_4

    .line 4
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzk:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzd:Lcom/google/android/gms/internal/ads/zzaaw;

    .line 5
    invoke-static {p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzaax;->zzc(Lcom/google/android/gms/internal/ads/zzfd;Lcom/google/android/gms/internal/ads/zzabb;ILcom/google/android/gms/internal/ads/zzaaw;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 p2, 0x0

    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzc()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v2

    if-le v1, v2, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p2, :cond_3

    .line 6
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzd:Lcom/google/android/gms/internal/ads/zzaaw;

    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/zzaaw;->zza:J

    return-wide p1

    :cond_3
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result p2

    .line 7
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    goto :goto_4

    .line 8
    :cond_5
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    :goto_4
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method private final zzf()V
    .locals 11

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzn:J

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    int-to-long v2, v2

    div-long v5, v0, v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzf:Lcom/google/android/gms/internal/ads/zzabr;

    iget v8, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzm:I

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 2
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzabr;->zzs(JIIILcom/google/android/gms/internal/ads/zzabq;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzabk;)I
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 62
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_17

    const/4 v5, 0x2

    if-eq v2, v3, :cond_16

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x4

    if-eq v2, v5, :cond_14

    if-eq v2, v7, :cond_d

    const-wide/16 v9, -0x1

    if-eq v2, v8, :cond_9

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzf:Lcom/google/android/gms/internal/ads/zzabr;

    .line 64
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    .line 63
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzl:Lcom/google/android/gms/internal/ads/zzaco;

    const/4 v6, -0x1

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzaaa;->zze()Z

    move-result v7

    if-eqz v7, :cond_0

    move-object/from16 v7, p2

    invoke-virtual {v5, v1, v7}, Lcom/google/android/gms/internal/ads/zzaaa;->zza(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzabk;)I

    move-result v4

    goto/16 :goto_2

    :cond_0
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzn:J

    cmp-long v5, v7, v9

    if-nez v5, :cond_1

    .line 50
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzaax;->zzb(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzabb;)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzn:J

    goto/16 :goto_2

    :cond_1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v5

    const v7, 0x8000

    if-ge v5, v7, :cond_4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v2

    sub-int/2addr v7, v5

    .line 51
    invoke-interface {v1, v2, v5, v7}, Lcom/google/android/gms/internal/ads/zzaap;->zza([BII)I

    move-result v1

    if-ne v1, v6, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_3

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    add-int/2addr v5, v1

    .line 52
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzE(I)V

    goto :goto_1

    .line 60
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v1

    if-nez v1, :cond_5

    .line 61
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzacq;->zzf()V

    const/4 v4, -0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    .line 52
    :cond_5
    :goto_1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzc()I

    move-result v2

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzm:I

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzj:I

    if-ge v5, v6, :cond_6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v7

    sub-int/2addr v6, v5

    .line 53
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    :cond_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 54
    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzacq;->zze(Lcom/google/android/gms/internal/ads/zzfd;Z)J

    move-result-wide v5

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzc()I

    move-result v3

    sub-int/2addr v3, v2

    .line 55
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzf:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 56
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzabp;->zzb(Lcom/google/android/gms/internal/ads/zzabr;Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzm:I

    add-int/2addr v1, v3

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzm:I

    cmp-long v1, v5, v9

    if-eqz v1, :cond_7

    .line 57
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzacq;->zzf()V

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzm:I

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzn:J

    :cond_7
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v2

    const/16 v3, 0x10

    if-lt v2, v3, :cond_8

    :goto_2
    return v4

    :cond_8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzc()I

    move-result v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v1

    .line 58
    invoke-static {v3, v5, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 59
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 60
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzE(I)V

    return v4

    .line 37
    :cond_9
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    .line 38
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {v2, v5}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v3

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/internal/ads/zzaae;

    .line 39
    invoke-virtual {v7, v3, v4, v5, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzo()I

    move-result v2

    shr-int/lit8 v3, v2, 0x2

    const/16 v5, 0x3ffe

    if-ne v3, v5, :cond_c

    .line 43
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzk:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zze:Lcom/google/android/gms/internal/ads/zzaar;

    .line 44
    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v14

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzd()J

    move-result-wide v16

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    .line 49
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    iget-object v1, v12, Lcom/google/android/gms/internal/ads/zzabb;->zzk:Lcom/google/android/gms/internal/ads/zzaba;

    if-eqz v1, :cond_a

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaaz;

    invoke-direct {v1, v12, v14, v15}, Lcom/google/android/gms/internal/ads/zzaaz;-><init>(Lcom/google/android/gms/internal/ads/zzabb;J)V

    goto :goto_3

    :cond_a
    const-wide/16 v5, 0x0

    cmp-long v1, v16, v9

    if-eqz v1, :cond_b

    .line 48
    iget-wide v7, v12, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    cmp-long v1, v7, v5

    if-lez v1, :cond_b

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaco;

    iget v13, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzk:I

    move-object v11, v1

    .line 46
    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzaco;-><init>(Lcom/google/android/gms/internal/ads/zzabb;IJJ)V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzl:Lcom/google/android/gms/internal/ads/zzaco;

    .line 47
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaaa;->zzb()Lcom/google/android/gms/internal/ads/zzabn;

    move-result-object v1

    goto :goto_3

    .line 63
    :cond_b
    new-instance v1, Lcom/google/android/gms/internal/ads/zzabm;

    .line 45
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzabb;->zza()J

    move-result-wide v7

    invoke-direct {v1, v7, v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzabm;-><init>(JJ)V

    .line 48
    :goto_3
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzN(Lcom/google/android/gms/internal/ads/zzabn;)V

    const/4 v1, 0x5

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    return v4

    .line 41
    :cond_c
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    const-string v1, "First frame does not start with sync code."

    .line 42
    invoke-static {v1, v6}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    .line 9
    :cond_d
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    .line 10
    :cond_e
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzfc;

    new-array v5, v8, [B

    invoke-direct {v3, v5, v8}, Lcom/google/android/gms/internal/ads/zzfc;-><init>([BI)V

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzfc;->zza:[B

    move-object v6, v1

    check-cast v6, Lcom/google/android/gms/internal/ads/zzaae;

    .line 11
    invoke-virtual {v6, v5, v4, v8, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    .line 12
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfc;->zzn()Z

    move-result v5

    const/4 v9, 0x7

    .line 13
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v9

    const/16 v10, 0x18

    .line 14
    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v3

    add-int/2addr v3, v8

    const/4 v10, 0x6

    if-nez v9, :cond_f

    const/16 v2, 0x26

    new-array v3, v2, [B

    .line 15
    invoke-virtual {v6, v3, v4, v2, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    new-instance v2, Lcom/google/android/gms/internal/ads/zzabb;

    .line 16
    invoke-direct {v2, v3, v8}, Lcom/google/android/gms/internal/ads/zzabb;-><init>([BI)V

    goto :goto_4

    :cond_f
    if-eqz v2, :cond_13

    if-ne v9, v7, :cond_10

    .line 17
    new-instance v9, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {v9, v3}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v11

    .line 18
    invoke-virtual {v6, v11, v4, v3, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    .line 19
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzaay;->zzb(Lcom/google/android/gms/internal/ads/zzfd;)Lcom/google/android/gms/internal/ads/zzaba;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzabb;->zzf(Lcom/google/android/gms/internal/ads/zzaba;)Lcom/google/android/gms/internal/ads/zzabb;

    move-result-object v2

    goto :goto_4

    :cond_10
    if-ne v9, v8, :cond_11

    .line 20
    new-instance v9, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {v9, v3}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v11

    .line 21
    invoke-virtual {v6, v11, v4, v3, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    .line 22
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 23
    invoke-static {v9, v4, v4}, Lcom/google/android/gms/internal/ads/zzabx;->zzc(Lcom/google/android/gms/internal/ads/zzfd;ZZ)Lcom/google/android/gms/internal/ads/zzabu;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzabu;->zzb:[Ljava/lang/String;

    .line 24
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 25
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzabb;->zzg(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzabb;

    move-result-object v2

    goto :goto_4

    :cond_11
    if-ne v9, v10, :cond_12

    .line 27
    new-instance v9, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {v9, v3}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v11

    .line 28
    invoke-virtual {v6, v11, v4, v3, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    .line 29
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 30
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzadk;->zzb(Lcom/google/android/gms/internal/ads/zzfd;)Lcom/google/android/gms/internal/ads/zzadk;

    move-result-object v3

    .line 31
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfrr;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzabb;->zze(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzabb;

    move-result-object v2

    goto :goto_4

    .line 26
    :cond_12
    invoke-virtual {v6, v3, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    .line 32
    :goto_4
    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    if-eqz v5, :cond_e

    .line 36
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, v2, Lcom/google/android/gms/internal/ads/zzabb;->zzc:I

    .line 34
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzj:I

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzf:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzi:Lcom/google/android/gms/internal/ads/zzabb;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzb:[B

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzh:Lcom/google/android/gms/internal/ads/zzca;

    .line 35
    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzabb;->zzc([BLcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    return v4

    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 33
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    .line 6
    :cond_14
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {v2, v8}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v3

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaae;

    .line 7
    invoke-virtual {v1, v3, v4, v8, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    .line 8
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v1

    const-wide/32 v8, 0x664c6143

    cmp-long v3, v1, v8

    if-nez v3, :cond_15

    .line 9
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    return v4

    :cond_15
    const-string v1, "Failed to read FLAC stream marker."

    invoke-static {v1, v6}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    .line 3
    :cond_16
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzb:[B

    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaae;

    const/16 v6, 0x2a

    .line 4
    invoke-virtual {v3, v2, v4, v6, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    .line 5
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    return v4

    .line 1
    :cond_17
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zze()J

    move-result-wide v5

    .line 2
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzaay;->zza(Lcom/google/android/gms/internal/ads/zzaap;Z)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zze()J

    move-result-wide v7

    sub-long/2addr v7, v5

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaae;

    long-to-int v5, v7

    .line 3
    invoke-virtual {v1, v5, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzh:Lcom/google/android/gms/internal/ads/zzca;

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    return v4
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzaar;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zze:Lcom/google/android/gms/internal/ads/zzaar;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzf:Lcom/google/android/gms/internal/ads/zzabr;

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaar;->zzC()V

    return-void
.end method

.method public final zzc(JJ)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzg:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzl:Lcom/google/android/gms/internal/ads/zzaco;

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzaaa;->zzd(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v1, -0x1

    .line 2
    :goto_1
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzn:J

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzm:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzacq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzC(I)V

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaap;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzaay;->zza(Lcom/google/android/gms/internal/ads/zzaap;Z)Lcom/google/android/gms/internal/ads/zzca;

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v3

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaae;

    .line 3
    invoke-virtual {p1, v3, v0, v2, v0}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v1

    const-wide/32 v3, 0x664c6143

    cmp-long p1, v1, v3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
