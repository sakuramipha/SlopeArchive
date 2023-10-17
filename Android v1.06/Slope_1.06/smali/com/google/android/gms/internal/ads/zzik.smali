.class public final Lcom/google/android/gms/internal/ads/zzik;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final zza:Landroid/content/Context;

.field zzb:Lcom/google/android/gms/internal/ads/zzdz;

.field zzc:Lcom/google/android/gms/internal/ads/zzfpp;

.field zzd:Lcom/google/android/gms/internal/ads/zzfpp;

.field zze:Lcom/google/android/gms/internal/ads/zzfpp;

.field zzf:Lcom/google/android/gms/internal/ads/zzfpp;

.field zzg:Lcom/google/android/gms/internal/ads/zzfpp;

.field zzh:Lcom/google/android/gms/internal/ads/zzfon;

.field zzi:Landroid/os/Looper;

.field zzj:Lcom/google/android/gms/internal/ads/zzk;

.field zzk:I

.field zzl:Z

.field zzm:Lcom/google/android/gms/internal/ads/zzlh;

.field zzn:J

.field zzo:J

.field zzp:Z

.field zzq:Z

.field zzr:Lcom/google/android/gms/internal/ads/zzhv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcek;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 4
    new-instance v2, Lcom/google/android/gms/internal/ads/zzie;

    move-object/from16 v3, p2

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzie;-><init>(Lcom/google/android/gms/internal/ads/zzcek;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzif;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/zzif;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/zzig;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Landroid/content/Context;)V

    sget-object v5, Lcom/google/android/gms/internal/ads/zzih;->zza:Lcom/google/android/gms/internal/ads/zzih;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzii;

    invoke-direct {v6, v1}, Lcom/google/android/gms/internal/ads/zzii;-><init>(Landroid/content/Context;)V

    sget-object v7, Lcom/google/android/gms/internal/ads/zzij;->zza:Lcom/google/android/gms/internal/ads/zzij;

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p1 .. p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzik;->zza:Landroid/content/Context;

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzik;->zzc:Lcom/google/android/gms/internal/ads/zzfpp;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzik;->zzd:Lcom/google/android/gms/internal/ads/zzfpp;

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzik;->zze:Lcom/google/android/gms/internal/ads/zzfpp;

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzik;->zzf:Lcom/google/android/gms/internal/ads/zzfpp;

    iput-object v6, v0, Lcom/google/android/gms/internal/ads/zzik;->zzg:Lcom/google/android/gms/internal/ads/zzfpp;

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzik;->zzh:Lcom/google/android/gms/internal/ads/zzfon;

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfn;->zzt()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzik;->zzi:Landroid/os/Looper;

    .line 2
    sget-object v1, Lcom/google/android/gms/internal/ads/zzk;->zza:Lcom/google/android/gms/internal/ads/zzk;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzik;->zzj:Lcom/google/android/gms/internal/ads/zzk;

    const/4 v1, 0x1

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzik;->zzk:I

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzik;->zzl:Z

    .line 3
    sget-object v2, Lcom/google/android/gms/internal/ads/zzlh;->zze:Lcom/google/android/gms/internal/ads/zzlh;

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzik;->zzm:Lcom/google/android/gms/internal/ads/zzlh;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzhv;

    const v4, 0x3f7851ec    # 0.97f

    const v5, 0x3f83d70a    # 1.03f

    const-wide/16 v6, 0x3e8

    const v8, 0x33d6bf95    # 1.0E-7f

    const-wide/16 v9, 0x14

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v9

    const-wide/16 v14, 0x1f4

    invoke-static {v14, v15}, Lcom/google/android/gms/internal/ads/zzfn;->zzo(J)J

    move-result-wide v11

    const v13, 0x3f7fbe77    # 0.999f

    const/16 v16, 0x0

    move-object v3, v2

    move-object/from16 v14, v16

    invoke-direct/range {v3 .. v14}, Lcom/google/android/gms/internal/ads/zzhv;-><init>(FFJFJJFLcom/google/android/gms/internal/ads/zzhu;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzik;->zzr:Lcom/google/android/gms/internal/ads/zzhv;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzdz;->zza:Lcom/google/android/gms/internal/ads/zzdz;

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzik;->zzb:Lcom/google/android/gms/internal/ads/zzdz;

    const-wide/16 v2, 0x1f4

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzik;->zzn:J

    const-wide/16 v2, 0x7d0

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzik;->zzo:J

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzik;->zzp:Z

    return-void
.end method

.method static synthetic zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zztk;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsy;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaaj;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzaaj;-><init>()V

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzsy;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaav;)V

    return-object v0
.end method
