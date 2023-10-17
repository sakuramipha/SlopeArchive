.class public final Lcom/google/android/gms/internal/ads/zzpw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzoz;


# static fields
.field private static final zza:Ljava/lang/Object;

.field private static zzb:Ljava/util/concurrent/ExecutorService;

.field private static zzc:I


# instance fields
.field private zzA:J

.field private zzB:J

.field private zzC:J

.field private zzD:J

.field private zzE:I

.field private zzF:Z

.field private zzG:Z

.field private zzH:J

.field private zzI:F

.field private zzJ:Ljava/nio/ByteBuffer;

.field private zzK:I

.field private zzL:Ljava/nio/ByteBuffer;

.field private zzM:[B

.field private zzN:I

.field private zzO:Z

.field private zzP:Z

.field private zzQ:Z

.field private zzR:Z

.field private zzS:I

.field private zzT:Lcom/google/android/gms/internal/ads/zzl;

.field private zzU:Lcom/google/android/gms/internal/ads/zzpi;

.field private zzV:J

.field private zzW:Z

.field private zzX:Z

.field private final zzY:Lcom/google/android/gms/internal/ads/zzpm;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzpe;

.field private final zze:Lcom/google/android/gms/internal/ads/zzqg;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfrr;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfrr;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzeb;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzpd;

.field private final zzj:Ljava/util/ArrayDeque;

.field private zzk:Lcom/google/android/gms/internal/ads/zzpu;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzpp;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzpp;

.field private final zzn:Lcom/google/android/gms/internal/ads/zzpj;

.field private zzo:Lcom/google/android/gms/internal/ads/zzof;

.field private zzp:Lcom/google/android/gms/internal/ads/zzow;

.field private zzq:Lcom/google/android/gms/internal/ads/zzpl;

.field private zzr:Lcom/google/android/gms/internal/ads/zzpl;

.field private zzs:Lcom/google/android/gms/internal/ads/zzdo;

.field private zzt:Landroid/media/AudioTrack;

.field private zzu:Lcom/google/android/gms/internal/ads/zzoh;

.field private zzv:Lcom/google/android/gms/internal/ads/zzk;

.field private zzw:Lcom/google/android/gms/internal/ads/zzpo;

.field private zzx:Lcom/google/android/gms/internal/ads/zzpo;

.field private zzy:Lcom/google/android/gms/internal/ads/zzci;

.field private zzz:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzpw;->zza:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzpk;Lcom/google/android/gms/internal/ads/zzpv;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzpk;->zza(Lcom/google/android/gms/internal/ads/zzpk;)Lcom/google/android/gms/internal/ads/zzoh;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzu:Lcom/google/android/gms/internal/ads/zzoh;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzpk;->zze(Lcom/google/android/gms/internal/ads/zzpk;)Lcom/google/android/gms/internal/ads/zzpm;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzY:Lcom/google/android/gms/internal/ads/zzpm;

    sget p2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzpk;->zza:Lcom/google/android/gms/internal/ads/zzpj;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzn:Lcom/google/android/gms/internal/ads/zzpj;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeb;

    sget-object p2, Lcom/google/android/gms/internal/ads/zzdz;->zza:Lcom/google/android/gms/internal/ads/zzdz;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzeb;-><init>(Lcom/google/android/gms/internal/ads/zzdz;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzh:Lcom/google/android/gms/internal/ads/zzeb;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeb;->zze()Z

    new-instance p1, Lcom/google/android/gms/internal/ads/zzpd;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzpr;

    const/4 v0, 0x0

    .line 3
    invoke-direct {p2, p0, v0}, Lcom/google/android/gms/internal/ads/zzpr;-><init>(Lcom/google/android/gms/internal/ads/zzpw;Lcom/google/android/gms/internal/ads/zzpq;)V

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzpd;-><init>(Lcom/google/android/gms/internal/ads/zzpc;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    .line 4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzpe;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzpe;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzd:Lcom/google/android/gms/internal/ads/zzpe;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzqg;

    .line 5
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzqg;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zze:Lcom/google/android/gms/internal/ads/zzqg;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdv;

    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzdv;-><init>()V

    .line 7
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfrr;->zzo(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzf:Lcom/google/android/gms/internal/ads/zzfrr;

    .line 8
    new-instance p1, Lcom/google/android/gms/internal/ads/zzqf;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzqf;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfrr;->zzm(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzg:Lcom/google/android/gms/internal/ads/zzfrr;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzI:F

    .line 9
    sget-object p1, Lcom/google/android/gms/internal/ads/zzk;->zza:Lcom/google/android/gms/internal/ads/zzk;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzv:Lcom/google/android/gms/internal/ads/zzk;

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzS:I

    new-instance p2, Lcom/google/android/gms/internal/ads/zzl;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzl;-><init>(IF)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzT:Lcom/google/android/gms/internal/ads/zzl;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzpo;

    .line 10
    sget-object v2, Lcom/google/android/gms/internal/ads/zzci;->zza:Lcom/google/android/gms/internal/ads/zzci;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzpo;-><init>(Lcom/google/android/gms/internal/ads/zzci;JJLcom/google/android/gms/internal/ads/zzpn;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    sget-object p2, Lcom/google/android/gms/internal/ads/zzci;->zza:Lcom/google/android/gms/internal/ads/zzci;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzy:Lcom/google/android/gms/internal/ads/zzci;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzz:Z

    new-instance p1, Ljava/util/ArrayDeque;

    .line 11
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzpp;

    const-wide/16 v0, 0x64

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzpp;-><init>(J)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzl:Lcom/google/android/gms/internal/ads/zzpp;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzpp;

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzpp;-><init>(J)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzm:Lcom/google/android/gms/internal/ads/zzpp;

    return-void
.end method

.method static bridge synthetic zzA(III)Landroid/media/AudioFormat;
    .locals 1

    .line 1
    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    .line 3
    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    .line 4
    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic zzB(Lcom/google/android/gms/internal/ads/zzpw;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    return-object p0
.end method

.method static bridge synthetic zzC(Lcom/google/android/gms/internal/ads/zzpw;)Lcom/google/android/gms/internal/ads/zzow;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    return-object p0
.end method

.method static synthetic zzD(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzeb;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    .line 2
    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeb;->zze()Z

    sget-object p0, Lcom/google/android/gms/internal/ads/zzpw;->zza:Ljava/lang/Object;

    monitor-enter p0

    :try_start_1
    sget p1, Lcom/google/android/gms/internal/ads/zzpw;->zzc:I

    add-int/lit8 p1, p1, -0x1

    sput p1, Lcom/google/android/gms/internal/ads/zzpw;->zzc:I

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzpw;->zzb:Ljava/util/concurrent/ExecutorService;

    .line 4
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzpw;->zzb:Ljava/util/concurrent/ExecutorService;

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p0

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeb;->zze()Z

    sget-object p1, Lcom/google/android/gms/internal/ads/zzpw;->zza:Ljava/lang/Object;

    monitor-enter p1

    :try_start_2
    sget v1, Lcom/google/android/gms/internal/ads/zzpw;->zzc:I

    add-int/lit8 v1, v1, -0x1

    sput v1, Lcom/google/android/gms/internal/ads/zzpw;->zzc:I

    if-nez v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/zzpw;->zzb:Ljava/util/concurrent/ExecutorService;

    .line 4
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzpw;->zzb:Ljava/util/concurrent/ExecutorService;

    .line 5
    :cond_1
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 6
    throw p0

    :catchall_2
    move-exception p0

    .line 5
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0
.end method

.method static bridge synthetic zzE(Lcom/google/android/gms/internal/ads/zzpw;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzQ:Z

    return p0
.end method

.method private final zzF()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzA:J

    .line 2
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzb:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzB:J

    :goto_0
    return-wide v1
.end method

.method private final zzG()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzC:J

    .line 2
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzd:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzD:J

    :goto_0
    return-wide v1
.end method

.method private final zzH(Lcom/google/android/gms/internal/ads/zzpl;)Landroid/media/AudioTrack;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzov;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzv:Lcom/google/android/gms/internal/ads/zzk;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzS:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzpl;->zzb(ZLcom/google/android/gms/internal/ads/zzk;I)Landroid/media/AudioTrack;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzow;->zza(Ljava/lang/Exception;)V

    .line 3
    :goto_0
    throw p1
.end method

.method private final zzI(J)V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzS()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzY:Lcom/google/android/gms/internal/ads/zzpm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzy:Lcom/google/android/gms/internal/ads/zzci;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzpm;->zzc(Lcom/google/android/gms/internal/ads/zzci;)Lcom/google/android/gms/internal/ads/zzci;

    goto :goto_0

    .line 3
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzci;->zza:Lcom/google/android/gms/internal/ads/zzci;

    :goto_0
    move-object v3, v1

    .line 2
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzy:Lcom/google/android/gms/internal/ads/zzci;

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzS()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzY:Lcom/google/android/gms/internal/ads/zzpm;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzz:Z

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzpm;->zzd(Z)Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzz:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzpo;

    const-wide/16 v4, 0x0

    .line 6
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzG()J

    move-result-wide v6

    invoke-virtual {p1, v6, v7}, Lcom/google/android/gms/internal/ads/zzpl;->zza(J)J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzpo;-><init>(Lcom/google/android/gms/internal/ads/zzci;JJLcom/google/android/gms/internal/ads/zzpn;)V

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzN()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    if-eqz p1, :cond_2

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzz:Z

    check-cast p1, Lcom/google/android/gms/internal/ads/zzqb;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqb;->zza:Lcom/google/android/gms/internal/ads/zzqc;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzqc;->zzW(Lcom/google/android/gms/internal/ads/zzqc;)Lcom/google/android/gms/internal/ads/zzos;

    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzos;->zzs(Z)V

    :cond_2
    return-void
.end method

.method private final zzJ()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzP:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzP:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzG()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzpd;->zzc(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 2
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    :cond_0
    return-void
.end method

.method private final zzK(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzoy;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzh()Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzg()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzb()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzpw;->zzO(Ljava/nio/ByteBuffer;J)V

    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdo;->zze(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_5

    .line 8
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zza:Ljava/nio/ByteBuffer;

    :cond_5
    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzpw;->zzO(Ljava/nio/ByteBuffer;J)V

    return-void
.end method

.method private final zzL(Lcom/google/android/gms/internal/ads/zzci;)V
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/ads/zzpo;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-wide v2, v4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzpo;-><init>(Lcom/google/android/gms/internal/ads/zzci;JJLcom/google/android/gms/internal/ads/zzpn;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object v7, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzw:Lcom/google/android/gms/internal/ads/zzpo;

    return-void

    :cond_0
    iput-object v7, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    return-void
.end method

.method private final zzM()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzI:F

    .line 2
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzI:F

    .line 3
    invoke-virtual {v0, v1, v1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method private final zzN()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzi:Lcom/google/android/gms/internal/ads/zzdo;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzc()V

    return-void
.end method

.method private final zzO(Ljava/nio/ByteBuffer;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzoy;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzL:Ljava/nio/ByteBuffer;

    const/16 p3, 0x15

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    if-ne p2, p1, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 2
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    goto :goto_1

    .line 15
    :cond_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzL:Ljava/nio/ByteBuffer;

    .line 3
    sget p2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-ge p2, p3, :cond_5

    .line 4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzM:[B

    if-eqz v2, :cond_3

    array-length v2, v2

    if-ge v2, p2, :cond_4

    .line 5
    :cond_3
    new-array v2, p2, [B

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzM:[B

    .line 6
    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzM:[B

    .line 7
    invoke-virtual {p1, v3, v1, p2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 8
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzN:I

    .line 9
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p2

    .line 10
    sget v2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    if-ge v2, p3, :cond_7

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzC:J

    .line 11
    invoke-virtual {p3, v2, v3}, Lcom/google/android/gms/internal/ads/zzpd;->zza(J)I

    move-result p3

    if-lez p3, :cond_6

    .line 12
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzM:[B

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzN:I

    .line 13
    invoke-virtual {v2, v3, v4, p3}, Landroid/media/AudioTrack;->write([BII)I

    move-result p3

    if-lez p3, :cond_8

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzN:I

    add-int/2addr v2, p3

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzN:I

    .line 14
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    add-int/2addr v2, p3

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_2

    :cond_6
    const/4 p3, 0x0

    goto :goto_2

    .line 26
    :cond_7
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 15
    invoke-virtual {p3, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p3

    .line 16
    :cond_8
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzV:J

    const-wide/16 v2, 0x0

    if-gez p3, :cond_e

    sget p1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_9

    const/4 p1, -0x6

    if-eq p3, p1, :cond_a

    :cond_9
    const/16 p1, -0x20

    if-ne p3, p1, :cond_b

    :cond_a
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzD:J

    cmp-long v4, p1, v2

    if-lez v4, :cond_b

    goto :goto_3

    :cond_b
    const/4 v0, 0x0

    :goto_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzoy;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 17
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzam;

    invoke-direct {p1, p3, p2, v0}, Lcom/google/android/gms/internal/ads/zzoy;-><init>(ILcom/google/android/gms/internal/ads/zzam;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    if-eqz p2, :cond_c

    .line 18
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzow;->zza(Ljava/lang/Exception;)V

    :cond_c
    iget-boolean p2, p1, Lcom/google/android/gms/internal/ads/zzoy;->zzb:Z

    if-nez p2, :cond_d

    .line 20
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzm:Lcom/google/android/gms/internal/ads/zzpp;

    .line 21
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzpp;->zzb(Ljava/lang/Exception;)V

    return-void

    .line 19
    :cond_d
    sget-object p2, Lcom/google/android/gms/internal/ads/zzoh;->zza:Lcom/google/android/gms/internal/ads/zzoh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzu:Lcom/google/android/gms/internal/ads/zzoh;

    .line 20
    throw p1

    .line 21
    :cond_e
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzm:Lcom/google/android/gms/internal/ads/zzpp;

    .line 22
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzpp;->zza()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 23
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzpw;->zzR(Landroid/media/AudioTrack;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzD:J

    cmp-long v6, v4, v2

    if-lez v6, :cond_f

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzX:Z

    :cond_f
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzQ:Z

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    if-eqz v2, :cond_10

    if-ge p3, p2, :cond_10

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzX:Z

    if-nez v3, :cond_10

    check-cast v2, Lcom/google/android/gms/internal/ads/zzqb;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzqb;->zza:Lcom/google/android/gms/internal/ads/zzqc;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzqc;->zzV(Lcom/google/android/gms/internal/ads/zzqc;)Lcom/google/android/gms/internal/ads/zzld;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzqc;->zzV(Lcom/google/android/gms/internal/ads/zzqc;)Lcom/google/android/gms/internal/ads/zzld;

    move-result-object v2

    .line 24
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzld;->zza()V

    :cond_10
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 25
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    if-nez v2, :cond_11

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzC:J

    int-to-long v5, p3

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzC:J

    :cond_11
    if-ne p3, p2, :cond_14

    if-eqz v2, :cond_13

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    if-ne p1, p2, :cond_12

    goto :goto_4

    :cond_12
    const/4 v0, 0x0

    .line 26
    :goto_4
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzD:J

    iget p3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzE:I

    int-to-long v0, p3

    iget p3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzK:I

    int-to-long v2, p3

    mul-long v0, v0, v2

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzD:J

    :cond_13
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzL:Ljava/nio/ByteBuffer;

    :cond_14
    return-void
.end method

.method private final zzP()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzoy;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzh()Z

    move-result v0

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzL:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    return v4

    .line 2
    :cond_0
    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzpw;->zzO(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzL:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    return v4

    :cond_1
    return v3

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzd()V

    .line 4
    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zzpw;->zzK(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzg()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzL:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    return v4

    :cond_4
    const/4 v3, 0x1

    :cond_5
    :goto_0
    return v3
.end method

.method private final zzQ()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static zzR(Landroid/media/AudioTrack;)Z
    .locals 2

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final zzS()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzam;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static bridge synthetic zzx(Lcom/google/android/gms/internal/ads/zzpw;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzV:J

    return-wide v0
.end method

.method static bridge synthetic zzy(Lcom/google/android/gms/internal/ads/zzpw;)J
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzF()J

    move-result-wide v0

    return-wide v0
.end method

.method static bridge synthetic zzz(Lcom/google/android/gms/internal/ads/zzpw;)J
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzG()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzam;)I
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_2

    .line 2
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfn;->zzC(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid PCM encoding: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DefaultAudioSink"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 4
    :cond_0
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    if-eq p1, v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzW:Z

    if-nez v0, :cond_3

    .line 5
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzu:Lcom/google/android/gms/internal/ads/zzoh;

    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzoh;->zza(Lcom/google/android/gms/internal/ads/zzam;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v1
.end method

.method public final zzb(Z)J
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzG:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzpd;->zzb(Z)J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzG()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzpl;->zza(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzpo;

    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzpo;->zzc:J

    cmp-long p1, v0, v2

    if-ltz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzpo;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    .line 6
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzpo;->zzc:J

    sub-long v2, v0, v2

    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzpo;->zza:Lcom/google/android/gms/internal/ads/zzci;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzci;->zza:Lcom/google/android/gms/internal/ads/zzci;

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzci;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    .line 8
    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzpo;->zzb:J

    add-long/2addr v0, v2

    goto :goto_1

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzY:Lcom/google/android/gms/internal/ads/zzpm;

    .line 10
    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzpm;->zza(J)J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    .line 11
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzpo;->zzb:J

    add-long/2addr v0, v2

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzpo;

    .line 13
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzpo;->zzc:J

    sub-long/2addr v2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    .line 14
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzpo;->zza:Lcom/google/android/gms/internal/ads/zzci;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzci;->zzc:F

    .line 15
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzfn;->zzm(JF)J

    move-result-wide v0

    .line 16
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzpo;->zzb:J

    sub-long v0, v2, v0

    .line 8
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzY:Lcom/google/android/gms/internal/ads/zzpm;

    .line 17
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzpm;->zzb()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzpl;->zza(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_4
    :goto_2
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzci;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzy:Lcom/google/android/gms/internal/ads/zzci;

    return-object v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzam;I[I)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzou;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    .line 1
    iget-object v0, v3, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v2, 0x8

    const/4 v5, -0x1

    if-eqz v0, :cond_3

    .line 2
    iget v0, v3, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfn;->zzC(I)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    .line 3
    iget v0, v3, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    iget v6, v3, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    invoke-static {v0, v6}, Lcom/google/android/gms/internal/ads/zzfn;->zzk(II)I

    move-result v0

    new-instance v6, Lcom/google/android/gms/internal/ads/zzfro;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzfro;-><init>()V

    .line 4
    iget v7, v3, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzf:Lcom/google/android/gms/internal/ads/zzfrr;

    .line 5
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfro;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfro;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzY:Lcom/google/android/gms/internal/ads/zzpm;

    .line 6
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzpm;->zze()[Lcom/google/android/gms/internal/ads/zzdr;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzfro;->zzg([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfro;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzdo;

    .line 7
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfro;->zzi()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v6

    invoke-direct {v7, v6}, Lcom/google/android/gms/internal/ads/zzdo;-><init>(Lcom/google/android/gms/internal/ads/zzfrr;)V

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    .line 8
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzdo;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    :cond_0
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zze:Lcom/google/android/gms/internal/ads/zzqg;

    .line 9
    iget v8, v3, Lcom/google/android/gms/internal/ads/zzam;->zzC:I

    iget v9, v3, Lcom/google/android/gms/internal/ads/zzam;->zzD:I

    invoke-virtual {v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzqg;->zzq(II)V

    sget v6, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v8, 0x15

    if-ge v6, v8, :cond_1

    .line 10
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    if-ne v6, v2, :cond_1

    if-nez p3, :cond_1

    const/4 v6, 0x6

    new-array v8, v6, [I

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v6, :cond_2

    .line 11
    aput v9, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    move-object/from16 v8, p3

    :cond_2
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzd:Lcom/google/android/gms/internal/ads/zzpe;

    .line 12
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzpe;->zzo([I)V

    .line 13
    new-instance v6, Lcom/google/android/gms/internal/ads/zzdp;

    iget v8, v3, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    iget v9, v3, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    iget v10, v3, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    invoke-direct {v6, v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzdp;-><init>(III)V

    .line 14
    :try_start_0
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzdo;->zza(Lcom/google/android/gms/internal/ads/zzdp;)Lcom/google/android/gms/internal/ads/zzdp;

    move-result-object v6
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzdq; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    iget v8, v6, Lcom/google/android/gms/internal/ads/zzdp;->zzd:I

    .line 17
    iget v9, v6, Lcom/google/android/gms/internal/ads/zzdp;->zzb:I

    .line 18
    iget v6, v6, Lcom/google/android/gms/internal/ads/zzdp;->zzc:I

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfn;->zzf(I)I

    move-result v10

    .line 19
    invoke-static {v8, v6}, Lcom/google/android/gms/internal/ads/zzfn;->zzk(II)I

    move-result v6

    move-object v11, v7

    move v7, v9

    const/4 v9, 0x0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 24
    new-instance v0, Lcom/google/android/gms/internal/ads/zzou;

    .line 15
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzou;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzam;)V

    throw v0

    .line 36
    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdo;

    .line 20
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzdo;-><init>(Lcom/google/android/gms/internal/ads/zzfrr;)V

    .line 21
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    .line 22
    sget v7, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzu:Lcom/google/android/gms/internal/ads/zzoh;

    .line 23
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzoh;->zza(Lcom/google/android/gms/internal/ads/zzam;)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_d

    .line 25
    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 26
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v9, 0x2

    move-object v11, v0

    move v10, v7

    const/4 v0, -0x1

    move v7, v6

    const/4 v6, -0x1

    :goto_1
    const-string v12, ") for: "

    if-eqz v8, :cond_c

    if-eqz v10, :cond_b

    .line 29
    invoke-static {v7, v10, v8}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v12

    const/4 v13, -0x2

    const/4 v14, 0x1

    if-eq v12, v13, :cond_4

    const/4 v13, 0x1

    goto :goto_2

    :cond_4
    const/4 v13, 0x0

    .line 30
    :goto_2
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    if-eq v6, v5, :cond_5

    move v13, v6

    goto :goto_3

    :cond_5
    const/4 v13, 0x1

    .line 31
    :goto_3
    iget v15, v3, Lcom/google/android/gms/internal/ads/zzam;->zzi:I

    const v4, 0x3d090

    if-eqz v9, :cond_9

    const-wide/32 v16, 0xf4240

    if-eq v9, v14, :cond_8

    const/4 v14, 0x5

    if-ne v8, v14, :cond_6

    const v4, 0x7a120

    const/4 v8, 0x5

    goto :goto_4

    :cond_6
    move v14, v8

    :goto_4
    if-eq v15, v5, :cond_7

    sget-object v8, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 37
    invoke-static {v15, v2, v8}, Lcom/google/android/gms/internal/ads/zzftx;->zza(IILjava/math/RoundingMode;)I

    move-result v2

    goto :goto_5

    .line 38
    :cond_7
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzpy;->zzb(I)I

    move-result v2

    :goto_5
    move/from16 p3, v6

    int-to-long v5, v4

    move v4, v14

    int-to-long v14, v2

    mul-long v5, v5, v14

    .line 37
    div-long v5, v5, v16

    .line 39
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzftz;->zza(J)I

    move-result v2

    move v14, v4

    goto :goto_7

    :cond_8
    move/from16 p3, v6

    .line 35
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzpy;->zzb(I)I

    move-result v2

    int-to-long v4, v2

    const-wide/32 v14, 0x2faf080

    mul-long v4, v4, v14

    div-long v4, v4, v16

    .line 36
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzftz;->zza(J)I

    move-result v2

    goto :goto_6

    :cond_9
    move/from16 p3, v6

    mul-int/lit8 v2, v12, 0x4

    .line 32
    invoke-static {v4, v7, v13}, Lcom/google/android/gms/internal/ads/zzpy;->zza(III)I

    move-result v4

    const v5, 0xb71b0

    .line 33
    invoke-static {v5, v7, v13}, Lcom/google/android/gms/internal/ads/zzpy;->zza(III)I

    move-result v5

    .line 34
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    :goto_6
    move v14, v8

    :goto_7
    int-to-double v4, v2

    double-to-int v2, v4

    .line 40
    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v13

    const/4 v4, -0x1

    add-int/2addr v2, v4

    .line 41
    div-int/2addr v2, v13

    mul-int v12, v2, v13

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzW:Z

    new-instance v13, Lcom/google/android/gms/internal/ads/zzpl;

    const/4 v15, 0x0

    move-object v2, v13

    move-object/from16 v3, p1

    move v4, v0

    move v5, v9

    move/from16 v6, p3

    move v8, v10

    move v9, v14

    move v10, v12

    move v12, v15

    invoke-direct/range {v2 .. v12}, Lcom/google/android/gms/internal/ads/zzpl;-><init>(Lcom/google/android/gms/internal/ads/zzam;IIIIIIILcom/google/android/gms/internal/ads/zzdo;Z)V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_a

    iput-object v13, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    return-void

    :cond_a
    iput-object v13, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    return-void

    .line 27
    :cond_b
    new-instance v0, Lcom/google/android/gms/internal/ads/zzou;

    .line 28
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid output channel config (mode="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzou;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzam;)V

    throw v0

    .line 19
    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzou;

    .line 27
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid output encoding (mode="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzou;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzam;)V

    throw v0

    .line 23
    :cond_d
    new-instance v0, Lcom/google/android/gms/internal/ads/zzou;

    .line 24
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "Unable to configure passthrough for: "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzou;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzam;)V

    throw v0
.end method

.method public final zze()V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_5

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzA:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzB:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzC:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzD:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzX:Z

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzE:I

    new-instance v10, Lcom/google/android/gms/internal/ads/zzpo;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzy:Lcom/google/android/gms/internal/ads/zzci;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzpo;-><init>(Lcom/google/android/gms/internal/ads/zzci;JJLcom/google/android/gms/internal/ads/zzpn;)V

    iput-object v10, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzx:Lcom/google/android/gms/internal/ads/zzpo;

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzH:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzw:Lcom/google/android/gms/internal/ads/zzpo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzj:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzK:I

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzL:Ljava/nio/ByteBuffer;

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzP:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzO:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zze:Lcom/google/android/gms/internal/ads/zzqg;

    .line 2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzqg;->zzp()V

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzN()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzpd;->zzh()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 5
    invoke-virtual {v1}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 6
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzpw;->zzR(Landroid/media/AudioTrack;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzk:Lcom/google/android/gms/internal/ads/zzpu;

    .line 16
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 7
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzpu;->zzb(Landroid/media/AudioTrack;)V

    .line 8
    :cond_1
    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v3, 0x15

    if-ge v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzR:Z

    if-nez v1, :cond_2

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzS:I

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    if-eqz v1, :cond_3

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzpd;->zzd()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzh:Lcom/google/android/gms/internal/ads/zzeb;

    .line 10
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeb;->zzc()Z

    sget-object v3, Lcom/google/android/gms/internal/ads/zzpw;->zza:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zzpw;->zzb:Ljava/util/concurrent/ExecutorService;

    if-nez v4, :cond_4

    const-string v4, "ExoPlayer:AudioTrackReleaseThread"

    .line 11
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzfn;->zzz(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    sput-object v4, Lcom/google/android/gms/internal/ads/zzpw;->zzb:Ljava/util/concurrent/ExecutorService;

    :cond_4
    sget v4, Lcom/google/android/gms/internal/ads/zzpw;->zzc:I

    add-int/lit8 v4, v4, 0x1

    sput v4, Lcom/google/android/gms/internal/ads/zzpw;->zzc:I

    sget-object v4, Lcom/google/android/gms/internal/ads/zzpw;->zzb:Ljava/util/concurrent/ExecutorService;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzpf;

    invoke-direct {v5, v1, v2}, Lcom/google/android/gms/internal/ads/zzpf;-><init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzeb;)V

    .line 12
    invoke-interface {v4, v5}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 13
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzm:Lcom/google/android/gms/internal/ads/zzpp;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpp;->zza()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzl:Lcom/google/android/gms/internal/ads/zzpp;

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpp;->zza()V

    return-void
.end method

.method public final zzf()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzF:Z

    return-void
.end method

.method public final zzg()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzQ:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpd;->zzk()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 2
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public final zzh()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzQ:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpd;->zzf()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 2
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public final zzi()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzoy;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzO:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzP()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzJ()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzO:Z

    :cond_0
    return-void
.end method

.method public final zzj()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zze()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzf:Lcom/google/android/gms/internal/ads/zzfrr;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 2
    check-cast v4, Lcom/google/android/gms/internal/ads/zzdr;

    .line 3
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzdr;->zzf()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzg:Lcom/google/android/gms/internal/ads/zzfrr;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 4
    check-cast v4, Lcom/google/android/gms/internal/ads/zzdr;

    .line 5
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzdr;->zzf()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzs:Lcom/google/android/gms/internal/ads/zzdo;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdo;->zzf()V

    :cond_2
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzQ:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzW:Z

    return-void
.end method

.method public final zzk(Lcom/google/android/gms/internal/ads/zzk;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzv:Lcom/google/android/gms/internal/ads/zzk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzk;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzv:Lcom/google/android/gms/internal/ads/zzk;

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zze()V

    return-void
.end method

.method public final zzl(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzS:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzS:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzR:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zze()V

    :cond_1
    return-void
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzl;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzT:Lcom/google/android/gms/internal/ads/zzl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzl;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzl;->zza:I

    .line 3
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzl;->zzb:F

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzT:Lcom/google/android/gms/internal/ads/zzl;

    .line 4
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzl;->zza:I

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzT:Lcom/google/android/gms/internal/ads/zzl;

    return-void
.end method

.method public final zzn(Lcom/google/android/gms/internal/ads/zzow;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    return-void
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzci;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzci;

    iget v1, p1, Lcom/google/android/gms/internal/ads/zzci;->zzc:F

    const/high16 v2, 0x41000000    # 8.0f

    .line 2
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 3
    iget v4, p1, Lcom/google/android/gms/internal/ads/zzci;->zzd:F

    .line 4
    invoke-static {v4, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 5
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzci;-><init>(FF)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzy:Lcom/google/android/gms/internal/ads/zzci;

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzpw;->zzL(Lcom/google/android/gms/internal/ads/zzci;)V

    return-void
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zzof;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzo:Lcom/google/android/gms/internal/ads/zzof;

    return-void
.end method

.method public final zzq(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzpi;

    .line 1
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzpi;-><init>(Landroid/media/AudioDeviceInfo;)V

    move-object p1, v0

    .line 2
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzU:Lcom/google/android/gms/internal/ads/zzpi;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzpg;->zza(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzpi;)V

    :cond_1
    return-void
.end method

.method public final zzr(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzz:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzy:Lcom/google/android/gms/internal/ads/zzci;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzpw;->zzL(Lcom/google/android/gms/internal/ads/zzci;)V

    return-void
.end method

.method public final zzs(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzI:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzI:F

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzM()V

    :cond_0
    return-void
.end method

.method public final zzt(Ljava/nio/ByteBuffer;JI)Z
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzov;,
            Lcom/google/android/gms/internal/ads/zzoy;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v5, p4

    .line 1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_1

    if-ne v2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    const/4 v8, 0x0

    if-eqz v0, :cond_7

    .line 2
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzP()Z

    move-result v0

    if-nez v0, :cond_2

    return v6

    :cond_2
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 3
    iget v10, v9, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    if-ne v10, v11, :cond_4

    iget v10, v9, Lcom/google/android/gms/internal/ads/zzpl;->zzg:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzg:I

    if-ne v10, v11, :cond_4

    iget v10, v9, Lcom/google/android/gms/internal/ads/zzpl;->zze:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzpl;->zze:I

    if-ne v10, v11, :cond_4

    iget v10, v9, Lcom/google/android/gms/internal/ads/zzpl;->zzf:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzf:I

    if-ne v10, v11, :cond_4

    iget v10, v9, Lcom/google/android/gms/internal/ads/zzpl;->zzd:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzd:I

    if-ne v10, v11, :cond_4

    iget-boolean v9, v9, Lcom/google/android/gms/internal/ads/zzpl;->zzj:Z

    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzj:Z

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzpw;->zzR(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 8
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v9, 0x3

    if-ne v0, v9, :cond_3

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 9
    invoke-virtual {v0}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    :cond_3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 10
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzam;

    iget v10, v9, Lcom/google/android/gms/internal/ads/zzam;->zzC:I

    iget v9, v9, Lcom/google/android/gms/internal/ads/zzam;->zzD:I

    invoke-virtual {v0, v10, v9}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    iput-boolean v7, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzX:Z

    goto :goto_2

    .line 4
    :cond_4
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzJ()V

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzu()Z

    move-result v0

    if-eqz v0, :cond_5

    return v6

    .line 6
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zze()V

    .line 11
    :cond_6
    :goto_2
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzpw;->zzI(J)V

    :cond_7
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_5

    .line 63
    :cond_8
    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzh:Lcom/google/android/gms/internal/ads/zzeb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeb;->zzd()Z

    move-result v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_0 .. :try_end_0} :catch_3

    if-nez v0, :cond_9

    return v6

    :cond_9
    :try_start_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_1 .. :try_end_1} :catch_0

    .line 13
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    :try_start_2
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzpw;->zzH(Lcom/google/android/gms/internal/ads/zzpl;)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v11, v0

    .line 30
    :try_start_3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 14
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzh:I

    const v13, 0xf4240

    if-le v12, v13, :cond_27

    new-instance v12, Lcom/google/android/gms/internal/ads/zzpl;

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzam;

    iget v13, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzb:I

    iget v14, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzd:I

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzpl;->zze:I

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzf:I

    iget v10, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzg:I

    const v22, 0xf4240

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzi:Lcom/google/android/gms/internal/ads/zzdo;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzj:Z

    const/16 v24, 0x0

    move v0, v14

    move-object v14, v12

    move/from16 v16, v13

    move/from16 v17, v0

    move/from16 v18, v8

    move/from16 v19, v6

    move/from16 v20, v7

    move/from16 v21, v10

    move-object/from16 v23, v9

    invoke-direct/range {v14 .. v24}, Lcom/google/android/gms/internal/ads/zzpl;-><init>(Lcom/google/android/gms/internal/ads/zzam;IIIIIIILcom/google/android/gms/internal/ads/zzdo;Z)V
    :try_end_3
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_3 .. :try_end_3} :catch_3

    .line 15
    :try_start_4
    invoke-direct {v1, v12}, Lcom/google/android/gms/internal/ads/zzpw;->zzH(Lcom/google/android/gms/internal/ads/zzpl;)Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v12, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;
    :try_end_4
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_4 .. :try_end_4} :catch_1

    .line 12
    :goto_3
    :try_start_5
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 19
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzpw;->zzR(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzk:Lcom/google/android/gms/internal/ads/zzpu;

    if-nez v6, :cond_a

    new-instance v6, Lcom/google/android/gms/internal/ads/zzpu;

    .line 20
    invoke-direct {v6, v1}, Lcom/google/android/gms/internal/ads/zzpu;-><init>(Lcom/google/android/gms/internal/ads/zzpw;)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzk:Lcom/google/android/gms/internal/ads/zzpu;

    :cond_a
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzk:Lcom/google/android/gms/internal/ads/zzpu;

    .line 21
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/zzpu;->zza(Landroid/media/AudioTrack;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 22
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzam;

    iget v7, v6, Lcom/google/android/gms/internal/ads/zzam;->zzC:I

    iget v6, v6, Lcom/google/android/gms/internal/ads/zzam;->zzD:I

    invoke-virtual {v0, v7, v6}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    .line 23
    :cond_b
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v6, 0x1f

    if-lt v0, v6, :cond_c

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzo:Lcom/google/android/gms/internal/ads/zzof;

    if-eqz v0, :cond_c

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 24
    invoke-static {v6, v0}, Lcom/google/android/gms/internal/ads/zzph;->zza(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzof;)V

    :cond_c
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 25
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    iput v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzS:I

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 26
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    const/4 v9, 0x2

    if-ne v8, v9, :cond_d

    const/4 v8, 0x1

    goto :goto_4

    :cond_d
    const/4 v8, 0x0

    :goto_4
    iget v9, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzg:I

    iget v10, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzd:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzh:I

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/ads/zzpd;->zze(Landroid/media/AudioTrack;ZIII)V

    .line 27
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzM()V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzT:Lcom/google/android/gms/internal/ads/zzl;

    .line 28
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzl;->zza:I

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzU:Lcom/google/android/gms/internal/ads/zzpi;

    if-eqz v0, :cond_e

    sget v6, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v7, 0x17

    if-lt v6, v7, :cond_e

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzt:Landroid/media/AudioTrack;

    .line 29
    invoke-static {v6, v0}, Lcom/google/android/gms/internal/ads/zzpg;->zza(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzpi;)V

    :cond_e
    const/4 v6, 0x1

    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzG:Z
    :try_end_5
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_5 .. :try_end_5} :catch_3

    .line 11
    :goto_5
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzl:Lcom/google/android/gms/internal/ads/zzpp;

    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpp;->zza()V

    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzG:Z

    const-wide/16 v6, 0x0

    if-eqz v0, :cond_f

    .line 33
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    iput-wide v8, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzH:J

    const/4 v8, 0x0

    iput-boolean v8, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzF:Z

    iput-boolean v8, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzG:Z

    .line 34
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzpw;->zzI(J)V

    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzQ:Z

    if-eqz v0, :cond_f

    .line 35
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzh()V

    :cond_f
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    .line 36
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzG()J

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Lcom/google/android/gms/internal/ads/zzpd;->zzj(J)Z

    move-result v0

    if-nez v0, :cond_10

    const/4 v8, 0x0

    return v8

    :cond_10
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_24

    .line 37
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v0

    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v0, v8, :cond_11

    const/4 v0, 0x1

    goto :goto_6

    :cond_11
    const/4 v0, 0x0

    :goto_6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    .line 38
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_12

    const/4 v8, 0x1

    return v8

    :cond_12
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 39
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    if-eqz v8, :cond_1c

    iget v8, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzE:I

    if-nez v8, :cond_1c

    .line 40
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzg:I

    const/16 v8, 0x400

    const/4 v9, -0x2

    const/16 v10, 0x10

    const/4 v11, -0x1

    packed-switch v0, :pswitch_data_0

    .line 6
    :pswitch_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    .line 80
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected audio encoding: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 41
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzabj;->zza(Ljava/nio/ByteBuffer;)I

    move-result v0

    goto/16 :goto_a

    .line 42
    :pswitch_2
    sget v0, Lcom/google/android/gms/internal/ads/zzzs;->zza:I

    new-array v0, v10, [B

    .line 43
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v8

    .line 44
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 45
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzfc;

    invoke-direct {v8, v0, v10}, Lcom/google/android/gms/internal/ads/zzfc;-><init>([BI)V

    .line 46
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzzs;->zza(Lcom/google/android/gms/internal/ads/zzfc;)Lcom/google/android/gms/internal/ads/zzzr;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzzr;->zzc:I

    goto/16 :goto_a

    :pswitch_3
    const/16 v0, 0x200

    goto :goto_a

    .line 47
    :pswitch_4
    sget v0, Lcom/google/android/gms/internal/ads/zzzp;->zza:I

    .line 48
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 49
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v8

    add-int/lit8 v8, v8, -0xa

    move v12, v0

    :goto_7
    if-gt v12, v8, :cond_14

    add-int/lit8 v13, v12, 0x4

    .line 50
    invoke-static {v2, v13}, Lcom/google/android/gms/internal/ads/zzfn;->zzg(Ljava/nio/ByteBuffer;I)I

    move-result v13

    and-int/2addr v13, v9

    const v14, -0x78d9046

    if-ne v13, v14, :cond_13

    sub-int/2addr v12, v0

    goto :goto_8

    :cond_13
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_14
    const/4 v12, -0x1

    :goto_8
    if-ne v12, v11, :cond_15

    const/4 v0, 0x0

    goto :goto_a

    .line 51
    :cond_15
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/2addr v0, v12

    add-int/lit8 v0, v0, 0x7

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 52
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v8

    add-int/2addr v8, v12

    const/16 v9, 0xbb

    if-ne v0, v9, :cond_16

    const/16 v0, 0x9

    goto :goto_9

    :cond_16
    const/16 v0, 0x8

    :goto_9
    const/16 v9, 0x28

    add-int/2addr v8, v0

    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    shr-int/lit8 v0, v0, 0x4

    and-int/lit8 v0, v0, 0x7

    shl-int v0, v9, v0

    mul-int/lit8 v0, v0, 0x10

    goto :goto_a

    :pswitch_5
    const/16 v0, 0x800

    goto :goto_a

    :pswitch_6
    const/16 v0, 0x400

    goto :goto_a

    .line 53
    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzfn;->zzg(Ljava/nio/ByteBuffer;I)I

    move-result v0

    .line 54
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzabi;->zzc(I)I

    move-result v0

    if-eq v0, v11, :cond_17

    :goto_a
    const/4 v10, 0x1

    goto/16 :goto_e

    .line 80
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 55
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 56
    :pswitch_8
    sget v0, Lcom/google/android/gms/internal/ads/zzaal;->zza:I

    .line 57
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 58
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    if-eq v8, v9, :cond_1a

    if-eq v8, v11, :cond_19

    const/16 v9, 0x1f

    if-eq v8, v9, :cond_18

    add-int/lit8 v8, v0, 0x4

    .line 62
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    const/4 v9, 0x1

    and-int/2addr v8, v9

    shl-int/lit8 v8, v8, 0x6

    add-int/lit8 v0, v0, 0x5

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xfc

    const/4 v9, 0x2

    goto :goto_c

    :cond_18
    const/4 v9, 0x2

    add-int/lit8 v8, v0, 0x5

    .line 59
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    and-int/lit8 v8, v8, 0x7

    shl-int/lit8 v8, v8, 0x4

    add-int/lit8 v0, v0, 0x6

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    goto :goto_b

    :cond_19
    const/4 v9, 0x2

    add-int/lit8 v8, v0, 0x4

    .line 60
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    and-int/lit8 v8, v8, 0x7

    shl-int/lit8 v8, v8, 0x4

    add-int/lit8 v0, v0, 0x7

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    :goto_b
    and-int/lit8 v0, v0, 0x3c

    :goto_c
    shr-int/2addr v0, v9

    or-int/2addr v0, v8

    const/4 v10, 0x1

    goto :goto_d

    :cond_1a
    const/4 v9, 0x2

    add-int/lit8 v8, v0, 0x5

    .line 61
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    const/4 v10, 0x1

    and-int/2addr v8, v10

    shl-int/lit8 v8, v8, 0x6

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xfc

    shr-int/2addr v0, v9

    or-int/2addr v0, v8

    :goto_d
    add-int/2addr v0, v10

    mul-int/lit8 v0, v0, 0x20

    goto :goto_e

    :pswitch_9
    const/4 v10, 0x1

    .line 63
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzzp;->zza(Ljava/nio/ByteBuffer;)I

    move-result v0

    .line 41
    :goto_e
    iput v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzE:I

    if-eqz v0, :cond_1b

    goto :goto_f

    :cond_1b
    return v10

    :cond_1c
    :goto_f
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzw:Lcom/google/android/gms/internal/ads/zzpo;

    if-eqz v0, :cond_1e

    .line 64
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzP()Z

    move-result v0

    if-nez v0, :cond_1d

    const/4 v8, 0x0

    return v8

    .line 65
    :cond_1d
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzpw;->zzI(J)V

    const/4 v8, 0x0

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzw:Lcom/google/android/gms/internal/ads/zzpo;

    :cond_1e
    iget-wide v8, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzH:J

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 66
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzF()J

    move-result-wide v10

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzpw;->zze:Lcom/google/android/gms/internal/ads/zzqg;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzqg;->zzo()J

    move-result-wide v12

    sub-long/2addr v10, v12

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzam;

    .line 67
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    int-to-long v12, v0

    const-wide/32 v14, 0xf4240

    mul-long v10, v10, v14

    div-long/2addr v10, v12

    add-long/2addr v8, v10

    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzF:Z

    if-nez v0, :cond_20

    sub-long v10, v8, v3

    .line 68
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    const-wide/32 v12, 0x30d40

    cmp-long v0, v10, v12

    if-lez v0, :cond_20

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    if-eqz v0, :cond_1f

    new-instance v10, Lcom/google/android/gms/internal/ads/zzox;

    .line 69
    invoke-direct {v10, v3, v4, v8, v9}, Lcom/google/android/gms/internal/ads/zzox;-><init>(JJ)V

    invoke-interface {v0, v10}, Lcom/google/android/gms/internal/ads/zzow;->zza(Ljava/lang/Exception;)V

    :cond_1f
    const/4 v10, 0x1

    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzF:Z

    :cond_20
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzF:Z

    if-eqz v0, :cond_22

    .line 70
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzP()Z

    move-result v0

    const/4 v10, 0x0

    if-nez v0, :cond_21

    return v10

    :cond_21
    sub-long v8, v3, v8

    iget-wide v11, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzH:J

    add-long/2addr v11, v8

    iput-wide v11, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzH:J

    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzF:Z

    .line 71
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzpw;->zzI(J)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzp:Lcom/google/android/gms/internal/ads/zzow;

    if-eqz v0, :cond_22

    cmp-long v10, v8, v6

    if-eqz v10, :cond_22

    check-cast v0, Lcom/google/android/gms/internal/ads/zzqb;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzqb;->zza:Lcom/google/android/gms/internal/ads/zzqc;

    .line 72
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzqc;->zzad()V

    :cond_22
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 73
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzc:I

    if-nez v0, :cond_23

    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzA:J

    .line 74
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    int-to-long v8, v0

    add-long/2addr v6, v8

    iput-wide v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzA:J

    goto :goto_10

    .line 79
    :cond_23
    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzB:J

    iget v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzE:I

    int-to-long v8, v0

    int-to-long v10, v5

    mul-long v8, v8, v10

    add-long/2addr v6, v8

    iput-wide v6, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzB:J

    .line 74
    :goto_10
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    iput v5, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzK:I

    .line 75
    :cond_24
    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzpw;->zzK(J)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    .line 76
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_25

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzJ:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzK:I

    const/4 v3, 0x1

    return v3

    :cond_25
    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    .line 77
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzG()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzpd;->zzi(J)Z

    move-result v0

    if-eqz v0, :cond_26

    const-string v0, "DefaultAudioSink"

    const-string v2, "Resetting stalled audio track"

    .line 78
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzpw;->zze()V

    return v3

    :cond_26
    return v2

    :catch_1
    move-exception v0

    .line 18
    :try_start_6
    const-class v2, Ljava/lang/Throwable;

    const-string v3, "addSuppressed"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, Ljava/lang/Throwable;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 16
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v0, v3, v7

    invoke-virtual {v2, v11, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 31
    :catch_2
    :cond_27
    :try_start_7
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpl;->zzc()Z

    move-result v0

    if-eqz v0, :cond_28

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzW:Z

    .line 18
    :cond_28
    throw v11
    :try_end_7
    .catch Lcom/google/android/gms/internal/ads/zzov; {:try_start_7 .. :try_end_7} :catch_3

    :catch_3
    move-exception v0

    .line 55
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzov;->zzb:Z

    if-nez v2, :cond_29

    .line 13
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzpw;->zzl:Lcom/google/android/gms/internal/ads/zzpp;

    .line 31
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzpp;->zzb(Ljava/lang/Exception;)V

    const/4 v2, 0x0

    return v2

    .line 30
    :cond_29
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_9
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final zzu()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzi:Lcom/google/android/gms/internal/ads/zzpd;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzG()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzpd;->zzg(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzv()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzQ()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpw;->zzO:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzpw;->zzu()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final zzw(Lcom/google/android/gms/internal/ads/zzam;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzpw;->zza(Lcom/google/android/gms/internal/ads/zzam;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
