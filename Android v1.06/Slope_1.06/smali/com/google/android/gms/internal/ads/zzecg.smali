.class public final Lcom/google/android/gms/internal/ads/zzecg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzebv;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcor;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdnk;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zze:Ljava/util/concurrent/Executor;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbik;

.field private final zzh:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcor;Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzdnk;Lcom/google/android/gms/internal/ads/zzfaa;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzbik;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzecg;->zzb:Landroid/content/Context;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzecg;->zza:Lcom/google/android/gms/internal/ads/zzcor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzecg;->zze:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzecg;->zzc:Lcom/google/android/gms/internal/ads/zzdnk;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzecg;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzecg;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzecg;->zzg:Lcom/google/android/gms/internal/ads/zzbik;

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

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzecg;->zzh:Z

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

    new-instance v2, Lcom/google/android/gms/internal/ads/zzece;

    invoke-direct {v2, p0, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzece;-><init>(Lcom/google/android/gms/internal/ads/zzecg;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzdno;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzecg;->zze:Ljava/util/concurrent/Executor;

    .line 2
    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzecf;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzecf;-><init>(Lcom/google/android/gms/internal/ads/zzdno;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecg;->zze:Ljava/util/concurrent/Executor;

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
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v1, p2

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzc:Lcom/google/android/gms/internal/ads/zzdnk;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzfaa;->zze:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzezq;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    .line 2
    invoke-virtual {v2, v3, v9, v4}, Lcom/google/android/gms/internal/ads/zzdnk;->zza(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;)Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v10

    .line 3
    iget-boolean v2, v9, Lcom/google/android/gms/internal/ads/zzezf;->zzX:Z

    invoke-interface {v10, v2}, Lcom/google/android/gms/internal/ads/zzcfb;->zzZ(Z)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzb:Landroid/content/Context;

    .line 2
    move-object v3, v10

    check-cast v3, Landroid/view/View;

    move-object/from16 v4, p3

    .line 4
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzdno;->zza(Landroid/content/Context;Landroid/view/View;)V

    new-instance v11, Lcom/google/android/gms/internal/ads/zzcal;

    .line 5
    invoke-direct {v11}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzecg;->zza:Lcom/google/android/gms/internal/ads/zzcor;

    new-instance v13, Lcom/google/android/gms/internal/ads/zzcru;

    const/4 v14, 0x0

    invoke-direct {v13, v1, v9, v14}, Lcom/google/android/gms/internal/ads/zzcru;-><init>(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Ljava/lang/String;)V

    new-instance v15, Lcom/google/android/gms/internal/ads/zzddt;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzeci;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzh:Z

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzg:Lcom/google/android/gms/internal/ads/zzbik;

    move-object v1, v8

    move-object v3, v11

    move-object/from16 v4, p1

    move-object/from16 v16, v5

    move-object v5, v10

    move-object v14, v8

    move-object/from16 v8, v16

    .line 6
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzeci;-><init>(Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzfaa;ZLcom/google/android/gms/internal/ads/zzbik;)V

    invoke-direct {v15, v14, v10}, Lcom/google/android/gms/internal/ads/zzddt;-><init>(Lcom/google/android/gms/internal/ads/zzdey;Lcom/google/android/gms/internal/ads/zzcfb;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcop;

    iget v2, v9, Lcom/google/android/gms/internal/ads/zzezf;->zzab:I

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzcop;-><init>(I)V

    .line 7
    invoke-virtual {v12, v13, v15, v1}, Lcom/google/android/gms/internal/ads/zzcor;->zza(Lcom/google/android/gms/internal/ads/zzcru;Lcom/google/android/gms/internal/ads/zzddt;Lcom/google/android/gms/internal/ads/zzcop;)Lcom/google/android/gms/internal/ads/zzcoo;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcoo;->zzh()Lcom/google/android/gms/internal/ads/zzdnj;

    move-result-object v2

    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzh:Z

    if-eqz v3, :cond_0

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzecg;->zzg:Lcom/google/android/gms/internal/ads/zzbik;

    goto :goto_0

    :cond_0
    const/4 v14, 0x0

    :goto_0
    const/4 v3, 0x0

    .line 9
    invoke-virtual {v2, v10, v3, v14}, Lcom/google/android/gms/internal/ads/zzdnj;->zzi(Lcom/google/android/gms/internal/ads/zzcfb;ZLcom/google/android/gms/internal/ads/zzbik;)V

    .line 10
    invoke-virtual {v11, v1}, Lcom/google/android/gms/internal/ads/zzcal;->zzd(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcoo;->zzc()Lcom/google/android/gms/internal/ads/zzcwa;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzecc;

    invoke-direct {v3, v10}, Lcom/google/android/gms/internal/ads/zzecc;-><init>(Lcom/google/android/gms/internal/ads/zzcfb;)V

    .line 12
    sget-object v4, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 13
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzdas;->zzm(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcoo;->zzh()Lcom/google/android/gms/internal/ads/zzdnj;

    iget-object v2, v9, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzezk;->zzb:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzezk;->zza:Ljava/lang/String;

    .line 15
    invoke-static {v10, v3, v2}, Lcom/google/android/gms/internal/ads/zzdnj;->zzj(Lcom/google/android/gms/internal/ads/zzcfb;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzecd;

    invoke-direct {v3, v0, v10, v9, v1}, Lcom/google/android/gms/internal/ads/zzecd;-><init>(Lcom/google/android/gms/internal/ads/zzecg;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzcoo;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzecg;->zze:Ljava/util/concurrent/Executor;

    .line 16
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v1

    return-object v1
.end method
