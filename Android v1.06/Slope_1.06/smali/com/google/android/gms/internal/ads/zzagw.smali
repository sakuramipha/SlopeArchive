.class public final Lcom/google/android/gms/internal/ads/zzagw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaao;
.implements Lcom/google/android/gms/internal/ads/zzabn;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaav;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzf:Ljava/util/ArrayDeque;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzagy;

.field private final zzh:Ljava/util/List;

.field private zzi:I

.field private zzj:I

.field private zzk:J

.field private zzl:I

.field private zzm:Lcom/google/android/gms/internal/ads/zzfd;

.field private zzn:I

.field private zzo:I

.field private zzp:I

.field private zzq:I

.field private zzr:Lcom/google/android/gms/internal/ads/zzaar;

.field private zzs:[Lcom/google/android/gms/internal/ads/zzagv;

.field private zzt:[[J

.field private zzu:I

.field private zzv:J

.field private zzw:I

.field private zzx:Lcom/google/android/gms/internal/ads/zzaev;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzagt;->zza:Lcom/google/android/gms/internal/ads/zzagt;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzagw;->zza:Lcom/google/android/gms/internal/ads/zzaav;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzagw;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    new-instance v0, Lcom/google/android/gms/internal/ads/zzagy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzagy;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzg:Lcom/google/android/gms/internal/ads/zzagy;

    new-instance v0, Ljava/util/ArrayList;

    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzh:Ljava/util/List;

    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfd;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance v0, Ljava/util/ArrayDeque;

    .line 5
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfd;

    .line 6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzew;->zza:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>([B)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzb:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfd;

    .line 8
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfd;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzd:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzn:I

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaar;->zza:Lcom/google/android/gms/internal/ads/zzaar;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzr:Lcom/google/android/gms/internal/ads/zzaar;

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzagv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzs:[Lcom/google/android/gms/internal/ads/zzagv;

    return-void
.end method

.method private static zzf(I)I
    .locals 1

    const v0, 0x68656963

    if-eq p0, v0, :cond_1

    const v0, 0x71742020

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method

.method private static zzi(Lcom/google/android/gms/internal/ads/zzahd;J)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzahd;->zza(J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzahd;->zzb(J)I

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method private static zzj(Lcom/google/android/gms/internal/ads/zzahd;JJ)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzagw;->zzi(Lcom/google/android/gms/internal/ads/zzahd;J)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return-wide p3

    .line 2
    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzahd;->zzc:[J

    aget-wide p1, p0, p1

    .line 3
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private final zzk()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    return-void
.end method

.method private final zzl(J)V
    .locals 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzce;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1a

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaga;

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/zzaga;->zza:J

    cmp-long v1, v3, p1

    if-nez v1, :cond_1a

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaga;

    .line 3
    iget v1, v3, Lcom/google/android/gms/internal/ads/zzaga;->zzd:I

    const v4, 0x6d6f6f76

    if-ne v1, v4, :cond_19

    new-instance v1, Ljava/util/ArrayList;

    .line 4
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzw:I

    new-instance v11, Lcom/google/android/gms/internal/ads/zzabd;

    invoke-direct {v11}, Lcom/google/android/gms/internal/ads/zzabd;-><init>()V

    const v5, 0x75647461

    .line 5
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzaga;->zzb(I)Lcom/google/android/gms/internal/ads/zzagb;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 6
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzagl;->zzb(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzagk;

    move-result-object v5

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/zzagk;->zza:Lcom/google/android/gms/internal/ads/zzca;

    iget-object v7, v5, Lcom/google/android/gms/internal/ads/zzagk;->zzb:Lcom/google/android/gms/internal/ads/zzca;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzagk;->zzc:Lcom/google/android/gms/internal/ads/zzca;

    if-eqz v6, :cond_1

    .line 7
    invoke-virtual {v11, v6}, Lcom/google/android/gms/internal/ads/zzabd;->zzb(Lcom/google/android/gms/internal/ads/zzca;)Z

    :cond_1
    move-object v13, v5

    move-object v14, v6

    move-object v15, v7

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    const v5, 0x6d657461

    .line 8
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzaga;->zza(I)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 9
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzagl;->zza(Lcom/google/android/gms/internal/ads/zzaga;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object v5

    move-object v10, v5

    goto :goto_2

    :cond_3
    const/4 v10, 0x0

    :goto_2
    const/4 v9, 0x0

    const/4 v8, 0x1

    if-ne v4, v8, :cond_4

    const/16 v16, 0x1

    goto :goto_3

    :cond_4
    const/16 v16, 0x0

    :goto_3
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    const/16 v17, 0x0

    sget-object v18, Lcom/google/android/gms/internal/ads/zzagu;->zza:Lcom/google/android/gms/internal/ads/zzagu;

    move-object v4, v11

    const/4 v12, 0x1

    move/from16 v8, v17

    move/from16 v9, v16

    move-object/from16 v20, v10

    move-object/from16 v10, v18

    .line 10
    invoke-static/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/zzagl;->zzc(Lcom/google/android/gms/internal/ads/zzaga;Lcom/google/android/gms/internal/ads/zzabd;JLcom/google/android/gms/internal/ads/zzad;ZZLcom/google/android/gms/internal/ads/zzfon;)Ljava/util/List;

    move-result-object v3

    .line 11
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v10, v13

    const/4 v8, -0x1

    const/4 v9, 0x0

    move-wide v12, v6

    :goto_4
    const-wide/16 v17, 0x0

    if-ge v9, v4, :cond_13

    .line 12
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v5, v21

    check-cast v5, Lcom/google/android/gms/internal/ads/zzahd;

    .line 13
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzahd;->zzb:I

    if-nez v2, :cond_5

    move-object/from16 v22, v3

    move/from16 v23, v4

    move-object/from16 v19, v10

    move-object/from16 v3, v20

    const/4 v2, -0x1

    move-wide/from16 v28, v6

    move-object v7, v11

    move-wide/from16 v10, v28

    goto/16 :goto_e

    .line 14
    :cond_5
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    move-object/from16 v22, v3

    move/from16 v23, v4

    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zze:J

    cmp-long v24, v3, v6

    if-eqz v24, :cond_6

    goto :goto_5

    .line 15
    :cond_6
    iget-wide v3, v5, Lcom/google/android/gms/internal/ads/zzahd;->zzh:J

    .line 16
    :goto_5
    invoke-static {v12, v13, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    new-instance v6, Lcom/google/android/gms/internal/ads/zzagv;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzr:Lcom/google/android/gms/internal/ads/zzaar;

    move-wide/from16 v25, v12

    iget v12, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzb:I

    .line 17
    invoke-interface {v7, v9, v12}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object v7

    invoke-direct {v6, v2, v5, v7}, Lcom/google/android/gms/internal/ads/zzagv;-><init>(Lcom/google/android/gms/internal/ads/zzaha;Lcom/google/android/gms/internal/ads/zzahd;Lcom/google/android/gms/internal/ads/zzabr;)V

    iget-object v7, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    .line 18
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v12, "audio/true-hd"

    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 19
    iget v7, v5, Lcom/google/android/gms/internal/ads/zzahd;->zze:I

    mul-int/lit8 v7, v7, 0x10

    goto :goto_6

    .line 20
    :cond_7
    iget v7, v5, Lcom/google/android/gms/internal/ads/zzahd;->zze:I

    add-int/lit8 v7, v7, 0x1e

    .line 19
    :goto_6
    iget-object v12, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    .line 21
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzam;->zzb()Lcom/google/android/gms/internal/ads/zzak;

    move-result-object v12

    .line 22
    invoke-virtual {v12, v7}, Lcom/google/android/gms/internal/ads/zzak;->zzL(I)Lcom/google/android/gms/internal/ads/zzak;

    iget v7, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzb:I

    const/4 v13, 0x2

    if-ne v7, v13, :cond_8

    cmp-long v7, v3, v17

    if-lez v7, :cond_8

    .line 23
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzahd;->zzb:I

    const/4 v7, 0x1

    if-le v5, v7, :cond_8

    long-to-float v3, v3

    int-to-float v4, v5

    const v5, 0x49742400    # 1000000.0f

    div-float/2addr v3, v5

    div-float/2addr v4, v3

    .line 24
    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/ads/zzak;->zzE(F)Lcom/google/android/gms/internal/ads/zzak;

    :cond_8
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzb:I

    .line 25
    sget v4, Lcom/google/android/gms/internal/ads/zzags;->zzb:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_9

    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzabd;->zza()Z

    move-result v3

    if-eqz v3, :cond_9

    iget v3, v11, Lcom/google/android/gms/internal/ads/zzabd;->zza:I

    .line 26
    invoke-virtual {v12, v3}, Lcom/google/android/gms/internal/ads/zzak;->zzC(I)Lcom/google/android/gms/internal/ads/zzak;

    iget v3, v11, Lcom/google/android/gms/internal/ads/zzabd;->zzb:I

    .line 27
    invoke-virtual {v12, v3}, Lcom/google/android/gms/internal/ads/zzak;->zzD(I)Lcom/google/android/gms/internal/ads/zzak;

    :cond_9
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzb:I

    const/4 v4, 0x3

    new-array v5, v4, [Lcom/google/android/gms/internal/ads/zzca;

    const/4 v7, 0x0

    aput-object v15, v5, v7

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzh:Ljava/util/List;

    .line 28
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v4, 0x1

    const/4 v13, 0x0

    goto :goto_7

    .line 34
    :cond_a
    new-instance v13, Lcom/google/android/gms/internal/ads/zzca;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzh:Ljava/util/List;

    .line 28
    invoke-direct {v13, v4}, Lcom/google/android/gms/internal/ads/zzca;-><init>(Ljava/util/List;)V

    const/4 v4, 0x1

    :goto_7
    aput-object v13, v5, v4

    const/4 v13, 0x2

    aput-object v10, v5, v13

    new-instance v13, Lcom/google/android/gms/internal/ads/zzca;

    move-object/from16 v19, v10

    new-array v10, v7, [Lcom/google/android/gms/internal/ads/zzbz;

    move/from16 v27, v8

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v13, v7, v8, v10}, Lcom/google/android/gms/internal/ads/zzca;-><init>(J[Lcom/google/android/gms/internal/ads/zzbz;)V

    if-ne v3, v4, :cond_b

    if-eqz v14, :cond_e

    move-object v7, v11

    move-object v13, v14

    :goto_8
    move-object/from16 v3, v20

    :goto_9
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_b

    :cond_b
    const/4 v4, 0x2

    if-ne v3, v4, :cond_e

    move-object/from16 v3, v20

    if-eqz v3, :cond_d

    const/4 v4, 0x0

    .line 29
    :goto_a
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzca;->zza()I

    move-result v7

    if-ge v4, v7, :cond_d

    .line 30
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzca;->zzb(I)Lcom/google/android/gms/internal/ads/zzbz;

    move-result-object v7

    .line 31
    instance-of v8, v7, Lcom/google/android/gms/internal/ads/zzaes;

    if-eqz v8, :cond_c

    .line 32
    check-cast v7, Lcom/google/android/gms/internal/ads/zzaes;

    .line 33
    iget-object v8, v7, Lcom/google/android/gms/internal/ads/zzaes;->zza:Ljava/lang/String;

    const-string v10, "com.android.capture.fps"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    new-instance v13, Lcom/google/android/gms/internal/ads/zzca;

    const/4 v4, 0x1

    new-array v8, v4, [Lcom/google/android/gms/internal/ads/zzbz;

    const/4 v4, 0x0

    aput-object v7, v8, v4

    move-object v7, v11

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    invoke-direct {v13, v10, v11, v8}, Lcom/google/android/gms/internal/ads/zzca;-><init>(J[Lcom/google/android/gms/internal/ads/zzbz;)V

    goto :goto_b

    :cond_c
    move-object v7, v11

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    add-int/lit8 v4, v4, 0x1

    move-object v11, v7

    goto :goto_a

    :cond_d
    move-object v7, v11

    goto :goto_9

    :cond_e
    move-object v7, v11

    goto :goto_8

    :goto_b
    const/4 v4, 0x0

    :goto_c
    const/4 v8, 0x3

    if-ge v4, v8, :cond_f

    .line 35
    aget-object v8, v5, v4

    .line 36
    invoke-virtual {v13, v8}, Lcom/google/android/gms/internal/ads/zzca;->zzd(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object v13

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    .line 37
    :cond_f
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzca;->zza()I

    move-result v4

    if-lez v4, :cond_10

    .line 38
    invoke-virtual {v12, v13}, Lcom/google/android/gms/internal/ads/zzak;->zzM(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzak;

    :cond_10
    iget-object v4, v6, Lcom/google/android/gms/internal/ads/zzagv;->zzc:Lcom/google/android/gms/internal/ads/zzabr;

    .line 39
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzak;->zzY()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzb:I

    const/4 v4, 0x2

    move/from16 v5, v27

    if-ne v2, v4, :cond_11

    const/4 v2, -0x1

    if-ne v5, v2, :cond_12

    .line 40
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move v8, v4

    goto :goto_d

    :cond_11
    const/4 v2, -0x1

    :cond_12
    move v8, v5

    .line 41
    :goto_d
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-wide/from16 v12, v25

    :goto_e
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v20, v3

    move-object/from16 v3, v22

    move/from16 v4, v23

    move-wide/from16 v28, v10

    move-object v11, v7

    move-wide/from16 v6, v28

    move-object/from16 v10, v19

    goto/16 :goto_4

    :cond_13
    move v5, v8

    const/4 v2, -0x1

    .line 15
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzu:I

    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzv:J

    const/4 v3, 0x0

    new-array v4, v3, [Lcom/google/android/gms/internal/ads/zzagv;

    .line 42
    invoke-interface {v1, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/gms/internal/ads/zzagv;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzs:[Lcom/google/android/gms/internal/ads/zzagv;

    .line 43
    array-length v3, v1

    new-array v4, v3, [[J

    new-array v5, v3, [I

    new-array v6, v3, [J

    new-array v3, v3, [Z

    const/4 v9, 0x0

    .line 44
    :goto_f
    array-length v7, v1

    if-ge v9, v7, :cond_14

    .line 45
    aget-object v7, v1, v9

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iget v7, v7, Lcom/google/android/gms/internal/ads/zzahd;->zzb:I

    new-array v7, v7, [J

    aput-object v7, v4, v9

    .line 46
    aget-object v7, v1, v9

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzahd;->zzf:[J

    const/4 v8, 0x0

    aget-wide v10, v7, v8

    aput-wide v10, v6, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_f

    :cond_14
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 47
    :goto_10
    array-length v7, v1

    if-ge v9, v7, :cond_18

    const-wide v10, 0x7fffffffffffffffL

    const/4 v7, 0x0

    const/4 v12, -0x1

    .line 48
    :goto_11
    array-length v13, v1

    if-ge v7, v13, :cond_16

    .line 49
    aget-boolean v13, v3, v7

    if-nez v13, :cond_15

    aget-wide v13, v6, v7

    cmp-long v15, v13, v10

    if-gtz v15, :cond_15

    move v12, v7

    move-wide v10, v13

    :cond_15
    add-int/lit8 v7, v7, 0x1

    goto :goto_11

    .line 50
    :cond_16
    aget v7, v5, v12

    .line 51
    aget-object v10, v4, v12

    aput-wide v17, v10, v7

    .line 52
    aget-object v11, v1, v12

    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v13, v11, Lcom/google/android/gms/internal/ads/zzahd;->zzd:[I

    aget v13, v13, v7

    int-to-long v13, v13

    add-long v17, v17, v13

    const/4 v13, 0x1

    add-int/2addr v7, v13

    .line 53
    aput v7, v5, v12

    .line 54
    array-length v10, v10

    if-ge v7, v10, :cond_17

    .line 55
    iget-object v10, v11, Lcom/google/android/gms/internal/ads/zzahd;->zzf:[J

    aget-wide v14, v10, v7

    aput-wide v14, v6, v12

    goto :goto_10

    .line 56
    :cond_17
    aput-boolean v13, v3, v12

    add-int/lit8 v9, v9, 0x1

    goto :goto_10

    :cond_18
    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzt:[[J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzr:Lcom/google/android/gms/internal/ads/zzaar;

    .line 57
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzC()V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzr:Lcom/google/android/gms/internal/ads/zzaar;

    .line 58
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzaar;->zzN(Lcom/google/android/gms/internal/ads/zzabn;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    const/4 v1, 0x2

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    goto/16 :goto_0

    :cond_19
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    .line 60
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    .line 61
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaga;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzaga;->zzc(Lcom/google/android/gms/internal/ads/zzaga;)V

    goto/16 :goto_0

    :cond_1a
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1b

    .line 62
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzagw;->zzk()V

    :cond_1b
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzabk;)I
    .locals 32
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 35
    :cond_0
    :goto_0
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    const v4, 0x66747970

    const-wide/16 v6, 0x0

    const/4 v8, -0x1

    const/16 v9, 0x8

    const/4 v10, 0x1

    if-eqz v3, :cond_1f

    const-wide/32 v13, 0x40000

    if-eq v3, v10, :cond_17

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v3

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzn:I

    if-ne v9, v8, :cond_a

    const-wide v16, 0x7fffffffffffffffL

    move-wide/from16 v18, v16

    move-wide/from16 v21, v18

    move-wide/from16 v23, v21

    const/4 v9, 0x0

    const/16 v20, 0x1

    const/16 v25, -0x1

    const/16 v26, -0x1

    const/16 v27, 0x1

    :goto_1
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzs:[Lcom/google/android/gms/internal/ads/zzagv;

    .line 36
    array-length v15, v5

    if-ge v9, v15, :cond_8

    .line 37
    aget-object v5, v5, v9

    .line 38
    iget v15, v5, Lcom/google/android/gms/internal/ads/zzagv;->zze:I

    .line 39
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iget v12, v5, Lcom/google/android/gms/internal/ads/zzahd;->zzb:I

    if-ne v15, v12, :cond_1

    goto :goto_6

    .line 40
    :cond_1
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzahd;->zzc:[J

    aget-wide v28, v5, v15

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzt:[[J

    .line 41
    sget v12, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    aget-object v5, v5, v9

    aget-wide v30, v5, v15

    sub-long v28, v28, v3

    cmp-long v5, v28, v6

    if-ltz v5, :cond_3

    cmp-long v5, v28, v13

    if-ltz v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v5, 0x1

    :goto_3
    if-nez v5, :cond_4

    if-nez v27, :cond_5

    const/4 v12, 0x0

    goto :goto_4

    :cond_4
    move/from16 v12, v27

    :goto_4
    if-ne v5, v12, :cond_6

    cmp-long v15, v28, v23

    if-gez v15, :cond_6

    :cond_5
    move/from16 v27, v5

    move/from16 v26, v9

    move-wide/from16 v23, v28

    move-wide/from16 v21, v30

    goto :goto_5

    :cond_6
    move/from16 v27, v12

    :goto_5
    cmp-long v12, v30, v18

    if-gez v12, :cond_7

    move/from16 v20, v5

    move/from16 v25, v9

    move-wide/from16 v18, v30

    :cond_7
    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_8
    cmp-long v5, v18, v16

    if-eqz v5, :cond_9

    if-eqz v20, :cond_9

    const-wide/32 v15, 0xa00000

    add-long v18, v18, v15

    cmp-long v5, v21, v18

    if-ltz v5, :cond_9

    move/from16 v9, v25

    goto :goto_7

    :cond_9
    move/from16 v9, v26

    :goto_7
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzn:I

    if-ne v9, v8, :cond_a

    goto/16 :goto_c

    :cond_a
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzs:[Lcom/google/android/gms/internal/ads/zzagv;

    .line 42
    aget-object v5, v5, v9

    .line 43
    iget-object v9, v5, Lcom/google/android/gms/internal/ads/zzagv;->zzc:Lcom/google/android/gms/internal/ads/zzabr;

    .line 44
    iget v12, v5, Lcom/google/android/gms/internal/ads/zzagv;->zze:I

    .line 45
    iget-object v15, v5, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v8, v15, Lcom/google/android/gms/internal/ads/zzahd;->zzc:[J

    aget-wide v10, v8, v12

    .line 46
    iget-object v8, v15, Lcom/google/android/gms/internal/ads/zzahd;->zzd:[I

    aget v8, v8, v12

    .line 47
    iget-object v15, v5, Lcom/google/android/gms/internal/ads/zzagv;->zzd:Lcom/google/android/gms/internal/ads/zzabs;

    sub-long v3, v10, v3

    iget v13, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    int-to-long v13, v13

    add-long/2addr v3, v13

    cmp-long v13, v3, v6

    if-ltz v13, :cond_16

    const-wide/32 v6, 0x40000

    cmp-long v13, v3, v6

    if-ltz v13, :cond_b

    goto/16 :goto_b

    .line 48
    :cond_b
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzagv;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzg:I

    const/4 v6, 0x1

    if-ne v2, v6, :cond_c

    const-wide/16 v6, 0x8

    add-long/2addr v3, v6

    add-int/lit8 v8, v8, -0x8

    :cond_c
    long-to-int v2, v3

    .line 49
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaap;->zzk(I)V

    .line 50
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzagv;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzj:I

    if-eqz v3, :cond_f

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v2

    const/4 v4, 0x0

    .line 51
    aput-byte v4, v2, v4

    const/4 v6, 0x1

    .line 52
    aput-byte v4, v2, v6

    const/4 v6, 0x2

    .line 53
    aput-byte v4, v2, v6

    rsub-int/lit8 v4, v3, 0x4

    :goto_8
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    if-ge v6, v8, :cond_13

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    if-nez v6, :cond_e

    .line 54
    invoke-interface {v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzaap;->zzi([BII)V

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    add-int/2addr v6, v3

    iput v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v7, 0x0

    .line 55
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 56
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v6

    if-ltz v6, :cond_d

    .line 60
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzb:Lcom/google/android/gms/internal/ads/zzfd;

    .line 57
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzb:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v10, 0x4

    .line 58
    invoke-interface {v9, v6, v10}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    add-int/2addr v6, v10

    iput v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    add-int/2addr v8, v4

    goto :goto_8

    :cond_d
    const-string v1, "Invalid NAL length"

    const/4 v2, 0x0

    .line 60
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    :cond_e
    const/4 v7, 0x0

    .line 59
    invoke-interface {v9, v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzabr;->zze(Lcom/google/android/gms/internal/ads/zzt;IZ)I

    move-result v6

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    sub-int/2addr v7, v6

    iput v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    goto :goto_8

    .line 71
    :cond_f
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    .line 61
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v3, "audio/ac4"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    if-nez v2, :cond_10

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzd:Lcom/google/android/gms/internal/ads/zzfd;

    .line 62
    invoke-static {v8, v2}, Lcom/google/android/gms/internal/ads/zzzs;->zzb(ILcom/google/android/gms/internal/ads/zzfd;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzd:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v3, 0x7

    .line 63
    invoke-interface {v9, v2, v3}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    add-int/2addr v2, v3

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    :cond_10
    add-int/lit8 v8, v8, 0x7

    goto :goto_9

    :cond_11
    if-eqz v15, :cond_12

    .line 64
    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/ads/zzabs;->zzd(Lcom/google/android/gms/internal/ads/zzaap;)V

    .line 63
    :cond_12
    :goto_9
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    if-ge v2, v8, :cond_13

    sub-int v2, v8, v2

    const/4 v3, 0x0

    .line 65
    invoke-interface {v9, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzabr;->zze(Lcom/google/android/gms/internal/ads/zzt;IZ)I

    move-result v2

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    sub-int/2addr v3, v2

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    goto :goto_9

    .line 66
    :cond_13
    iget-object v1, v5, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzahd;->zzf:[J

    aget-wide v3, v2, v12

    .line 67
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzahd;->zzg:[I

    aget v1, v1, v12

    if-eqz v15, :cond_14

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v2, v15

    move-object/from16 v16, v9

    move-wide/from16 v17, v3

    move/from16 v19, v1

    move/from16 v20, v8

    .line 68
    invoke-virtual/range {v15 .. v22}, Lcom/google/android/gms/internal/ads/zzabs;->zzc(Lcom/google/android/gms/internal/ads/zzabr;JIIILcom/google/android/gms/internal/ads/zzabq;)V

    const/4 v1, 0x1

    add-int/2addr v12, v1

    .line 69
    iget-object v1, v5, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzahd;->zzb:I

    if-ne v12, v1, :cond_15

    const/4 v1, 0x0

    .line 70
    invoke-virtual {v2, v9, v1}, Lcom/google/android/gms/internal/ads/zzabs;->zza(Lcom/google/android/gms/internal/ads/zzabr;Lcom/google/android/gms/internal/ads/zzabq;)V

    goto :goto_a

    :cond_14
    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v15, v9

    move-wide/from16 v16, v3

    move/from16 v18, v1

    move/from16 v19, v8

    .line 71
    invoke-interface/range {v15 .. v21}, Lcom/google/android/gms/internal/ads/zzabr;->zzs(JIIILcom/google/android/gms/internal/ads/zzabq;)V

    .line 72
    :cond_15
    :goto_a
    iget v1, v5, Lcom/google/android/gms/internal/ads/zzagv;->zze:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v5, Lcom/google/android/gms/internal/ads/zzagv;->zze:I

    const/4 v1, -0x1

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzn:I

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    const/4 v8, 0x0

    goto :goto_c

    .line 47
    :cond_16
    :goto_b
    iput-wide v10, v2, Lcom/google/android/gms/internal/ads/zzabk;->zza:J

    const/4 v8, 0x1

    :goto_c
    return v8

    .line 64
    :cond_17
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    int-to-long v7, v3

    sub-long/2addr v5, v7

    .line 24
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v7

    add-long/2addr v7, v5

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzm:Lcom/google/android/gms/internal/ads/zzfd;

    if-eqz v3, :cond_1c

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v10

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    long-to-int v6, v5

    .line 25
    invoke-interface {v1, v10, v11, v6}, Lcom/google/android/gms/internal/ads/zzaap;->zzi([BII)V

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzj:I

    if-ne v5, v4, :cond_1b

    .line 26
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 27
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzagw;->zzf(I)I

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_d

    :cond_18
    const/4 v4, 0x4

    .line 28
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    :cond_19
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v4

    if-lez v4, :cond_1a

    .line 29
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzagw;->zzf(I)I

    move-result v4

    if-eqz v4, :cond_19

    goto :goto_d

    :cond_1a
    const/4 v4, 0x0

    .line 27
    :goto_d
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzw:I

    goto :goto_e

    .line 29
    :cond_1b
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    .line 30
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1d

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    .line 31
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzaga;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzagb;

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzj:I

    invoke-direct {v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzagb;-><init>(ILcom/google/android/gms/internal/ads/zzfd;)V

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzaga;->zzd(Lcom/google/android/gms/internal/ads/zzagb;)V

    goto :goto_e

    :cond_1c
    const-wide/32 v3, 0x40000

    cmp-long v9, v5, v3

    if-gez v9, :cond_1e

    long-to-int v3, v5

    .line 32
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzaap;->zzk(I)V

    :cond_1d
    :goto_e
    const/4 v11, 0x0

    goto :goto_f

    .line 33
    :cond_1e
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v3

    add-long/2addr v3, v5

    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzabk;->zza:J

    const/4 v11, 0x1

    .line 34
    :goto_f
    invoke-direct {v0, v7, v8}, Lcom/google/android/gms/internal/ads/zzagw;->zzl(J)V

    if-eqz v11, :cond_0

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    const/4 v3, 0x1

    return v3

    :cond_1f
    const/4 v3, 0x1

    .line 33
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    if-nez v5, :cond_21

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v5

    const/4 v8, 0x0

    .line 1
    invoke-interface {v1, v5, v8, v9, v3}, Lcom/google/android/gms/internal/ads/zzaap;->zzn([BIIZ)Z

    move-result v5

    if-nez v5, :cond_20

    const/4 v3, -0x1

    return v3

    :cond_20
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    .line 2
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    .line 3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v10

    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    .line 4
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzj:I

    :cond_21
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    const-wide/16 v12, 0x1

    cmp-long v3, v10, v12

    if-nez v3, :cond_22

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v3

    .line 5
    invoke-interface {v1, v3, v9, v9}, Lcom/google/android/gms/internal/ads/zzaap;->zzi([BII)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    add-int/2addr v3, v9

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    .line 6
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    goto :goto_11

    :cond_22
    cmp-long v3, v10, v6

    if-nez v3, :cond_25

    .line 7
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzd()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v3, v5, v7

    if-nez v3, :cond_24

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    .line 8
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaga;

    if-eqz v3, :cond_23

    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzaga;->zza:J

    goto :goto_10

    :cond_23
    move-wide v5, v7

    :cond_24
    :goto_10
    cmp-long v3, v5, v7

    if-eqz v3, :cond_25

    .line 9
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v7

    sub-long/2addr v5, v7

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    int-to-long v7, v3

    add-long/2addr v5, v7

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    .line 6
    :cond_25
    :goto_11
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    int-to-long v7, v3

    cmp-long v10, v5, v7

    if-ltz v10, :cond_2f

    .line 73
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzj:I

    const v6, 0x6d6f6f76

    const v7, 0x6d657461

    if-eq v5, v6, :cond_2c

    const v6, 0x7472616b

    if-eq v5, v6, :cond_2c

    const v6, 0x6d646961

    if-eq v5, v6, :cond_2c

    const v6, 0x6d696e66

    if-eq v5, v6, :cond_2c

    const v6, 0x7374626c

    if-eq v5, v6, :cond_2c

    const v6, 0x65647473

    if-eq v5, v6, :cond_2c

    if-ne v5, v7, :cond_26

    goto/16 :goto_15

    :cond_26
    const v6, 0x6d646864

    if-eq v5, v6, :cond_29

    const v6, 0x6d766864

    if-eq v5, v6, :cond_29

    const v6, 0x68646c72    # 4.3148E24f

    if-eq v5, v6, :cond_29

    const v6, 0x73747364

    if-eq v5, v6, :cond_29

    const v6, 0x73747473

    if-eq v5, v6, :cond_29

    const v6, 0x73747373

    if-eq v5, v6, :cond_29

    const v6, 0x63747473

    if-eq v5, v6, :cond_29

    const v6, 0x656c7374

    if-eq v5, v6, :cond_29

    const v6, 0x73747363

    if-eq v5, v6, :cond_29

    const v6, 0x7374737a

    if-eq v5, v6, :cond_29

    const v6, 0x73747a32

    if-eq v5, v6, :cond_29

    const v6, 0x7374636f

    if-eq v5, v6, :cond_29

    const v6, 0x636f3634

    if-eq v5, v6, :cond_29

    const v6, 0x746b6864

    if-eq v5, v6, :cond_29

    if-eq v5, v4, :cond_29

    const v4, 0x75647461

    if-eq v5, v4, :cond_29

    const v4, 0x6b657973

    if-eq v5, v4, :cond_29

    const v4, 0x696c7374

    if-ne v5, v4, :cond_27

    goto :goto_12

    .line 23
    :cond_27
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v3

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    int-to-long v5, v5

    sub-long v10, v3, v5

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzj:I

    const v4, 0x6d707664

    if-ne v3, v4, :cond_28

    add-long v14, v10, v5

    new-instance v3, Lcom/google/android/gms/internal/ads/zzaev;

    const-wide/16 v8, 0x0

    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    sub-long v4, v12, v5

    move-object v7, v3

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move-wide/from16 v16, v4

    invoke-direct/range {v7 .. v17}, Lcom/google/android/gms/internal/ads/zzaev;-><init>(JJJJJ)V

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzx:Lcom/google/android/gms/internal/ads/zzaev;

    :cond_28
    const/4 v3, 0x0

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzm:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v3, 0x1

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    goto/16 :goto_0

    :cond_29
    :goto_12
    if-ne v3, v9, :cond_2a

    const/4 v3, 0x1

    goto :goto_13

    :cond_2a
    const/4 v3, 0x0

    .line 19
    :goto_13
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    const-wide/32 v5, 0x7fffffff

    cmp-long v7, v3, v5

    if-gtz v7, :cond_2b

    const/4 v3, 0x1

    goto :goto_14

    :cond_2b
    const/4 v3, 0x0

    .line 20
    :goto_14
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    .line 21
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfd;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    long-to-int v5, v4

    invoke-direct {v3, v5}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzagw;->zze:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v5

    const/4 v6, 0x0

    .line 22
    invoke-static {v4, v6, v5, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzm:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v3, 0x1

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzi:I

    goto/16 :goto_0

    .line 10
    :cond_2c
    :goto_15
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v3

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    add-long/2addr v3, v5

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    int-to-long v10, v8

    cmp-long v8, v5, v10

    if-eqz v8, :cond_2d

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzj:I

    if-ne v5, v7, :cond_2d

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzd:Lcom/google/android/gms/internal/ads/zzfd;

    .line 11
    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzC(I)V

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzd:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v5

    const/4 v6, 0x0

    .line 12
    invoke-interface {v1, v5, v6, v9}, Lcom/google/android/gms/internal/ads/zzaap;->zzh([BII)V

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzd:Lcom/google/android/gms/internal/ads/zzfd;

    .line 13
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzagl;->zzd(Lcom/google/android/gms/internal/ads/zzfd;)V

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzd:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzc()I

    move-result v5

    .line 14
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/zzaap;->zzk(I)V

    .line 15
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    :cond_2d
    sub-long/2addr v3, v10

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzaga;

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzj:I

    .line 16
    invoke-direct {v6, v7, v3, v4}, Lcom/google/android/gms/internal/ads/zzaga;-><init>(IJ)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzk:J

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    int-to-long v7, v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_2e

    .line 17
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzagw;->zzl(J)V

    goto/16 :goto_0

    .line 18
    :cond_2e
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzagw;->zzk()V

    goto/16 :goto_0

    :cond_2f
    const-string v1, "Atom size less than header length (unsupported)."

    .line 73
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzaar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzr:Lcom/google/android/gms/internal/ads/zzaar;

    return-void
.end method

.method public final zzc(JJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzf:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzl:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzn:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzo:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzp:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzq:I

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-nez v4, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzagw;->zzk()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzs:[Lcom/google/android/gms/internal/ads/zzagv;

    .line 3
    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_3

    aget-object v2, p1, v0

    .line 4
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    .line 5
    invoke-virtual {v3, p3, p4}, Lcom/google/android/gms/internal/ads/zzahd;->zza(J)I

    move-result v4

    if-ne v4, v1, :cond_1

    .line 6
    invoke-virtual {v3, p3, p4}, Lcom/google/android/gms/internal/ads/zzahd;->zzb(J)I

    move-result v4

    .line 7
    :cond_1
    iput v4, v2, Lcom/google/android/gms/internal/ads/zzagv;->zze:I

    .line 8
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzagv;->zzd:Lcom/google/android/gms/internal/ads/zzabs;

    if-eqz v2, :cond_2

    .line 9
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzabs;->zzb()V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaap;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzagz;->zzb(Lcom/google/android/gms/internal/ads/zzaap;Z)Z

    move-result p1

    return p1
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzv:J

    return-wide v0
.end method

.method public final zzg(J)Lcom/google/android/gms/internal/ads/zzabl;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzs:[Lcom/google/android/gms/internal/ads/zzagv;

    array-length v1, v0

    if-nez v1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabl;

    sget-object p2, Lcom/google/android/gms/internal/ads/zzabo;->zza:Lcom/google/android/gms/internal/ads/zzabo;

    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzabl;-><init>(Lcom/google/android/gms/internal/ads/zzabo;Lcom/google/android/gms/internal/ads/zzabo;)V

    goto/16 :goto_3

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzu:I

    const/4 v2, -0x1

    const-wide/16 v3, -0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v1, v2, :cond_3

    .line 2
    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    .line 3
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzagw;->zzi(Lcom/google/android/gms/internal/ads/zzahd;J)I

    move-result v1

    if-ne v1, v2, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabl;

    sget-object p2, Lcom/google/android/gms/internal/ads/zzabo;->zza:Lcom/google/android/gms/internal/ads/zzabo;

    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzabl;-><init>(Lcom/google/android/gms/internal/ads/zzabo;Lcom/google/android/gms/internal/ads/zzabo;)V

    goto/16 :goto_3

    .line 4
    :cond_1
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzf:[J

    aget-wide v8, v7, v1

    .line 5
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzc:[J

    aget-wide v10, v7, v1

    cmp-long v7, v8, p1

    if-gez v7, :cond_2

    .line 6
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzb:I

    add-int/2addr v7, v2

    if-ge v1, v7, :cond_2

    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzahd;->zzb(J)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_2

    .line 8
    iget-object p2, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzf:[J

    aget-wide v1, p2, p1

    .line 9
    iget-object p2, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzc:[J

    aget-wide p1, p2, p1

    move-wide v3, p1

    goto :goto_0

    :cond_2
    move-wide v1, v5

    :goto_0
    move-wide p1, v8

    goto :goto_1

    :cond_3
    const-wide v10, 0x7fffffffffffffffL

    move-wide v1, v5

    :goto_1
    const/4 v0, 0x0

    :goto_2
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzs:[Lcom/google/android/gms/internal/ads/zzagv;

    .line 10
    array-length v8, v7

    if-ge v0, v8, :cond_6

    iget v8, p0, Lcom/google/android/gms/internal/ads/zzagw;->zzu:I

    if-eq v0, v8, :cond_5

    .line 11
    aget-object v7, v7, v0

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    .line 12
    invoke-static {v7, p1, p2, v10, v11}, Lcom/google/android/gms/internal/ads/zzagw;->zzj(Lcom/google/android/gms/internal/ads/zzahd;JJ)J

    move-result-wide v8

    cmp-long v10, v1, v5

    if-eqz v10, :cond_4

    .line 13
    invoke-static {v7, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzagw;->zzj(Lcom/google/android/gms/internal/ads/zzahd;JJ)J

    move-result-wide v3

    :cond_4
    move-wide v10, v8

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/ads/zzabo;

    .line 14
    invoke-direct {v0, p1, p2, v10, v11}, Lcom/google/android/gms/internal/ads/zzabo;-><init>(JJ)V

    cmp-long p1, v1, v5

    if-nez p1, :cond_7

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabl;

    invoke-direct {p1, v0, v0}, Lcom/google/android/gms/internal/ads/zzabl;-><init>(Lcom/google/android/gms/internal/ads/zzabo;Lcom/google/android/gms/internal/ads/zzabo;)V

    goto :goto_3

    :cond_7
    new-instance p1, Lcom/google/android/gms/internal/ads/zzabo;

    .line 15
    invoke-direct {p1, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzabo;-><init>(JJ)V

    new-instance p2, Lcom/google/android/gms/internal/ads/zzabl;

    invoke-direct {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzabl;-><init>(Lcom/google/android/gms/internal/ads/zzabo;Lcom/google/android/gms/internal/ads/zzabo;)V

    move-object p1, p2

    :goto_3
    return-object p1
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
