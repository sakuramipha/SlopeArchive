.class final Lcom/google/android/gms/internal/ads/zzevq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzeju;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzffq;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfff;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzcqa;

.field final synthetic zze:Lcom/google/android/gms/internal/ads/zzevr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzevr;Lcom/google/android/gms/internal/ads/zzeju;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;Lcom/google/android/gms/internal/ads/zzcqa;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zza:Lcom/google/android/gms/internal/ads/zzeju;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzb:Lcom/google/android/gms/internal/ads/zzffq;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzc:Lcom/google/android/gms/internal/ads/zzfff;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzd:Lcom/google/android/gms/internal/ads/zzcqa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzd:Lcom/google/android/gms/internal/ads/zzcqa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcqa;->zzd()Lcom/google/android/gms/internal/ads/zzcsm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcsm;->zza(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    const/4 v3, 0x0

    .line 2
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzevr;->zzl(Lcom/google/android/gms/internal/ads/zzevr;Lcom/google/android/gms/internal/ads/zzfwb;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzd:Lcom/google/android/gms/internal/ads/zzcqa;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcqa;->zzf()Lcom/google/android/gms/internal/ads/zzcvk;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzcvk;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbk;->zzhH:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v2

    .line 4
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzevr;->zzk(Lcom/google/android/gms/internal/ads/zzevr;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzevp;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/zzevp;-><init>(Lcom/google/android/gms/internal/ads/zzevq;Lcom/google/android/gms/ads/internal/client/zze;)V

    .line 6
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzevr;->zze(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzcxx;

    move-result-object v3

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzevr;->zzf(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzdae;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdae;->zzc()I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzcxx;->zzd(I)V

    .line 8
    iget v2, v0, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    const-string v3, "BannerAdLoader.onFailure"

    invoke-static {v2, p1, v3}, Lcom/google/android/gms/internal/ads/zzfau;->zzb(ILjava/lang/Throwable;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zza:Lcom/google/android/gms/internal/ads/zzeju;

    .line 9
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzeju;->zza()V

    .line 10
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbcw;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzb:Lcom/google/android/gms/internal/ads/zzffq;

    if-eqz v2, :cond_1

    .line 13
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzffq;->zzc(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/internal/ads/zzffq;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzc:Lcom/google/android/gms/internal/ads/zzfff;

    .line 14
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfff;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzffq;->zza(Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzffq;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzffq;->zzg()V

    goto :goto_0

    .line 16
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzevr;->zzj(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzc:Lcom/google/android/gms/internal/ads/zzfff;

    .line 11
    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/ads/zzfff;->zza(Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v4, p1}, Lcom/google/android/gms/internal/ads/zzfff;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzfff;->zzl()Lcom/google/android/gms/internal/ads/zzffj;

    move-result-object p1

    .line 12
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzfft;->zzb(Lcom/google/android/gms/internal/ads/zzffj;)V

    .line 16
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcpd;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    const/4 v2, 0x0

    .line 2
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzevr;->zzl(Lcom/google/android/gms/internal/ads/zzevr;Lcom/google/android/gms/internal/ads/zzfwb;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevr;->zzc(Lcom/google/android/gms/internal/ads/zzevr;)Landroid/view/ViewGroup;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcpd;->zzc()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcpd;->zzc()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 6
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    const-string v2, ""

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzl()Lcom/google/android/gms/internal/ads/zzcvb;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzl()Lcom/google/android/gms/internal/ads/zzcvb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvb;->zzg()Ljava/lang/String;

    move-result-object v2

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 9
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Banner view provided from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " already has a parent view. Removing its old parent."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    .line 11
    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcpd;->zzc()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 12
    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzhH:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzn()Lcom/google/android/gms/internal/ads/zzczn;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzevr;->zzg(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzejf;

    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzczn;->zza(Lcom/google/android/gms/internal/ads/zzejf;)Lcom/google/android/gms/internal/ads/zzczn;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzevr;->zzh(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzejj;

    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzczn;->zzc(Lcom/google/android/gms/internal/ads/zzejj;)Lcom/google/android/gms/internal/ads/zzczn;

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevr;->zzc(Lcom/google/android/gms/internal/ads/zzevr;)Landroid/view/ViewGroup;

    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcpd;->zzc()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zza:Lcom/google/android/gms/internal/ads/zzeju;

    .line 18
    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzeju;->zzb(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzhH:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 19
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevr;->zzk(Lcom/google/android/gms/internal/ads/zzevr;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevr;->zzg(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzejf;

    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzevo;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/zzevo;-><init>(Lcom/google/android/gms/internal/ads/zzejf;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevr;->zze(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzcxx;

    move-result-object v1

    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcpd;->zza()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzcxx;->zzd(I)V

    .line 23
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbcw;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzb:Lcom/google/android/gms/internal/ads/zzffq;

    if-eqz v1, :cond_4

    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzp()Lcom/google/android/gms/internal/ads/zzezr;

    move-result-object v3

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzffq;->zzf(Lcom/google/android/gms/internal/ads/zzezq;)Lcom/google/android/gms/internal/ads/zzffq;

    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzl()Lcom/google/android/gms/internal/ads/zzcvb;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcvb;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzffq;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffq;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzc:Lcom/google/android/gms/internal/ads/zzfff;

    .line 31
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzffq;->zza(Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzffq;

    .line 32
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzffq;->zzg()V

    goto :goto_0

    .line 33
    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevq;->zze:Lcom/google/android/gms/internal/ads/zzevr;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzevr;->zzj(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzevq;->zzc:Lcom/google/android/gms/internal/ads/zzfff;

    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzp()Lcom/google/android/gms/internal/ads/zzezr;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzfff;->zzb(Lcom/google/android/gms/internal/ads/zzezq;)Lcom/google/android/gms/internal/ads/zzfff;

    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcrf;->zzl()Lcom/google/android/gms/internal/ads/zzcvb;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcvb;->zzg()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfff;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfff;

    .line 26
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    .line 27
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzfff;->zzl()Lcom/google/android/gms/internal/ads/zzffj;

    move-result-object p1

    .line 28
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfft;->zzb(Lcom/google/android/gms/internal/ads/zzffj;)V

    .line 33
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
