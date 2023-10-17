.class final Lcom/google/android/gms/internal/ads/zzjt;
.super Lcom/google/android/gms/internal/ads/zzm;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzil;


# static fields
.field public static final synthetic zzd:I


# instance fields
.field private final zzA:Lcom/google/android/gms/internal/ads/zzlq;

.field private final zzB:Lcom/google/android/gms/internal/ads/zzlr;

.field private final zzC:J

.field private zzD:I

.field private zzE:I

.field private zzF:Z

.field private zzG:I

.field private zzH:Lcom/google/android/gms/internal/ads/zzlh;

.field private zzI:Lcom/google/android/gms/internal/ads/zzcm;

.field private zzJ:Lcom/google/android/gms/internal/ads/zzbw;

.field private zzK:Lcom/google/android/gms/internal/ads/zzbw;

.field private zzL:Lcom/google/android/gms/internal/ads/zzam;

.field private zzM:Lcom/google/android/gms/internal/ads/zzam;

.field private zzN:Landroid/media/AudioTrack;

.field private zzO:Ljava/lang/Object;

.field private zzP:Landroid/view/Surface;

.field private zzQ:I

.field private zzR:Lcom/google/android/gms/internal/ads/zzff;

.field private zzS:Lcom/google/android/gms/internal/ads/zzhs;

.field private zzT:Lcom/google/android/gms/internal/ads/zzhs;

.field private zzU:I

.field private zzV:Lcom/google/android/gms/internal/ads/zzk;

.field private zzW:F

.field private zzX:Z

.field private zzY:Lcom/google/android/gms/internal/ads/zzdx;

.field private zzZ:Z

.field private zzaa:Z

.field private zzab:Lcom/google/android/gms/internal/ads/zzz;

.field private zzac:Lcom/google/android/gms/internal/ads/zzdn;

.field private zzad:Lcom/google/android/gms/internal/ads/zzbw;

.field private zzae:Lcom/google/android/gms/internal/ads/zzky;

.field private zzaf:I

.field private zzag:J

.field private final zzah:Lcom/google/android/gms/internal/ads/zzjg;

.field private zzai:Lcom/google/android/gms/internal/ads/zzvf;

.field final zzb:Lcom/google/android/gms/internal/ads/zzxe;

.field final zzc:Lcom/google/android/gms/internal/ads/zzcm;

.field private final zze:Lcom/google/android/gms/internal/ads/zzeb;

.field private final zzf:Landroid/content/Context;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcq;

.field private final zzh:[Lcom/google/android/gms/internal/ads/zzle;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzxd;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzei;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzkd;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzeo;

.field private final zzm:Ljava/util/concurrent/CopyOnWriteArraySet;

.field private final zzn:Lcom/google/android/gms/internal/ads/zzcu;

.field private final zzo:Ljava/util/List;

.field private final zzp:Z

.field private final zzq:Lcom/google/android/gms/internal/ads/zztk;

.field private final zzr:Lcom/google/android/gms/internal/ads/zzls;

.field private final zzs:Landroid/os/Looper;

.field private final zzt:Lcom/google/android/gms/internal/ads/zzxl;

.field private final zzu:Lcom/google/android/gms/internal/ads/zzdz;

.field private final zzv:Lcom/google/android/gms/internal/ads/zzjp;

.field private final zzw:Lcom/google/android/gms/internal/ads/zzjr;

.field private final zzx:Lcom/google/android/gms/internal/ads/zzhm;

.field private final zzy:Lcom/google/android/gms/internal/ads/zzhq;

.field private final zzz:Lcom/google/android/gms/internal/ads/zzlp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.exoplayer"

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbr;->zzb(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzik;Lcom/google/android/gms/internal/ads/zzcq;)V
    .locals 41

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzm;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzeb;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzdz;->zza:Lcom/google/android/gms/internal/ads/zzdz;

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzeb;-><init>(Lcom/google/android/gms/internal/ads/zzdz;)V

    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzjt;->zze:Lcom/google/android/gms/internal/ads/zzeb;

    :try_start_0
    const-string v4, "ExoPlayerImpl"

    .line 2
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/ads/zzfn;->zze:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Init "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " [AndroidXMedia3/1.0.1] ["

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzik;->zza:Landroid/content/Context;

    .line 4
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzf:Landroid/content/Context;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzik;->zzh:Lcom/google/android/gms/internal/ads/zzfon;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzik;->zzb:Lcom/google/android/gms/internal/ads/zzdz;

    .line 5
    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/ads/zzfon;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzr:Lcom/google/android/gms/internal/ads/zzls;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzik;->zzj:Lcom/google/android/gms/internal/ads/zzk;

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzV:Lcom/google/android/gms/internal/ads/zzk;

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzik;->zzk:I

    iput v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzQ:I

    const/4 v6, 0x0

    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzX:Z

    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzik;->zzo:J

    iput-wide v7, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzC:J

    .line 6
    new-instance v15, Lcom/google/android/gms/internal/ads/zzjp;

    const/4 v8, 0x0

    invoke-direct {v15, v1, v8}, Lcom/google/android/gms/internal/ads/zzjp;-><init>(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzjo;)V

    iput-object v15, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzv:Lcom/google/android/gms/internal/ads/zzjp;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzjr;

    invoke-direct {v7, v8}, Lcom/google/android/gms/internal/ads/zzjr;-><init>(Lcom/google/android/gms/internal/ads/zzjq;)V

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzw:Lcom/google/android/gms/internal/ads/zzjr;

    new-instance v14, Landroid/os/Handler;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzik;->zzi:Landroid/os/Looper;

    .line 7
    invoke-direct {v14, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzik;->zzc:Lcom/google/android/gms/internal/ads/zzfpp;

    check-cast v9, Lcom/google/android/gms/internal/ads/zzie;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzie;->zza:Lcom/google/android/gms/internal/ads/zzcek;

    move-object v10, v14

    move-object v11, v15

    move-object v12, v15

    move-object v13, v15

    move-object/from16 v26, v14

    move-object v14, v15

    .line 8
    invoke-virtual/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzcek;->zza(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzzj;Lcom/google/android/gms/internal/ads/zzot;Lcom/google/android/gms/internal/ads/zzvn;Lcom/google/android/gms/internal/ads/zzsl;)[Lcom/google/android/gms/internal/ads/zzle;

    move-result-object v9

    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzh:[Lcom/google/android/gms/internal/ads/zzle;

    .line 9
    array-length v10, v9

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzik;->zze:Lcom/google/android/gms/internal/ads/zzfpp;

    .line 10
    invoke-interface {v10}, Lcom/google/android/gms/internal/ads/zzfpp;->zza()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/google/android/gms/internal/ads/zzxd;

    iput-object v12, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzi:Lcom/google/android/gms/internal/ads/zzxd;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzik;->zzd:Lcom/google/android/gms/internal/ads/zzfpp;

    check-cast v10, Lcom/google/android/gms/internal/ads/zzif;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzif;->zza:Landroid/content/Context;

    .line 11
    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzik;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zztk;

    move-result-object v10

    iput-object v10, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzq:Lcom/google/android/gms/internal/ads/zztk;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzik;->zzg:Lcom/google/android/gms/internal/ads/zzfpp;

    check-cast v10, Lcom/google/android/gms/internal/ads/zzii;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzii;->zza:Landroid/content/Context;

    .line 12
    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzxp;->zzg(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzxp;

    move-result-object v11

    iput-object v11, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzt:Lcom/google/android/gms/internal/ads/zzxl;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzik;->zzl:Z

    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzp:Z

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzik;->zzm:Lcom/google/android/gms/internal/ads/zzlh;

    iput-object v10, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzH:Lcom/google/android/gms/internal/ads/zzlh;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzik;->zzi:Landroid/os/Looper;

    iput-object v10, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzs:Landroid/os/Looper;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzik;->zzb:Lcom/google/android/gms/internal/ads/zzdz;

    iput-object v14, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzu:Lcom/google/android/gms/internal/ads/zzdz;

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzg:Lcom/google/android/gms/internal/ads/zzcq;

    new-instance v13, Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzjf;

    .line 13
    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/ads/zzjf;-><init>(Lcom/google/android/gms/internal/ads/zzjt;)V

    invoke-direct {v13, v10, v14, v8}, Lcom/google/android/gms/internal/ads/zzeo;-><init>(Landroid/os/Looper;Lcom/google/android/gms/internal/ads/zzdz;Lcom/google/android/gms/internal/ads/zzem;)V

    iput-object v13, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    .line 14
    new-instance v8, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzm:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v6, Ljava/util/ArrayList;

    .line 15
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzvf;

    move-object/from16 v17, v7

    const/4 v7, 0x0

    .line 16
    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/ads/zzvf;-><init>(I)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzai:Lcom/google/android/gms/internal/ads/zzvf;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzxe;

    .line 17
    array-length v7, v9

    const/4 v7, 0x2

    move-object/from16 v18, v8

    new-array v8, v7, [Lcom/google/android/gms/internal/ads/zzlg;

    move-object/from16 v19, v11

    new-array v11, v7, [Lcom/google/android/gms/internal/ads/zzwx;

    sget-object v7, Lcom/google/android/gms/internal/ads/zzdi;->zza:Lcom/google/android/gms/internal/ads/zzdi;

    move-object/from16 v20, v13

    const/4 v13, 0x0

    invoke-direct {v6, v8, v11, v7, v13}, Lcom/google/android/gms/internal/ads/zzxe;-><init>([Lcom/google/android/gms/internal/ads/zzlg;[Lcom/google/android/gms/internal/ads/zzwx;Lcom/google/android/gms/internal/ads/zzdi;Ljava/lang/Object;)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzb:Lcom/google/android/gms/internal/ads/zzxe;

    .line 18
    new-instance v7, Lcom/google/android/gms/internal/ads/zzcu;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzcu;-><init>()V

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzck;

    .line 19
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzck;-><init>()V

    const/16 v8, 0x18

    new-array v11, v8, [I

    const/4 v13, 0x1

    const/16 v22, 0x0

    aput v13, v11, v22

    const/16 v21, 0x2

    aput v21, v11, v13

    const/4 v13, 0x3

    aput v13, v11, v21

    const/16 v23, 0xd

    aput v23, v11, v13

    const/16 v24, 0xe

    const/4 v13, 0x4

    aput v24, v11, v13

    const/16 v27, 0xf

    const/4 v13, 0x5

    aput v27, v11, v13

    const/16 v29, 0x10

    const/4 v13, 0x6

    aput v29, v11, v13

    const/16 v31, 0x11

    const/4 v13, 0x7

    aput v31, v11, v13

    const/16 v32, 0x12

    const/16 v13, 0x8

    aput v32, v11, v13

    const/16 v33, 0x13

    const/16 v13, 0x9

    aput v33, v11, v13

    const/16 v13, 0x1f

    const/16 v8, 0xa

    aput v13, v11, v8

    const/16 v34, 0xb

    const/16 v35, 0x14

    aput v35, v11, v34

    const/16 v34, 0xc

    const/16 v35, 0x1e

    aput v35, v11, v34

    const/16 v13, 0x15

    aput v13, v11, v23

    const/16 v23, 0x16

    aput v23, v11, v24

    const/16 v23, 0x17

    aput v23, v11, v27

    const/16 v23, 0x18

    aput v23, v11, v29

    const/16 v23, 0x19

    aput v23, v11, v31

    const/16 v23, 0x21

    aput v23, v11, v32

    const/16 v23, 0x1a

    aput v23, v11, v33

    const/16 v23, 0x14

    const/16 v24, 0x22

    aput v24, v11, v23

    const/16 v23, 0x1b

    aput v23, v11, v13

    const/16 v23, 0x16

    const/16 v24, 0x1c

    aput v24, v11, v23

    const/16 v23, 0x17

    const/16 v24, 0x20

    aput v24, v11, v23

    .line 20
    invoke-virtual {v7, v11}, Lcom/google/android/gms/internal/ads/zzck;->zzc([I)Lcom/google/android/gms/internal/ads/zzck;

    .line 21
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzxd;->zzl()Z

    const/16 v11, 0x1d

    const/4 v13, 0x1

    .line 22
    invoke-virtual {v7, v11, v13}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    .line 23
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzck;->zze()Lcom/google/android/gms/internal/ads/zzcm;

    move-result-object v7

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzc:Lcom/google/android/gms/internal/ads/zzcm;

    new-instance v11, Lcom/google/android/gms/internal/ads/zzck;

    .line 24
    invoke-direct {v11}, Lcom/google/android/gms/internal/ads/zzck;-><init>()V

    .line 25
    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/ads/zzck;->zzb(Lcom/google/android/gms/internal/ads/zzcm;)Lcom/google/android/gms/internal/ads/zzck;

    const/4 v7, 0x4

    .line 26
    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/ads/zzck;->zza(I)Lcom/google/android/gms/internal/ads/zzck;

    .line 27
    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/ads/zzck;->zza(I)Lcom/google/android/gms/internal/ads/zzck;

    .line 28
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzck;->zze()Lcom/google/android/gms/internal/ads/zzcm;

    move-result-object v11

    iput-object v11, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzI:Lcom/google/android/gms/internal/ads/zzcm;

    const/4 v11, 0x0

    .line 29
    invoke-interface {v14, v10, v11}, Lcom/google/android/gms/internal/ads/zzdz;->zzb(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/google/android/gms/internal/ads/zzei;

    move-result-object v7

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzj:Lcom/google/android/gms/internal/ads/zzei;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzjg;

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/ads/zzjg;-><init>(Lcom/google/android/gms/internal/ads/zzjt;)V

    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzah:Lcom/google/android/gms/internal/ads/zzjg;

    .line 30
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzky;->zzi(Lcom/google/android/gms/internal/ads/zzxe;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v8

    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 31
    invoke-interface {v5, v2, v10}, Lcom/google/android/gms/internal/ads/zzls;->zzS(Lcom/google/android/gms/internal/ads/zzcq;Landroid/os/Looper;)V

    sget v2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v8, 0x1f

    if-ge v2, v8, :cond_0

    .line 32
    new-instance v2, Lcom/google/android/gms/internal/ads/zzof;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzof;-><init>()V

    :goto_0
    move-object/from16 v24, v2

    goto :goto_1

    .line 69
    :cond_0
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzik;->zzp:Z

    .line 33
    invoke-static {v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzji;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjt;Z)Lcom/google/android/gms/internal/ads/zzof;

    move-result-object v2

    goto :goto_0

    .line 34
    :goto_1
    new-instance v2, Lcom/google/android/gms/internal/ads/zzkd;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzik;->zzf:Lcom/google/android/gms/internal/ads/zzfpp;

    .line 35
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzfpp;->zza()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v22, v8

    check-cast v22, Lcom/google/android/gms/internal/ads/zzkg;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzH:Lcom/google/android/gms/internal/ads/zzlh;

    move-object/from16 v27, v14

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzik;->zzr:Lcom/google/android/gms/internal/ads/zzhv;

    move-object/from16 v31, v14

    move-object/from16 v29, v15

    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/zzik;->zzn:J

    const/16 v32, 0x0

    move-object/from16 v36, v20

    move/from16 v13, v32

    const/16 v20, 0x0

    move-object/from16 v23, v27

    move-object/from16 v27, v31

    move-wide/from16 v30, v14

    move/from16 v14, v20

    const/16 v25, 0x0

    move-object/from16 v28, v7

    move-object/from16 v15, v17

    move-object v7, v2

    move-object/from16 v16, v8

    move-object/from16 v11, v18

    move-object v8, v9

    move-object v9, v12

    move-object/from16 p2, v10

    move-object v10, v6

    move-object/from16 v37, v11

    move-object/from16 v6, v19

    move-object/from16 v11, v22

    move-object/from16 v38, v12

    move-object v12, v6

    move-object/from16 v40, v15

    move-object/from16 v39, v29

    move-object v15, v5

    move-object/from16 v17, v27

    move-wide/from16 v18, v30

    move-object/from16 v21, p2

    move-object/from16 v22, v23

    move-object/from16 v23, v28

    invoke-direct/range {v7 .. v25}, Lcom/google/android/gms/internal/ads/zzkd;-><init>([Lcom/google/android/gms/internal/ads/zzle;Lcom/google/android/gms/internal/ads/zzxd;Lcom/google/android/gms/internal/ads/zzxe;Lcom/google/android/gms/internal/ads/zzkg;Lcom/google/android/gms/internal/ads/zzxl;IZLcom/google/android/gms/internal/ads/zzls;Lcom/google/android/gms/internal/ads/zzlh;Lcom/google/android/gms/internal/ads/zzhv;JZLandroid/os/Looper;Lcom/google/android/gms/internal/ads/zzdz;Lcom/google/android/gms/internal/ads/zzjg;Lcom/google/android/gms/internal/ads/zzof;Landroid/os/Looper;)V

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzW:F

    .line 36
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbw;->zza:Lcom/google/android/gms/internal/ads/zzbw;

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzJ:Lcom/google/android/gms/internal/ads/zzbw;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbw;->zza:Lcom/google/android/gms/internal/ads/zzbw;

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzK:Lcom/google/android/gms/internal/ads/zzbw;

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzad:Lcom/google/android/gms/internal/ads/zzbw;

    const/4 v2, -0x1

    iput v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzaf:I

    sget v2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/16 v7, 0x15

    if-lt v2, v7, :cond_2

    const-string v2, "audio"

    .line 41
    invoke-virtual {v4, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/AudioManager;

    if-nez v2, :cond_1

    const/4 v2, -0x1

    goto :goto_2

    .line 42
    :cond_1
    invoke-virtual {v2}, Landroid/media/AudioManager;->generateAudioSessionId()I

    move-result v2

    .line 41
    :goto_2
    iput v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzU:I

    const/4 v2, 0x0

    goto :goto_4

    .line 42
    :cond_2
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    if-eqz v2, :cond_3

    .line 37
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    .line 38
    invoke-virtual {v2}, Landroid/media/AudioTrack;->release()V

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    if-nez v4, :cond_4

    new-instance v4, Landroid/media/AudioTrack;

    const/4 v8, 0x3

    const/16 v9, 0xfa0

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v7, v4

    .line 39
    invoke-direct/range {v7 .. v14}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    :cond_4
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    .line 40
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v4

    iput v4, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzU:I

    .line 43
    :goto_4
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdx;->zza:Lcom/google/android/gms/internal/ads/zzdx;

    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzY:Lcom/google/android/gms/internal/ads/zzdx;

    const/4 v4, 0x1

    iput-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzZ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v7, v36

    .line 44
    :try_start_1
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzeo;->zzb(Ljava/lang/Object;)V

    new-instance v7, Landroid/os/Handler;

    move-object/from16 v8, p2

    .line 45
    invoke-direct {v7, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v6, v7, v5}, Lcom/google/android/gms/internal/ads/zzxl;->zze(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzxk;)V

    move-object/from16 v6, v37

    move-object/from16 v5, v39

    .line 46
    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    new-instance v6, Lcom/google/android/gms/internal/ads/zzhm;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzik;->zza:Landroid/content/Context;

    move-object/from16 v8, v26

    .line 47
    invoke-direct {v6, v7, v8, v5}, Lcom/google/android/gms/internal/ads/zzhm;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzhl;)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzx:Lcom/google/android/gms/internal/ads/zzhm;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzhq;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzik;->zza:Landroid/content/Context;

    .line 48
    invoke-direct {v6, v7, v8, v5}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzhp;)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzy:Lcom/google/android/gms/internal/ads/zzhq;

    .line 49
    invoke-static {v2, v2}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/ads/zzlp;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzik;->zza:Landroid/content/Context;

    .line 50
    invoke-direct {v2, v6, v8, v5}, Lcom/google/android/gms/internal/ads/zzlp;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzll;)V

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzz:Lcom/google/android/gms/internal/ads/zzlp;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzV:Lcom/google/android/gms/internal/ads/zzk;

    .line 51
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzk;->zzc:I

    const/4 v5, 0x3

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzlp;->zzf(I)V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzlq;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzik;->zza:Landroid/content/Context;

    .line 52
    invoke-direct {v6, v7}, Lcom/google/android/gms/internal/ads/zzlq;-><init>(Landroid/content/Context;)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzA:Lcom/google/android/gms/internal/ads/zzlq;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzlr;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzik;->zza:Landroid/content/Context;

    .line 53
    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/zzlr;-><init>(Landroid/content/Context;)V

    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzB:Lcom/google/android/gms/internal/ads/zzlr;

    .line 54
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzjt;->zzah(Lcom/google/android/gms/internal/ads/zzlp;)Lcom/google/android/gms/internal/ads/zzz;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzab:Lcom/google/android/gms/internal/ads/zzz;

    .line 55
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdn;->zza:Lcom/google/android/gms/internal/ads/zzdn;

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzac:Lcom/google/android/gms/internal/ads/zzdn;

    .line 56
    sget-object v0, Lcom/google/android/gms/internal/ads/zzff;->zza:Lcom/google/android/gms/internal/ads/zzff;

    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzR:Lcom/google/android/gms/internal/ads/zzff;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzV:Lcom/google/android/gms/internal/ads/zzk;

    move-object/from16 v10, v38

    .line 57
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzxd;->zzi(Lcom/google/android/gms/internal/ads/zzk;)V

    iget v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzU:I

    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0xa

    invoke-direct {v1, v4, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    iget v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzU:I

    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x2

    invoke-direct {v1, v6, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzV:Lcom/google/android/gms/internal/ads/zzk;

    .line 60
    invoke-direct {v1, v4, v5, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    iget v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzQ:I

    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    invoke-direct {v1, v6, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x5

    .line 63
    invoke-direct {v1, v6, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzjt;->zzX:Z

    .line 64
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v2, 0x9

    invoke-direct {v1, v4, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    move-object/from16 v0, v40

    const/4 v2, 0x7

    .line 65
    invoke-direct {v1, v6, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    const/16 v2, 0x8

    const/4 v4, 0x6

    .line 66
    invoke-direct {v1, v4, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeb;->zze()Z

    return-void

    :catchall_0
    move-exception v0

    .line 68
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzjt;->zze:Lcom/google/android/gms/internal/ads/zzeb;

    .line 67
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeb;->zze()Z

    .line 69
    throw v0
.end method

.method static bridge synthetic zzC(ZI)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzjt;->zzac(ZI)I

    move-result p0

    return p0
.end method

.method static bridge synthetic zzD(Lcom/google/android/gms/internal/ads/zzjt;)Lcom/google/android/gms/internal/ads/zzz;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzab:Lcom/google/android/gms/internal/ads/zzz;

    return-object p0
.end method

.method static bridge synthetic zzE(Lcom/google/android/gms/internal/ads/zzlp;)Lcom/google/android/gms/internal/ads/zzz;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzah(Lcom/google/android/gms/internal/ads/zzlp;)Lcom/google/android/gms/internal/ads/zzz;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic zzF(Lcom/google/android/gms/internal/ads/zzjt;)Lcom/google/android/gms/internal/ads/zzeo;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    return-object p0
.end method

.method static bridge synthetic zzH(Lcom/google/android/gms/internal/ads/zzjt;)Lcom/google/android/gms/internal/ads/zzlp;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzz:Lcom/google/android/gms/internal/ads/zzlp;

    return-object p0
.end method

.method static bridge synthetic zzI(Lcom/google/android/gms/internal/ads/zzjt;)Lcom/google/android/gms/internal/ads/zzls;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzr:Lcom/google/android/gms/internal/ads/zzls;

    return-object p0
.end method

.method static bridge synthetic zzJ(Lcom/google/android/gms/internal/ads/zzjt;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzO:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic zzK(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzhs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzT:Lcom/google/android/gms/internal/ads/zzhs;

    return-void
.end method

.method static bridge synthetic zzL(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzam;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzM:Lcom/google/android/gms/internal/ads/zzam;

    return-void
.end method

.method static bridge synthetic zzM(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzab:Lcom/google/android/gms/internal/ads/zzz;

    return-void
.end method

.method static bridge synthetic zzN(Lcom/google/android/gms/internal/ads/zzjt;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzX:Z

    return-void
.end method

.method static bridge synthetic zzO(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzhs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzS:Lcom/google/android/gms/internal/ads/zzhs;

    return-void
.end method

.method static bridge synthetic zzP(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzam;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzL:Lcom/google/android/gms/internal/ads/zzam;

    return-void
.end method

.method static bridge synthetic zzQ(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzdn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzac:Lcom/google/android/gms/internal/ads/zzdn;

    return-void
.end method

.method static bridge synthetic zzR(Lcom/google/android/gms/internal/ads/zzjt;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzjt;->zzak(II)V

    return-void
.end method

.method static bridge synthetic zzS(Lcom/google/android/gms/internal/ads/zzjt;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzam()V

    return-void
.end method

.method static bridge synthetic zzT(Lcom/google/android/gms/internal/ads/zzjt;Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzan(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzP:Landroid/view/Surface;

    return-void
.end method

.method static bridge synthetic zzU(Lcom/google/android/gms/internal/ads/zzjt;Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzjt;->zzan(Ljava/lang/Object;)V

    return-void
.end method

.method static bridge synthetic zzV(Lcom/google/android/gms/internal/ads/zzjt;ZII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzjt;->zzap(ZII)V

    return-void
.end method

.method static bridge synthetic zzW(Lcom/google/android/gms/internal/ads/zzjt;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzar()V

    return-void
.end method

.method static bridge synthetic zzaa(Lcom/google/android/gms/internal/ads/zzjt;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzX:Z

    return p0
.end method

.method private final zzab()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzaf:I

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    return v0
.end method

.method private static zzac(ZI)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    return v0
.end method

.method private final zzad(Lcom/google/android/gms/internal/ads/zzky;)J
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzag:J

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v0

    return-wide v0

    .line 3
    :cond_0
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzky;->zza()J

    move-result-wide v0

    goto :goto_0

    .line 5
    :cond_1
    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    .line 6
    :goto_0
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v2

    if-eqz v2, :cond_2

    return-wide v0

    .line 7
    :cond_2
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-direct {p0, v2, p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzjt;->zzaf(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;J)J

    return-wide v0
.end method

.method private static zzae(Lcom/google/android/gms/internal/ads/zzky;)J
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcw;-><init>()V

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcu;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    .line 4
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 5
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    const-wide/16 v2, 0x0

    .line 6
    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object p0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzcw;->zzm:J

    :cond_0
    return-wide v2
.end method

.method private final zzaf(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;J)J
    .locals 1

    .line 1
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    return-wide p3
.end method

.method private final zzag(Lcom/google/android/gms/internal/ads/zzcx;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzaf:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, p1

    if-nez v0, :cond_0

    move-wide p3, v1

    :cond_0
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzag:J

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzc()I

    move-result v0

    if-lt p2, v0, :cond_3

    :cond_2
    const/4 p2, 0x0

    .line 3
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcx;->zzg(Z)I

    move-result p2

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 4
    invoke-virtual {p1, p2, p3, v1, v2}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object p3

    iget-wide p3, p3, Lcom/google/android/gms/internal/ads/zzcw;->zzm:J

    .line 5
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide p3

    :cond_3
    move v3, p2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 6
    invoke-static {p3, p4}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzcx;->zzl(Lcom/google/android/gms/internal/ads/zzcw;Lcom/google/android/gms/internal/ads/zzcu;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private static zzah(Lcom/google/android/gms/internal/ads/zzlp;)Lcom/google/android/gms/internal/ads/zzz;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzx;-><init>(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzlp;->zzb()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzx;->zzd(I)Lcom/google/android/gms/internal/ads/zzx;

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzlp;->zza()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzx;->zzc(I)Lcom/google/android/gms/internal/ads/zzx;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzx;->zze()Lcom/google/android/gms/internal/ads/zzz;

    move-result-object p0

    return-object p0
.end method

.method private final zzai(Lcom/google/android/gms/internal/ads/zzky;Lcom/google/android/gms/internal/ads/zzcx;Landroid/util/Pair;)Lcom/google/android/gms/internal/ads/zzky;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    move-object/from16 v3, p1

    .line 2
    iget-object v6, v3, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    .line 3
    invoke-virtual/range {p1 .. p2}, Lcom/google/android/gms/internal/ads/zzky;->zzh(Lcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v7

    .line 4
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzky;->zzj()Lcom/google/android/gms/internal/ads/zztl;

    move-result-object v1

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzag:J

    .line 5
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    .line 6
    sget-object v17, Lcom/google/android/gms/internal/ads/zzvk;->zza:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzb:Lcom/google/android/gms/internal/ads/zzxe;

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v19

    move-object v8, v1

    move-wide v9, v13

    move-wide v11, v13

    move-object/from16 v18, v2

    .line 8
    invoke-virtual/range {v7 .. v19}, Lcom/google/android/gms/internal/ads/zzky;->zzd(Lcom/google/android/gms/internal/ads/zztl;JJJJLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v2

    .line 9
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzky;->zzc(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v1

    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    return-object v1

    :cond_2
    iget-object v3, v7, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    .line 10
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    .line 11
    sget v8, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v8, v5

    if-eqz v8, :cond_3

    new-instance v9, Lcom/google/android/gms/internal/ads/zztl;

    .line 12
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v9, v10}, Lcom/google/android/gms/internal/ads/zztl;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    .line 36
    :cond_3
    iget-object v9, v7, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    :goto_2
    move-object v15, v9

    .line 13
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    .line 14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzj()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v9

    .line 15
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 16
    invoke-virtual {v6, v3, v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    :cond_4
    if-nez v8, :cond_a

    cmp-long v2, v13, v9

    if-gez v2, :cond_5

    goto/16 :goto_5

    :cond_5
    if-nez v2, :cond_8

    .line 21
    iget-object v2, v7, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    .line 22
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    .line 23
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzcx;->zza(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_6

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 24
    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zzd(ILcom/google/android/gms/internal/ads/zzcu;Z)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object v2

    .line 25
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    iget-object v3, v15, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 26
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    if-eq v2, v3, :cond_e

    .line 27
    :cond_6
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    .line 28
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 29
    iget v2, v15, Lcom/google/android/gms/internal/ads/zztl;->zzb:I

    iget v3, v15, Lcom/google/android/gms/internal/ads/zztl;->zzc:I

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcu;->zzh(II)J

    move-result-wide v1

    goto :goto_3

    .line 32
    :cond_7
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 30
    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzcu;->zze:J

    .line 29
    :goto_3
    iget-wide v9, v7, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    iget-wide v11, v7, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    iget-wide v13, v7, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget-wide v3, v7, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    sub-long v3, v1, v3

    iget-object v5, v7, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v6, v7, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v8, v7, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    move-object/from16 v19, v8

    move-object v8, v15

    move-object v0, v15

    move-wide v15, v3

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    .line 31
    invoke-virtual/range {v7 .. v19}, Lcom/google/android/gms/internal/ads/zzky;->zzd(Lcom/google/android/gms/internal/ads/zztl;JJJJLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v3

    .line 32
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzky;->zzc(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v7

    iput-wide v1, v7, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    goto :goto_4

    :cond_8
    move-object v0, v15

    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v1

    xor-int/2addr v1, v5

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    const-wide/16 v1, 0x0

    iget-wide v3, v7, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    sub-long v5, v13, v9

    sub-long/2addr v3, v5

    .line 34
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v15

    iget-wide v1, v7, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    iget-object v3, v7, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v4, v7, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    .line 35
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbx;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    add-long v1, v13, v15

    :cond_9
    iget-object v3, v7, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v4, v7, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v5, v7, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    move-object v8, v0

    move-wide v9, v13

    move-wide v11, v13

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    .line 36
    invoke-virtual/range {v7 .. v19}, Lcom/google/android/gms/internal/ads/zzky;->zzd(Lcom/google/android/gms/internal/ads/zztl;JJJJLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v7

    iput-wide v1, v7, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    :goto_4
    move-object/from16 v0, p0

    goto :goto_9

    :cond_a
    :goto_5
    move-object v0, v15

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v1

    xor-int/2addr v1, v5

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    if-eqz v8, :cond_b

    .line 18
    sget-object v1, Lcom/google/android/gms/internal/ads/zzvk;->zza:Lcom/google/android/gms/internal/ads/zzvk;

    goto :goto_6

    .line 21
    :cond_b
    iget-object v1, v7, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    :goto_6
    move-object/from16 v17, v1

    if-eqz v8, :cond_c

    move-object v1, v0

    move-object/from16 v0, p0

    .line 18
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzb:Lcom/google/android/gms/internal/ads/zzxe;

    goto :goto_7

    :cond_c
    move-object v1, v0

    move-object/from16 v0, p0

    .line 21
    iget-object v2, v7, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    :goto_7
    move-object/from16 v18, v2

    if-eqz v8, :cond_d

    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v2

    goto :goto_8

    .line 21
    :cond_d
    iget-object v2, v7, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    :goto_8
    move-object/from16 v19, v2

    const-wide/16 v15, 0x0

    move-object v8, v1

    move-wide v9, v13

    move-wide v11, v13

    move-wide v2, v13

    .line 20
    invoke-virtual/range {v7 .. v19}, Lcom/google/android/gms/internal/ads/zzky;->zzd(Lcom/google/android/gms/internal/ads/zztl;JJJJLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v4

    .line 21
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzky;->zzc(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v7

    iput-wide v2, v7, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    :cond_e
    :goto_9
    return-object v7
.end method

.method private final zzaj(Lcom/google/android/gms/internal/ads/zzla;)Lcom/google/android/gms/internal/ads/zzlb;
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzab()I

    move-result v0

    new-instance v8, Lcom/google/android/gms/internal/ads/zzlb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move v5, v0

    :goto_0
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzu:Lcom/google/android/gms/internal/ads/zzdz;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzkd;->zzb()Landroid/os/Looper;

    move-result-object v7

    move-object v1, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzlb;-><init>(Lcom/google/android/gms/internal/ads/zzkz;Lcom/google/android/gms/internal/ads/zzla;Lcom/google/android/gms/internal/ads/zzcx;ILcom/google/android/gms/internal/ads/zzdz;Landroid/os/Looper;)V

    return-object v8
.end method

.method private final zzak(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzR:Lcom/google/android/gms/internal/ads/zzff;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzff;->zzb()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzR:Lcom/google/android/gms/internal/ads/zzff;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzff;->zza()I

    move-result v0

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzff;

    .line 2
    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzff;-><init>(II)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzR:Lcom/google/android/gms/internal/ads/zzff;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    const/16 v1, 0x18

    new-instance v2, Lcom/google/android/gms/internal/ads/zzin;

    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzin;-><init>(II)V

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeo;->zzc()V

    const/4 v0, 0x2

    const/16 v1, 0xe

    new-instance v2, Lcom/google/android/gms/internal/ads/zzff;

    .line 5
    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzff;-><init>(II)V

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    return-void
.end method

.method private final zzal(IILjava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzh:[Lcom/google/android/gms/internal/ads/zzle;

    array-length v1, v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    .line 2
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzle;->zzb()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 3
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzjt;->zzaj(Lcom/google/android/gms/internal/ads/zzla;)Lcom/google/android/gms/internal/ads/zzlb;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzlb;->zzf(I)Lcom/google/android/gms/internal/ads/zzlb;

    invoke-virtual {v2, p3}, Lcom/google/android/gms/internal/ads/zzlb;->zze(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzlb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzlb;->zzd()Lcom/google/android/gms/internal/ads/zzlb;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final zzam()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzW:F

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzy:Lcom/google/android/gms/internal/ads/zzhq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhq;->zza()F

    move-result v1

    mul-float v0, v0, v1

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzal(IILjava/lang/Object;)V

    return-void
.end method

.method private final zzan(Ljava/lang/Object;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzh:[Lcom/google/android/gms/internal/ads/zzle;

    .line 2
    array-length v2, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    aget-object v6, v1, v3

    .line 3
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzle;->zzb()I

    move-result v7

    if-ne v7, v4, :cond_0

    .line 4
    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/ads/zzjt;->zzaj(Lcom/google/android/gms/internal/ads/zzla;)Lcom/google/android/gms/internal/ads/zzlb;

    move-result-object v4

    .line 5
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzlb;->zzf(I)Lcom/google/android/gms/internal/ads/zzlb;

    .line 6
    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/ads/zzlb;->zze(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzlb;

    .line 7
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzlb;->zzd()Lcom/google/android/gms/internal/ads/zzlb;

    .line 8
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzO:Ljava/lang/Object;

    if-eqz v1, :cond_3

    if-eq v1, p1, :cond_3

    .line 9
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzlb;

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzC:J

    .line 10
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzlb;->zzi(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v2, 0x1

    goto :goto_2

    .line 11
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 10
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzO:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzP:Landroid/view/Surface;

    if-ne v0, v1, :cond_3

    .line 12
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzP:Landroid/view/Surface;

    :cond_3
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzO:Ljava/lang/Object;

    if-eqz v2, :cond_4

    new-instance p1, Lcom/google/android/gms/internal/ads/zzke;

    const/4 v0, 0x3

    .line 13
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzke;-><init>(I)V

    const/16 v0, 0x3eb

    .line 14
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzia;->zzd(Ljava/lang/RuntimeException;I)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object p1

    .line 13
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzjt;->zzao(Lcom/google/android/gms/internal/ads/zzia;)V

    :cond_4
    return-void
.end method

.method private final zzao(Lcom/google/android/gms/internal/ads/zzia;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzky;->zzc(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzky;->zzg(I)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzky;->zzf(Lcom/google/android/gms/internal/ads/zzia;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    :cond_0
    move-object v3, v0

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzkd;->zzo()V

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x5

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v11, -0x1

    const/4 v12, 0x0

    move-object v2, p0

    .line 6
    invoke-direct/range {v2 .. v12}, Lcom/google/android/gms/internal/ads/zzjt;->zzaq(Lcom/google/android/gms/internal/ads/zzky;IIZZIJIZ)V

    return-void
.end method

.method private final zzap(ZII)V
    .locals 11

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x1

    .line 1
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    if-ne v4, v3, :cond_3

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    if-eq v4, v2, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    add-int/2addr v4, v1

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    .line 2
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    if-eqz v1, :cond_4

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzky;->zzb()Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    .line 4
    :cond_4
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzky;->zze(ZI)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    .line 5
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzkd;->zzn(ZI)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    move v3, p3

    .line 6
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzjt;->zzaq(Lcom/google/android/gms/internal/ads/zzky;IIZZIJIZ)V

    return-void
.end method

.method private final zzaq(Lcom/google/android/gms/internal/ads/zzky;IIZZIJIZ)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p6

    .line 1
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzcx;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x1

    .line 6
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    xor-int/2addr v4, v5

    .line 2
    iget-object v7, v3, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    .line 3
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    .line 4
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v9

    const/4 v11, 0x3

    const/4 v12, -0x1

    .line 21
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const-wide/16 v14, 0x0

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    if-eqz v9, :cond_0

    .line 4
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v9

    if-eqz v9, :cond_0

    new-instance v6, Landroid/util/Pair;

    .line 21
    invoke-direct {v6, v12, v13}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 5
    :cond_0
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v9

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v10

    if-eq v9, v10, :cond_1

    new-instance v7, Landroid/util/Pair;

    .line 6
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v7, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    move-object v6, v7

    goto/16 :goto_2

    .line 7
    :cond_1
    iget-object v9, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 8
    invoke-virtual {v7, v9, v10}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object v9

    iget v9, v9, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 9
    invoke-virtual {v7, v9, v10, v14, v15}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v7

    .line 10
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzcw;->zzc:Ljava/lang/Object;

    .line 11
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 12
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object v9

    iget v9, v9, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 13
    invoke-virtual {v8, v9, v10, v14, v15}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v8

    .line 14
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzcw;->zzc:Ljava/lang/Object;

    .line 15
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    if-eqz p5, :cond_2

    if-nez v2, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    if-eqz p5, :cond_3

    if-ne v2, v5, :cond_3

    const/4 v7, 0x2

    goto :goto_1

    :cond_3
    if-eqz v4, :cond_4

    const/4 v7, 0x3

    :goto_1
    new-instance v8, Landroid/util/Pair;

    .line 17
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v8, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v6, v8

    goto :goto_2

    .line 20
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 16
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_5
    if-eqz p5, :cond_6

    if-nez v2, :cond_6

    .line 18
    iget-object v7, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v7, v7, Lcom/google/android/gms/internal/ads/zztl;->zzd:J

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v9, v9, Lcom/google/android/gms/internal/ads/zztl;->zzd:J

    cmp-long v17, v7, v9

    if-gez v17, :cond_6

    new-instance v7, Landroid/util/Pair;

    const/4 v8, 0x0

    .line 20
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v7, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 16
    :cond_6
    new-instance v6, Landroid/util/Pair;

    .line 19
    invoke-direct {v6, v12, v13}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    :goto_2
    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 23
    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzJ:Lcom/google/android/gms/internal/ads/zzbw;

    if-eqz v7, :cond_8

    .line 24
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v10

    if-nez v10, :cond_7

    .line 25
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 26
    invoke-virtual {v10, v12, v13}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object v10

    iget v10, v10, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    .line 27
    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 28
    invoke-virtual {v12, v10, v13, v14, v15}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v10

    .line 27
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzcw;->zzd:Lcom/google/android/gms/internal/ads/zzbq;

    goto :goto_3

    :cond_7
    const/4 v10, 0x0

    .line 29
    :goto_3
    sget-object v12, Lcom/google/android/gms/internal/ads/zzbw;->zza:Lcom/google/android/gms/internal/ads/zzbw;

    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzad:Lcom/google/android/gms/internal/ads/zzbw;

    goto :goto_4

    :cond_8
    const/4 v10, 0x0

    :goto_4
    if-nez v7, :cond_9

    .line 30
    iget-object v12, v3, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    .line 31
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    :cond_9
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzad:Lcom/google/android/gms/internal/ads/zzbw;

    .line 32
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbw;->zza()Lcom/google/android/gms/internal/ads/zzbu;

    move-result-object v8

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    const/4 v13, 0x0

    .line 33
    :goto_5
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v9

    if-ge v13, v9, :cond_b

    .line 34
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/ads/zzca;

    const/4 v11, 0x0

    .line 35
    :goto_6
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzca;->zza()I

    move-result v5

    if-ge v11, v5, :cond_a

    .line 36
    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/ads/zzca;->zzb(I)Lcom/google/android/gms/internal/ads/zzbz;

    move-result-object v5

    .line 37
    invoke-interface {v5, v8}, Lcom/google/android/gms/internal/ads/zzbz;->zza(Lcom/google/android/gms/internal/ads/zzbu;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_a
    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x1

    const/4 v11, 0x3

    goto :goto_5

    .line 38
    :cond_b
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbu;->zzu()Lcom/google/android/gms/internal/ads/zzbw;

    move-result-object v5

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzad:Lcom/google/android/gms/internal/ads/zzbw;

    .line 39
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v5

    .line 40
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v8

    if-eqz v8, :cond_c

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzad:Lcom/google/android/gms/internal/ads/zzbw;

    goto :goto_7

    .line 41
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzd()I

    move-result v8

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 42
    invoke-virtual {v5, v8, v9, v14, v15}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v5

    .line 41
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzcw;->zzd:Lcom/google/android/gms/internal/ads/zzbq;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzad:Lcom/google/android/gms/internal/ads/zzbw;

    .line 43
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbw;->zza()Lcom/google/android/gms/internal/ads/zzbu;

    move-result-object v8

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzbq;->zzg:Lcom/google/android/gms/internal/ads/zzbw;

    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzbu;->zzb(Lcom/google/android/gms/internal/ads/zzbw;)Lcom/google/android/gms/internal/ads/zzbu;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbu;->zzu()Lcom/google/android/gms/internal/ads/zzbw;

    move-result-object v8

    .line 40
    :cond_d
    :goto_7
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzJ:Lcom/google/android/gms/internal/ads/zzbw;

    .line 44
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzbw;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v9, 0x1

    xor-int/2addr v5, v9

    iput-object v8, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzJ:Lcom/google/android/gms/internal/ads/zzbw;

    .line 45
    iget-boolean v8, v3, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    iget-boolean v9, v1, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    if-eq v8, v9, :cond_e

    const/4 v8, 0x1

    goto :goto_8

    :cond_e
    const/4 v8, 0x0

    .line 46
    :goto_8
    iget v9, v3, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    iget v11, v1, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    if-eq v9, v11, :cond_f

    const/4 v9, 0x1

    goto :goto_9

    :cond_f
    const/4 v9, 0x0

    :goto_9
    if-nez v9, :cond_10

    if-eqz v8, :cond_11

    .line 47
    :cond_10
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzar()V

    .line 48
    :cond_11
    iget-boolean v11, v3, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-boolean v12, v1, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    if-eq v11, v12, :cond_12

    const/4 v11, 0x1

    goto :goto_a

    :cond_12
    const/4 v11, 0x0

    :goto_a
    if-eqz v4, :cond_13

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v12, Lcom/google/android/gms/internal/ads/zzio;

    move/from16 v13, p2

    invoke-direct {v12, v1, v13}, Lcom/google/android/gms/internal/ads/zzio;-><init>(Lcom/google/android/gms/internal/ads/zzky;I)V

    const/4 v13, 0x0

    .line 49
    invoke-virtual {v4, v13, v12}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_13
    if-eqz p5, :cond_1b

    .line 50
    new-instance v12, Lcom/google/android/gms/internal/ads/zzcu;

    invoke-direct {v12}, Lcom/google/android/gms/internal/ads/zzcu;-><init>()V

    .line 51
    iget-object v13, v3, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v13

    if-nez v13, :cond_14

    .line 52
    iget-object v13, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    .line 53
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v4, v13, v12}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    iget v4, v12, Lcom/google/android/gms/internal/ads/zzcu;->zzd:I

    .line 54
    iget-object v14, v3, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/ads/zzcx;->zza(Ljava/lang/Object;)I

    move-result v14

    .line 55
    iget-object v15, v3, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    move-object/from16 p5, v13

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    move/from16 v18, v8

    move/from16 v19, v9

    const-wide/16 v8, 0x0

    .line 56
    invoke-virtual {v15, v4, v13, v8, v9}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v13

    .line 55
    iget-object v8, v13, Lcom/google/android/gms/internal/ads/zzcw;->zzc:Ljava/lang/Object;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzcw;->zzd:Lcom/google/android/gms/internal/ads/zzbq;

    move-object/from16 v24, p5

    move/from16 v22, v4

    move-object/from16 v21, v8

    move-object/from16 v23, v9

    move/from16 v25, v14

    goto :goto_b

    :cond_14
    move/from16 v18, v8

    move/from16 v19, v9

    move/from16 v22, p9

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, -0x1

    :goto_b
    if-nez v2, :cond_17

    .line 57
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v4

    if-eqz v4, :cond_15

    .line 58
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget v8, v4, Lcom/google/android/gms/internal/ads/zztl;->zzb:I

    iget v4, v4, Lcom/google/android/gms/internal/ads/zztl;->zzc:I

    .line 59
    invoke-virtual {v12, v8, v4}, Lcom/google/android/gms/internal/ads/zzcu;->zzh(II)J

    move-result-wide v8

    .line 60
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzjt;->zzae(Lcom/google/android/gms/internal/ads/zzky;)J

    move-result-wide v12

    goto :goto_d

    .line 61
    :cond_15
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zztl;->zze:I

    const/4 v8, -0x1

    if-eq v4, v8, :cond_16

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 62
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzjt;->zzae(Lcom/google/android/gms/internal/ads/zzky;)J

    move-result-wide v8

    goto :goto_c

    :cond_16
    iget-wide v8, v12, Lcom/google/android/gms/internal/ads/zzcu;->zze:J

    goto :goto_c

    .line 63
    :cond_17
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v4

    if-eqz v4, :cond_18

    .line 64
    iget-wide v8, v3, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    .line 65
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzjt;->zzae(Lcom/google/android/gms/internal/ads/zzky;)J

    move-result-wide v12

    goto :goto_d

    .line 66
    :cond_18
    iget-wide v8, v3, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    :goto_c
    move-wide v12, v8

    .line 67
    :goto_d
    new-instance v4, Lcom/google/android/gms/internal/ads/zzcp;

    .line 68
    sget v14, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    .line 69
    iget-object v14, v3, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget v15, v14, Lcom/google/android/gms/internal/ads/zztl;->zzb:I

    iget v14, v14, Lcom/google/android/gms/internal/ads/zztl;->zzc:I

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v26

    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v28

    move-object/from16 v20, v4

    move/from16 v30, v15

    move/from16 v31, v14

    invoke-direct/range {v20 .. v31}, Lcom/google/android/gms/internal/ads/zzcp;-><init>(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzbq;Ljava/lang/Object;IJJII)V

    .line 70
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzd()I

    move-result v8

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 71
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v9

    if-nez v9, :cond_19

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 72
    iget-object v12, v9, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    .line 73
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    invoke-virtual {v9, v12, v13}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 74
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v9, v12}, Lcom/google/android/gms/internal/ads/zzcx;->zza(Ljava/lang/Object;)I

    move-result v9

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 75
    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    move v15, v11

    move-object/from16 v17, v12

    const-wide/16 v11, 0x0

    .line 76
    invoke-virtual {v13, v8, v14, v11, v12}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v13

    .line 75
    iget-object v11, v13, Lcom/google/android/gms/internal/ads/zzcw;->zzc:Ljava/lang/Object;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzcw;->zzd:Lcom/google/android/gms/internal/ads/zzbq;

    move/from16 v35, v9

    move-object/from16 v31, v11

    move-object/from16 v33, v12

    move-object/from16 v34, v17

    goto :goto_e

    :cond_19
    move v15, v11

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, -0x1

    :goto_e
    invoke-static/range {p7 .. p8}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v36

    new-instance v9, Lcom/google/android/gms/internal/ads/zzcp;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 77
    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v11

    if-eqz v11, :cond_1a

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 78
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzjt;->zzae(Lcom/google/android/gms/internal/ads/zzky;)J

    move-result-wide v11

    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v11

    move-wide/from16 v38, v11

    goto :goto_f

    :cond_1a
    move-wide/from16 v38, v36

    :goto_f
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 79
    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget v12, v11, Lcom/google/android/gms/internal/ads/zztl;->zzb:I

    iget v11, v11, Lcom/google/android/gms/internal/ads/zztl;->zzc:I

    move-object/from16 v30, v9

    move/from16 v32, v8

    move/from16 v40, v12

    move/from16 v41, v11

    invoke-direct/range {v30 .. v41}, Lcom/google/android/gms/internal/ads/zzcp;-><init>(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zzbq;Ljava/lang/Object;IJJII)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v11, Lcom/google/android/gms/internal/ads/zziu;

    invoke-direct {v11, v2, v4, v9}, Lcom/google/android/gms/internal/ads/zziu;-><init>(ILcom/google/android/gms/internal/ads/zzcp;Lcom/google/android/gms/internal/ads/zzcp;)V

    const/16 v2, 0xb

    .line 80
    invoke-virtual {v8, v2, v11}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    goto :goto_10

    :cond_1b
    move/from16 v18, v8

    move/from16 v19, v9

    move v15, v11

    :goto_10
    if-eqz v7, :cond_1c

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v4, Lcom/google/android/gms/internal/ads/zziv;

    invoke-direct {v4, v10, v6}, Lcom/google/android/gms/internal/ads/zziv;-><init>(Lcom/google/android/gms/internal/ads/zzbq;I)V

    const/4 v6, 0x1

    .line 81
    invoke-virtual {v2, v6, v4}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    goto :goto_11

    :cond_1c
    const/4 v6, 0x1

    .line 82
    :goto_11
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    const/16 v7, 0xa

    if-eq v2, v4, :cond_1d

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v4, Lcom/google/android/gms/internal/ads/zziw;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zziw;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    .line 83
    invoke-virtual {v2, v7, v4}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 84
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzix;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzix;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    .line 85
    invoke-virtual {v2, v7, v4}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 86
    :cond_1d
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    if-eq v2, v4, :cond_1e

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzi:Lcom/google/android/gms/internal/ads/zzxd;

    .line 87
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzxe;->zze:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzxd;->zzo(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v4, Lcom/google/android/gms/internal/ads/zziy;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zziy;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    const/4 v8, 0x2

    .line 88
    invoke-virtual {v2, v8, v4}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_1e
    if-eqz v5, :cond_1f

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzJ:Lcom/google/android/gms/internal/ads/zzbw;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    const/16 v5, 0xe

    new-instance v8, Lcom/google/android/gms/internal/ads/zziz;

    invoke-direct {v8, v2}, Lcom/google/android/gms/internal/ads/zziz;-><init>(Lcom/google/android/gms/internal/ads/zzbw;)V

    .line 89
    invoke-virtual {v4, v5, v8}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_1f
    if-eqz v15, :cond_20

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzja;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzja;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    const/4 v5, 0x3

    .line 90
    invoke-virtual {v2, v5, v4}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_20
    if-nez v19, :cond_21

    if-eqz v18, :cond_22

    :cond_21
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzjb;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzjb;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    const/4 v5, -0x1

    .line 91
    invoke-virtual {v2, v5, v4}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_22
    const/4 v2, 0x4

    if-eqz v19, :cond_23

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzjc;

    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/ads/zzjc;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    .line 92
    invoke-virtual {v4, v2, v5}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_23
    const/4 v4, 0x5

    if-eqz v18, :cond_24

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzip;

    move/from16 v9, p3

    invoke-direct {v8, v1, v9}, Lcom/google/android/gms/internal/ads/zzip;-><init>(Lcom/google/android/gms/internal/ads/zzky;I)V

    .line 93
    invoke-virtual {v5, v4, v8}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 94
    :cond_24
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    iget v8, v1, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    const/4 v9, 0x6

    if-eq v5, v8, :cond_25

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v8, Lcom/google/android/gms/internal/ads/zziq;

    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/ads/zziq;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    .line 95
    invoke-virtual {v5, v9, v8}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 96
    :cond_25
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzky;->zzk()Z

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzky;->zzk()Z

    move-result v8

    const/4 v10, 0x7

    if-eq v5, v8, :cond_26

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzir;

    invoke-direct {v8, v1}, Lcom/google/android/gms/internal/ads/zzir;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    .line 97
    invoke-virtual {v5, v10, v8}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 98
    :cond_26
    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/ads/zzci;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/16 v8, 0xc

    if-nez v5, :cond_27

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    new-instance v11, Lcom/google/android/gms/internal/ads/zzis;

    invoke-direct {v11, v1}, Lcom/google/android/gms/internal/ads/zzis;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    .line 99
    invoke-virtual {v5, v8, v11}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_27
    if-eqz p4, :cond_28

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    sget-object v11, Lcom/google/android/gms/internal/ads/zzit;->zza:Lcom/google/android/gms/internal/ads/zzit;

    const/4 v12, -0x1

    .line 100
    invoke-virtual {v5, v12, v11}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_28
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzI:Lcom/google/android/gms/internal/ads/zzcm;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzg:Lcom/google/android/gms/internal/ads/zzcq;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzc:Lcom/google/android/gms/internal/ads/zzcm;

    .line 101
    sget v13, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    .line 102
    invoke-interface {v11}, Lcom/google/android/gms/internal/ads/zzcq;->zzx()Z

    move-result v13

    move-object v14, v11

    check-cast v14, Lcom/google/android/gms/internal/ads/zzm;

    .line 103
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v15

    .line 104
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v17

    if-nez v17, :cond_29

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzd()I

    move-result v6

    iget-object v8, v14, Lcom/google/android/gms/internal/ads/zzm;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    const-wide/16 v9, 0x0

    .line 105
    invoke-virtual {v15, v6, v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v6

    .line 104
    iget-boolean v6, v6, Lcom/google/android/gms/internal/ads/zzcw;->zzh:Z

    if-eqz v6, :cond_29

    const/4 v8, 0x1

    goto :goto_12

    :cond_29
    const/4 v8, 0x0

    .line 106
    :goto_12
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v6

    .line 107
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v9

    if-eqz v9, :cond_2b

    const/4 v9, -0x1

    const/4 v10, 0x0

    :cond_2a
    const/16 v16, 0x0

    goto :goto_13

    .line 108
    :cond_2b
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzd()I

    move-result v9

    .line 109
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzh()I

    .line 108
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzw()Z

    const/4 v10, 0x0

    .line 110
    invoke-virtual {v6, v9, v10, v10}, Lcom/google/android/gms/internal/ads/zzcx;->zzk(IIZ)I

    move-result v6

    const/4 v9, -0x1

    if-eq v6, v9, :cond_2a

    const/16 v16, 0x1

    .line 111
    :goto_13
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v6

    .line 112
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v15

    if-eqz v15, :cond_2d

    :cond_2c
    const/4 v6, 0x0

    goto :goto_14

    .line 113
    :cond_2d
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzd()I

    move-result v15

    .line 114
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzh()I

    .line 113
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzw()Z

    .line 115
    invoke-virtual {v6, v15, v10, v10}, Lcom/google/android/gms/internal/ads/zzcx;->zzj(IIZ)I

    move-result v6

    if-eq v6, v9, :cond_2c

    const/4 v6, 0x1

    .line 116
    :goto_14
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v9

    .line 117
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v15

    if-nez v15, :cond_2e

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzd()I

    move-result v15

    iget-object v10, v14, Lcom/google/android/gms/internal/ads/zzm;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    move-object/from16 v17, v5

    const-wide/16 v4, 0x0

    .line 118
    invoke-virtual {v9, v15, v10, v4, v5}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v9

    .line 117
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzcw;->zzb()Z

    move-result v9

    if-eqz v9, :cond_2f

    const/4 v9, 0x1

    goto :goto_15

    :cond_2e
    move-object/from16 v17, v5

    const-wide/16 v4, 0x0

    :cond_2f
    const/4 v9, 0x0

    .line 119
    :goto_15
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v10

    .line 120
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v15

    if-nez v15, :cond_30

    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzm;->zzd()I

    move-result v15

    iget-object v14, v14, Lcom/google/android/gms/internal/ads/zzm;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 121
    invoke-virtual {v10, v15, v14, v4, v5}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v4

    .line 120
    iget-boolean v4, v4, Lcom/google/android/gms/internal/ads/zzcw;->zzi:Z

    if-eqz v4, :cond_30

    const/4 v4, 0x1

    goto :goto_16

    :cond_30
    const/4 v4, 0x0

    .line 122
    :goto_16
    invoke-interface {v11}, Lcom/google/android/gms/internal/ads/zzcq;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v5

    new-instance v10, Lcom/google/android/gms/internal/ads/zzck;

    .line 123
    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/zzck;-><init>()V

    .line 124
    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/ads/zzck;->zzb(Lcom/google/android/gms/internal/ads/zzcm;)Lcom/google/android/gms/internal/ads/zzck;

    xor-int/lit8 v11, v13, 0x1

    .line 125
    invoke-virtual {v10, v2, v11}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    if-eqz v8, :cond_31

    if-nez v13, :cond_31

    const/4 v2, 0x1

    goto :goto_17

    :cond_31
    const/4 v2, 0x0

    :goto_17
    const/4 v12, 0x5

    .line 126
    invoke-virtual {v10, v12, v2}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    if-eqz v16, :cond_32

    if-nez v13, :cond_32

    const/4 v2, 0x1

    goto :goto_18

    :cond_32
    const/4 v2, 0x0

    :goto_18
    const/4 v12, 0x6

    .line 127
    invoke-virtual {v10, v12, v2}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    if-nez v5, :cond_34

    if-nez v16, :cond_33

    if-eqz v9, :cond_33

    if-eqz v8, :cond_34

    :cond_33
    if-nez v13, :cond_34

    const/4 v2, 0x1

    goto :goto_19

    :cond_34
    const/4 v2, 0x0

    :goto_19
    const/4 v12, 0x7

    .line 128
    invoke-virtual {v10, v12, v2}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    if-eqz v6, :cond_35

    if-nez v13, :cond_35

    const/4 v2, 0x1

    goto :goto_1a

    :cond_35
    const/4 v2, 0x0

    :goto_1a
    const/16 v12, 0x8

    .line 129
    invoke-virtual {v10, v12, v2}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    if-nez v5, :cond_37

    if-nez v6, :cond_36

    if-eqz v9, :cond_37

    if-eqz v4, :cond_37

    :cond_36
    if-nez v13, :cond_37

    const/4 v2, 0x1

    goto :goto_1b

    :cond_37
    const/4 v2, 0x0

    :goto_1b
    const/16 v4, 0x9

    .line 130
    invoke-virtual {v10, v4, v2}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    .line 131
    invoke-virtual {v10, v7, v11}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    if-eqz v8, :cond_38

    if-nez v13, :cond_38

    const/4 v2, 0x1

    goto :goto_1c

    :cond_38
    const/4 v2, 0x0

    :goto_1c
    const/16 v4, 0xb

    .line 132
    invoke-virtual {v10, v4, v2}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    if-eqz v8, :cond_39

    if-nez v13, :cond_39

    const/16 v2, 0xc

    const/4 v5, 0x1

    goto :goto_1d

    :cond_39
    const/16 v2, 0xc

    const/4 v5, 0x0

    .line 133
    :goto_1d
    invoke-virtual {v10, v2, v5}, Lcom/google/android/gms/internal/ads/zzck;->zzd(IZ)Lcom/google/android/gms/internal/ads/zzck;

    .line 134
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzck;->zze()Lcom/google/android/gms/internal/ads/zzcm;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzI:Lcom/google/android/gms/internal/ads/zzcm;

    move-object/from16 v4, v17

    .line 135
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzcm;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3a

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    const/16 v4, 0xd

    new-instance v5, Lcom/google/android/gms/internal/ads/zzje;

    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/ads/zzje;-><init>(Lcom/google/android/gms/internal/ads/zzjt;)V

    .line 136
    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    :cond_3a
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    .line 137
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeo;->zzc()V

    .line 138
    iget-boolean v2, v3, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    if-eq v2, v3, :cond_3b

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzjt;->zzm:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 139
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzib;

    .line 140
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzib;->zza(Z)V

    goto :goto_1e

    :cond_3b
    return-void
.end method

.method private final zzar()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzf()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 3
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzv()Z

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzv()Z

    return-void
.end method

.method private final zzas()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zze:Lcom/google/android/gms/internal/ads/zzeb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeb;->zzb()V

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzs:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzs:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 4
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 5
    invoke-static {v1, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzZ:Z

    if-nez v1, :cond_1

    .line 6
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzaa:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    const-string v3, "ExoPlayerImpl"

    invoke-static {v3, v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzaa:Z

    return-void

    .line 5
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 6
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-void
.end method


# virtual methods
.method public final zzA(Lcom/google/android/gms/internal/ads/zzlv;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzr:Lcom/google/android/gms/internal/ads/zzls;

    .line 2
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzls;->zzR(Lcom/google/android/gms/internal/ads/zzlv;)V

    return-void
.end method

.method public final zzB(Lcom/google/android/gms/internal/ads/zztn;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzab()I

    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzk()J

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    .line 7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v4, v1, -0x1

    :goto_0
    if-ltz v4, :cond_0

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    .line 9
    invoke-interface {v5, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzai:Lcom/google/android/gms/internal/ads/zzvf;

    .line 10
    invoke-virtual {v4, v3, v1}, Lcom/google/android/gms/internal/ads/zzvf;->zzh(II)Lcom/google/android/gms/internal/ads/zzvf;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzai:Lcom/google/android/gms/internal/ads/zzvf;

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    .line 11
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 12
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    new-instance v4, Lcom/google/android/gms/internal/ads/zzkv;

    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zztn;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzp:Z

    invoke-direct {v4, v6, v7}, Lcom/google/android/gms/internal/ads/zzkv;-><init>(Lcom/google/android/gms/internal/ads/zztn;Z)V

    .line 14
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzjs;

    iget-object v8, v4, Lcom/google/android/gms/internal/ads/zzkv;->zzb:Ljava/lang/Object;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzkv;->zza:Lcom/google/android/gms/internal/ads/zztg;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zztg;->zzB()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v4

    invoke-direct {v7, v8, v4}, Lcom/google/android/gms/internal/ads/zzjs;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcx;)V

    .line 15
    invoke-interface {v6, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzai:Lcom/google/android/gms/internal/ads/zzvf;

    .line 16
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    .line 17
    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzvf;->zzg(II)Lcom/google/android/gms/internal/ads/zzvf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzai:Lcom/google/android/gms/internal/ads/zzvf;

    .line 18
    new-instance v0, Lcom/google/android/gms/internal/ads/zzlc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzai:Lcom/google/android/gms/internal/ads/zzvf;

    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzlc;-><init>(Ljava/util/Collection;Lcom/google/android/gms/internal/ads/zzvf;)V

    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v1

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzc()I

    move-result v1

    if-ltz v1, :cond_3

    goto :goto_2

    .line 31
    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaq;

    .line 32
    invoke-direct {v1, v0, v4, v6, v7}, Lcom/google/android/gms/internal/ads/zzaq;-><init>(Lcom/google/android/gms/internal/ads/zzcx;IJ)V

    throw v1

    .line 20
    :cond_4
    :goto_2
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzcx;->zzg(Z)I

    move-result v1

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 21
    invoke-direct {p0, v0, v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzjt;->zzag(Lcom/google/android/gms/internal/ads/zzcx;IJ)Landroid/util/Pair;

    move-result-object v9

    .line 22
    invoke-direct {p0, v8, v0, v9}, Lcom/google/android/gms/internal/ads/zzjt;->zzai(Lcom/google/android/gms/internal/ads/zzky;Lcom/google/android/gms/internal/ads/zzcx;Landroid/util/Pair;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v8

    iget v9, v8, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    const/4 v10, 0x4

    if-eq v1, v4, :cond_7

    if-eq v9, v2, :cond_7

    .line 23
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzc()I

    move-result v0

    if-lt v1, v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v9, 0x2

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v9, 0x4

    .line 24
    :cond_7
    :goto_4
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/ads/zzky;->zzg(I)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v10

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    .line 25
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v7

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzai:Lcom/google/android/gms/internal/ads/zzvf;

    move v6, v1

    .line 26
    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/zzkd;->zzq(Ljava/util/List;IJLcom/google/android/gms/internal/ads/zzvf;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 27
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v1, v10, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_5
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x4

    .line 30
    invoke-direct {p0, v10}, Lcom/google/android/gms/internal/ads/zzjt;->zzad(Lcom/google/android/gms/internal/ads/zzky;)J

    move-result-wide v7

    const/4 v9, -0x1

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, v10

    move v10, v11

    .line 31
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzjt;->zzaq(Lcom/google/android/gms/internal/ads/zzky;IIZZIJIZ)V

    return-void
.end method

.method public final zzG()Lcom/google/android/gms/internal/ads/zzia;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    return-object v0
.end method

.method final synthetic zzX(Lcom/google/android/gms/internal/ads/zzkb;)V
    .locals 11

    .line 1
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zzb:I

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    .line 2
    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zzc:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 3
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zzd:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzE:I

    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzF:Z

    .line 4
    :cond_0
    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zze:Z

    if-eqz v2, :cond_1

    .line 5
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zzf:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzG:I

    :cond_1
    if-nez v1, :cond_b

    .line 6
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 7
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzaf:I

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzag:J

    .line 8
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_4

    .line 9
    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzlc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzlc;->zzw()Ljava/util/List;

    move-result-object v2

    .line 10
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v5, v6, :cond_3

    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_0
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    const/4 v5, 0x0

    .line 11
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzo:Ljava/util/List;

    .line 12
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zzjs;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/ads/zzcx;

    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/zzjs;->zzc(Lcom/google/android/gms/internal/ads/zzjs;Lcom/google/android/gms/internal/ads/zzcx;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzF:Z

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_a

    .line 13
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    .line 14
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzbx;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iget-wide v7, v2, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-wide v9, v2, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    cmp-long v2, v7, v9

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :cond_6
    :goto_2
    if-eqz v3, :cond_9

    .line 15
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    .line 17
    :cond_7
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v6, v2, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    invoke-direct {p0, v1, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzjt;->zzaf(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;J)J

    goto :goto_4

    .line 16
    :cond_8
    :goto_3
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    :goto_4
    move v5, v3

    move-wide v7, v6

    goto :goto_5

    :cond_9
    move-wide v7, v5

    move v5, v3

    goto :goto_5

    :cond_a
    move-wide v7, v5

    const/4 v5, 0x0

    :goto_5
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzF:Z

    .line 18
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzkb;->zza:Lcom/google/android/gms/internal/ads/zzky;

    const/4 v2, 0x1

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzG:I

    const/4 v4, 0x0

    iget v6, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzE:I

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzjt;->zzaq(Lcom/google/android/gms/internal/ads/zzky;IIZZIJIZ)V

    :cond_b
    return-void
.end method

.method final synthetic zzY(Lcom/google/android/gms/internal/ads/zzkb;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzj:Lcom/google/android/gms/internal/ads/zzei;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzjh;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzjh;-><init>(Lcom/google/android/gms/internal/ads/zzjt;Lcom/google/android/gms/internal/ads/zzkb;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzei;->zzh(Ljava/lang/Runnable;)Z

    return-void
.end method

.method final synthetic zzZ(Lcom/google/android/gms/internal/ads/zzcn;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzI:Lcom/google/android/gms/internal/ads/zzcm;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzcn;->zza(Lcom/google/android/gms/internal/ads/zzcm;)V

    return-void
.end method

.method public final zza(IJIZ)V
    .locals 15

    move-object v11, p0

    move/from16 v0, p1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    const/4 v1, 0x1

    if-ltz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 2
    :goto_0
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzr:Lcom/google/android/gms/internal/ads/zzls;

    .line 3
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzls;->zzx()V

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 4
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    .line 5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzc()I

    move-result v3

    if-ge v0, v3, :cond_1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_1
    iget v3, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    add-int/2addr v3, v1

    iput v3, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzx()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v0, "ExoPlayerImpl"

    const-string v2, "seekTo ignored because an ad is playing"

    .line 7
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzkb;

    iget-object v2, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzkb;-><init>(Lcom/google/android/gms/internal/ads/zzky;)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzkb;->zza(I)V

    iget-object v1, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzah:Lcom/google/android/gms/internal/ads/zzjg;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzjg;->zza:Lcom/google/android/gms/internal/ads/zzjt;

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzY(Lcom/google/android/gms/internal/ads/zzkb;)V

    return-void

    .line 10
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzf()I

    move-result v3

    if-ne v3, v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v1, 0x2

    .line 11
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzd()I

    move-result v9

    iget-object v3, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 12
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzky;->zzg(I)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v1

    move-wide/from16 v3, p2

    .line 13
    invoke-direct {p0, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzjt;->zzag(Lcom/google/android/gms/internal/ads/zzcx;IJ)Landroid/util/Pair;

    move-result-object v5

    .line 14
    invoke-direct {p0, v1, v2, v5}, Lcom/google/android/gms/internal/ads/zzjt;->zzai(Lcom/google/android/gms/internal/ads/zzky;Lcom/google/android/gms/internal/ads/zzcx;Landroid/util/Pair;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v10, 0x1

    iget-object v12, v11, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    .line 15
    invoke-static/range {p2 .. p3}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v3

    invoke-virtual {v12, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzkd;->zzl(Lcom/google/android/gms/internal/ads/zzcx;IJ)V

    .line 16
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzjt;->zzad(Lcom/google/android/gms/internal/ads/zzky;)J

    move-result-wide v12

    const/4 v14, 0x0

    move-object v0, p0

    move v2, v5

    move v3, v6

    move v4, v7

    move v5, v8

    move v6, v10

    move-wide v7, v12

    move v10, v14

    .line 17
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzjt;->zzaq(Lcom/google/android/gms/internal/ads/zzky;IIZZIJIZ)V

    return-void
.end method

.method public final zzb()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzx()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zztl;->zzb:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final zzc()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzx()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zztl;->zzc:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final zzd()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzab()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final zze()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zza(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zzf()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    return v0
.end method

.method public final zzg()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    return v0
.end method

.method public final zzh()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    const/4 v0, 0x0

    return v0
.end method

.method public final zzi()J
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzx()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 17
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbx;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 18
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzl()J

    move-result-wide v0

    :goto_0
    return-wide v0

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 4
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzag:J

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 5
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zztl;->zzd:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v3, v3, Lcom/google/android/gms/internal/ads/zztl;->zzd:J

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v3

    if-eqz v7, :cond_3

    .line 6
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzd()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 7
    invoke-virtual {v0, v1, v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzcw;->zzn:J

    .line 8
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    goto :goto_2

    .line 9
    :cond_3
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 10
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 11
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 12
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 13
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zztl;->zzb:I

    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcu;->zzi(I)J

    goto :goto_1

    :cond_4
    move-wide v5, v0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 15
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    .line 16
    invoke-direct {p0, v1, v0, v5, v6}, Lcom/google/android/gms/internal/ads/zzjt;->zzaf(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;J)J

    .line 15
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    :goto_2
    return-wide v0
.end method

.method public final zzj()J
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzx()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 4
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v3

    if-nez v7, :cond_0

    .line 7
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzd()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    .line 9
    invoke-virtual {v0, v1, v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzcw;->zzm:J

    .line 10
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    goto :goto_0

    .line 5
    :cond_0
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 6
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    :goto_0
    return-wide v0

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzk()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzk()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzad(Lcom/google/android/gms/internal/ads/zzky;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzl()J
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzx()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzm;->zzn()Lcom/google/android/gms/internal/ads/zzcx;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzm;->zzd()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzm;->zza:Lcom/google/android/gms/internal/ads/zzcw;

    const-wide/16 v3, 0x0

    .line 6
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzcw;->zzn:J

    .line 7
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 8
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    .line 9
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzn:Lcom/google/android/gms/internal/ads/zzcu;

    .line 10
    iget v2, v1, Lcom/google/android/gms/internal/ads/zztl;->zzb:I

    iget v1, v1, Lcom/google/android/gms/internal/ads/zztl;->zzc:I

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzcu;->zzh(II)J

    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzm()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzn()Lcom/google/android/gms/internal/ads/zzcx;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    return-object v0
.end method

.method public final zzo()Lcom/google/android/gms/internal/ads/zzdi;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzxe;->zzd:Lcom/google/android/gms/internal/ads/zzdi;

    return-object v0
.end method

.method public final zzp()V
    .locals 15

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzv()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzy:Lcom/google/android/gms/internal/ads/zzhq;

    const/4 v2, 0x2

    .line 3
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzhq;->zzb(ZI)I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzjt;->zzac(ZI)I

    move-result v3

    .line 4
    invoke-direct {p0, v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzjt;->zzap(ZII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 5
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzky;->zzf(Lcom/google/android/gms/internal/ads/zzia;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v1

    if-eq v3, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    .line 8
    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzky;->zzg(I)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v5

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzD:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzkd;->zzk()V

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, -0x1

    const/4 v14, 0x0

    move-object v4, p0

    .line 10
    invoke-direct/range {v4 .. v14}, Lcom/google/android/gms/internal/ads/zzjt;->zzaq(Lcom/google/android/gms/internal/ads/zzky;IIZZIJIZ)V

    return-void
.end method

.method public final zzq()V
    .locals 5

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfn;->zze:Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbr;->zza()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Release "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " [AndroidXMedia3/1.0.1] ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExoPlayerImpl"

    .line 3
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzN:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzz:Lcom/google/android/gms/internal/ads/zzlp;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzlp;->zze()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzy:Lcom/google/android/gms/internal/ads/zzhq;

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhq;->zzd()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzk:Lcom/google/android/gms/internal/ads/zzkd;

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzkd;->zzp()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    const/16 v2, 0xa

    sget-object v3, Lcom/google/android/gms/internal/ads/zzim;->zza:Lcom/google/android/gms/internal/ads/zzim;

    .line 9
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeo;->zzc()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeo;->zze()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzj:Lcom/google/android/gms/internal/ads/zzei;

    .line 12
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzei;->zze(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzt:Lcom/google/android/gms/internal/ads/zzxl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzr:Lcom/google/android/gms/internal/ads/zzls;

    .line 13
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzxl;->zzf(Lcom/google/android/gms/internal/ads/zzxk;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 14
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    if-eqz v2, :cond_2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzky;->zzb()Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    const/4 v2, 0x1

    .line 16
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzky;->zzg(I)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 17
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzky;->zzc(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzky;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 18
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    const-wide/16 v2, 0x0

    .line 19
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzr:Lcom/google/android/gms/internal/ads/zzls;

    .line 20
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzls;->zzQ()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzi:Lcom/google/android/gms/internal/ads/zzxd;

    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzxd;->zzh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzP:Landroid/view/Surface;

    if-eqz v0, :cond_3

    .line 22
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzP:Landroid/view/Surface;

    .line 23
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdx;->zza:Lcom/google/android/gms/internal/ads/zzdx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzY:Lcom/google/android/gms/internal/ads/zzdx;

    return-void
.end method

.method public final zzr(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzy:Lcom/google/android/gms/internal/ads/zzhq;

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzf()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzhq;->zzb(ZI)I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzac(ZI)I

    move-result v1

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzjt;->zzap(ZII)V

    return-void
.end method

.method public final zzs(Landroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzjt;->zzan(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 3
    :goto_0
    invoke-direct {p0, p1, p1}, Lcom/google/android/gms/internal/ads/zzjt;->zzak(II)V

    return-void
.end method

.method public final zzt(F)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzW:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzW:F

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzam()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzl:Lcom/google/android/gms/internal/ads/zzeo;

    const/16 v1, 0x16

    new-instance v2, Lcom/google/android/gms/internal/ads/zzjd;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ads/zzjd;-><init>(F)V

    .line 4
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzeo;->zzd(ILcom/google/android/gms/internal/ads/zzel;)V

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeo;->zzc()V

    return-void
.end method

.method public final zzu()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzy:Lcom/google/android/gms/internal/ads/zzhq;

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzv()Z

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhq;->zzb(ZI)I

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzjt;->zzao(Lcom/google/android/gms/internal/ads/zzia;)V

    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdx;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzdx;-><init>(Ljava/util/List;J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzY:Lcom/google/android/gms/internal/ads/zzdx;

    return-void
.end method

.method public final zzv()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    return v0
.end method

.method public final zzw()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    const/4 v0, 0x0

    return v0
.end method

.method public final zzx()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzae:Lcom/google/android/gms/internal/ads/zzky;

    .line 2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbx;->zzb()Z

    move-result v0

    return v0
.end method

.method public final zzy()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjt;->zzas()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzh:[Lcom/google/android/gms/internal/ads/zzle;

    .line 2
    array-length v0, v0

    const/4 v0, 0x2

    return v0
.end method

.method public final zzz(Lcom/google/android/gms/internal/ads/zzlv;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjt;->zzr:Lcom/google/android/gms/internal/ads/zzls;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzls;->zzw(Lcom/google/android/gms/internal/ads/zzlv;)V

    return-void
.end method
