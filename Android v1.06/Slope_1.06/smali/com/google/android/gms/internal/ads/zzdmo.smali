.class public final Lcom/google/android/gms/internal/ads/zzdmo;
.super Lcom/google/android/gms/internal/ads/zzcrf;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zzc:Landroid/content/Context;

.field private final zzd:Ljava/lang/ref/WeakReference;

.field private final zze:Lcom/google/android/gms/internal/ads/zzdey;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzdce;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcvv;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzcxc;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzcrz;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzbvm;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzfje;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzezt;

.field private zzm:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcre;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzdey;Lcom/google/android/gms/internal/ads/zzdce;Lcom/google/android/gms/internal/ads/zzcvv;Lcom/google/android/gms/internal/ads/zzcxc;Lcom/google/android/gms/internal/ads/zzcrz;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzfje;Lcom/google/android/gms/internal/ads/zzezt;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzcrf;-><init>(Lcom/google/android/gms/internal/ads/zzcre;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzm:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzc:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zze:Lcom/google/android/gms/internal/ads/zzdey;

    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 2
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzd:Ljava/lang/ref/WeakReference;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzf:Lcom/google/android/gms/internal/ads/zzdce;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzg:Lcom/google/android/gms/internal/ads/zzcvv;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzh:Lcom/google/android/gms/internal/ads/zzcxc;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzi:Lcom/google/android/gms/internal/ads/zzcrz;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzk:Lcom/google/android/gms/internal/ads/zzfje;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbwg;

    iget-object p2, p9, Lcom/google/android/gms/internal/ads/zzezf;->zzm:Lcom/google/android/gms/internal/ads/zzbvi;

    if-eqz p2, :cond_0

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzbvi;->zza:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p3, ""

    :goto_0
    if-eqz p2, :cond_1

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzbvi;->zzb:I

    goto :goto_1

    :cond_1
    const/4 p2, 0x1

    .line 3
    :goto_1
    invoke-direct {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzbwg;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzj:Lcom/google/android/gms/internal/ads/zzbvm;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzl:Lcom/google/android/gms/internal/ads/zzezt;

    return-void
.end method


# virtual methods
.method public final finalize()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzd:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcfb;

    .line 2
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzgw:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 2
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzm:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    .line 4
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zze:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzdmn;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzdmn;-><init>(Lcom/google/android/gms/internal/ads/zzcfb;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzfwc;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfb;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :cond_1
    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 7
    throw v0
.end method

.method public final zza()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzh:Lcom/google/android/gms/internal/ads/zzcxc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcxc;->zzb()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzbvm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzj:Lcom/google/android/gms/internal/ads/zzbvm;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzezt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzl:Lcom/google/android/gms/internal/ads/zzezt;

    return-object v0
.end method

.method public final zze()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzi:Lcom/google/android/gms/internal/ads/zzcrz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcrz;->zzg()Z

    move-result v0

    return v0
.end method

.method public final zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzm:Z

    return v0
.end method

.method public final zzg()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzd:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcfb;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfb;->zzaB()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzh(ZLandroid/app/Activity;)Z
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzaB:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzc:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzC(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies"

    .line 10
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzg:Lcom/google/android/gms/internal/ads/zzcvv;

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcvv;->zzb()V

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzaC:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 12
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzk:Lcom/google/android/gms/internal/ads/zzfje;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zza:Lcom/google/android/gms/internal/ads/zzezr;

    .line 14
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezq;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezi;->zzb:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzfje;->zza(Ljava/lang/String;)V

    :cond_0
    return v1

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzm:Z

    if-eqz v0, :cond_2

    const-string p1, "The rewarded ad have been showed."

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzg:Lcom/google/android/gms/internal/ads/zzcvv;

    const/16 p2, 0xa

    const/4 v0, 0x0

    .line 4
    invoke-static {p2, v0, v0}, Lcom/google/android/gms/internal/ads/zzfba;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p2

    .line 5
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcvv;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    return v1

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzm:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzf:Lcom/google/android/gms/internal/ads/zzdce;

    .line 6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdce;->zzb()V

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzc:Landroid/content/Context;

    :cond_3
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zze:Lcom/google/android/gms/internal/ads/zzdey;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzg:Lcom/google/android/gms/internal/ads/zzcvv;

    .line 7
    invoke-interface {v2, p1, p2, v3}, Lcom/google/android/gms/internal/ads/zzdey;->zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzcvv;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzf:Lcom/google/android/gms/internal/ads/zzdce;

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdce;->zza()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzdex; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdmo;->zzg:Lcom/google/android/gms/internal/ads/zzcvv;

    .line 9
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzcvv;->zzc(Lcom/google/android/gms/internal/ads/zzdex;)V

    return v1
.end method
