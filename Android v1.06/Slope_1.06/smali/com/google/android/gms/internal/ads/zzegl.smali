.class public final Lcom/google/android/gms/internal/ads/zzegl;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzebv;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdnk;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdmt;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zze:Ljava/util/concurrent/Executor;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbik;

.field private final zzh:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfaa;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzdmt;Lcom/google/android/gms/internal/ads/zzdnk;Lcom/google/android/gms/internal/ads/zzbik;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzegl;->zza:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzc:Lcom/google/android/gms/internal/ads/zzdmt;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzegl;->zze:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzb:Lcom/google/android/gms/internal/ads/zzdnk;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzg:Lcom/google/android/gms/internal/ads/zzbik;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zziq:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzegl;->zzh:Z

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdno;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzdno;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzege;

    invoke-direct {v2, p0, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzege;-><init>(Lcom/google/android/gms/internal/ads/zzegl;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzdno;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzegl;->zze:Ljava/util/concurrent/Executor;

    .line 2
    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzegf;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzegf;-><init>(Lcom/google/android/gms/internal/ads/zzdno;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegl;->zze:Ljava/util/concurrent/Executor;

    .line 3
    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;)Z
    .locals 0

    .line 1
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezk;->zza:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final synthetic zzc(Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzdno;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object/from16 v1, p2

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzb:Lcom/google/android/gms/internal/ads/zzdnk;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzfaa;->zze:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzezq;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    .line 2
    invoke-virtual {v2, v3, v11, v4}, Lcom/google/android/gms/internal/ads/zzdnk;->zza(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;)Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v12

    .line 3
    iget-boolean v2, v11, Lcom/google/android/gms/internal/ads/zzezf;->zzX:Z

    invoke-interface {v12, v2}, Lcom/google/android/gms/internal/ads/zzcfb;->zzZ(Z)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzegl;->zza:Landroid/content/Context;

    .line 2
    move-object v3, v12

    check-cast v3, Landroid/view/View;

    move-object/from16 v4, p3

    .line 4
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzdno;->zza(Landroid/content/Context;Landroid/view/View;)V

    new-instance v13, Lcom/google/android/gms/internal/ads/zzcal;

    .line 5
    invoke-direct {v13}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzc:Lcom/google/android/gms/internal/ads/zzdmt;

    new-instance v15, Lcom/google/android/gms/internal/ads/zzcru;

    const/4 v10, 0x0

    invoke-direct {v15, v1, v11, v10}, Lcom/google/android/gms/internal/ads/zzcru;-><init>(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Ljava/lang/String;)V

    new-instance v9, Lcom/google/android/gms/internal/ads/zzdmq;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzegk;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzegl;->zza:Landroid/content/Context;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzb:Lcom/google/android/gms/internal/ads/zzdnk;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzg:Lcom/google/android/gms/internal/ads/zzbik;

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzegl;->zzh:Z

    move-object v1, v8

    move/from16 v16, v6

    move-object/from16 v6, p1

    move-object/from16 v17, v7

    move-object v7, v13

    move-object v11, v8

    move-object v8, v12

    move-object v0, v9

    move-object/from16 v9, v17

    move-object/from16 v17, v10

    move/from16 v10, v16

    .line 6
    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/zzegk;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdnk;Lcom/google/android/gms/internal/ads/zzfaa;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzbik;Z)V

    invoke-direct {v0, v11, v12}, Lcom/google/android/gms/internal/ads/zzdmq;-><init>(Lcom/google/android/gms/internal/ads/zzdey;Lcom/google/android/gms/internal/ads/zzcfb;)V

    .line 7
    invoke-virtual {v14, v15, v0}, Lcom/google/android/gms/internal/ads/zzdmt;->zze(Lcom/google/android/gms/internal/ads/zzcru;Lcom/google/android/gms/internal/ads/zzdmq;)Lcom/google/android/gms/internal/ads/zzdmp;

    move-result-object v0

    .line 8
    invoke-virtual {v13, v0}, Lcom/google/android/gms/internal/ads/zzcal;->zzd(Ljava/lang/Object;)Z

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdmp;->zzg()Lcom/google/android/gms/internal/ads/zzddf;

    move-result-object v1

    invoke-static {v12, v1}, Lcom/google/android/gms/internal/ads/zzbiy;->zzb(Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzbix;)V

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdmp;->zzc()Lcom/google/android/gms/internal/ads/zzcwa;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzegg;

    invoke-direct {v2, v12}, Lcom/google/android/gms/internal/ads/zzegg;-><init>(Lcom/google/android/gms/internal/ads/zzcfb;)V

    .line 11
    sget-object v3, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 12
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzdas;->zzm(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdmp;->zzl()Lcom/google/android/gms/internal/ads/zzdnj;

    move-result-object v1

    move-object/from16 v2, p0

    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/zzegl;->zzh:Z

    if-eqz v3, :cond_0

    iget-object v10, v2, Lcom/google/android/gms/internal/ads/zzegl;->zzg:Lcom/google/android/gms/internal/ads/zzbik;

    goto :goto_0

    :cond_0
    move-object/from16 v10, v17

    :goto_0
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v1, v12, v3, v10}, Lcom/google/android/gms/internal/ads/zzdnj;->zzi(Lcom/google/android/gms/internal/ads/zzcfb;ZLcom/google/android/gms/internal/ads/zzbik;)V

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdmp;->zzl()Lcom/google/android/gms/internal/ads/zzdnj;

    move-object/from16 v1, p1

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzezk;->zzb:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzezk;->zza:Ljava/lang/String;

    .line 16
    invoke-static {v12, v4, v3}, Lcom/google/android/gms/internal/ads/zzdnj;->zzj(Lcom/google/android/gms/internal/ads/zzcfb;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzegh;

    invoke-direct {v4, v2, v12, v1, v0}, Lcom/google/android/gms/internal/ads/zzegh;-><init>(Lcom/google/android/gms/internal/ads/zzegl;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzdmp;)V

    iget-object v0, v2, Lcom/google/android/gms/internal/ads/zzegl;->zze:Ljava/util/concurrent/Executor;

    .line 17
    invoke-static {v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0
.end method
