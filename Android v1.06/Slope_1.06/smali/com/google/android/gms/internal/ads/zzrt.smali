.class public abstract Lcom/google/android/gms/internal/ads/zzrt;
.super Lcom/google/android/gms/internal/ads/zzhr;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field private static final zzb:[B


# instance fields
.field private zzA:Lcom/google/android/gms/internal/ads/zzrr;

.field private zzB:Lcom/google/android/gms/internal/ads/zzrp;

.field private zzC:I

.field private zzD:Z

.field private zzE:Z

.field private zzF:Z

.field private zzG:Z

.field private zzH:Z

.field private zzI:Z

.field private zzJ:Z

.field private zzK:Z

.field private zzL:Z

.field private zzM:Lcom/google/android/gms/internal/ads/zzrh;

.field private zzN:J

.field private zzO:I

.field private zzP:I

.field private zzQ:Ljava/nio/ByteBuffer;

.field private zzR:Z

.field private zzS:Z

.field private zzT:Z

.field private zzU:Z

.field private zzV:Z

.field private zzW:Z

.field private zzX:I

.field private zzY:I

.field private zzZ:I

.field protected zza:Lcom/google/android/gms/internal/ads/zzhs;

.field private zzaa:Z

.field private zzab:Z

.field private zzac:Z

.field private zzad:J

.field private zzae:J

.field private zzaf:Z

.field private zzag:Z

.field private zzah:Z

.field private zzai:Lcom/google/android/gms/internal/ads/zzrs;

.field private zzaj:J

.field private zzak:Z

.field private zzal:Lcom/google/android/gms/internal/ads/zzqs;

.field private zzam:Lcom/google/android/gms/internal/ads/zzqs;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzrl;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzrv;

.field private final zze:F

.field private final zzf:Lcom/google/android/gms/internal/ads/zzhi;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzhi;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzhi;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzrg;

.field private final zzj:Ljava/util/ArrayList;

.field private final zzk:Landroid/media/MediaCodec$BufferInfo;

.field private final zzl:Ljava/util/ArrayDeque;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzqd;

.field private zzn:Lcom/google/android/gms/internal/ads/zzam;

.field private zzo:Lcom/google/android/gms/internal/ads/zzam;

.field private zzp:Landroid/media/MediaCrypto;

.field private zzq:Z

.field private zzr:J

.field private zzs:F

.field private zzt:F

.field private zzu:Lcom/google/android/gms/internal/ads/zzrm;

.field private zzv:Lcom/google/android/gms/internal/ads/zzam;

.field private zzw:Landroid/media/MediaFormat;

.field private zzx:Z

.field private zzy:F

.field private zzz:Ljava/util/ArrayDeque;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzrt;->zzb:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/ads/zzrl;Lcom/google/android/gms/internal/ads/zzrv;ZF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzhr;-><init>(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzc:Lcom/google/android/gms/internal/ads/zzrl;

    .line 14
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzd:Lcom/google/android/gms/internal/ads/zzrv;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zze:F

    .line 2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhi;

    const/4 p2, 0x0

    .line 3
    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzhi;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzf:Lcom/google/android/gms/internal/ads/zzhi;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzhi;

    .line 4
    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzhi;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzhi;

    const/4 p3, 0x2

    .line 5
    invoke-direct {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzhi;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzrg;

    .line 6
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzrg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    new-instance p3, Ljava/util/ArrayList;

    .line 7
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzj:Ljava/util/ArrayList;

    .line 8
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzs:F

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzt:F

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzr:J

    new-instance p5, Ljava/util/ArrayDeque;

    .line 9
    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    sget-object p5, Lcom/google/android/gms/internal/ads/zzrs;->zza:Lcom/google/android/gms/internal/ads/zzrs;

    .line 10
    invoke-direct {p0, p5}, Lcom/google/android/gms/internal/ads/zzrt;->zzaD(Lcom/google/android/gms/internal/ads/zzrs;)V

    .line 11
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzhi;->zzj(I)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzb:Ljava/nio/ByteBuffer;

    .line 12
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzqd;

    .line 13
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzqd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzm:Lcom/google/android/gms/internal/ads/zzqd;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzy:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzC:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzP:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzN:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzae:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaj:J

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    return-void
.end method

.method private final zzV()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzV:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzU:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzT:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzm:Lcom/google/android/gms/internal/ads/zzqd;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzqd;->zzb()V

    return-void
.end method

.method private final zzW()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzap()V

    return-void
.end method

.method private final zzaA()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 6
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzag()V

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzap()V

    return-void

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzad()V

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaE()V

    return-void

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzad()V

    return-void
.end method

.method private final zzaB()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzaC()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzP:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzQ:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzaD(Lcom/google/android/gms/internal/ads/zzrs;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzrs;->zzc:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzak:Z

    :cond_0
    return-void
.end method

.method private final zzaE()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    throw v0
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v2, 0x0

    const/16 v3, 0x1776

    .line 2
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object v0

    .line 3
    throw v0
.end method

.method private final zzaF()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzE:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzG:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaE()V

    :goto_1
    return v1
.end method

.method private final zzaG()Z
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    const/4 v1, 0x0

    if-eqz v0, :cond_21

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_21

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    if-eqz v2, :cond_0

    goto/16 :goto_6

    :cond_0
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    if-gez v2, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrm;->zza()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    if-gez v0, :cond_1

    return v1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    .line 2
    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/ads/zzrm;->zzf(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzL:Z

    if-nez v0, :cond_3

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzab:Z

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    .line 4
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzrm;->zzj(IIIJI)V

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaB()V

    :cond_3
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    return v1

    :cond_4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzJ:Z

    if-eqz v0, :cond_5

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzJ:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzrt;->zzb:[B

    .line 6
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    const/4 v5, 0x0

    const/16 v6, 0x26

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    .line 7
    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzrm;->zzj(IIIJI)V

    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaB()V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    return v2

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    if-ne v0, v2, :cond_7

    const/4 v0, 0x0

    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    .line 9
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_6

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    .line 10
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    .line 11
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzh()Lcom/google/android/gms/internal/ads/zzkf;

    move-result-object v4

    :try_start_0
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    .line 14
    invoke-virtual {p0, v4, v5, v1}, Lcom/google/android/gms/internal/ads/zzhr;->zzbd(Lcom/google/android/gms/internal/ads/zzkf;Lcom/google/android/gms/internal/ads/zzhi;I)I

    move-result v5
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzhh; {:try_start_0 .. :try_end_0} :catch_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzI()Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzhc;->zzi()Z

    move-result v6

    if-eqz v6, :cond_9

    :cond_8
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzae:J

    :cond_9
    const/4 v6, -0x3

    if-ne v5, v6, :cond_a

    return v1

    :cond_a
    const/4 v7, -0x5

    if-ne v5, v7, :cond_c

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    if-ne v0, v3, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    .line 19
    :cond_b
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzrt;->zzU(Lcom/google/android/gms/internal/ads/zzkf;)Lcom/google/android/gms/internal/ads/zzht;

    return v2

    :cond_c
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzg()Z

    move-result v5

    if-eqz v5, :cond_10

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    if-ne v0, v3, :cond_d

    .line 20
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    :cond_d
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    if-nez v0, :cond_e

    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaA()V

    return v1

    :cond_e
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzL:Z

    if-nez v0, :cond_f

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzab:Z

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x4

    .line 22
    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzrm;->zzj(IIIJI)V

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaB()V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_f
    return v1

    :catch_0
    move-exception v0

    .line 55
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 24
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzh(I)I

    move-result v3

    .line 25
    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object v0

    .line 26
    throw v0

    .line 23
    :cond_10
    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    if-nez v5, :cond_12

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzh()Z

    move-result v5

    if-nez v5, :cond_12

    .line 58
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    if-ne v0, v3, :cond_11

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    :cond_11
    return v2

    :cond_12
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhi;->zzl()Z

    move-result v3

    if-eqz v3, :cond_13

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzhi;->zza:Lcom/google/android/gms/internal/ads/zzhf;

    .line 27
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzhf;->zzb(I)V

    :cond_13
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzD:Z

    if-eqz v0, :cond_1a

    if-nez v3, :cond_1a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    .line 28
    sget-object v4, Lcom/google/android/gms/internal/ads/zzew;->zza:[B

    .line 29
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_1
    add-int/lit8 v8, v5, 0x1

    if-ge v8, v4, :cond_18

    .line 30
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    const/4 v10, 0x3

    if-ne v7, v10, :cond_15

    if-ne v9, v2, :cond_16

    .line 31
    invoke-virtual {v0, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v9

    and-int/lit8 v9, v9, 0x1f

    const/4 v10, 0x7

    if-ne v9, v10, :cond_14

    .line 32
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v7

    add-int/2addr v5, v6

    .line 33
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 34
    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 35
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 36
    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_3

    :cond_14
    const/4 v9, 0x1

    goto :goto_2

    :cond_15
    if-nez v9, :cond_16

    add-int/lit8 v7, v7, 0x1

    :cond_16
    :goto_2
    if-eqz v9, :cond_17

    const/4 v7, 0x0

    :cond_17
    move v5, v8

    goto :goto_1

    .line 37
    :cond_18
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 36
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    .line 38
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    if-nez v0, :cond_19

    return v2

    :cond_19
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzD:Z

    :cond_1a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzhi;->zzd:J

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzM:Lcom/google/android/gms/internal/ads/zzrh;

    if-eqz v6, :cond_1b

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 39
    invoke-virtual {v6, v4, v0}, Lcom/google/android/gms/internal/ads/zzrh;->zzb(Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzhi;)J

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzM:Lcom/google/android/gms/internal/ads/zzrh;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 40
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzrh;->zza(Lcom/google/android/gms/internal/ads/zzam;)J

    move-result-wide v8

    .line 41
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    :cond_1b
    move-wide v12, v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhc;->zzf()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzj:Ljava/util/ArrayList;

    .line 42
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzah:Z

    if-eqz v0, :cond_1e

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1d

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzrs;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzrs;->zzd:Lcom/google/android/gms/internal/ads/zzfk;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v0, v12, v13, v4}, Lcom/google/android/gms/internal/ads/zzfk;->zzd(JLjava/lang/Object;)V

    goto :goto_4

    .line 52
    :cond_1d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    .line 45
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzrs;->zzd:Lcom/google/android/gms/internal/ads/zzfk;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    invoke-virtual {v0, v12, v13, v4}, Lcom/google/android/gms/internal/ads/zzfk;->zzd(JLjava/lang/Object;)V

    .line 44
    :goto_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzah:Z

    :cond_1e
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    .line 46
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    .line 47
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhi;->zzk()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhc;->zze()Z

    move-result v4

    if-eqz v4, :cond_1f

    .line 48
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzao(Lcom/google/android/gms/internal/ads/zzhi;)V

    :cond_1f
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    .line 49
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaf(Lcom/google/android/gms/internal/ads/zzhi;)V

    if-eqz v3, :cond_20

    :try_start_2
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget v9, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    const/4 v10, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzhi;->zza:Lcom/google/android/gms/internal/ads/zzhf;

    const/4 v14, 0x0

    .line 50
    invoke-interface/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzrm;->zzk(IILcom/google/android/gms/internal/ads/zzhf;JI)V

    goto :goto_5

    .line 57
    :cond_20
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget v9, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzO:I

    const/4 v10, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzg:Lcom/google/android/gms/internal/ads/zzhi;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhi;->zzb:Ljava/nio/ByteBuffer;

    .line 51
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v11

    const/4 v14, 0x0

    .line 52
    invoke-interface/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzrm;->zzj(IIIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    .line 56
    :goto_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaB()V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zza:Lcom/google/android/gms/internal/ads/zzhs;

    .line 57
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhs;->zzc:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzhs;->zzc:I

    return v2

    :catch_1
    move-exception v0

    .line 37
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 53
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzh(I)I

    move-result v3

    .line 54
    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object v0

    .line 55
    throw v0

    :catch_2
    move-exception v0

    .line 15
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzZ(Ljava/lang/Exception;)V

    .line 16
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzrt;->zzaI(I)Z

    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzad()V

    return v2

    :cond_21
    :goto_6
    return v1
.end method

.method private final zzaH()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzP:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final zzaI(I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzh()Lcom/google/android/gms/internal/ads/zzkf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzf:Lcom/google/android/gms/internal/ads/zzhi;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzf:Lcom/google/android/gms/internal/ads/zzhi;

    or-int/lit8 p1, p1, 0x4

    .line 3
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzhr;->zzbd(Lcom/google/android/gms/internal/ads/zzkf;Lcom/google/android/gms/internal/ads/zzhi;I)I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, -0x5

    if-ne p1, v2, :cond_0

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzU(Lcom/google/android/gms/internal/ads/zzkf;)Lcom/google/android/gms/internal/ads/zzht;

    return v1

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzf:Lcom/google/android/gms/internal/ads/zzhi;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhc;->zzg()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaA()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final zzaJ(J)Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzr:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzr:J

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final zzaK(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzbc()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzt:F

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzL()[Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v2

    invoke-virtual {p0, v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzrt;->zzR(FLcom/google/android/gms/internal/ads/zzam;[Lcom/google/android/gms/internal/ads/zzam;)F

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzy:F

    cmpl-float v2, v0, p1

    if-nez v2, :cond_2

    return v1

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v3, p1, v2

    if-nez v3, :cond_3

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzW()V

    const/4 p1, 0x0

    return p1

    :cond_3
    cmpl-float v0, v0, v2

    if-nez v0, :cond_5

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zze:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_4

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    .line 4
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "operating-rate"

    .line 5
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    .line 6
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzrm;->zzp(Landroid/os/Bundle;)V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzy:F

    :cond_6
    :goto_1
    return v1
.end method

.method private final zzad()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrm;->zzi()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzat()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzat()V

    .line 3
    throw v0
.end method

.method protected static zzay(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/internal/ads/zzam;->zzF:I

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private final zzaz(Lcom/google/android/gms/internal/ads/zzrp;Landroid/media/MediaCrypto;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v1, "createCodec:"

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzrp;->zza:Ljava/lang/String;

    .line 2
    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v5, 0x17

    if-ge v3, v5, :cond_0

    const/high16 v3, -0x40800000    # -1.0f

    goto :goto_0

    .line 19
    :cond_0
    iget v3, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzt:F

    iget-object v6, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzL()[Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v7

    invoke-virtual {v8, v3, v6, v7}, Lcom/google/android/gms/internal/ads/zzrt;->zzR(FLcom/google/android/gms/internal/ads/zzam;[Lcom/google/android/gms/internal/ads/zzam;)F

    move-result v3

    .line 2
    :goto_0
    iget v6, v8, Lcom/google/android/gms/internal/ads/zzrt;->zze:F

    cmpg-float v6, v3, v6

    if-gtz v6, :cond_1

    const/high16 v3, -0x40800000    # -1.0f

    :cond_1
    iget-object v6, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 4
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzrt;->zzar(Lcom/google/android/gms/internal/ads/zzam;)V

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object v9, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v10, 0x0

    .line 6
    invoke-virtual {v8, v0, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzrt;->zzX(Lcom/google/android/gms/internal/ads/zzrp;Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zzrk;

    move-result-object v9

    sget v11, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v12, 0x1f

    if-lt v11, v12, :cond_2

    .line 7
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzl()Lcom/google/android/gms/internal/ads/zzof;

    move-result-object v11

    invoke-static {v9, v11}, Lcom/google/android/gms/internal/ads/zzrq;->zza(Lcom/google/android/gms/internal/ads/zzrk;Lcom/google/android/gms/internal/ads/zzof;)V

    :cond_2
    :try_start_0
    new-instance v11, Ljava/lang/StringBuilder;

    .line 8
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 9
    invoke-static {v11}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    sget v11, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/4 v13, 0x0

    if-lt v11, v5, :cond_3

    sget v11, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-lt v11, v12, :cond_3

    iget-object v1, v9, Lcom/google/android/gms/internal/ads/zzrk;->zzc:Lcom/google/android/gms/internal/ads/zzam;

    .line 23
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzcd;->zzb(Ljava/lang/String;)I

    move-result v1

    const-string v10, "DMCodecAdapterFactory"

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzx(I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Creating an asynchronous MediaCodec adapter for track type "

    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 24
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lcom/google/android/gms/internal/ads/zzqx;

    invoke-direct {v10, v1, v13}, Lcom/google/android/gms/internal/ads/zzqx;-><init>(IZ)V

    .line 25
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/zzqx;->zzc(Lcom/google/android/gms/internal/ads/zzrk;)Lcom/google/android/gms/internal/ads/zzqz;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 64
    :cond_3
    :try_start_1
    iget-object v11, v9, Lcom/google/android/gms/internal/ads/zzrk;->zza:Lcom/google/android/gms/internal/ads/zzrp;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    :try_start_2
    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzrp;->zza:Ljava/lang/String;

    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 11
    invoke-static {v11}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1

    .line 12
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v11, "configureCodec"

    .line 13
    invoke-static {v11}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v11, v9, Lcom/google/android/gms/internal/ads/zzrk;->zzb:Landroid/media/MediaFormat;

    iget-object v12, v9, Lcom/google/android/gms/internal/ads/zzrk;->zzd:Landroid/view/Surface;

    .line 14
    invoke-virtual {v1, v11, v12, v10, v13}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 15
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v11, "startCodec"

    .line 16
    invoke-static {v11}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    new-instance v11, Lcom/google/android/gms/internal/ads/zzsk;

    .line 19
    invoke-direct {v11, v1, v10}, Lcom/google/android/gms/internal/ads/zzsk;-><init>(Landroid/media/MediaCodec;Lcom/google/android/gms/internal/ads/zzsj;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v11

    .line 25
    :goto_1
    :try_start_4
    iput-object v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 26
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 29
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzrp;->zze(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v1

    const/4 v12, 0x2

    if-nez v1, :cond_18

    new-array v1, v12, [Ljava/lang/Object;

    iget-object v15, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 30
    sget-object v16, Lcom/google/android/gms/internal/ads/zzam;->zza:Lcom/google/android/gms/internal/ads/zzn;

    if-nez v15, :cond_4

    const-string v4, "null"

    move-wide/from16 v18, v6

    move-object/from16 v17, v9

    :goto_2
    const/4 v7, 0x0

    goto/16 :goto_7

    .line 76
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 31
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "id="

    .line 32
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v15, Lcom/google/android/gms/internal/ads/zzam;->zzb:Ljava/lang/String;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", mimeType="

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v15, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v13, v15, Lcom/google/android/gms/internal/ads/zzam;->zzi:I

    const/4 v12, -0x1

    if-eq v13, v12, :cond_5

    const-string v13, ", bitrate="

    .line 33
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v13, v15, Lcom/google/android/gms/internal/ads/zzam;->zzi:I

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v13, v15, Lcom/google/android/gms/internal/ads/zzam;->zzj:Ljava/lang/String;

    if-eqz v13, :cond_6

    const-string v13, ", codecs="

    .line 34
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v15, Lcom/google/android/gms/internal/ads/zzam;->zzj:Ljava/lang/String;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v13, v15, Lcom/google/android/gms/internal/ads/zzam;->zzp:Lcom/google/android/gms/internal/ads/zzad;

    const-string v14, ","

    if-eqz v13, :cond_d

    new-instance v13, Ljava/util/LinkedHashSet;

    .line 35
    invoke-direct {v13}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v4, 0x0

    :goto_3
    iget-object v12, v15, Lcom/google/android/gms/internal/ads/zzam;->zzp:Lcom/google/android/gms/internal/ads/zzad;

    move-object/from16 v17, v9

    .line 36
    iget v9, v12, Lcom/google/android/gms/internal/ads/zzad;->zzb:I

    if-ge v4, v9, :cond_c

    .line 37
    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/ads/zzad;->zza(I)Lcom/google/android/gms/internal/ads/zzac;

    move-result-object v9

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzac;->zza:Ljava/util/UUID;

    .line 38
    sget-object v12, Lcom/google/android/gms/internal/ads/zzo;->zzb:Ljava/util/UUID;

    invoke-virtual {v9, v12}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const-string v9, "cenc"

    .line 39
    invoke-interface {v13, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_4
    move-wide/from16 v18, v6

    goto :goto_5

    :cond_7
    sget-object v12, Lcom/google/android/gms/internal/ads/zzo;->zzc:Ljava/util/UUID;

    .line 40
    invoke-virtual {v9, v12}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const-string v9, "clearkey"

    .line 41
    invoke-interface {v13, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    sget-object v12, Lcom/google/android/gms/internal/ads/zzo;->zze:Ljava/util/UUID;

    .line 42
    invoke-virtual {v9, v12}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const-string v9, "playready"

    .line 43
    invoke-interface {v13, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    sget-object v12, Lcom/google/android/gms/internal/ads/zzo;->zzd:Ljava/util/UUID;

    .line 44
    invoke-virtual {v9, v12}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const-string v9, "widevine"

    .line 45
    invoke-interface {v13, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    sget-object v12, Lcom/google/android/gms/internal/ads/zzo;->zza:Ljava/util/UUID;

    .line 46
    invoke-virtual {v9, v12}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const-string v9, "universal"

    .line 47
    invoke-interface {v13, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 48
    :cond_b
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v18, v6

    const-string v6, "unknown ("

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ")"

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v13, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v9, v17

    move-wide/from16 v6, v18

    goto :goto_3

    :cond_c
    move-wide/from16 v18, v6

    const-string v4, ", drm=["

    .line 49
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-static {v5, v13, v14}, Lcom/google/android/gms/internal/ads/zzfoo;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5d

    .line 51
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_d
    move-wide/from16 v18, v6

    move-object/from16 v17, v9

    :goto_6
    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    const/4 v6, -0x1

    if-eq v4, v6, :cond_e

    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    if-eq v4, v6, :cond_e

    const-string v4, ", res="

    .line 52
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "x"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_e
    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzy:Lcom/google/android/gms/internal/ads/zzs;

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzs;->zze()Z

    move-result v4

    if-eqz v4, :cond_f

    const-string v4, ", color="

    .line 53
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzy:Lcom/google/android/gms/internal/ads/zzs;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzs;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzt:F

    const/high16 v6, -0x40800000    # -1.0f

    cmpl-float v4, v4, v6

    if-eqz v4, :cond_10

    const-string v4, ", fps="

    .line 54
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzt:F

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    :cond_10
    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    const/4 v6, -0x1

    if-eq v4, v6, :cond_11

    const-string v4, ", channels="

    .line 55
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_11
    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    if-eq v4, v6, :cond_12

    const-string v4, ", sample_rate="

    .line 56
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_12
    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzd:Ljava/lang/String;

    if-eqz v4, :cond_13

    const-string v4, ", language="

    .line 57
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzd:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_13
    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzc:Ljava/lang/String;

    if-eqz v4, :cond_14

    const-string v4, ", label="

    .line 58
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zzc:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    iget v4, v15, Lcom/google/android/gms/internal/ads/zzam;->zze:I

    if-eqz v4, :cond_17

    new-instance v4, Ljava/util/ArrayList;

    .line 59
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget v6, v15, Lcom/google/android/gms/internal/ads/zzam;->zze:I

    const/4 v7, 0x1

    and-int/2addr v6, v7

    if-eqz v6, :cond_15

    const-string v6, "default"

    .line 60
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_15
    iget v6, v15, Lcom/google/android/gms/internal/ads/zzam;->zze:I

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-eqz v6, :cond_16

    const-string v6, "forced"

    .line 61
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_16
    const-string v6, ", selectionFlags=["

    .line 62
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-static {v5, v4, v14}, Lcom/google/android/gms/internal/ads/zzfoo;->zzb(Ljava/lang/StringBuilder;Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "]"

    .line 64
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_17
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_2

    :goto_7
    aput-object v4, v1, v7

    const/4 v4, 0x1

    aput-object v2, v1, v4

    .line 30
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Format exceeds selected codec\'s capabilities [%s, %s]"

    .line 65
    invoke-static {v4, v5, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "MediaCodecRenderer"

    .line 66
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :cond_18
    move-wide/from16 v18, v6

    move-object/from16 v17, v9

    const/4 v7, 0x0

    :goto_8
    iput-object v0, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzB:Lcom/google/android/gms/internal/ads/zzrp;

    iput v3, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzy:F

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    iput-object v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const-string v3, "OMX.Exynos.avc.dec.secure"

    const/16 v4, 0x19

    if-gt v1, v4, :cond_1a

    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Ljava/lang/String;

    const-string v5, "SM-T585"

    .line 68
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_19

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Ljava/lang/String;

    const-string v5, "SM-A510"

    .line 69
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_19

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Ljava/lang/String;

    const-string v5, "SM-A520"

    .line 70
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_19

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Ljava/lang/String;

    const-string v5, "SM-J700"

    .line 71
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    :cond_19
    const/4 v1, 0x2

    goto :goto_9

    .line 109
    :cond_1a
    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v5, 0x18

    if-ge v1, v5, :cond_1d

    const-string v1, "OMX.Nvidia.h264.decode"

    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    const-string v1, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :cond_1b
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "flounder"

    .line 73
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "flounder_lte"

    .line 74
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "grouper"

    .line 75
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "tilapia"

    .line 76
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    :cond_1c
    const/4 v1, 0x1

    goto :goto_9

    :cond_1d
    const/4 v1, 0x0

    .line 71
    :goto_9
    iput v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzC:I

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    sget v5, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v6, 0x15

    if-ge v5, v6, :cond_1e

    .line 77
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    .line 78
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1e

    const-string v1, "OMX.MTK.VIDEO.DECODER.AVC"

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    const/4 v1, 0x1

    goto :goto_a

    :cond_1e
    const/4 v1, 0x0

    :goto_a
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzD:Z

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v5, 0x13

    if-ne v1, v5, :cond_20

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Ljava/lang/String;

    const-string v9, "SM-G800"

    .line 80
    invoke-virtual {v1, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_20

    const-string v1, "OMX.Exynos.avc.dec"

    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    :cond_1f
    const/4 v1, 0x1

    goto :goto_b

    :cond_20
    const/4 v1, 0x0

    :goto_b
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzE:Z

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v3, 0x1d

    if-ne v1, v3, :cond_21

    const-string v1, "c2.android.aac.decoder"

    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    const/4 v1, 0x1

    goto :goto_c

    :cond_21
    const/4 v1, 0x0

    :goto_c
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzF:Z

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v9, 0x17

    if-gt v1, v9, :cond_23

    const-string v1, "OMX.google.vorbis.decoder"

    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    goto :goto_e

    :cond_22
    :goto_d
    const/4 v1, 0x1

    goto :goto_f

    :cond_23
    :goto_e
    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-gt v1, v5, :cond_25

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "hb2000"

    .line 84
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "stvm8"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    :cond_24
    const-string v1, "OMX.amlogic.avc.decoder.awesome"

    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    const-string v1, "OMX.amlogic.avc.decoder.awesome.secure"

    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    goto :goto_d

    :cond_25
    const/4 v1, 0x0

    :goto_f
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzG:Z

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-ne v1, v6, :cond_26

    const-string v1, "OMX.google.aac.decoder"

    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    const/4 v1, 0x1

    goto :goto_10

    :cond_26
    const/4 v1, 0x0

    :goto_10
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzH:Z

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-ge v1, v6, :cond_28

    const-string v1, "OMX.SEC.mp3.dec"

    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzc:Ljava/lang/String;

    const-string v5, "samsung"

    .line 89
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "baffin"

    .line 90
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "grand"

    .line 91
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "fortuna"

    .line 92
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "gprimelte"

    .line 93
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "j2y18lte"

    .line 94
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/lang/String;

    const-string v5, "ms01"

    .line 95
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_28

    :cond_27
    const/4 v1, 0x1

    goto :goto_11

    :cond_28
    const/4 v1, 0x0

    :goto_11
    iput-boolean v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzI:Z

    .line 96
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzrp;->zza:Ljava/lang/String;

    sget v5, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-gt v5, v4, :cond_2a

    const-string v4, "OMX.rk.video_decoder.avc"

    .line 97
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_29

    goto :goto_13

    :cond_29
    :goto_12
    const/4 v13, 0x1

    goto :goto_14

    :cond_2a
    :goto_13
    sget v4, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-gt v4, v3, :cond_2b

    const-string v3, "OMX.broadcom.video_decoder.tunnel"

    .line 98
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    const-string v3, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 99
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    const-string v3, "OMX.bcm.vdec.avc.tunnel"

    .line 100
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    const-string v3, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 101
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    const-string v3, "OMX.bcm.vdec.hevc.tunnel"

    .line 102
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    const-string v3, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 103
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    :cond_2b
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzc:Ljava/lang/String;

    const-string v3, "Amazon"

    .line 104
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Ljava/lang/String;

    const-string v3, "AFTS"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzrp;->zzf:Z

    if-eqz v1, :cond_2c

    goto :goto_12

    :cond_2c
    const/4 v13, 0x0

    :goto_14
    iput-boolean v13, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzL:Z

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    .line 105
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzrm;->zzr()Z

    .line 106
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzrp;->zza:Ljava/lang/String;

    const-string v1, "c2.android.mp3.decoder"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    new-instance v0, Lcom/google/android/gms/internal/ads/zzrh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzrh;-><init>()V

    iput-object v0, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzM:Lcom/google/android/gms/internal/ads/zzrh;

    :cond_2d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzbc()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2e

    .line 107
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v3, 0x3e8

    add-long/2addr v0, v3

    iput-wide v0, v8, Lcom/google/android/gms/internal/ads/zzrt;->zzN:J

    :cond_2e
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzrt;->zza:Lcom/google/android/gms/internal/ads/zzhs;

    .line 108
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzhs;->zza:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzhs;->zza:I

    sub-long v6, v10, v18

    move-object/from16 v1, p0

    move-object/from16 v3, v17

    move-wide v4, v10

    .line 109
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzrt;->zzaa(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzrk;JJ)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_15

    :catch_1
    move-exception v0

    :goto_15
    move-object v10, v1

    goto :goto_16

    :catch_2
    move-exception v0

    goto :goto_16

    :catch_3
    move-exception v0

    :goto_16
    if-eqz v10, :cond_2f

    .line 21
    :try_start_5
    invoke-virtual {v10}, Landroid/media/MediaCodec;->release()V

    .line 22
    :cond_2f
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v0

    .line 26
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 27
    throw v0
.end method


# virtual methods
.method public zzF(FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzs:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzt:F

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzrt;->zzaK(Lcom/google/android/gms/internal/ads/zzam;)Z

    return-void
.end method

.method public zzN(JJ)V
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    move-object/from16 v15, p0

    const/4 v14, 0x1

    const/4 v13, 0x0

    .line 1
    :try_start_0
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzag()V

    return-void

    :cond_0
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v11, 0x2

    if-nez v0, :cond_2

    .line 2
    invoke-direct {v15, v11}, Lcom/google/android/gms/internal/ads/zzrt;->zzaI(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 3
    :cond_2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzap()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzT:Z

    if-eqz v0, :cond_11

    const-string v0, "bypassRender"

    .line 4
    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    .line 5
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    xor-int/2addr v0, v14

    .line 6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrg;->zzq()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzrg;->zzb:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzP:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrg;->zzm()I

    move-result v10

    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzrg;->zzd:J

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhc;->zzf()Z

    move-result v16

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhc;->zzg()Z

    move-result v0

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzo:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_b

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v17, v4

    move-wide/from16 v4, p3

    move/from16 v13, v16

    move v14, v0

    move-object/from16 v15, v17

    .line 7
    :try_start_1
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzrt;->zzah(JJLcom/google/android/gms/internal/ads/zzrm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_4

    move-object/from16 v15, p0

    :try_start_2
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrg;->zzn()J

    move-result-wide v0

    .line 8
    invoke-virtual {v15, v0, v1}, Lcom/google/android/gms/internal/ads/zzrt;->zzaq(J)V

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    goto :goto_2

    :cond_4
    move-object/from16 v15, p0

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_5

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    const/16 v19, 0x0

    goto/16 :goto_f

    :cond_5
    :goto_2
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    if-eqz v0, :cond_6

    const/4 v14, 0x1

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    const/4 v13, 0x0

    goto/16 :goto_5

    :cond_6
    const/4 v14, 0x1

    .line 70
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzU:Z

    if-eqz v0, :cond_7

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 10
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzrg;->zzp(Lcom/google/android/gms/internal/ads/zzhi;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    const/4 v13, 0x0

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzU:Z

    goto :goto_3

    :cond_7
    const/4 v13, 0x0

    :goto_3
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzV:Z

    if-eqz v0, :cond_8

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrg;->zzq()Z

    move-result v0

    if-nez v0, :cond_3

    .line 11
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzV()V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzV:Z

    .line 12
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzap()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzT:Z

    if-eqz v0, :cond_10

    :cond_8
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    xor-int/2addr v0, v14

    .line 13
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    .line 14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzh()Lcom/google/android/gms/internal/ads/zzkf;

    move-result-object v0

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 15
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    :cond_9
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 17
    invoke-virtual {v15, v0, v1, v13}, Lcom/google/android/gms/internal/ads/zzhr;->zzbd(Lcom/google/android/gms/internal/ads/zzkf;Lcom/google/android/gms/internal/ads/zzhi;I)I

    move-result v1

    const/4 v2, -0x5

    if-eq v1, v2, :cond_e

    const/4 v2, -0x4

    if-eq v1, v2, :cond_a

    goto :goto_4

    .line 23
    :cond_a
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzg()Z

    move-result v1

    if-eqz v1, :cond_b

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    goto :goto_4

    :cond_b
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzah:Z

    if-eqz v1, :cond_c

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_b

    .line 25
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    :try_start_3
    iput-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzo:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v2, 0x0

    .line 18
    invoke-virtual {v15, v1, v2}, Lcom/google/android/gms/internal/ads/zzrt;->zzac(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzah:Z

    :cond_c
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 19
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhi;->zzk()V

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz v1, :cond_d

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    if-eqz v1, :cond_d

    const-string v2, "audio/opus"

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzm:Lcom/google/android/gms/internal/ads/zzqd;

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzqd;->zza(Lcom/google/android/gms/internal/ads/zzhi;)V

    :cond_d
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 22
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzrg;->zzp(Lcom/google/android/gms/internal/ads/zzhi;)Z

    move-result v1

    if-nez v1, :cond_9

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzU:Z

    goto :goto_4

    .line 23
    :cond_e
    invoke-virtual {v15, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzU(Lcom/google/android/gms/internal/ads/zzkf;)Lcom/google/android/gms/internal/ads/zzht;

    .line 17
    :goto_4
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrg;->zzq()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhi;->zzk()V

    :cond_f
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrg;->zzq()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    if-nez v0, :cond_3

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzV:Z

    if-eqz v0, :cond_10

    goto/16 :goto_1

    .line 26
    :cond_10
    :goto_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    move-object v1, v15

    const/4 v2, 0x1

    const/16 v19, 0x0

    goto/16 :goto_14

    .line 22
    :cond_11
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_b

    if-eqz v0, :cond_29

    .line 27
    :try_start_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    const-string v0, "drainAndFeed"

    .line 28
    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    .line 29
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_6
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaH()Z

    move-result v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_8

    if-nez v0, :cond_21

    :try_start_5
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzH:Z

    if-eqz v0, :cond_13

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzab:Z
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_b

    if-eqz v0, :cond_13

    :try_start_6
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 31
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzrm;->zzb(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_8

    .line 59
    :catch_1
    :try_start_7
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaA()V

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    if-eqz v0, :cond_12

    .line 60
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V

    :cond_12
    :goto_7
    move-wide v2, v9

    move-object v1, v15

    const/16 v19, 0x0

    goto/16 :goto_12

    .line 52
    :cond_13
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 30
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzrm;->zzb(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0

    :goto_8
    if-gez v0, :cond_17

    const/4 v1, -0x2

    if-ne v0, v1, :cond_15

    .line 31
    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzac:Z

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    .line 32
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzrm;->zzc()Landroid/media/MediaFormat;

    move-result-object v0

    iget v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzC:I

    if-eqz v1, :cond_14

    const-string v1, "width"

    .line 33
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_14

    const-string v1, "height"

    .line 34
    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    if-ne v1, v2, :cond_14

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzK:Z

    goto :goto_9

    .line 67
    :cond_14
    iput-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzw:Landroid/media/MediaFormat;

    iput-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzx:Z

    goto :goto_9

    :cond_15
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzL:Z

    if-eqz v0, :cond_12

    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    if-nez v0, :cond_16

    iget v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    if-ne v0, v11, :cond_12

    .line 61
    :cond_16
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaA()V

    goto :goto_7

    :cond_17
    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzK:Z

    if-eqz v1, :cond_18

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzK:Z

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    .line 35
    invoke-interface {v1, v0, v13}, Lcom/google/android/gms/internal/ads/zzrm;->zzn(IZ)V

    :goto_9
    move-wide v2, v9

    move-object v1, v15

    const/4 v0, 0x2

    const/16 v19, 0x0

    goto/16 :goto_11

    :cond_18
    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 36
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v1, :cond_19

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_19

    .line 65
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaA()V

    goto :goto_7

    :cond_19
    iput v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzP:I

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    .line 37
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzrm;->zzg(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzQ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1a

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 38
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzQ:Ljava/nio/ByteBuffer;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 39
    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_1a
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzI:Z

    if-eqz v0, :cond_1b

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 40
    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1b

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1b

    iget-wide v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1b

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 41
    iput-wide v0, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_1b
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 42
    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzj:Ljava/util/ArrayList;

    .line 43
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v2, :cond_1d

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzj:Ljava/util/ArrayList;

    .line 44
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-nez v6, :cond_1c

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzj:Ljava/util/ArrayList;

    .line 45
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_b

    :cond_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_1d
    const/4 v0, 0x0

    :goto_b
    iput-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzR:Z

    iget-wide v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzae:J

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 46
    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1e

    const/4 v0, 0x1

    goto :goto_c

    :cond_1e
    const/4 v0, 0x0

    :goto_c
    iput-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzS:Z

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 47
    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    .line 48
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzrs;->zzd:Lcom/google/android/gms/internal/ads/zzfk;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfk;->zzc(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzam;

    if-nez v0, :cond_1f

    iget-boolean v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzak:Z

    if-eqz v1, :cond_1f

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzw:Landroid/media/MediaFormat;

    if-eqz v1, :cond_1f

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    .line 49
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzrs;->zzd:Lcom/google/android/gms/internal/ads/zzfk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfk;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzam;

    :cond_1f
    if-eqz v0, :cond_20

    iput-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzo:Lcom/google/android/gms/internal/ads/zzam;

    goto :goto_d

    .line 52
    :cond_20
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzx:Z

    if-eqz v0, :cond_21

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzo:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz v0, :cond_21

    .line 49
    :goto_d
    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzo:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzw:Landroid/media/MediaFormat;

    .line 50
    invoke-virtual {v15, v0, v1}, Lcom/google/android/gms/internal/ads/zzrt;->zzac(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzx:Z

    iput-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzak:Z
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_b

    :cond_21
    :try_start_8
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzH:Z
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_8

    if-eqz v0, :cond_23

    :try_start_9
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzab:Z
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_5

    if-eqz v0, :cond_23

    :try_start_a
    iget-object v6, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget-object v7, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzQ:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzP:I

    iget-object v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 53
    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v12, 0x1

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v4, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v2, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzR:Z

    iget-boolean v3, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzS:Z

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzo:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_2

    move-object/from16 v16, v1

    move-object/from16 v1, p0

    move/from16 v17, v2

    move/from16 v18, v3

    move-wide/from16 v2, p1

    move-wide/from16 v19, v4

    move-wide/from16 v4, p3

    move-wide/from16 v21, v9

    move v9, v0

    move v10, v12

    const/4 v0, 0x2

    move-wide/from16 v11, v19

    const/16 v19, 0x0

    move/from16 v13, v17

    move/from16 v14, v18

    move-object/from16 v15, v16

    .line 54
    :try_start_b
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzrt;->zzah(JJLcom/google/android/gms/internal/ads/zzrm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z

    move-result v1
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_3

    goto :goto_10

    :catch_2
    move-wide/from16 v21, v9

    const/16 v19, 0x0

    .line 62
    :catch_3
    :try_start_c
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaA()V
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_4

    move-object/from16 v15, p0

    :try_start_d
    iget-boolean v0, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    if-eqz v0, :cond_22

    .line 63
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V

    :cond_22
    move-object v1, v15

    :goto_e
    move-wide/from16 v2, v21

    goto :goto_12

    :catch_4
    move-exception v0

    const/4 v2, 0x1

    :goto_f
    move-object/from16 v1, p0

    goto/16 :goto_16

    :catch_5
    move-exception v0

    const/16 v19, 0x0

    goto/16 :goto_13

    :cond_23
    move-wide/from16 v21, v9

    const/4 v0, 0x2

    const/16 v19, 0x0

    .line 64
    iget-object v6, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iget-object v7, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzQ:Ljava/nio/ByteBuffer;

    iget v8, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzP:I

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 51
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v10, 0x1

    iget-object v1, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v11, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v13, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzR:Z

    iget-boolean v14, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzS:Z

    iget-object v4, v15, Lcom/google/android/gms/internal/ads/zzrt;->zzo:Lcom/google/android/gms/internal/ads/zzam;
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_7

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v16, v4

    move-wide/from16 v4, p3

    move-object/from16 v15, v16

    .line 52
    :try_start_e
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzrt;->zzah(JJLcom/google/android/gms/internal/ads/zzrm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z

    move-result v1
    :try_end_e
    .catch Ljava/lang/IllegalStateException; {:try_start_e .. :try_end_e} :catch_6

    :goto_10
    if-eqz v1, :cond_26

    move-object/from16 v1, p0

    .line 54
    :try_start_f
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 55
    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzrt;->zzaq(J)V

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzrt;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 56
    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v2, v2, 0x4

    .line 57
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaC()V

    if-eqz v2, :cond_24

    .line 64
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaA()V

    goto :goto_e

    :cond_24
    move-wide/from16 v2, v21

    .line 58
    :goto_11
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzrt;->zzaJ(J)Z

    move-result v4

    if-nez v4, :cond_25

    goto :goto_12

    :cond_25
    move-object v15, v1

    move-wide v9, v2

    const/4 v11, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_6

    :cond_26
    move-object/from16 v1, p0

    goto :goto_e

    .line 66
    :cond_27
    :goto_12
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaG()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzrt;->zzaJ(J)Z

    move-result v0

    if-nez v0, :cond_27

    .line 67
    :cond_28
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 v2, 0x1

    goto :goto_14

    :catch_6
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_15

    :catch_7
    move-exception v0

    :goto_13
    move-object v1, v15

    goto :goto_15

    :catch_8
    move-exception v0

    move-object v1, v15

    const/16 v19, 0x0

    goto :goto_15

    :cond_29
    move-object v1, v15

    const/16 v19, 0x0

    .line 30
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzrt;->zza:Lcom/google/android/gms/internal/ads/zzhs;

    .line 68
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzhs;->zzd:I

    invoke-virtual/range {p0 .. p2}, Lcom/google/android/gms/internal/ads/zzhr;->zzd(J)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzhs;->zzd:I
    :try_end_f
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_a

    const/4 v2, 0x1

    .line 69
    :try_start_10
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzrt;->zzaI(I)Z

    .line 26
    :goto_14
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzrt;->zza:Lcom/google/android/gms/internal/ads/zzhs;

    .line 70
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhs;->zza()V
    :try_end_10
    .catch Ljava/lang/IllegalStateException; {:try_start_10 .. :try_end_10} :catch_9

    return-void

    :catch_9
    move-exception v0

    goto :goto_16

    :catch_a
    move-exception v0

    :goto_15
    const/4 v2, 0x1

    goto :goto_16

    :catch_b
    move-exception v0

    move-object v1, v15

    const/4 v2, 0x1

    const/16 v19, 0x0

    .line 71
    :goto_16
    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_2a

    .line 72
    instance-of v3, v0, Landroid/media/MediaCodec$CodecException;

    if-eqz v3, :cond_2a

    goto :goto_17

    .line 73
    :cond_2a
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    .line 74
    array-length v5, v3

    if-lez v5, :cond_2d

    aget-object v3, v3, v19

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    const-string v5, "android.media.MediaCodec"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2d

    .line 76
    :goto_17
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzZ(Ljava/lang/Exception;)V

    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-lt v3, v4, :cond_2b

    .line 77
    instance-of v3, v0, Landroid/media/MediaCodec$CodecException;

    if-eqz v3, :cond_2b

    .line 78
    move-object v3, v0

    check-cast v3, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v3}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result v3

    if-eqz v3, :cond_2b

    const/4 v14, 0x1

    goto :goto_18

    :cond_2b
    const/4 v14, 0x0

    :goto_18
    if-eqz v14, :cond_2c

    .line 79
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V

    :cond_2c
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzrt;->zzB:Lcom/google/android/gms/internal/ads/zzrp;

    .line 80
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzrt;->zzam(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzrp;)Lcom/google/android/gms/internal/ads/zzrn;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/16 v3, 0xfa3

    .line 81
    invoke-virtual {v1, v0, v2, v14, v3}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object v0

    throw v0

    .line 75
    :cond_2d
    throw v0
.end method

.method public zzO()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    return v0
.end method

.method public zzP()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhr;->zzK()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaH()Z

    move-result v0

    if-nez v0, :cond_2

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzN:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzN:J

    cmp-long v0, v3, v5

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final zzQ(Lcom/google/android/gms/internal/ads/zzam;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzd:Lcom/google/android/gms/internal/ads/zzrv;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzrt;->zzS(Lcom/google/android/gms/internal/ads/zzrv;Lcom/google/android/gms/internal/ads/zzam;)I

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzsc; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    const/16 v2, 0xfa2

    .line 2
    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object p1

    .line 3
    throw p1
.end method

.method protected zzR(FLcom/google/android/gms/internal/ads/zzam;[Lcom/google/android/gms/internal/ads/zzam;)F
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected abstract zzS(Lcom/google/android/gms/internal/ads/zzrv;Lcom/google/android/gms/internal/ads/zzam;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsc;
        }
    .end annotation
.end method

.method protected zzT(Lcom/google/android/gms/internal/ads/zzrp;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;)Lcom/google/android/gms/internal/ads/zzht;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzU(Lcom/google/android/gms/internal/ads/zzkf;)Lcom/google/android/gms/internal/ads/zzht;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzah:Z

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zzkf;->zza:Lcom/google/android/gms/internal/ads/zzam;

    .line 22
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    iget-object v1, v4, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_16

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzkf;->zzb:Lcom/google/android/gms/internal/ads/zzqs;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzam:Lcom/google/android/gms/internal/ads/zzqs;

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzT:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzV:Z

    return-object v3

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    if-nez v1, :cond_1

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzap()V

    return-object v3

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzB:Lcom/google/android/gms/internal/ads/zzrp;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzal:Lcom/google/android/gms/internal/ads/zzqs;

    const/16 v7, 0x17

    if-ne v6, p1, :cond_13

    if-eq p1, v6, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    .line 4
    sget v6, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-lt v6, v7, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v6, 0x1

    :goto_2
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    .line 5
    invoke-virtual {p0, v3, v5, v4}, Lcom/google/android/gms/internal/ads/zzrt;->zzT(Lcom/google/android/gms/internal/ads/zzrp;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;)Lcom/google/android/gms/internal/ads/zzht;

    move-result-object v6

    iget v7, v6, Lcom/google/android/gms/internal/ads/zzht;->zzd:I

    const/4 v8, 0x3

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eqz v7, :cond_f

    if-eq v7, v0, :cond_a

    if-eq v7, v10, :cond_6

    .line 6
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzrt;->zzaK(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    .line 14
    :cond_5
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz p1, :cond_10

    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaF()Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_7

    .line 8
    :cond_6
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzrt;->zzaK(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzW:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzC:I

    if-eq v7, v10, :cond_9

    if-ne v7, v0, :cond_8

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    .line 9
    iget v9, v5, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    if-ne v7, v9, :cond_8

    iget v7, v4, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    iget v9, v5, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    if-ne v7, v9, :cond_8

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :cond_9
    :goto_3
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzJ:Z

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz p1, :cond_10

    .line 10
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaF()Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_7

    .line 11
    :cond_a
    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzrt;->zzaK(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v7

    if-nez v7, :cond_b

    :goto_4
    const/16 v10, 0x10

    goto :goto_7

    :cond_b
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    if-eqz p1, :cond_c

    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaF()Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_7

    :cond_c
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    if-eqz p1, :cond_10

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzE:Z

    if-nez p1, :cond_e

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzG:Z

    if-eqz p1, :cond_d

    goto :goto_5

    :cond_d
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    goto :goto_6

    :cond_e
    :goto_5
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    goto :goto_7

    .line 13
    :cond_f
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzW()V

    :cond_10
    :goto_6
    const/4 v10, 0x0

    .line 6
    :goto_7
    iget p1, v6, Lcom/google/android/gms/internal/ads/zzht;->zzd:I

    if-eqz p1, :cond_12

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    if-ne p1, v1, :cond_11

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    if-ne p1, v8, :cond_12

    :cond_11
    new-instance p1, Lcom/google/android/gms/internal/ads/zzht;

    .line 14
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzrp;->zza:Ljava/lang/String;

    const/4 v0, 0x0

    move-object v1, p1

    move-object v3, v5

    move v5, v0

    move v6, v10

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzht;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;II)V

    return-object p1

    :cond_12
    return-object v6

    :cond_13
    if-eqz p1, :cond_15

    if-nez v6, :cond_14

    goto :goto_8

    .line 15
    :cond_14
    sget-object p1, Lcom/google/android/gms/internal/ads/zzo;->zza:Ljava/util/UUID;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzo;->zza:Ljava/util/UUID;

    .line 16
    invoke-virtual {p1, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15

    .line 17
    sget p1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-lt p1, v7, :cond_15

    sget-object p1, Lcom/google/android/gms/internal/ads/zzo;->zze:Ljava/util/UUID;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzo;->zza:Ljava/util/UUID;

    .line 18
    invoke-virtual {p1, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    .line 22
    sget-object p1, Lcom/google/android/gms/internal/ads/zzo;->zze:Ljava/util/UUID;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzo;->zza:Ljava/util/UUID;

    .line 19
    invoke-virtual {p1, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 20
    :cond_15
    :goto_8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzW()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzht;

    .line 21
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzrp;->zza:Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v6, 0x80

    move-object v1, p1

    move-object v3, v5

    move v5, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzht;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzam;II)V

    return-object p1

    .line 1
    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    const/16 v0, 0xfa5

    .line 2
    invoke-virtual {p0, p1, v4, v2, v0}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object p1

    .line 1
    throw p1
.end method

.method protected abstract zzX(Lcom/google/android/gms/internal/ads/zzrp;Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zzrk;
.end method

.method protected abstract zzY(Lcom/google/android/gms/internal/ads/zzrv;Lcom/google/android/gms/internal/ads/zzam;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzsc;
        }
    .end annotation
.end method

.method protected zzZ(Ljava/lang/Exception;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzaa(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzrk;JJ)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzab(Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzac(Lcom/google/android/gms/internal/ads/zzam;Landroid/media/MediaFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzae()V
    .locals 0

    return-void
.end method

.method protected zzaf(Lcom/google/android/gms/internal/ads/zzhi;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method protected zzag()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    return-void
.end method

.method protected abstract zzah(JJLcom/google/android/gms/internal/ads/zzrm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzam;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation
.end method

.method protected zzai(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected final zzaj()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzs:F

    return v0
.end method

.method protected final zzak()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzrs;->zzc:J

    return-wide v0
.end method

.method protected final zzal()Lcom/google/android/gms/internal/ads/zzrm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    return-object v0
.end method

.method protected zzam(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzrp;)Lcom/google/android/gms/internal/ads/zzrn;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzrn;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzrn;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzrp;)V

    return-object v0
.end method

.method protected final zzan()Lcom/google/android/gms/internal/ads/zzrp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzB:Lcom/google/android/gms/internal/ads/zzrp;

    return-object v0
.end method

.method protected zzao(Lcom/google/android/gms/internal/ads/zzhi;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    return-void
.end method

.method protected final zzap()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    if-nez v0, :cond_d

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzT:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzam:Lcom/google/android/gms/internal/ads/zzqs;

    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzai(Lcom/google/android/gms/internal/ads/zzam;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 32
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzV()V

    .line 33
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v1, "audio/mp4a-latm"

    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const-string v1, "audio/mpeg"

    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "audio/opus"

    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    .line 38
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzrg;->zzo(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    const/16 v1, 0x20

    .line 37
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzrg;->zzo(I)V

    .line 38
    :goto_0
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzT:Z

    return-void

    .line 37
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzam:Lcom/google/android/gms/internal/ads/zzqs;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzal:Lcom/google/android/gms/internal/ads/zzqs;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzal:Lcom/google/android/gms/internal/ads/zzqs;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 3
    sget-boolean v0, Lcom/google/android/gms/internal/ads/zzqt;->zza:Z

    if-nez v0, :cond_3

    goto :goto_1

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzal:Lcom/google/android/gms/internal/ads/zzqs;

    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzqs;->zza()Lcom/google/android/gms/internal/ads/zzqj;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzqj;->zza:I

    .line 30
    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object v0

    .line 31
    throw v0

    .line 3
    :cond_4
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzrr; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v2, 0x0

    if-nez v0, :cond_6

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzd:Lcom/google/android/gms/internal/ads/zzrv;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 4
    invoke-virtual {p0, v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzrt;->zzY(Lcom/google/android/gms/internal/ads/zzrv;Lcom/google/android/gms/internal/ads/zzam;Z)Ljava/util/List;

    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    new-instance v3, Ljava/util/ArrayDeque;

    .line 6
    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzrp;

    invoke-virtual {v3, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_5
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzA:Lcom/google/android/gms/internal/ads/zzrr;
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzsc; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/google/android/gms/internal/ads/zzrr; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_2

    :catch_0
    move-exception v0

    .line 28
    :try_start_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzrr;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const v4, -0xc34e

    .line 9
    invoke-direct {v2, v3, v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzrr;-><init>(Lcom/google/android/gms/internal/ads/zzam;Ljava/lang/Throwable;ZI)V

    throw v2

    .line 8
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzrp;

    :goto_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    if-nez v3, :cond_b

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzrp;

    .line 14
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzrt;->zzax(Lcom/google/android/gms/internal/ads/zzrp;)Z

    move-result v4
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zzrr; {:try_start_2 .. :try_end_2} :catch_3

    if-nez v4, :cond_7

    return-void

    .line 15
    :cond_7
    :try_start_3
    invoke-direct {p0, v3, v2}, Lcom/google/android/gms/internal/ads/zzrt;->zzaz(Lcom/google/android/gms/internal/ads/zzrp;Landroid/media/MediaCrypto;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception v4

    const-string v5, "MediaCodecRenderer"

    if-ne v3, v0, :cond_8

    :try_start_4
    const-string v4, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    .line 16
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v6, 0x32

    .line 17
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    .line 18
    invoke-direct {p0, v3, v2}, Lcom/google/android/gms/internal/ads/zzrt;->zzaz(Lcom/google/android/gms/internal/ads/zzrp;Landroid/media/MediaCrypto;)V

    goto :goto_3

    .line 19
    :cond_8
    throw v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception v4

    .line 20
    :try_start_5
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Failed to initialize decoder: "

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 21
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzrr;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    .line 22
    invoke-direct {v5, v6, v4, v1, v3}, Lcom/google/android/gms/internal/ads/zzrr;-><init>(Lcom/google/android/gms/internal/ads/zzam;Ljava/lang/Throwable;ZLcom/google/android/gms/internal/ads/zzrp;)V

    .line 23
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzrt;->zzZ(Ljava/lang/Exception;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzA:Lcom/google/android/gms/internal/ads/zzrr;

    if-nez v3, :cond_9

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzA:Lcom/google/android/gms/internal/ads/zzrr;

    goto :goto_4

    .line 24
    :cond_9
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzrr;->zza(Lcom/google/android/gms/internal/ads/zzrr;Lcom/google/android/gms/internal/ads/zzrr;)Lcom/google/android/gms/internal/ads/zzrr;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzA:Lcom/google/android/gms/internal/ads/zzrr;

    .line 23
    :goto_4
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    .line 25
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzA:Lcom/google/android/gms/internal/ads/zzrr;

    .line 26
    throw v0

    .line 15
    :cond_b
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    return-void

    .line 10
    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzrr;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const v4, -0xc34f

    .line 11
    invoke-direct {v0, v3, v2, v1, v4}, Lcom/google/android/gms/internal/ads/zzrr;-><init>(Lcom/google/android/gms/internal/ads/zzam;Ljava/lang/Throwable;ZI)V

    throw v0
    :try_end_5
    .catch Lcom/google/android/gms/internal/ads/zzrr; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    move-exception v0

    .line 31
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    const/16 v3, 0xfa1

    .line 27
    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzhr;->zzbe(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;ZI)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object v0

    .line 28
    throw v0

    :cond_d
    :goto_5
    return-void
.end method

.method protected zzaq(J)V
    .locals 3

    .line 1
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaj:J

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzrs;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzrs;->zzb:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzrs;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaD(Lcom/google/android/gms/internal/ads/zzrs;)V

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzae()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected zzar(Lcom/google/android/gms/internal/ads/zzam;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    return-void
.end method

.method protected final zzas()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzrm;->zzl()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zza:Lcom/google/android/gms/internal/ads/zzhs;

    .line 2
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzhs;->zzb:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzhs;->zzb:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzB:Lcom/google/android/gms/internal/ads/zzrp;

    .line 3
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzrp;->zza:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzrt;->zzab(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzp:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzal:Lcom/google/android/gms/internal/ads/zzqs;

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzau()V

    return-void

    :catchall_0
    move-exception v1

    .line 3
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzp:Landroid/media/MediaCrypto;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzal:Lcom/google/android/gms/internal/ads/zzqs;

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzau()V

    .line 5
    throw v1
.end method

.method protected zzat()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaB()V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaC()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzN:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzab:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaa:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzJ:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzK:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzR:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzS:Z

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzj:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzae:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaj:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzM:Lcom/google/android/gms/internal/ads/zzrh;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrh;->zzc()V

    :cond_0
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzY:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzW:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    return-void
.end method

.method protected final zzau()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzat()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzM:Lcom/google/android/gms/internal/ads/zzrh;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzz:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzB:Lcom/google/android/gms/internal/ads/zzrp;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzv:Lcom/google/android/gms/internal/ads/zzam;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzw:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzx:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzac:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzy:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzC:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzD:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzE:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzF:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzG:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzH:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzI:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzL:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzW:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzX:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzq:Z

    return-void
.end method

.method protected final zzav()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaw()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzap()V

    :cond_0
    return v0
.end method

.method protected final zzaw()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzu:Lcom/google/android/gms/internal/ads/zzrm;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzZ:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzE:Z

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzF:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzac:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzG:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzab:Z

    if-nez v2, :cond_5

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-lt v0, v2, :cond_4

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaE()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzia; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    .line 3
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V

    return v3

    .line 5
    :cond_4
    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzad()V

    return v1

    .line 6
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V

    return v3
.end method

.method protected zzax(Lcom/google/android/gms/internal/ads/zzrp;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final zze()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method protected zzt()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzn:Lcom/google/android/gms/internal/ads/zzam;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzrs;->zza:Lcom/google/android/gms/internal/ads/zzrs;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaD(Lcom/google/android/gms/internal/ads/zzrs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzaw()Z

    return-void
.end method

.method protected zzu(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/ads/zzhs;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzhs;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zza:Lcom/google/android/gms/internal/ads/zzhs;

    return-void
.end method

.method protected zzv(JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzaf:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzag:Z

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzT:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzi:Lcom/google/android/gms/internal/ads/zzrg;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzh:Lcom/google/android/gms/internal/ads/zzhi;

    .line 2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzhc;->zzb()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzU:Z

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzav()Z

    .line 2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    .line 4
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzrs;->zzd:Lcom/google/android/gms/internal/ads/zzfk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfk;->zza()I

    move-result p2

    if-lez p2, :cond_1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzah:Z

    .line 5
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfk;->zze()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method protected zzw()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzV()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzas()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzam:Lcom/google/android/gms/internal/ads/zzqs;

    return-void

    :catchall_0
    move-exception v1

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrt;->zzam:Lcom/google/android/gms/internal/ads/zzqs;

    .line 3
    throw v1
.end method

.method protected final zzz([Lcom/google/android/gms/internal/ads/zzam;JJ)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    move-object v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzrs;->zzc:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzrs;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object v6, v1

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/zzrs;-><init>(JJJ)V

    .line 2
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzrt;->zzaD(Lcom/google/android/gms/internal/ads/zzrs;)V

    return-void

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzrt;->zzaj:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_3

    cmp-long v7, v5, v1

    if-ltz v7, :cond_3

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzrs;

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v8, v1

    move-wide/from16 v11, p2

    move-wide/from16 v13, p4

    invoke-direct/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzrs;-><init>(JJJ)V

    .line 5
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzrt;->zzaD(Lcom/google/android/gms/internal/ads/zzrs;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzrt;->zzai:Lcom/google/android/gms/internal/ads/zzrs;

    .line 6
    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzrs;->zzc:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzrt;->zzae()V

    :cond_2
    return-void

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzrt;->zzl:Ljava/util/ArrayDeque;

    new-instance v9, Lcom/google/android/gms/internal/ads/zzrs;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzrt;->zzad:J

    move-object v2, v9

    move-wide/from16 v5, p2

    move-wide/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzrs;-><init>(JJJ)V

    .line 4
    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method
