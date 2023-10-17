.class public final Lcom/google/android/gms/internal/ads/zzagr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaao;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaav;

.field private static final zzb:[B

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzam;


# instance fields
.field private zzA:I

.field private zzB:I

.field private zzC:Z

.field private zzD:Lcom/google/android/gms/internal/ads/zzaar;

.field private zzE:[Lcom/google/android/gms/internal/ads/zzabr;

.field private zzF:[Lcom/google/android/gms/internal/ads/zzabr;

.field private zzG:Z

.field private final zzd:Ljava/util/List;

.field private final zze:Landroid/util/SparseArray;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzi:[B

.field private final zzj:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzadi;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzm:Ljava/util/ArrayDeque;

.field private final zzn:Ljava/util/ArrayDeque;

.field private zzo:I

.field private zzp:I

.field private zzq:J

.field private zzr:I

.field private zzs:Lcom/google/android/gms/internal/ads/zzfd;

.field private zzt:J

.field private zzu:I

.field private zzv:J

.field private zzw:J

.field private zzx:J

.field private zzy:Lcom/google/android/gms/internal/ads/zzagq;

.field private zzz:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzagn;->zza:Lcom/google/android/gms/internal/ads/zzagn;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzagr;->zza:Lcom/google/android/gms/internal/ads/zzaav;

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzagr;->zzb:[B

    new-instance v0, Lcom/google/android/gms/internal/ads/zzak;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzak;-><init>()V

    const-string v1, "application/x-emsg"

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzak;->zzS(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzak;->zzY()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzagr;->zzc:Lcom/google/android/gms/internal/ads/zzam;

    return-void

    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzagr;-><init>(ILcom/google/android/gms/internal/ads/zzfl;)V

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/ads/zzfl;)V
    .locals 1

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzd:Ljava/util/List;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzadi;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzadi;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzk:Lcom/google/android/gms/internal/ads/zzadi;

    .line 5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzew;->zza:[B

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzf:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v0, 0x5

    .line 7
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzg:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    new-array p1, p2, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzi:[B

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfd;

    .line 9
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>([B)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzj:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 10
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 11
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzn:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzw:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzv:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzx:J

    sget-object p1, Lcom/google/android/gms/internal/ads/zzaar;->zza:Lcom/google/android/gms/internal/ads/zzaar;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzD:Lcom/google/android/gms/internal/ads/zzaar;

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzE:[Lcom/google/android/gms/internal/ads/zzabr;

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzF:[Lcom/google/android/gms/internal/ads/zzabr;

    return-void
.end method

.method private static zze(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzce;
        }
    .end annotation

    if-ltz p0, :cond_0

    return p0

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected negative value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object p0

    throw p0
.end method

.method private static zzf(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzad;
    .locals 14

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_a

    .line 2
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzagb;

    .line 3
    iget v6, v5, Lcom/google/android/gms/internal/ads/zzagb;->zzd:I

    const v7, 0x70737368    # 3.013775E29f

    if-ne v6, v7, :cond_9

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    .line 4
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    :cond_0
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/ads/zzfd;

    .line 6
    invoke-direct {v6, v5}, Lcom/google/android/gms/internal/ads/zzfd;-><init>([B)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v8

    const/16 v9, 0x20

    if-ge v8, v9, :cond_1

    :goto_1
    move-object v6, v2

    goto :goto_2

    .line 7
    :cond_1
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 8
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v9

    add-int/lit8 v9, v9, 0x4

    if-eq v8, v9, :cond_2

    goto :goto_1

    .line 9
    :cond_2
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v8

    if-eq v8, v7, :cond_3

    goto :goto_1

    .line 10
    :cond_3
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v7

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_4

    new-instance v6, Ljava/lang/StringBuilder;

    .line 11
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unsupported pssh version: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "PsshAtomUtil"

    invoke-static {v7, v6}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    new-instance v9, Ljava/util/UUID;

    .line 12
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzr()J

    move-result-wide v10

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzr()J

    move-result-wide v12

    invoke-direct {v9, v10, v11, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    if-ne v7, v8, :cond_5

    .line 13
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzn()I

    move-result v8

    mul-int/lit8 v8, v8, 0x10

    .line 14
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 15
    :cond_5
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzn()I

    move-result v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v10

    if-eq v8, v10, :cond_6

    goto :goto_1

    :cond_6
    new-array v10, v8, [B

    .line 16
    invoke-virtual {v6, v10, v1, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzagx;

    invoke-direct {v6, v9, v7, v10}, Lcom/google/android/gms/internal/ads/zzagx;-><init>(Ljava/util/UUID;I[B)V

    :goto_2
    if-nez v6, :cond_7

    move-object v6, v2

    goto :goto_3

    .line 19
    :cond_7
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzagx;->zza(Lcom/google/android/gms/internal/ads/zzagx;)Ljava/util/UUID;

    move-result-object v6

    :goto_3
    if-nez v6, :cond_8

    const-string v5, "FragmentedMp4Extractor"

    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    .line 17
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    new-instance v7, Lcom/google/android/gms/internal/ads/zzac;

    const-string v8, "video/mp4"

    .line 18
    invoke-direct {v7, v6, v2, v8, v5}, Lcom/google/android/gms/internal/ads/zzac;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 19
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_a
    if-nez v4, :cond_b

    return-object v2

    .line 16
    :cond_b
    new-instance p0, Lcom/google/android/gms/internal/ads/zzad;

    .line 20
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzad;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private final zzg()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    return-void
.end method

.method private static zzh(Lcom/google/android/gms/internal/ads/zzfd;ILcom/google/android/gms/internal/ads/zzahc;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzce;
        }
    .end annotation

    add-int/lit8 p1, p1, 0x8

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result p1

    const v0, 0xffffff

    and-int/2addr p1, v0

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_3

    and-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfd;->zzn()I

    move-result v1

    if-nez v1, :cond_1

    iget-object p0, p2, Lcom/google/android/gms/internal/ads/zzahc;->zzl:[Z

    iget p1, p2, Lcom/google/android/gms/internal/ads/zzahc;->zze:I

    .line 5
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void

    :cond_1
    iget v2, p2, Lcom/google/android/gms/internal/ads/zzahc;->zze:I

    if-ne v1, v2, :cond_2

    .line 6
    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzahc;->zzl:[Z

    .line 7
    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result p1

    .line 8
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzahc;->zza(I)V

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzahc;->zzn:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result p1

    .line 9
    invoke-virtual {p0, v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    iget-object p0, p2, Lcom/google/android/gms/internal/ads/zzahc;->zzn:Lcom/google/android/gms/internal/ads/zzfd;

    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iput-boolean v0, p2, Lcom/google/android/gms/internal/ads/zzahc;->zzo:Z

    return-void

    .line 5
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 6
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Senc sample count "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is different from fragment sample count"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object p0

    throw p0

    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object p0

    throw p0
.end method

.method private final zzi(J)V
    .locals 45
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzce;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4f

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaga;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzaga;->zza:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_4f

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzaga;

    .line 3
    iget v1, v2, Lcom/google/android/gms/internal/ads/zzaga;->zzd:I

    const v3, 0x6d6f6f76

    const/16 v6, 0xc

    const/16 v7, 0x8

    if-ne v1, v3, :cond_8

    .line 4
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzagr;->zzf(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzad;

    move-result-object v1

    const v3, 0x6d766578

    .line 5
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzaga;->zza(I)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v3

    .line 174
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance v12, Landroid/util/SparseArray;

    .line 6
    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    iget-object v8, v3, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    .line 7
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_4

    iget-object v13, v3, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    .line 8
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/ads/zzagb;

    .line 9
    iget v14, v13, Lcom/google/android/gms/internal/ads/zzagb;->zzd:I

    const v15, 0x74726578

    if-ne v14, v15, :cond_1

    .line 10
    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 11
    invoke-virtual {v13, v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 12
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v14

    .line 13
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    .line 14
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v10

    .line 15
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v6

    .line 16
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v13

    .line 17
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v11, Lcom/google/android/gms/internal/ads/zzagm;

    invoke-direct {v11, v15, v10, v6, v13}, Lcom/google/android/gms/internal/ads/zzagm;-><init>(IIII)V

    .line 18
    invoke-static {v14, v11}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v6

    .line 19
    iget-object v10, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Lcom/google/android/gms/internal/ads/zzagm;

    invoke-virtual {v12, v10, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    const v6, 0x6d656864

    if-ne v14, v6, :cond_3

    .line 20
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 21
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 22
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v5

    if-nez v5, :cond_2

    .line 23
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v4

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v4

    :cond_3
    :goto_2
    add-int/lit8 v9, v9, 0x1

    const/16 v6, 0xc

    goto :goto_1

    :cond_4
    new-instance v3, Lcom/google/android/gms/internal/ads/zzabd;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzabd;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/google/android/gms/internal/ads/zzago;

    invoke-direct {v9, v0}, Lcom/google/android/gms/internal/ads/zzago;-><init>(Lcom/google/android/gms/internal/ads/zzagr;)V

    move-object v6, v1

    .line 24
    invoke-static/range {v2 .. v9}, Lcom/google/android/gms/internal/ads/zzagl;->zzc(Lcom/google/android/gms/internal/ads/zzaga;Lcom/google/android/gms/internal/ads/zzabd;JLcom/google/android/gms/internal/ads/zzad;ZZLcom/google/android/gms/internal/ads/zzfon;)Ljava/util/List;

    move-result-object v1

    .line 25
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 26
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-nez v3, :cond_6

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v2, :cond_5

    .line 27
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzahd;

    .line 28
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzagq;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzD:Lcom/google/android/gms/internal/ads/zzaar;

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzaha;->zzb:I

    .line 29
    invoke-interface {v6, v10, v7}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object v6

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzaha;->zza:I

    .line 30
    invoke-static {v12, v7}, Lcom/google/android/gms/internal/ads/zzagr;->zzj(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzagm;

    move-result-object v7

    invoke-direct {v5, v6, v3, v7}, Lcom/google/android/gms/internal/ads/zzagq;-><init>(Lcom/google/android/gms/internal/ads/zzabr;Lcom/google/android/gms/internal/ads/zzahd;Lcom/google/android/gms/internal/ads/zzagm;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    iget v6, v4, Lcom/google/android/gms/internal/ads/zzaha;->zza:I

    .line 31
    invoke-virtual {v3, v6, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzw:J

    iget-wide v3, v4, Lcom/google/android/gms/internal/ads/zzaha;->zze:J

    .line 32
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzw:J

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzD:Lcom/google/android/gms/internal/ads/zzaar;

    .line 33
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzC()V

    goto/16 :goto_0

    :cond_6
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 34
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ne v3, v2, :cond_7

    const/4 v11, 0x1

    goto :goto_4

    :cond_7
    const/4 v11, 0x0

    :goto_4
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v2, :cond_0

    .line 35
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzahd;

    .line 36
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    iget v6, v4, Lcom/google/android/gms/internal/ads/zzaha;->zza:I

    .line 37
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzagq;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zzaha;->zza:I

    .line 38
    invoke-static {v12, v4}, Lcom/google/android/gms/internal/ads/zzagr;->zzj(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzagm;

    move-result-object v4

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/ads/zzagq;->zzh(Lcom/google/android/gms/internal/ads/zzahd;Lcom/google/android/gms/internal/ads/zzagm;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_8
    const v3, 0x6d6f6f66

    if-ne v1, v3, :cond_4d

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzi:[B

    .line 39
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzaga;->zzc:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v6, :cond_47

    .line 40
    iget-object v10, v2, Lcom/google/android/gms/internal/ads/zzaga;->zzc:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/ads/zzaga;

    .line 41
    iget v11, v10, Lcom/google/android/gms/internal/ads/zzaga;->zzd:I

    const v12, 0x74726166

    if-ne v11, v12, :cond_46

    const v11, 0x74666864

    .line 42
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/zzaga;->zzb(I)Lcom/google/android/gms/internal/ads/zzagb;

    move-result-object v11

    .line 182
    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 43
    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 44
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v12

    const v13, 0xffffff

    and-int/2addr v12, v13

    .line 45
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v14

    .line 46
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/ads/zzagq;

    if-nez v14, :cond_9

    const/4 v14, 0x0

    goto :goto_b

    :cond_9
    and-int/lit8 v15, v12, 0x1

    if-eqz v15, :cond_a

    .line 47
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v4

    iget-object v15, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iput-wide v4, v15, Lcom/google/android/gms/internal/ads/zzahc;->zzb:J

    iput-wide v4, v15, Lcom/google/android/gms/internal/ads/zzahc;->zzc:J

    :cond_a
    iget-object v4, v14, Lcom/google/android/gms/internal/ads/zzagq;->zze:Lcom/google/android/gms/internal/ads/zzagm;

    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_b

    .line 48
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    goto :goto_7

    .line 49
    :cond_b
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzagm;->zza:I

    :goto_7
    and-int/lit8 v15, v12, 0x8

    if-eqz v15, :cond_c

    .line 50
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v15

    goto :goto_8

    .line 51
    :cond_c
    iget v15, v4, Lcom/google/android/gms/internal/ads/zzagm;->zzb:I

    :goto_8
    and-int/lit8 v16, v12, 0x10

    if-eqz v16, :cond_d

    .line 52
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v16

    move/from16 v9, v16

    goto :goto_9

    .line 53
    :cond_d
    iget v9, v4, Lcom/google/android/gms/internal/ads/zzagm;->zzc:I

    :goto_9
    and-int/lit8 v12, v12, 0x20

    if-eqz v12, :cond_e

    .line 54
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v4

    goto :goto_a

    .line 55
    :cond_e
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzagm;->zzd:I

    .line 54
    :goto_a
    iget-object v11, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    new-instance v12, Lcom/google/android/gms/internal/ads/zzagm;

    invoke-direct {v12, v5, v15, v9, v4}, Lcom/google/android/gms/internal/ads/zzagm;-><init>(IIII)V

    iput-object v12, v11, Lcom/google/android/gms/internal/ads/zzahc;->zza:Lcom/google/android/gms/internal/ads/zzagm;

    :goto_b
    if-nez v14, :cond_f

    goto/16 :goto_2c

    .line 46
    :cond_f
    iget-object v4, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-wide v11, v4, Lcom/google/android/gms/internal/ads/zzahc;->zzp:J

    iget-boolean v5, v4, Lcom/google/android/gms/internal/ads/zzahc;->zzq:Z

    .line 56
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzagq;->zzi()V

    const/4 v9, 0x1

    .line 57
    invoke-static {v14, v9}, Lcom/google/android/gms/internal/ads/zzagq;->zzg(Lcom/google/android/gms/internal/ads/zzagq;Z)V

    const v15, 0x74666474

    .line 58
    invoke-virtual {v10, v15}, Lcom/google/android/gms/internal/ads/zzaga;->zzb(I)Lcom/google/android/gms/internal/ads/zzagb;

    move-result-object v15

    if-eqz v15, :cond_11

    iget-object v5, v15, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 59
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 60
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v11

    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v11

    if-ne v11, v9, :cond_10

    .line 61
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v11

    goto :goto_c

    :cond_10
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v11

    :goto_c
    iput-wide v11, v4, Lcom/google/android/gms/internal/ads/zzahc;->zzp:J

    iput-boolean v9, v4, Lcom/google/android/gms/internal/ads/zzahc;->zzq:Z

    goto :goto_d

    :cond_11
    iput-wide v11, v4, Lcom/google/android/gms/internal/ads/zzahc;->zzp:J

    iput-boolean v5, v4, Lcom/google/android/gms/internal/ads/zzahc;->zzq:Z

    .line 62
    :goto_d
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    .line 63
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_e
    const v13, 0x7472756e

    if-ge v11, v9, :cond_13

    .line 64
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v7, v18

    check-cast v7, Lcom/google/android/gms/internal/ads/zzagb;

    move-object/from16 v18, v1

    .line 65
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzagb;->zzd:I

    if-ne v1, v13, :cond_12

    .line 66
    iget-object v1, v7, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    const/16 v7, 0xc

    .line 67
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 68
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzn()I

    move-result v1

    if-lez v1, :cond_12

    add-int/2addr v15, v1

    add-int/lit8 v12, v12, 0x1

    :cond_12
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v18

    const/16 v7, 0x8

    goto :goto_e

    :cond_13
    move-object/from16 v18, v1

    const/4 v1, 0x0

    iput v1, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzh:I

    iput v1, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzg:I

    iput v1, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    iget-object v1, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iput v12, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzd:I

    iput v15, v1, Lcom/google/android/gms/internal/ads/zzahc;->zze:I

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzg:[I

    .line 69
    array-length v7, v7

    if-ge v7, v12, :cond_14

    new-array v7, v12, [J

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzf:[J

    new-array v7, v12, [I

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzg:[I

    :cond_14
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzh:[I

    .line 70
    array-length v7, v7

    if-ge v7, v15, :cond_15

    mul-int/lit8 v15, v15, 0x7d

    div-int/lit8 v15, v15, 0x64

    .line 71
    new-array v7, v15, [I

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzh:[I

    .line 72
    new-array v7, v15, [J

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzi:[J

    .line 73
    new-array v7, v15, [Z

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzj:[Z

    .line 74
    new-array v7, v15, [Z

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzl:[Z

    :cond_15
    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    :goto_f
    const-wide/16 v19, 0x0

    if-ge v1, v9, :cond_28

    .line 75
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/internal/ads/zzagb;

    .line 76
    iget v12, v15, Lcom/google/android/gms/internal/ads/zzagb;->zzd:I

    if-ne v12, v13, :cond_27

    add-int/lit8 v12, v7, 0x1

    .line 77
    iget-object v15, v15, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    const/16 v13, 0x8

    .line 78
    invoke-virtual {v15, v13}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 79
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v13

    const v17, 0xffffff

    and-int v13, v13, v17

    move-object/from16 v21, v5

    iget-object v5, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    .line 80
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    move/from16 v22, v6

    iget-object v6, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    move/from16 v23, v9

    iget-object v9, v6, Lcom/google/android/gms/internal/ads/zzahc;->zza:Lcom/google/android/gms/internal/ads/zzagm;

    .line 81
    sget v24, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    move/from16 v24, v12

    iget-object v12, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzg:[I

    .line 82
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zzn()I

    move-result v25

    aput v25, v12, v7

    iget-object v12, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzf:[J

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    iget-wide v2, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzb:J

    .line 83
    aput-wide v2, v12, v7

    and-int/lit8 v27, v13, 0x1

    if-eqz v27, :cond_16

    .line 84
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v0

    move/from16 v27, v1

    int-to-long v0, v0

    add-long/2addr v2, v0

    aput-wide v2, v12, v7

    goto :goto_10

    :cond_16
    move/from16 v27, v1

    :goto_10
    and-int/lit8 v0, v13, 0x4

    if-eqz v0, :cond_17

    const/4 v0, 0x1

    goto :goto_11

    :cond_17
    const/4 v0, 0x0

    .line 85
    :goto_11
    iget v1, v9, Lcom/google/android/gms/internal/ads/zzagm;->zzd:I

    if-eqz v0, :cond_18

    .line 86
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v1

    :cond_18
    and-int/lit16 v2, v13, 0x100

    and-int/lit16 v3, v13, 0x200

    and-int/lit16 v12, v13, 0x400

    and-int/lit16 v13, v13, 0x800

    move/from16 v28, v1

    iget-object v1, v5, Lcom/google/android/gms/internal/ads/zzaha;->zzh:[J

    if-eqz v1, :cond_1d

    move/from16 v29, v8

    array-length v8, v1

    move-object/from16 v30, v10

    const/4 v10, 0x1

    if-ne v8, v10, :cond_1c

    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzaha;->zzi:[J

    if-nez v8, :cond_19

    goto :goto_13

    :cond_19
    const/4 v10, 0x0

    .line 87
    aget-wide v31, v1, v10

    cmp-long v1, v31, v19

    if-nez v1, :cond_1a

    move v10, v0

    move v8, v13

    move-object/from16 v31, v14

    goto :goto_12

    .line 88
    :cond_1a
    aget-wide v33, v8, v10

    add-long v35, v31, v33

    const-wide/32 v37, 0xf4240

    move v8, v13

    move-object v1, v14

    iget-wide v13, v5, Lcom/google/android/gms/internal/ads/zzaha;->zzd:J

    move-wide/from16 v39, v13

    .line 89
    invoke-static/range {v35 .. v40}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v13

    move v10, v0

    move-object/from16 v31, v1

    iget-wide v0, v5, Lcom/google/android/gms/internal/ads/zzaha;->zze:J

    cmp-long v32, v13, v0

    if-gez v32, :cond_1b

    goto :goto_14

    .line 87
    :cond_1b
    :goto_12
    iget-object v0, v5, Lcom/google/android/gms/internal/ads/zzaha;->zzi:[J

    const/4 v1, 0x0

    .line 90
    aget-wide v19, v0, v1

    goto :goto_14

    :cond_1c
    :goto_13
    move v10, v0

    move v8, v13

    move-object/from16 v31, v14

    goto :goto_14

    :cond_1d
    move/from16 v29, v8

    move-object/from16 v30, v10

    move v8, v13

    move-object/from16 v31, v14

    move v10, v0

    .line 86
    :goto_14
    iget-object v0, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzh:[I

    iget-object v1, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzi:[J

    iget-object v13, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzj:[Z

    iget-object v14, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzg:[I

    .line 91
    aget v7, v14, v7

    add-int/2addr v7, v11

    move-object v14, v4

    iget-wide v4, v5, Lcom/google/android/gms/internal/ads/zzaha;->zzc:J

    move-object/from16 v38, v13

    move-object/from16 v39, v14

    iget-wide v13, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzp:J

    :goto_15
    if-ge v11, v7, :cond_26

    if-eqz v2, :cond_1e

    .line 92
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v32

    move/from16 v40, v2

    move/from16 v2, v32

    goto :goto_16

    :cond_1e
    move/from16 v40, v2

    iget v2, v9, Lcom/google/android/gms/internal/ads/zzagm;->zzb:I

    :goto_16
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzagr;->zze(I)I

    if-eqz v3, :cond_1f

    .line 93
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v32

    move/from16 v41, v3

    move/from16 v3, v32

    goto :goto_17

    :cond_1f
    move/from16 v41, v3

    iget v3, v9, Lcom/google/android/gms/internal/ads/zzagm;->zzc:I

    :goto_17
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzagr;->zze(I)I

    if-eqz v12, :cond_20

    .line 94
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v32

    move/from16 v42, v7

    move/from16 v7, v32

    goto :goto_18

    :cond_20
    move/from16 v42, v7

    if-nez v11, :cond_22

    if-eqz v10, :cond_21

    move/from16 v7, v28

    const/4 v11, 0x0

    goto :goto_18

    :cond_21
    const/4 v11, 0x0

    .line 95
    :cond_22
    iget v7, v9, Lcom/google/android/gms/internal/ads/zzagm;->zzd:I

    :goto_18
    if-eqz v8, :cond_23

    .line 96
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v32

    move/from16 v43, v8

    move-object/from16 v44, v9

    move/from16 v8, v32

    goto :goto_19

    :cond_23
    move/from16 v43, v8

    move-object/from16 v44, v9

    const/4 v8, 0x0

    :goto_19
    int-to-long v8, v8

    add-long/2addr v8, v13

    sub-long v32, v8, v19

    const-wide/32 v34, 0xf4240

    move-wide/from16 v36, v4

    .line 97
    invoke-static/range {v32 .. v37}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v8

    aput-wide v8, v1, v11

    move-wide/from16 v32, v4

    iget-boolean v4, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzq:Z

    if-nez v4, :cond_24

    move-object/from16 v4, v31

    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    .line 98
    iget-wide v4, v5, Lcom/google/android/gms/internal/ads/zzahd;->zzh:J

    add-long/2addr v8, v4

    aput-wide v8, v1, v11

    .line 99
    :cond_24
    aput v3, v0, v11

    const/16 v3, 0x10

    shr-int/lit8 v4, v7, 0x10

    const/4 v3, 0x1

    and-int/2addr v4, v3

    xor-int/2addr v4, v3

    if-eq v3, v4, :cond_25

    const/4 v3, 0x0

    goto :goto_1a

    :cond_25
    const/4 v3, 0x1

    .line 100
    :goto_1a
    aput-boolean v3, v38, v11

    int-to-long v2, v2

    add-long/2addr v13, v2

    add-int/lit8 v11, v11, 0x1

    move-wide/from16 v4, v32

    move/from16 v2, v40

    move/from16 v3, v41

    move/from16 v7, v42

    move/from16 v8, v43

    move-object/from16 v9, v44

    goto/16 :goto_15

    :cond_26
    move/from16 v42, v7

    .line 92
    iput-wide v13, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzp:J

    move/from16 v7, v24

    move/from16 v11, v42

    goto :goto_1b

    :cond_27
    move/from16 v27, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v39, v4

    move-object/from16 v21, v5

    move/from16 v22, v6

    move/from16 v29, v8

    move/from16 v23, v9

    move-object/from16 v30, v10

    move-object/from16 v31, v14

    const v17, 0xffffff

    :goto_1b
    add-int/lit8 v1, v27, 0x1

    move-object/from16 v0, p0

    move-object/from16 v5, v21

    move/from16 v6, v22

    move/from16 v9, v23

    move-object/from16 v2, v25

    move-object/from16 v3, v26

    move/from16 v8, v29

    move-object/from16 v10, v30

    move-object/from16 v14, v31

    move-object/from16 v4, v39

    const v13, 0x7472756e

    goto/16 :goto_f

    :cond_28
    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v39, v4

    move/from16 v22, v6

    move/from16 v29, v8

    move-object/from16 v30, v10

    .line 89
    iget-object v0, v14, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    .line 101
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    move-object/from16 v1, v39

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzahc;->zza:Lcom/google/android/gms/internal/ads/zzagm;

    .line 181
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzagm;->zza:I

    .line 102
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaha;->zza(I)Lcom/google/android/gms/internal/ads/zzahb;

    move-result-object v0

    const v2, 0x7361697a

    move-object/from16 v10, v30

    .line 103
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/ads/zzaga;->zzb(I)Lcom/google/android/gms/internal/ads/zzagb;

    move-result-object v2

    if-eqz v2, :cond_2f

    .line 180
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzahb;->zzd:I

    const/16 v4, 0x8

    .line 104
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 105
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v5

    const/4 v6, 0x1

    and-int/2addr v5, v6

    if-ne v5, v6, :cond_29

    .line 106
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 107
    :cond_29
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzk()I

    move-result v4

    .line 108
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzn()I

    move-result v5

    iget v6, v1, Lcom/google/android/gms/internal/ads/zzahc;->zze:I

    if-gt v5, v6, :cond_2e

    if-nez v4, :cond_2c

    .line 175
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzl:[Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1c
    if-ge v6, v5, :cond_2b

    .line 109
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzk()I

    move-result v8

    add-int/2addr v7, v8

    if-le v8, v3, :cond_2a

    const/4 v8, 0x1

    goto :goto_1d

    :cond_2a
    const/4 v8, 0x0

    .line 110
    :goto_1d
    aput-boolean v8, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1c

    :cond_2b
    const/4 v4, 0x0

    goto :goto_1f

    :cond_2c
    if-le v4, v3, :cond_2d

    const/4 v2, 0x1

    goto :goto_1e

    :cond_2d
    const/4 v2, 0x0

    :goto_1e
    mul-int v7, v4, v5

    .line 119
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzl:[Z

    const/4 v4, 0x0

    .line 111
    invoke-static {v3, v4, v5, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 110
    :goto_1f
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzl:[Z

    iget v3, v1, Lcom/google/android/gms/internal/ads/zzahc;->zze:I

    .line 112
    invoke-static {v2, v5, v3, v4}, Ljava/util/Arrays;->fill([ZIIZ)V

    if-lez v7, :cond_2f

    .line 113
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzahc;->zza(I)V

    goto :goto_20

    .line 108
    :cond_2e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 175
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Saiz sample count "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is greater than fragment sample count"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v0

    throw v0

    :cond_2f
    :goto_20
    const v2, 0x7361696f

    .line 114
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/ads/zzaga;->zzb(I)Lcom/google/android/gms/internal/ads/zzagb;

    move-result-object v2

    if-eqz v2, :cond_33

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    const/16 v3, 0x8

    .line 115
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 116
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v4

    and-int/lit8 v5, v4, 0x1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_30

    .line 117
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 118
    :cond_30
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzn()I

    move-result v3

    if-ne v3, v6, :cond_32

    .line 176
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v3

    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzc:J

    if-nez v3, :cond_31

    .line 119
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v2

    goto :goto_21

    :cond_31
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v2

    :goto_21
    add-long/2addr v4, v2

    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzc:J

    goto :goto_22

    .line 118
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 176
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected saio entry count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v0

    throw v0

    :cond_33
    :goto_22
    const/4 v2, 0x0

    const v3, 0x73656e63

    .line 120
    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/ads/zzaga;->zzb(I)Lcom/google/android/gms/internal/ads/zzagb;

    move-result-object v3

    if-eqz v3, :cond_34

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v4, 0x0

    .line 121
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzagr;->zzh(Lcom/google/android/gms/internal/ads/zzfd;ILcom/google/android/gms/internal/ads/zzahc;)V

    :cond_34
    if-eqz v0, :cond_35

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahb;->zzb:Ljava/lang/String;

    move-object/from16 v32, v0

    goto :goto_23

    :cond_35
    move-object/from16 v32, v2

    :goto_23
    move-object v0, v2

    move-object v3, v0

    const/4 v4, 0x0

    .line 122
    :goto_24
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_38

    .line 123
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzagb;

    .line 124
    iget-object v6, v5, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 125
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzagb;->zzd:I

    const v7, 0x73626770

    const v8, 0x73656967

    if-ne v5, v7, :cond_36

    const/16 v7, 0xc

    .line 126
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 127
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v5

    if-ne v5, v8, :cond_37

    move-object v0, v6

    goto :goto_25

    :cond_36
    const/16 v7, 0xc

    const v9, 0x73677064

    if-ne v5, v9, :cond_37

    .line 128
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 129
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v5

    if-ne v5, v8, :cond_37

    move-object v3, v6

    :cond_37
    :goto_25
    add-int/lit8 v4, v4, 0x1

    goto :goto_24

    :cond_38
    const/16 v7, 0xc

    if-eqz v0, :cond_41

    if-nez v3, :cond_39

    goto/16 :goto_28

    :cond_39
    const/16 v4, 0x8

    .line 130
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 131
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v5

    const/4 v6, 0x4

    .line 132
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    const/4 v8, 0x1

    if-ne v5, v8, :cond_3a

    .line 133
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 134
    :cond_3a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v0

    if-ne v0, v8, :cond_40

    .line 135
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 136
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v0

    .line 137
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    if-ne v0, v8, :cond_3c

    .line 138
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v4

    cmp-long v0, v4, v19

    if-eqz v0, :cond_3b

    goto :goto_26

    :cond_3b
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 178
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v0

    throw v0

    :cond_3c
    const/4 v4, 0x2

    if-lt v0, v4, :cond_3d

    .line 139
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 140
    :cond_3d
    :goto_26
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v4

    const-wide/16 v8, 0x1

    cmp-long v0, v4, v8

    if-nez v0, :cond_3f

    const/4 v0, 0x1

    .line 141
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 142
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzk()I

    move-result v4

    and-int/lit16 v5, v4, 0xf0

    shr-int/lit8 v35, v5, 0x4

    and-int/lit8 v36, v4, 0xf

    .line 143
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzk()I

    move-result v4

    if-ne v4, v0, :cond_42

    .line 144
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzk()I

    move-result v33

    const/16 v4, 0x10

    new-array v5, v4, [B

    const/4 v6, 0x0

    .line 145
    invoke-virtual {v3, v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    if-nez v33, :cond_3e

    .line 146
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzk()I

    move-result v2

    new-array v9, v2, [B

    .line 147
    invoke-virtual {v3, v9, v6, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    move-object/from16 v37, v9

    goto :goto_27

    :cond_3e
    move-object/from16 v37, v2

    :goto_27
    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzk:Z

    new-instance v2, Lcom/google/android/gms/internal/ads/zzahb;

    const/16 v31, 0x1

    move-object/from16 v30, v2

    move-object/from16 v34, v5

    .line 148
    invoke-direct/range {v30 .. v37}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(ZLjava/lang/String;I[BII[B)V

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzahc;->zzm:Lcom/google/android/gms/internal/ads/zzahb;

    goto :goto_29

    :cond_3f
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 179
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v0

    throw v0

    :cond_40
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 177
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v0

    throw v0

    :cond_41
    :goto_28
    const/4 v0, 0x1

    .line 149
    :cond_42
    :goto_29
    iget-object v2, v10, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_2a
    if-ge v3, v2, :cond_45

    .line 150
    iget-object v4, v10, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzagb;

    .line 151
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzagb;->zzd:I

    const v6, 0x75756964

    if-ne v5, v6, :cond_43

    .line 152
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    const/16 v5, 0x8

    .line 153
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    move-object/from16 v8, v26

    const/4 v6, 0x0

    const/16 v9, 0x10

    .line 154
    invoke-virtual {v4, v8, v6, v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    sget-object v11, Lcom/google/android/gms/internal/ads/zzagr;->zzb:[B

    .line 155
    invoke-static {v8, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11

    if-eqz v11, :cond_44

    .line 156
    invoke-static {v4, v9, v1}, Lcom/google/android/gms/internal/ads/zzagr;->zzh(Lcom/google/android/gms/internal/ads/zzfd;ILcom/google/android/gms/internal/ads/zzahc;)V

    goto :goto_2b

    :cond_43
    move-object/from16 v8, v26

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v9, 0x10

    :cond_44
    :goto_2b
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v26, v8

    goto :goto_2a

    :cond_45
    move-object/from16 v8, v26

    const/16 v5, 0x8

    const/4 v6, 0x0

    goto :goto_2d

    :cond_46
    :goto_2c
    move-object/from16 v18, v1

    move-object/from16 v25, v2

    move/from16 v22, v6

    move/from16 v29, v8

    const/4 v0, 0x1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v7, 0xc

    move-object v8, v3

    :goto_2d
    add-int/lit8 v1, v29, 0x1

    move-object/from16 v0, p0

    move-object v3, v8

    move/from16 v6, v22

    move-object/from16 v2, v25

    const/16 v7, 0x8

    move v8, v1

    move-object/from16 v1, v18

    goto/16 :goto_6

    :cond_47
    move-object v1, v2

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 157
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzaga;->zzb:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzagr;->zzf(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzad;

    move-result-object v0

    move-object/from16 v3, p0

    if-eqz v0, :cond_49

    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 158
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_2e
    if-ge v4, v1, :cond_49

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 159
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzagq;

    iget-object v7, v5, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    .line 160
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzahc;->zza:Lcom/google/android/gms/internal/ads/zzagm;

    .line 161
    sget v9, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget v8, v8, Lcom/google/android/gms/internal/ads/zzagm;->zza:I

    .line 162
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzaha;->zza(I)Lcom/google/android/gms/internal/ads/zzahb;

    move-result-object v7

    if-eqz v7, :cond_48

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzahb;->zzb:Ljava/lang/String;

    goto :goto_2f

    :cond_48
    move-object v7, v2

    .line 163
    :goto_2f
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzad;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzad;

    move-result-object v7

    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    .line 164
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    .line 165
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzam;->zzb()Lcom/google/android/gms/internal/ads/zzak;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzak;->zzB(Lcom/google/android/gms/internal/ads/zzad;)Lcom/google/android/gms/internal/ads/zzak;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzak;->zzY()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v7

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    .line 166
    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2e

    :cond_49
    iget-wide v0, v3, Lcom/google/android/gms/internal/ads/zzagr;->zzv:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v4

    if-eqz v2, :cond_4e

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 167
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v10, 0x0

    :goto_30
    if-ge v10, v0, :cond_4c

    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 168
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzagq;

    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/zzagr;->zzv:J

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    :goto_31
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget v7, v6, Lcom/google/android/gms/internal/ads/zzahc;->zze:I

    if-ge v2, v7, :cond_4b

    iget-object v7, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzi:[J

    .line 169
    aget-wide v8, v7, v2

    cmp-long v7, v8, v4

    if-gtz v7, :cond_4b

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzahc;->zzj:[Z

    .line 170
    aget-boolean v6, v6, v2

    if-eqz v6, :cond_4a

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzagq;->zzi:I

    :cond_4a
    add-int/lit8 v2, v2, 0x1

    goto :goto_31

    :cond_4b
    add-int/lit8 v10, v10, 0x1

    goto :goto_30

    :cond_4c
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v3, Lcom/google/android/gms/internal/ads/zzagr;->zzv:J

    goto :goto_32

    :cond_4d
    move-object v3, v0

    move-object v1, v2

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 171
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4e

    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 172
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaga;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaga;->zzc(Lcom/google/android/gms/internal/ads/zzaga;)V

    :cond_4e
    :goto_32
    move-object v0, v3

    goto/16 :goto_0

    :cond_4f
    move-object v3, v0

    .line 173
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzagr;->zzg()V

    return-void
.end method

.method private static final zzj(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzagm;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzagm;

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzagm;

    .line 4
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaap;Lcom/google/android/gms/internal/ads/zzabk;)I
    .locals 33
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    :goto_0
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    const v3, 0x656d7367

    const v4, 0x73696478

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_30

    const-string v10, "FragmentedMp4Extractor"

    if-eq v2, v8, :cond_22

    const-wide v3, 0x7fffffffffffffffL

    const/4 v12, 0x3

    if-eq v2, v5, :cond_1d

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzy:Lcom/google/android/gms/internal/ads/zzagq;

    if-nez v2, :cond_7

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v13

    move-wide v14, v3

    move-object v3, v7

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v13, :cond_3

    .line 2
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Lcom/google/android/gms/internal/ads/zzagq;

    .line 3
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzagq;->zzj(Lcom/google/android/gms/internal/ads/zzagq;)Z

    move-result v16

    if-nez v16, :cond_0

    iget v11, v5, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget v6, v6, Lcom/google/android/gms/internal/ads/zzahd;->zzb:I

    if-eq v11, v6, :cond_2

    :cond_0
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzagq;->zzj(Lcom/google/android/gms/internal/ads/zzagq;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, v5, Lcom/google/android/gms/internal/ads/zzagq;->zzh:I

    iget-object v11, v5, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget v11, v11, Lcom/google/android/gms/internal/ads/zzahc;->zzd:I

    if-ne v6, v11, :cond_1

    goto :goto_2

    .line 4
    :cond_1
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzagq;->zzd()J

    move-result-wide v18

    cmp-long v6, v18, v14

    if-gez v6, :cond_2

    move-object v3, v5

    move-wide/from16 v14, v18

    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x2

    goto :goto_1

    :cond_3
    if-nez v3, :cond_5

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzt:J

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v3, v2

    if-ltz v3, :cond_4

    .line 86
    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzaae;

    .line 5
    invoke-virtual {v2, v3, v9}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    .line 6
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzagr;->zzg()V

    goto :goto_0

    :cond_4
    const-string v1, "Offset to end of mdat was negative."

    .line 86
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    .line 87
    :cond_5
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzagq;->zzd()J

    move-result-wide v4

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v13

    sub-long/2addr v4, v13

    long-to-int v2, v4

    if-gez v2, :cond_6

    const-string v2, "Ignoring negative offset to sample data."

    .line 88
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_6
    move-object v4, v1

    check-cast v4, Lcom/google/android/gms/internal/ads/zzaae;

    .line 89
    invoke-virtual {v4, v2, v9}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzy:Lcom/google/android/gms/internal/ads/zzagq;

    move-object v2, v3

    :cond_7
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    const/4 v4, 0x6

    if-ne v3, v12, :cond_f

    .line 90
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagq;->zzb()I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    .line 91
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzi:I

    if-ge v5, v6, :cond_c

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaae;

    .line 92
    invoke-virtual {v1, v3, v9}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    .line 93
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagq;->zzf()Lcom/google/android/gms/internal/ads/zzahb;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_3

    .line 97
    :cond_8
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzahc;->zzn:Lcom/google/android/gms/internal/ads/zzfd;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzahb;->zzd:I

    if-eqz v1, :cond_9

    .line 94
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    :cond_9
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    .line 95
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzahc;->zzb(I)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 96
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzo()I

    move-result v1

    mul-int/lit8 v1, v1, 0x6

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 97
    :cond_a
    :goto_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagq;->zzk()Z

    move-result v1

    if-nez v1, :cond_b

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzy:Lcom/google/android/gms/internal/ads/zzagq;

    :cond_b
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    :goto_4
    const/4 v1, 0x0

    goto/16 :goto_f

    .line 98
    :cond_c
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzaha;->zzg:I

    if-ne v5, v8, :cond_d

    add-int/lit8 v3, v3, -0x8

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaae;

    const/16 v5, 0x8

    .line 99
    invoke-virtual {v3, v5, v9}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    .line 100
    :cond_d
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v5, "audio/ac4"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    const/4 v5, 0x7

    .line 101
    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzagq;->zzc(II)I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzj:Lcom/google/android/gms/internal/ads/zzfd;

    .line 102
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zzzs;->zzb(ILcom/google/android/gms/internal/ads/zzfd;)V

    .line 103
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzj:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-interface {v3, v6, v5}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    add-int/2addr v3, v5

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    goto :goto_5

    .line 129
    :cond_e
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    .line 104
    invoke-virtual {v2, v3, v9}, Lcom/google/android/gms/internal/ads/zzagq;->zzc(II)I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    .line 103
    :goto_5
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    add-int/2addr v5, v3

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    const/4 v3, 0x4

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    iput v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    .line 105
    :cond_f
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    .line 106
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    .line 107
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagq;->zze()J

    move-result-wide v10

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzaha;->zzj:I

    if-nez v6, :cond_10

    :goto_6
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    if-ge v3, v4, :cond_17

    sub-int/2addr v4, v3

    .line 108
    invoke-interface {v5, v1, v4, v9}, Lcom/google/android/gms/internal/ads/zzabr;->zze(Lcom/google/android/gms/internal/ads/zzt;IZ)I

    move-result v3

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    add-int/2addr v4, v3

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    goto :goto_6

    .line 140
    :cond_10
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzg:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v13

    .line 109
    aput-byte v9, v13, v9

    .line 110
    aput-byte v9, v13, v8

    const/4 v14, 0x2

    .line 111
    aput-byte v9, v13, v14

    add-int/lit8 v14, v6, 0x1

    const/4 v15, 0x4

    rsub-int/lit8 v6, v6, 0x4

    :goto_7
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    if-ge v15, v12, :cond_17

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    const-string v15, "video/hevc"

    if-nez v12, :cond_15

    move-object v12, v1

    check-cast v12, Lcom/google/android/gms/internal/ads/zzaae;

    .line 112
    invoke-virtual {v12, v13, v6, v14, v9}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzg:Lcom/google/android/gms/internal/ads/zzfd;

    .line 113
    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzg:Lcom/google/android/gms/internal/ads/zzfd;

    .line 114
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v12

    if-lez v12, :cond_14

    add-int/lit8 v12, v12, -0x1

    .line 141
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzf:Lcom/google/android/gms/internal/ads/zzfd;

    .line 115
    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzf:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v9, 0x4

    .line 116
    invoke-interface {v5, v12, v9}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzg:Lcom/google/android/gms/internal/ads/zzfd;

    .line 117
    invoke-interface {v5, v12, v8}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzF:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 118
    array-length v12, v12

    if-lez v12, :cond_13

    iget-object v12, v3, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    aget-byte v17, v13, v9

    .line 119
    sget-object v9, Lcom/google/android/gms/internal/ads/zzew;->zza:[B

    const-string v9, "video/avc"

    .line 120
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    and-int/lit8 v9, v17, 0x1f

    if-eq v9, v4, :cond_11

    goto :goto_9

    :cond_11
    :goto_8
    const/4 v9, 0x1

    goto :goto_a

    .line 121
    :cond_12
    :goto_9
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_13

    and-int/lit8 v9, v17, 0x7e

    shr-int/2addr v9, v8

    const/16 v12, 0x27

    if-ne v9, v12, :cond_13

    goto :goto_8

    :cond_13
    const/4 v9, 0x0

    :goto_a
    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzC:Z

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    add-int/lit8 v9, v9, 0x5

    iput v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    add-int/2addr v9, v6

    iput v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    goto :goto_c

    :cond_14
    const-string v1, "Invalid NAL length"

    .line 141
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    .line 121
    :cond_15
    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzC:Z

    if-eqz v9, :cond_16

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    .line 122
    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/ads/zzfd;->zzC(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v9

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    move-object v4, v1

    check-cast v4, Lcom/google/android/gms/internal/ads/zzaae;

    const/4 v8, 0x0

    .line 123
    invoke-virtual {v4, v9, v8, v12, v8}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    .line 124
    invoke-interface {v5, v4, v8}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v9

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v8

    .line 125
    invoke-static {v9, v8}, Lcom/google/android/gms/internal/ads/zzew;->zzb([BI)I

    move-result v8

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    iget-object v12, v3, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    .line 126
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    .line 127
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzE(I)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzh:Lcom/google/android/gms/internal/ads/zzfd;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzF:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 128
    invoke-static {v10, v11, v8, v9}, Lcom/google/android/gms/internal/ads/zzaab;->zza(JLcom/google/android/gms/internal/ads/zzfd;[Lcom/google/android/gms/internal/ads/zzabr;)V

    goto :goto_b

    :cond_16
    const/4 v4, 0x0

    .line 129
    invoke-interface {v5, v1, v12, v4}, Lcom/google/android/gms/internal/ads/zzabr;->zze(Lcom/google/android/gms/internal/ads/zzt;IZ)I

    move-result v8

    move v4, v8

    .line 128
    :goto_b
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    add-int/2addr v8, v4

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzA:I

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    sub-int/2addr v8, v4

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzB:I

    const/4 v4, 0x6

    const/4 v8, 0x1

    :goto_c
    const/4 v9, 0x0

    const/4 v12, 0x3

    goto/16 :goto_7

    .line 130
    :cond_17
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagq;->zza()I

    move-result v20

    .line 131
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagq;->zzf()Lcom/google/android/gms/internal/ads/zzahb;

    move-result-object v1

    if-eqz v1, :cond_18

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzahb;->zzc:Lcom/google/android/gms/internal/ads/zzabq;

    move-object/from16 v23, v1

    goto :goto_d

    :cond_18
    move-object/from16 v23, v7

    :goto_d
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzz:I

    const/16 v22, 0x0

    move-object/from16 v17, v5

    move-wide/from16 v18, v10

    move/from16 v21, v1

    .line 132
    invoke-interface/range {v17 .. v23}, Lcom/google/android/gms/internal/ads/zzabr;->zzs(JIIILcom/google/android/gms/internal/ads/zzabq;)V

    :cond_19
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzn:Ljava/util/ArrayDeque;

    .line 133
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1b

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzn:Ljava/util/ArrayDeque;

    .line 134
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzagp;

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    .line 135
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzagp;->zzc:I

    sub-int/2addr v3, v4

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    .line 136
    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/zzagp;->zza:J

    .line 137
    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzagp;->zzb:Z

    if-eqz v5, :cond_1a

    add-long/2addr v3, v10

    :cond_1a
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzE:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 138
    array-length v6, v5

    const/4 v8, 0x0

    :goto_e
    if-ge v8, v6, :cond_19

    aget-object v12, v5, v8

    const/4 v15, 0x1

    .line 139
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzagp;->zzc:I

    iget v13, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    const/16 v18, 0x0

    move/from16 v17, v13

    move-wide v13, v3

    move/from16 v16, v9

    invoke-interface/range {v12 .. v18}, Lcom/google/android/gms/internal/ads/zzabr;->zzs(JIIILcom/google/android/gms/internal/ads/zzabq;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_e

    .line 140
    :cond_1b
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagq;->zzk()Z

    move-result v1

    if-nez v1, :cond_1c

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzy:Lcom/google/android/gms/internal/ads/zzagq;

    :cond_1c
    const/4 v1, 0x3

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    goto/16 :goto_4

    :goto_f
    return v1

    .line 14
    :cond_1d
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 80
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    move-object v6, v7

    const/4 v5, 0x0

    :goto_10
    if-ge v5, v2, :cond_1f

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 81
    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/ads/zzagq;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzahc;->zzo:Z

    if-eqz v9, :cond_1e

    iget-wide v8, v8, Lcom/google/android/gms/internal/ads/zzahc;->zzc:J

    cmp-long v10, v8, v3

    if-gez v10, :cond_1e

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 82
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/google/android/gms/internal/ads/zzagq;

    move-wide v3, v8

    :cond_1e
    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    :cond_1f
    if-nez v6, :cond_20

    const/4 v2, 0x3

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    goto/16 :goto_0

    :cond_20
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v8

    sub-long/2addr v3, v8

    long-to-int v2, v3

    if-ltz v2, :cond_21

    .line 150
    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaae;

    const/4 v4, 0x0

    .line 83
    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    iget-object v2, v6, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzahc;->zzn:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()I

    move-result v5

    .line 84
    invoke-virtual {v3, v6, v4, v5, v4}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzahc;->zzn:Lcom/google/android/gms/internal/ads/zzfd;

    .line 85
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iput-boolean v4, v2, Lcom/google/android/gms/internal/ads/zzahc;->zzo:Z

    goto/16 :goto_0

    :cond_21
    const-string v1, "Offset to encryption data was negative."

    .line 151
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    .line 104
    :cond_22
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    long-to-int v2, v5

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    sub-int/2addr v2, v5

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzs:Lcom/google/android/gms/internal/ads/zzfd;

    if-eqz v5, :cond_2f

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v6

    move-object v8, v1

    check-cast v8, Lcom/google/android/gms/internal/ads/zzaae;

    const/16 v9, 0x8

    const/4 v11, 0x0

    .line 24
    invoke-virtual {v8, v6, v9, v2, v11}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    new-instance v2, Lcom/google/android/gms/internal/ads/zzagb;

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzp:I

    invoke-direct {v2, v6, v5}, Lcom/google/android/gms/internal/ads/zzagb;-><init>(ILcom/google/android/gms/internal/ads/zzfd;)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v5

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 25
    invoke-virtual {v8}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_23

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 26
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaga;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzaga;->zzd(Lcom/google/android/gms/internal/ads/zzagb;)V

    goto/16 :goto_18

    .line 79
    :cond_23
    iget v8, v2, Lcom/google/android/gms/internal/ads/zzagb;->zzd:I

    if-ne v8, v4, :cond_27

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    const/16 v3, 0x8

    .line 27
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 28
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v3

    const/4 v4, 0x4

    .line 29
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 30
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v14

    if-nez v3, :cond_24

    .line 31
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v3

    .line 32
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v8

    goto :goto_11

    .line 33
    :cond_24
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v3

    .line 34
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v8

    :goto_11
    add-long/2addr v5, v8

    const-wide/32 v10, 0xf4240

    move-wide v8, v3

    move-wide v12, v14

    .line 35
    invoke-static/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v19

    const/4 v8, 0x2

    .line 36
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 37
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzo()I

    move-result v12

    new-array v13, v12, [I

    new-array v10, v12, [J

    new-array v11, v12, [J

    new-array v8, v12, [J

    move-wide/from16 v21, v19

    const/4 v9, 0x0

    :goto_12
    if-ge v9, v12, :cond_26

    .line 38
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v17

    const/high16 v23, -0x80000000

    and-int v23, v17, v23

    if-nez v23, :cond_25

    .line 39
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v23

    const v25, 0x7fffffff

    and-int v17, v17, v25

    .line 40
    aput v17, v13, v9

    .line 41
    aput-wide v5, v10, v9

    .line 42
    aput-wide v21, v8, v9

    add-long v3, v3, v23

    const-wide/32 v21, 0xf4240

    move-object v7, v8

    move/from16 v24, v9

    move-wide v8, v3

    move-wide/from16 v25, v3

    move-object v3, v10

    move-object v4, v11

    move-wide/from16 v10, v21

    move/from16 v17, v12

    move-object v1, v13

    move-wide v12, v14

    .line 43
    invoke-static/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v21

    .line 44
    aget-wide v8, v7, v24

    sub-long v8, v21, v8

    aput-wide v8, v4, v24

    const/4 v8, 0x4

    .line 45
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    .line 46
    aget v9, v1, v24

    int-to-long v9, v9

    add-long/2addr v5, v9

    add-int/lit8 v9, v24, 0x1

    move-object v13, v1

    move-object v10, v3

    move-object v11, v4

    move-object v8, v7

    move/from16 v12, v17

    move-wide/from16 v3, v25

    const/4 v7, 0x0

    move-object/from16 v1, p1

    goto :goto_12

    :cond_25
    const-string v1, "Unhandled indirect reference"

    const/4 v2, 0x0

    .line 146
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzce;->zza(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    :cond_26
    move-object v7, v8

    move-object v3, v10

    move-object v4, v11

    move-object v1, v13

    .line 47
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v5, Lcom/google/android/gms/internal/ads/zzaac;

    invoke-direct {v5, v1, v3, v4, v7}, Lcom/google/android/gms/internal/ads/zzaac;-><init>([I[J[J[J)V

    .line 48
    invoke-static {v2, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    .line 49
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzx:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzD:Lcom/google/android/gms/internal/ads/zzaar;

    .line 50
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzabn;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzN(Lcom/google/android/gms/internal/ads/zzabn;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzG:Z

    goto/16 :goto_17

    :cond_27
    if-ne v8, v3, :cond_2e

    .line 34
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/zzagb;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzE:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 51
    array-length v2, v2

    if-eqz v2, :cond_2e

    const/16 v2, 0x8

    .line 52
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 53
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzagc;->zze(I)I

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_29

    const/4 v5, 0x1

    if-eq v2, v5, :cond_28

    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipping unsupported emsg version: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_17

    .line 60
    :cond_28
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v5

    .line 61
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v11

    const-wide/32 v13, 0xf4240

    move-wide v15, v5

    invoke-static/range {v11 .. v16}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v7

    .line 62
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v11

    const-wide/16 v13, 0x3e8

    invoke-static/range {v11 .. v16}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v5

    .line 63
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v9

    const/4 v2, 0x0

    .line 64
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzv(C)Ljava/lang/String;

    move-result-object v11

    .line 150
    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzv(C)Ljava/lang/String;

    move-result-object v12

    .line 149
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-wide/from16 v28, v5

    move-wide/from16 v30, v9

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move-wide v5, v3

    move-wide v12, v7

    goto :goto_14

    :cond_29
    const/4 v2, 0x0

    .line 54
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzv(C)Ljava/lang/String;

    move-result-object v11

    .line 148
    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzv(C)Ljava/lang/String;

    move-result-object v12

    .line 147
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v13

    .line 57
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v5

    const-wide/32 v7, 0xf4240

    move-wide v9, v13

    invoke-static/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v15

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzx:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_2a

    add-long/2addr v5, v15

    move-wide/from16 v19, v5

    goto :goto_13

    :cond_2a
    move-wide/from16 v19, v3

    .line 58
    :goto_13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    move-wide v9, v13

    invoke-static/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzfn;->zzp(JJJ)J

    move-result-wide v5

    .line 59
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v9

    move-wide/from16 v28, v5

    move-wide/from16 v30, v9

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move-wide v5, v15

    move-wide/from16 v12, v19

    :goto_14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v2

    .line 66
    new-array v2, v2, [B

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v7

    const/4 v8, 0x0

    .line 67
    invoke-virtual {v1, v2, v8, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    .line 68
    new-instance v1, Lcom/google/android/gms/internal/ads/zzadh;

    move-object/from16 v25, v1

    move-object/from16 v32, v2

    invoke-direct/range {v25 .. v32}, Lcom/google/android/gms/internal/ads/zzadh;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfd;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzk:Lcom/google/android/gms/internal/ads/zzadi;

    .line 69
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/ads/zzadi;->zza(Lcom/google/android/gms/internal/ads/zzadh;)[B

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>([B)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v1

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzE:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 70
    array-length v8, v7

    const/4 v9, 0x0

    :goto_15
    if-ge v9, v8, :cond_2b

    aget-object v10, v7, v9

    const/4 v11, 0x0

    .line 71
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    .line 72
    invoke-interface {v10, v2, v1}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_15

    :cond_2b
    cmp-long v2, v12, v3

    if-nez v2, :cond_2c

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzn:Ljava/util/ArrayDeque;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzagp;

    const/4 v4, 0x1

    invoke-direct {v3, v5, v6, v4, v1}, Lcom/google/android/gms/internal/ads/zzagp;-><init>(JZI)V

    .line 73
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    add-int/2addr v2, v1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    goto :goto_17

    :cond_2c
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzn:Ljava/util/ArrayDeque;

    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2d

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzn:Ljava/util/ArrayDeque;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzagp;

    const/4 v4, 0x0

    invoke-direct {v3, v12, v13, v4, v1}, Lcom/google/android/gms/internal/ads/zzagp;-><init>(JZI)V

    .line 75
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    add-int/2addr v2, v1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    goto :goto_17

    :cond_2d
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzE:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 76
    array-length v3, v2

    const/4 v4, 0x0

    :goto_16
    if-ge v4, v3, :cond_2e

    aget-object v5, v2, v4

    const/4 v8, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-wide v6, v12

    move v9, v1

    .line 77
    invoke-interface/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zzabr;->zzs(JIIILcom/google/android/gms/internal/ads/zzabq;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :cond_2e
    :goto_17
    move-object/from16 v1, p1

    goto :goto_18

    .line 65
    :cond_2f
    move-object v3, v1

    check-cast v3, Lcom/google/android/gms/internal/ads/zzaae;

    const/4 v5, 0x0

    .line 23
    invoke-virtual {v3, v2, v5}, Lcom/google/android/gms/internal/ads/zzaae;->zzo(IZ)Z

    .line 26
    :goto_18
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v2

    .line 79
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzagr;->zzi(J)V

    goto/16 :goto_0

    :cond_30
    const/4 v5, 0x0

    .line 23
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    if-nez v2, :cond_32

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v2

    const/16 v6, 0x8

    const/4 v7, 0x1

    .line 7
    invoke-interface {v1, v2, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzaap;->zzn([BIIZ)Z

    move-result v2

    if-nez v2, :cond_31

    const/4 v1, -0x1

    return v1

    :cond_31
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    .line 8
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    .line 9
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzs()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    .line 10
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zze()I

    move-result v2

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzp:I

    :cond_32
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    const-wide/16 v7, 0x1

    cmp-long v2, v5, v7

    if-nez v2, :cond_33

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v2

    move-object v5, v1

    check-cast v5, Lcom/google/android/gms/internal/ads/zzaae;

    const/16 v6, 0x8

    const/4 v7, 0x0

    .line 11
    invoke-virtual {v5, v2, v6, v6, v7}, Lcom/google/android/gms/internal/ads/zzaae;->zzn([BIIZ)Z

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    add-int/2addr v2, v6

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    .line 12
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzt()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    goto :goto_1a

    :cond_33
    const-wide/16 v7, 0x0

    cmp-long v2, v5, v7

    if-nez v2, :cond_36

    .line 145
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzd()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v2, v5, v7

    if-nez v2, :cond_35

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_34

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzaga;

    iget-wide v5, v2, Lcom/google/android/gms/internal/ads/zzaga;->zza:J

    goto :goto_19

    :cond_34
    move-wide v5, v7

    :cond_35
    :goto_19
    cmp-long v2, v5, v7

    if-eqz v2, :cond_36

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v7

    sub-long/2addr v5, v7

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    int-to-long v7, v2

    add-long/2addr v5, v7

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    .line 12
    :cond_36
    :goto_1a
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    int-to-long v7, v2

    cmp-long v2, v5, v7

    if-ltz v2, :cond_43

    .line 142
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v5

    sub-long/2addr v5, v7

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzp:I

    const v7, 0x6d646174

    const v8, 0x6d6f6f66

    if-eq v2, v8, :cond_37

    if-ne v2, v7, :cond_38

    :cond_37
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzG:Z

    if-nez v2, :cond_38

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzD:Lcom/google/android/gms/internal/ads/zzaar;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzabm;

    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzw:J

    invoke-direct {v9, v10, v11, v5, v6}, Lcom/google/android/gms/internal/ads/zzabm;-><init>(JJ)V

    .line 15
    invoke-interface {v2, v9}, Lcom/google/android/gms/internal/ads/zzaar;->zzN(Lcom/google/android/gms/internal/ads/zzabn;)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzG:Z

    :cond_38
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzp:I

    if-ne v2, v8, :cond_39

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 16
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v9, 0x0

    :goto_1b
    if-ge v9, v2, :cond_39

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 17
    invoke-virtual {v10, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/ads/zzagq;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iput-wide v5, v10, Lcom/google/android/gms/internal/ads/zzahc;->zzc:J

    iput-wide v5, v10, Lcom/google/android/gms/internal/ads/zzahc;->zzb:J

    add-int/lit8 v9, v9, 0x1

    goto :goto_1b

    :cond_39
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzp:I

    if-ne v2, v7, :cond_3a

    const/4 v7, 0x0

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzy:Lcom/google/android/gms/internal/ads/zzagq;

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    add-long/2addr v5, v2

    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzt:J

    const/4 v2, 0x2

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    goto/16 :goto_0

    :cond_3a
    const v5, 0x6d6f6f76

    if-eq v2, v5, :cond_41

    const v5, 0x7472616b

    if-eq v2, v5, :cond_41

    const v5, 0x6d646961

    if-eq v2, v5, :cond_41

    const v5, 0x6d696e66

    if-eq v2, v5, :cond_41

    const v5, 0x7374626c

    if-eq v2, v5, :cond_41

    if-eq v2, v8, :cond_41

    const v5, 0x74726166

    if-eq v2, v5, :cond_41

    const v5, 0x6d766578

    if-eq v2, v5, :cond_41

    const v5, 0x65647473

    if-ne v2, v5, :cond_3b

    goto/16 :goto_1d

    :cond_3b
    const v5, 0x68646c72    # 4.3148E24f

    const-wide/32 v6, 0x7fffffff

    if-eq v2, v5, :cond_3e

    const v5, 0x6d646864

    if-eq v2, v5, :cond_3e

    const v5, 0x6d766864

    if-eq v2, v5, :cond_3e

    if-eq v2, v4, :cond_3e

    const v4, 0x73747364

    if-eq v2, v4, :cond_3e

    const v4, 0x73747473

    if-eq v2, v4, :cond_3e

    const v4, 0x63747473

    if-eq v2, v4, :cond_3e

    const v4, 0x73747363

    if-eq v2, v4, :cond_3e

    const v4, 0x7374737a

    if-eq v2, v4, :cond_3e

    const v4, 0x73747a32

    if-eq v2, v4, :cond_3e

    const v4, 0x7374636f

    if-eq v2, v4, :cond_3e

    const v4, 0x636f3634

    if-eq v2, v4, :cond_3e

    const v4, 0x73747373

    if-eq v2, v4, :cond_3e

    const v4, 0x74666474

    if-eq v2, v4, :cond_3e

    const v4, 0x74666864

    if-eq v2, v4, :cond_3e

    const v4, 0x746b6864

    if-eq v2, v4, :cond_3e

    const v4, 0x74726578

    if-eq v2, v4, :cond_3e

    const v4, 0x7472756e

    if-eq v2, v4, :cond_3e

    const v4, 0x70737368    # 3.013775E29f

    if-eq v2, v4, :cond_3e

    const v4, 0x7361697a

    if-eq v2, v4, :cond_3e

    const v4, 0x7361696f

    if-eq v2, v4, :cond_3e

    const v4, 0x73656e63

    if-eq v2, v4, :cond_3e

    const v4, 0x75756964

    if-eq v2, v4, :cond_3e

    const v4, 0x73626770

    if-eq v2, v4, :cond_3e

    const v4, 0x73677064

    if-eq v2, v4, :cond_3e

    const v4, 0x656c7374

    if-eq v2, v4, :cond_3e

    const v4, 0x6d656864

    if-eq v2, v4, :cond_3e

    if-ne v2, v3, :cond_3c

    goto :goto_1c

    .line 22
    :cond_3c
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    cmp-long v4, v2, v6

    if-gtz v4, :cond_3d

    const/4 v2, 0x0

    .line 145
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzs:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v2, 0x1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    goto/16 :goto_0

    :cond_3d
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    .line 20
    :cond_3e
    :goto_1c
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    const/16 v3, 0x8

    if-ne v2, v3, :cond_40

    .line 143
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    cmp-long v2, v4, v6

    if-gtz v2, :cond_3f

    .line 21
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfd;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    long-to-int v5, v4

    invoke-direct {v2, v5}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzl:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v5

    const/4 v6, 0x0

    .line 22
    invoke-static {v4, v6, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzs:Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v2, 0x1

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzo:I

    goto/16 :goto_0

    :cond_3f
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 144
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    :cond_40
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 143
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1

    .line 17
    :cond_41
    :goto_1d
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzaap;->zzf()J

    move-result-wide v3

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    add-long/2addr v3, v5

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzaga;

    const-wide/16 v7, -0x8

    add-long/2addr v3, v7

    .line 18
    invoke-direct {v6, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzaga;-><init>(IJ)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzq:J

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagr;->zzr:I

    int-to-long v7, v2

    cmp-long v2, v5, v7

    if-nez v2, :cond_42

    .line 19
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzagr;->zzi(J)V

    goto/16 :goto_0

    .line 20
    :cond_42
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzagr;->zzg()V

    goto/16 :goto_0

    :cond_43
    const-string v1, "Atom size less than header length (unsupported)."

    .line 142
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzce;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v1

    throw v1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzaar;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzD:Lcom/google/android/gms/internal/ads/zzaar;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzagr;->zzg()V

    const/4 p1, 0x2

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzE:[Lcom/google/android/gms/internal/ads/zzabr;

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzfn;->zzF([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzE:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 3
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    sget-object v4, Lcom/google/android/gms/internal/ads/zzagr;->zzc:Lcom/google/android/gms/internal/ads/zzam;

    .line 4
    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzd:Ljava/util/List;

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzF:[Lcom/google/android/gms/internal/ads/zzabr;

    const/16 p1, 0x64

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzF:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 6
    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzD:Lcom/google/android/gms/internal/ads/zzaar;

    add-int/lit8 v2, p1, 0x1

    const/4 v3, 0x3

    .line 7
    invoke-interface {v1, p1, v3}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzd:Ljava/util/List;

    .line 8
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzam;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzF:[Lcom/google/android/gms/internal/ads/zzabr;

    .line 9
    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    move p1, v2

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final zzc(JJ)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zze:Landroid/util/SparseArray;

    .line 2
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzagq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzagq;->zzi()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzn:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzu:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzv:J

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagr;->zzm:Ljava/util/ArrayDeque;

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzagr;->zzg()V

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
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzagz;->zza(Lcom/google/android/gms/internal/ads/zzaap;)Z

    move-result p1

    return p1
.end method
