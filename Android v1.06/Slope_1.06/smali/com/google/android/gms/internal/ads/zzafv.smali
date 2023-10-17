.class public final Lcom/google/android/gms/internal/ads/zzafv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaao;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaav;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzaec;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzabh;

.field private final zze:Lcom/google/android/gms/internal/ads/zzabd;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzabf;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzabr;

.field private zzh:Lcom/google/android/gms/internal/ads/zzaar;

.field private zzi:Lcom/google/android/gms/internal/ads/zzabr;

.field private zzj:Lcom/google/android/gms/internal/ads/zzabr;

.field private zzk:I

.field private zzl:Lcom/google/android/gms/internal/ads/zzca;

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:I

.field private zzq:Lcom/google/android/gms/internal/ads/zzafx;

.field private zzr:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzaft;->zza:Lcom/google/android/gms/internal/ads/zzaft;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzafv;->zza:Lcom/google/android/gms/internal/ads/zzaav;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzafu;->zza:Lcom/google/android/gms/internal/ads/zzafu;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzafv;->zzb:Lcom/google/android/gms/internal/ads/zzaec;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzafv;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabh;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzabh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzabd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zze:Lcom/google/android/gms/internal/ads/zzabd;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzm:J

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabf;

    .line 3
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzabf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzf:Lcom/google/android/gms/internal/ads/zzabf;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaan;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaan;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzg:Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzj:Lcom/google/android/gms/internal/ads/zzabr;

    return-void
.end method

.method private final zzf(Lcom/google/android/gms/internal/ads/zzaap;)I
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput",
            "realTrackOutput"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzk:I

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    :try_start_0
    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzafv;->zzk(Lcom/google/android/gms/internal/ads/zzaap;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return v3

    :cond_0
    :goto_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    const/4 v8, 0x1

    if-nez v2, :cond_15

    .line 2
    new-instance v14, Lcom/google/android/gms/internal/ads/zzfd;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzabh;->zzc:I

    invoke-direct {v14, v2}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v2

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v9, v9, Lcom/google/android/gms/internal/ads/zzabh;->zzc:I

    move-object v15, v1

    check-cast v15, Lcom/google/android/gms/internal/ads/zzaae;

    .line 3
    invoke-virtual {v15, v2, v4, v9, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v9, v2, Lcom/google/android/gms/internal/ads/zzabh;->zza:I

    and-int/2addr v9, v8

    const/16 v10, 0x24

    const/16 v11, 0x15

    if-eqz v9, :cond_1

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzabh;->zze:I

    if-eq v2, v8, :cond_2

    const/16 v2, 0x24

    goto :goto_1

    .line 7
    :cond_1
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzabh;->zze:I

    if-eq v2, v8, :cond_3

    :cond_2
    const/16 v2, 0x15

    goto :goto_1

    :cond_3
    const/16 v11, 0xd

    const/16 v2, 0xd

    .line 3
    :goto_1
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v9

    add-int/lit8 v11, v2, 0x4

    const v12, 0x58696e67

    const v13, 0x56425249

    const v8, 0x496e666f

    if-lt v9, v11, :cond_5

    .line 4
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 5
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v9

    if-eq v9, v12, :cond_4

    if-ne v9, v8, :cond_5

    const v11, 0x496e666f

    goto :goto_2

    :cond_4
    move v11, v9

    goto :goto_2

    .line 18
    :cond_5
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v9

    const/16 v11, 0x28

    if-lt v9, v11, :cond_6

    .line 6
    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 7
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v9

    if-ne v9, v13, :cond_6

    const v11, 0x56425249

    goto :goto_2

    :cond_6
    const/4 v11, 0x0

    :goto_2
    if-eq v11, v12, :cond_9

    if-ne v11, v8, :cond_7

    goto :goto_3

    :cond_7
    if-ne v11, v13, :cond_8

    .line 28
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzd()J

    move-result-wide v9

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v11

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    .line 16
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzafy;->zza(JJLcom/google/android/gms/internal/ads/zzabh;Lcom/google/android/gms/internal/ads/zzfd;)Lcom/google/android/gms/internal/ads/zzafy;

    move-result-object v2

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v8, v8, Lcom/google/android/gms/internal/ads/zzabh;->zzc:I

    .line 17
    invoke-virtual {v15, v8, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    goto :goto_4

    .line 18
    :cond_8
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    const/4 v2, 0x0

    goto :goto_4

    .line 5
    :cond_9
    :goto_3
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzd()J

    move-result-wide v9

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v12

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    move v5, v11

    move-wide v11, v12

    move-object v13, v7

    .line 8
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzafz;->zza(JJLcom/google/android/gms/internal/ads/zzabh;Lcom/google/android/gms/internal/ads/zzfd;)Lcom/google/android/gms/internal/ads/zzafz;

    move-result-object v6

    if-eqz v6, :cond_b

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzafv;->zze:Lcom/google/android/gms/internal/ads/zzabd;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzabd;->zza()Z

    move-result v7

    if-nez v7, :cond_b

    .line 9
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    add-int/lit16 v2, v2, 0x8d

    .line 10
    invoke-virtual {v15, v2, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzl(IZ)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v2

    const/4 v7, 0x3

    .line 11
    invoke-virtual {v15, v2, v4, v7, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 12
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zze:Lcom/google/android/gms/internal/ads/zzabd;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 13
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzm()I

    move-result v7

    shr-int/lit8 v9, v7, 0xc

    and-int/lit16 v7, v7, 0xfff

    if-gtz v9, :cond_a

    if-lez v7, :cond_b

    :cond_a
    iput v9, v2, Lcom/google/android/gms/internal/ads/zzabd;->zza:I

    iput v7, v2, Lcom/google/android/gms/internal/ads/zzabd;->zzb:I

    :cond_b
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzabh;->zzc:I

    .line 14
    invoke-virtual {v15, v2, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    if-eqz v6, :cond_c

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzafx;->zzh()Z

    move-result v2

    if-nez v2, :cond_c

    if-ne v5, v8, :cond_c

    .line 15
    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzafv;->zzh(Lcom/google/android/gms/internal/ads/zzaap;Z)Lcom/google/android/gms/internal/ads/zzafx;

    move-result-object v2

    goto :goto_4

    :cond_c
    move-object v2, v6

    :goto_4
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzl:Lcom/google/android/gms/internal/ads/zzca;

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v6

    if-eqz v5, :cond_10

    .line 19
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzca;->zza()I

    move-result v8

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_10

    .line 20
    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/ads/zzca;->zzb(I)Lcom/google/android/gms/internal/ads/zzbz;

    move-result-object v10

    .line 21
    instance-of v11, v10, Lcom/google/android/gms/internal/ads/zzaej;

    if-eqz v11, :cond_f

    .line 22
    check-cast v10, Lcom/google/android/gms/internal/ads/zzaej;

    .line 23
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzca;->zza()I

    move-result v8

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v8, :cond_e

    .line 24
    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/ads/zzca;->zzb(I)Lcom/google/android/gms/internal/ads/zzbz;

    move-result-object v11

    .line 25
    instance-of v12, v11, Lcom/google/android/gms/internal/ads/zzaen;

    if-eqz v12, :cond_d

    check-cast v11, Lcom/google/android/gms/internal/ads/zzaen;

    iget-object v12, v11, Lcom/google/android/gms/internal/ads/zzaen;->zzf:Ljava/lang/String;

    const-string v13, "TLEN"

    .line 26
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    .line 27
    iget-object v5, v11, Lcom/google/android/gms/internal/ads/zzaen;->zzc:Lcom/google/android/gms/internal/ads/zzfrr;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzfrr;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v8

    goto :goto_7

    :cond_d
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_e
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    :goto_7
    invoke-static {v6, v7, v10, v8, v9}, Lcom/google/android/gms/internal/ads/zzafs;->zza(JLcom/google/android/gms/internal/ads/zzaej;J)Lcom/google/android/gms/internal/ads/zzafs;

    move-result-object v5

    goto :goto_8

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_10
    const/4 v5, 0x0

    :goto_8
    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzr:Z

    if-eqz v6, :cond_11

    new-instance v2, Lcom/google/android/gms/internal/ads/zzafw;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzafw;-><init>()V

    goto :goto_a

    :cond_11
    if-eqz v5, :cond_12

    move-object v2, v5

    goto :goto_9

    :cond_12
    if-nez v2, :cond_13

    const/4 v2, 0x0

    :cond_13
    :goto_9
    if-eqz v2, :cond_14

    .line 51
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzafx;->zzh()Z

    goto :goto_a

    .line 28
    :cond_14
    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzafv;->zzh(Lcom/google/android/gms/internal/ads/zzaap;Z)Lcom/google/android/gms/internal/ads/zzafx;

    move-result-object v2

    .line 22
    :goto_a
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzh:Lcom/google/android/gms/internal/ads/zzaar;

    .line 29
    invoke-interface {v5, v2}, Lcom/google/android/gms/internal/ads/zzaar;->zzN(Lcom/google/android/gms/internal/ads/zzabn;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzj:Lcom/google/android/gms/internal/ads/zzabr;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzak;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzak;-><init>()V

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzabh;->zzb:Ljava/lang/String;

    .line 30
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzak;->zzS(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;

    const/16 v6, 0x1000

    .line 31
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzak;->zzL(I)Lcom/google/android/gms/internal/ads/zzak;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v6, v6, Lcom/google/android/gms/internal/ads/zzabh;->zze:I

    .line 32
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzak;->zzw(I)Lcom/google/android/gms/internal/ads/zzak;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v6, v6, Lcom/google/android/gms/internal/ads/zzabh;->zzd:I

    .line 33
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzak;->zzT(I)Lcom/google/android/gms/internal/ads/zzak;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zze:Lcom/google/android/gms/internal/ads/zzabd;

    iget v6, v6, Lcom/google/android/gms/internal/ads/zzabd;->zza:I

    .line 34
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzak;->zzC(I)Lcom/google/android/gms/internal/ads/zzak;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zze:Lcom/google/android/gms/internal/ads/zzabd;

    iget v6, v6, Lcom/google/android/gms/internal/ads/zzabd;->zzb:I

    .line 35
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzak;->zzD(I)Lcom/google/android/gms/internal/ads/zzak;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzl:Lcom/google/android/gms/internal/ads/zzca;

    .line 36
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzak;->zzM(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzak;

    .line 37
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzak;->zzY()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v5

    .line 38
    invoke-interface {v2, v5}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzo:J

    goto :goto_b

    .line 7
    :cond_15
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzo:J

    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-eqz v2, :cond_16

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v7

    cmp-long v2, v7, v5

    if-gez v2, :cond_16

    sub-long/2addr v5, v7

    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzaae;

    long-to-int v6, v5

    .line 39
    invoke-virtual {v2, v6, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    .line 38
    :cond_16
    :goto_b
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzp:I

    if-nez v2, :cond_1c

    .line 40
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    .line 41
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzafv;->zzj(Lcom/google/android/gms/internal/ads/zzaap;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto/16 :goto_f

    :cond_17
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 42
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 43
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v2

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzk:I

    int-to-long v5, v5

    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzafv;->zzi(IJ)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 44
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzabi;->zzb(I)I

    move-result v5

    if-ne v5, v3, :cond_18

    goto :goto_c

    .line 45
    :cond_18
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    .line 46
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzabh;->zza(I)Z

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzm:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v5, v7

    if-nez v2, :cond_19

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v5

    .line 47
    invoke-interface {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzafx;->zzc(J)J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzm:J

    :cond_19
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v5, v2, Lcom/google/android/gms/internal/ads/zzabh;->zzc:I

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzp:I

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    .line 48
    instance-of v7, v6, Lcom/google/android/gms/internal/ads/zzafr;

    if-nez v7, :cond_1a

    move v2, v5

    goto :goto_d

    .line 52
    :cond_1a
    check-cast v6, Lcom/google/android/gms/internal/ads/zzafr;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzn:J

    iget v1, v2, Lcom/google/android/gms/internal/ads/zzabh;->zzg:I

    int-to-long v1, v1

    add-long/2addr v3, v1

    .line 53
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzafv;->zzg(J)J

    const/4 v1, 0x0

    .line 54
    throw v1

    .line 44
    :cond_1b
    :goto_c
    check-cast v1, Lcom/google/android/gms/internal/ads/zzaae;

    const/4 v5, 0x1

    .line 45
    invoke-virtual {v1, v5, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzk:I

    goto :goto_e

    :cond_1c
    :goto_d
    const/4 v5, 0x1

    .line 48
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzj:Lcom/google/android/gms/internal/ads/zzabr;

    .line 49
    invoke-interface {v6, v1, v2, v5}, Lcom/google/android/gms/internal/ads/zzabr;->zze(Lcom/google/android/gms/internal/ads/zzt;IZ)I

    move-result v1

    if-ne v1, v3, :cond_1d

    goto :goto_f

    :cond_1d
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzp:I

    sub-int/2addr v2, v1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzp:I

    if-lez v2, :cond_1e

    :goto_e
    const/4 v3, 0x0

    :goto_f
    return v3

    :cond_1e
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzj:Lcom/google/android/gms/internal/ads/zzabr;

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzn:J

    .line 50
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzafv;->zzg(J)J

    move-result-wide v6

    const/4 v8, 0x1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v9, v1, Lcom/google/android/gms/internal/ads/zzabh;->zzc:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 51
    invoke-interface/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zzabr;->zzs(JIIILcom/google/android/gms/internal/ads/zzabq;)V

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzn:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzabh;->zzg:I

    int-to-long v5, v3

    add-long/2addr v1, v5

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzn:J

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzafv;->zzp:I

    return v4
.end method

.method private final zzg(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzm:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzabh;->zzd:I

    int-to-long v2, v2

    const-wide/32 v4, 0xf4240

    mul-long p1, p1, v4

    div-long/2addr p1, v2

    add-long/2addr v0, p1

    return-wide v0
.end method

.method private final zzh(Lcom/google/android/gms/internal/ads/zzaap;Z)Lcom/google/android/gms/internal/ads/zzafx;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object p2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaae;

    const/4 v1, 0x0

    const/4 v2, 0x4

    .line 1
    invoke-virtual {v0, p2, v1, v2, v1}, Lcom/google/android/gms/internal/ads/zzaae;->zzm([BIIZ)Z

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 2
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzabh;->zza(I)Z

    new-instance p2, Lcom/google/android/gms/internal/ads/zzafq;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzd()J

    move-result-wide v2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    const/4 v7, 0x0

    move-object v1, p2

    .line 4
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzafq;-><init>(JJLcom/google/android/gms/internal/ads/zzabh;Z)V

    return-object p2
.end method

.method private static zzi(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long p0, p1, v2

    cmp-long p2, v0, p0

    if-nez p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final zzj(Lcom/google/android/gms/internal/ads/zzaap;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzafx;->zzb()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zze()J

    move-result-wide v4

    const-wide/16 v6, -0x4

    add-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v0

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-interface {p1, v0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzaap;->zzm([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v3

    :catch_0
    return v1
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzaap;Z)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-nez v6, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzf:Lcom/google/android/gms/internal/ads/zzabf;

    .line 2
    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzabf;->zza(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzaec;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzl:Lcom/google/android/gms/internal/ads/zzca;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zze:Lcom/google/android/gms/internal/ads/zzabd;

    .line 3
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzabd;->zzb(Lcom/google/android/gms/internal/ads/zzca;)Z

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zze()J

    move-result-wide v0

    long-to-int v1, v0

    if-nez p2, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaae;

    .line 4
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 5
    :goto_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzafv;->zzj(Lcom/google/android/gms/internal/ads/zzaap;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_4

    if-lez v4, :cond_3

    goto :goto_4

    .line 14
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 17
    :cond_4
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 6
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 7
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v6

    if-eqz v0, :cond_5

    int-to-long v8, v0

    invoke-static {v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzafv;->zzi(IJ)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 8
    :cond_5
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzabi;->zzb(I)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_b

    :cond_6
    if-eq v7, p2, :cond_7

    const/high16 v0, 0x20000

    goto :goto_2

    :cond_7
    const v0, 0x8000

    :goto_2
    add-int/lit8 v4, v5, 0x1

    if-ne v5, v0, :cond_9

    if-eqz p2, :cond_8

    return v3

    :cond_8
    const-string p1, "Searched too many bytes."

    .line 15
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object p1

    throw p1

    :cond_9
    if-eqz p2, :cond_a

    .line 10
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    add-int v0, v1, v4

    move-object v5, p1

    check-cast v5, Lcom/google/android/gms/internal/ads/zzaae;

    .line 11
    invoke-virtual {v5, v0, v3}, Lcom/google/android/gms/internal/ads/zzaae;->zzl(IZ)Z

    goto :goto_3

    :cond_a
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaae;

    .line 9
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    :goto_3
    move v5, v4

    const/4 v0, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_b
    add-int/lit8 v4, v4, 0x1

    if-ne v4, v7, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzd:Lcom/google/android/gms/internal/ads/zzabh;

    .line 12
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzabh;->zza(I)Z

    move v0, v6

    goto :goto_6

    :cond_c
    const/4 v6, 0x4

    if-ne v4, v6, :cond_e

    :goto_4
    if-eqz p2, :cond_d

    add-int/2addr v1, v5

    .line 5
    check-cast p1, Lcom/google/android/gms/internal/ads/zzaae;

    .line 16
    invoke-virtual {p1, v1, v3}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    goto :goto_5

    .line 17
    :cond_d
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzj()V

    .line 16
    :goto_5
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzk:I

    return v7

    :cond_e
    :goto_6
    add-int/lit8 v8, v8, -0x4

    .line 12
    move-object v6, p1

    check-cast v6, Lcom/google/android/gms/internal/ads/zzaae;

    .line 13
    invoke-virtual {v6, v8, v3}, Lcom/google/android/gms/internal/ads/zzaae;->zzl(IZ)Z

    goto :goto_1
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
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzi:Lcom/google/android/gms/internal/ads/zzabr;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget p2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzafv;->zzf(Lcom/google/android/gms/internal/ads/zzaap;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    .line 4
    instance-of p2, p2, Lcom/google/android/gms/internal/ads/zzafr;

    if-eqz p2, :cond_1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzn:J

    .line 5
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzafv;->zzg(J)J

    move-result-wide v0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    .line 6
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzafx;->zze()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    .line 7
    check-cast p1, Lcom/google/android/gms/internal/ads/zzafr;

    const/4 p1, 0x0

    .line 8
    throw p1

    :cond_1
    :goto_0
    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzaar;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzh:Lcom/google/android/gms/internal/ads/zzaar;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzi:Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzj:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzh:Lcom/google/android/gms/internal/ads/zzaar;

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaar;->zzC()V

    return-void
.end method

.method public final zzc(JJ)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzk:I

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzm:J

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzn:J

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzp:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzq:Lcom/google/android/gms/internal/ads/zzafx;

    instance-of p2, p1, Lcom/google/android/gms/internal/ads/zzafr;

    if-nez p2, :cond_0

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/zzafr;

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaap;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzafv;->zzk(Lcom/google/android/gms/internal/ads/zzaap;Z)Z

    move-result p1

    return p1
.end method

.method public final zze()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzafv;->zzr:Z

    return-void
.end method
