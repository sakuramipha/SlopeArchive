.class final Lcom/google/android/gms/internal/ads/zzky;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field private static final zzt:Lcom/google/android/gms/internal/ads/zztl;


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzcx;

.field public final zzb:Lcom/google/android/gms/internal/ads/zztl;

.field public final zzc:J

.field public final zzd:J

.field public final zze:I

.field public final zzf:Lcom/google/android/gms/internal/ads/zzia;

.field public final zzg:Z

.field public final zzh:Lcom/google/android/gms/internal/ads/zzvk;

.field public final zzi:Lcom/google/android/gms/internal/ads/zzxe;

.field public final zzj:Ljava/util/List;

.field public final zzk:Lcom/google/android/gms/internal/ads/zztl;

.field public final zzl:Z

.field public final zzm:I

.field public final zzn:Lcom/google/android/gms/internal/ads/zzci;

.field public final zzo:Z

.field public volatile zzp:J

.field public volatile zzq:J

.field public volatile zzr:J

.field public volatile zzs:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zztl;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zztl;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzky;->zzt:Lcom/google/android/gms/internal/ads/zztl;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    move-wide v1, p3

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    move-wide v1, p5

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    move v1, p7

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    move v1, p9

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    move/from16 v1, p14

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    move/from16 v1, p15

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    move-wide/from16 v1, p23

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    move/from16 v1, p25

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    return-void
.end method

.method public static zzi(Lcom/google/android/gms/internal/ads/zzxe;)Lcom/google/android/gms/internal/ads/zzky;
    .locals 27

    move-object/from16 v11, p0

    .line 1
    new-instance v26, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v0, v26

    sget-object v1, Lcom/google/android/gms/internal/ads/zzcx;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    sget-object v13, Lcom/google/android/gms/internal/ads/zzky;->zzt:Lcom/google/android/gms/internal/ads/zztl;

    move-object v2, v13

    sget-object v10, Lcom/google/android/gms/internal/ads/zzvk;->zza:Lcom/google/android/gms/internal/ads/zzvk;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v12

    sget-object v16, Lcom/google/android/gms/internal/ads/zzci;->zza:Lcom/google/android/gms/internal/ads/zzci;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v25}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v26
.end method

.method public static zzj()Lcom/google/android/gms/internal/ads/zztl;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzky;->zzt:Lcom/google/android/gms/internal/ads/zztl;

    return-object v0
.end method


# virtual methods
.method public final zza()J
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzky;->zzk()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v0

    .line 2
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfn;->zzq(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzci;->zzc:F

    long-to-float v3, v4

    mul-float v3, v3, v2

    float-to-long v2, v3

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    return-wide v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzky;
    .locals 30

    move-object/from16 v0, p0

    .line 1
    new-instance v27, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v1, v27

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    move-object/from16 v28, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    move/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-object/from16 v17, v1

    move-object/from16 v29, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    move-wide/from16 v20, v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzky;->zza()J

    move-result-wide v22

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v24

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    move/from16 v26, v1

    move-object/from16 v1, v28

    move-object/from16 v2, v29

    invoke-direct/range {v1 .. v26}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v27
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzky;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    .line 1
    new-instance v27, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v1, v27

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    move-object/from16 p1, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    move/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-object/from16 v17, v1

    move-object/from16 v28, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    move-wide/from16 v22, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    move-wide/from16 v24, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    move/from16 v26, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v28

    invoke-direct/range {v1 .. v26}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v27
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zztl;JJJJLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzky;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v22, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v20, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    .line 1
    new-instance v27, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v1, v27

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    move-object/from16 p1, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    move/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v18, v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v24

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    move/from16 v26, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v26}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v27
.end method

.method public final zze(ZI)Lcom/google/android/gms/internal/ads/zzky;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v15, p1

    move/from16 v16, p2

    .line 1
    new-instance v27, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v1, v27

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    move-object/from16 p1, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    move-wide/from16 v22, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    move-wide/from16 v24, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    move/from16 v26, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v26}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v27
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzia;)Lcom/google/android/gms/internal/ads/zzky;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    .line 1
    new-instance v27, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v1, v27

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    move-object/from16 p1, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    move/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-object/from16 v17, v1

    move-object/from16 v28, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    move-wide/from16 v22, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    move-wide/from16 v24, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    move/from16 v26, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v28

    invoke-direct/range {v1 .. v26}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v27
.end method

.method public final zzg(I)Lcom/google/android/gms/internal/ads/zzky;
    .locals 29

    move-object/from16 v0, p0

    move/from16 v8, p1

    .line 1
    new-instance v27, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v1, v27

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzky;->zza:Lcom/google/android/gms/internal/ads/zzcx;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    move-object/from16 p1, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    move/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-object/from16 v17, v1

    move-object/from16 v28, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    move-wide/from16 v22, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    move-wide/from16 v24, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    move/from16 v26, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v28

    invoke-direct/range {v1 .. v26}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v27
.end method

.method public final zzh(Lcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzky;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 1
    new-instance v27, Lcom/google/android/gms/internal/ads/zzky;

    move-object/from16 v1, v27

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzky;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzky;->zzc:J

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzky;->zzd:J

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzky;->zzf:Lcom/google/android/gms/internal/ads/zzia;

    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzky;->zzg:Z

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzky;->zzh:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzky;->zzi:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzky;->zzj:Ljava/util/List;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzky;->zzk:Lcom/google/android/gms/internal/ads/zztl;

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    move-object/from16 p1, v1

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    move/from16 v16, v1

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzn:Lcom/google/android/gms/internal/ads/zzci;

    move-object/from16 v17, v1

    move-object/from16 v28, v2

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzp:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzq:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzr:J

    move-wide/from16 v22, v1

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzs:J

    move-wide/from16 v24, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzky;->zzo:Z

    move/from16 v26, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v28

    invoke-direct/range {v1 .. v26}, Lcom/google/android/gms/internal/ads/zzky;-><init>(Lcom/google/android/gms/internal/ads/zzcx;Lcom/google/android/gms/internal/ads/zztl;JJILcom/google/android/gms/internal/ads/zzia;ZLcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzxe;Ljava/util/List;Lcom/google/android/gms/internal/ads/zztl;ZILcom/google/android/gms/internal/ads/zzci;JJJJZ)V

    return-object v27
.end method

.method public final zzk()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzky;->zze:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzky;->zzm:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
