.class final Lcom/google/android/gms/internal/ads/zzegk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdey;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdnk;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zze:Lcom/google/android/gms/internal/ads/zzezf;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfwb;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcfb;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzbik;

.field private final zzi:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdnk;Lcom/google/android/gms/internal/ads/zzfaa;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzbik;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzegk;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzegk;->zzb:Lcom/google/android/gms/internal/ads/zzdnk;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzegk;->zzc:Lcom/google/android/gms/internal/ads/zzfaa;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzegk;->zzd:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzegk;->zze:Lcom/google/android/gms/internal/ads/zzezf;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzegk;->zzf:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzegk;->zzg:Lcom/google/android/gms/internal/ads/zzcfb;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzegk;->zzh:Lcom/google/android/gms/internal/ads/zzbik;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzegk;->zzi:Z

    return-void
.end method


# virtual methods
.method public final zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzcvv;)V
    .locals 21

    move-object/from16 v1, p0

    .line 1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzf:Lcom/google/android/gms/internal/ads/zzfwb;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzp(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzdmp;

    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzegk;->zze:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzg:Lcom/google/android/gms/internal/ads/zzcfb;

    .line 2
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcfb;->zzaB()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzg:Lcom/google/android/gms/internal/ads/zzcfb;

    :goto_0
    move-object v11, v2

    goto :goto_2

    .line 3
    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbbk;->zzaJ:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v3

    .line 3
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzg:Lcom/google/android/gms/internal/ads/zzcfb;

    goto :goto_0

    :cond_1
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzb:Lcom/google/android/gms/internal/ads/zzdnk;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzc:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfaa;->zze:Lcom/google/android/gms/ads/internal/client/zzq;

    const/4 v6, 0x0

    .line 5
    invoke-virtual {v3, v5, v6, v6}, Lcom/google/android/gms/internal/ads/zzdnk;->zza(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;)Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v3

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdmp;->zzg()Lcom/google/android/gms/internal/ads/zzddf;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzbiy;->zzb(Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzbix;)V

    new-instance v5, Lcom/google/android/gms/internal/ads/zzdno;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzdno;-><init>()V

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzegk;->zza:Landroid/content/Context;

    .line 5
    move-object v8, v3

    check-cast v8, Landroid/view/View;

    .line 7
    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/internal/ads/zzdno;->zza(Landroid/content/Context;Landroid/view/View;)V

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdmp;->zzl()Lcom/google/android/gms/internal/ads/zzdnj;

    move-result-object v7

    iget-boolean v8, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzi:Z

    if-eqz v8, :cond_2

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzh:Lcom/google/android/gms/internal/ads/zzbik;

    goto :goto_1

    :cond_2
    move-object v8, v6

    .line 9
    :goto_1
    invoke-virtual {v7, v3, v4, v8}, Lcom/google/android/gms/internal/ads/zzdnj;->zzi(Lcom/google/android/gms/internal/ads/zzcfb;ZLcom/google/android/gms/internal/ads/zzbik;)V

    .line 10
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcfb;->zzN()Lcom/google/android/gms/internal/ads/zzcgo;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/zzegi;

    invoke-direct {v8, v5, v3}, Lcom/google/android/gms/internal/ads/zzegi;-><init>(Lcom/google/android/gms/internal/ads/zzdno;Lcom/google/android/gms/internal/ads/zzcfb;)V

    .line 11
    invoke-interface {v7, v8}, Lcom/google/android/gms/internal/ads/zzcgo;->zzA(Lcom/google/android/gms/internal/ads/zzcgm;)V

    .line 12
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcfb;->zzN()Lcom/google/android/gms/internal/ads/zzcgo;

    move-result-object v5

    new-instance v7, Lcom/google/android/gms/internal/ads/zzegj;

    invoke-direct {v7, v3}, Lcom/google/android/gms/internal/ads/zzegj;-><init>(Lcom/google/android/gms/internal/ads/zzcfb;)V

    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/ads/zzcgo;->zzG(Lcom/google/android/gms/internal/ads/zzcgn;)V

    .line 13
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzezk;->zzb:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzezk;->zza:Ljava/lang/String;

    invoke-interface {v3, v5, v2, v6}, Lcom/google/android/gms/internal/ads/zzcfb;->zzab(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzcfm; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v3

    .line 15
    :goto_2
    invoke-interface {v11, v4}, Lcom/google/android/gms/internal/ads/zzcfb;->zzan(Z)V

    .line 16
    new-instance v2, Lcom/google/android/gms/ads/internal/zzj;

    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzi:Z

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzh:Lcom/google/android/gms/internal/ads/zzbik;

    .line 17
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzbik;->zze(Z)Z

    move-result v3

    move v13, v3

    goto :goto_3

    :cond_3
    const/4 v13, 0x0

    .line 18
    :goto_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zza:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/zzs;->zzE(Landroid/content/Context;)Z

    move-result v14

    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzi:Z

    if-eqz v3, :cond_4

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzh:Lcom/google/android/gms/internal/ads/zzbik;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbik;->zzd()Z

    move-result v5

    move v15, v5

    goto :goto_4

    :cond_4
    const/4 v15, 0x0

    :goto_4
    if-eqz v3, :cond_5

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzh:Lcom/google/android/gms/internal/ads/zzbik;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbik;->zza()F

    move-result v3

    move/from16 v16, v3

    goto :goto_5

    :cond_5
    const/4 v3, 0x0

    const/16 v16, 0x0

    :goto_5
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzegk;->zze:Lcom/google/android/gms/internal/ads/zzezf;

    const/16 v17, -0x1

    .line 19
    iget-boolean v5, v3, Lcom/google/android/gms/internal/ads/zzezf;->zzP:Z

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/zzezf;->zzQ:Z

    move-object v12, v2

    move/from16 v18, p1

    move/from16 v19, v5

    move/from16 v20, v3

    invoke-direct/range {v12 .. v20}, Lcom/google/android/gms/ads/internal/zzj;-><init>(ZZZFIZZZ)V

    if-eqz p3, :cond_6

    .line 20
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzcvv;->zzf()V

    .line 21
    :cond_6
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzi()Lcom/google/android/gms/ads/internal/overlay/zzm;

    new-instance v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    const/4 v8, 0x0

    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdmp;->zzh()Lcom/google/android/gms/internal/ads/zzden;

    move-result-object v9

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzegk;->zze:Lcom/google/android/gms/internal/ads/zzezf;

    const/4 v10, 0x0

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzR:I

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzd:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzC:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzezk;->zzb:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezk;->zza:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzegk;->zzc:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfaa;->zzf:Ljava/lang/String;

    move-object v7, v3

    move-object v15, v2

    move-object/from16 v16, v5

    move-object/from16 v17, v0

    move-object/from16 v18, v6

    move-object/from16 v19, p3

    invoke-direct/range {v7 .. v19}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/google/android/gms/internal/ads/zzcfb;ILcom/google/android/gms/internal/ads/zzbzz;Ljava/lang/String;Lcom/google/android/gms/ads/internal/zzj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcvv;)V

    move-object/from16 v0, p2

    .line 23
    invoke-static {v0, v3, v4}, Lcom/google/android/gms/ads/internal/overlay/zzm;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;Z)V

    return-void

    :catch_0
    move-exception v0

    const-string v2, ""

    .line 14
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
