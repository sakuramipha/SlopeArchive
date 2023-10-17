.class public final Lcom/google/android/gms/internal/ads/zzekc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzejv;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzezy;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcgw;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzejs;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfft;

.field private zzf:Lcom/google/android/gms/internal/ads/zzcrt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcgw;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzejs;Lcom/google/android/gms/internal/ads/zzezy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzc:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:Lcom/google/android/gms/internal/ads/zzejs;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzekc;->zza:Lcom/google/android/gms/internal/ads/zzezy;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzy()Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zze:Lcom/google/android/gms/internal/ads/zzfft;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzejs;->zzd()Lcom/google/android/gms/internal/ads/zzejf;

    move-result-object p1

    .line 2
    invoke-virtual {p4, p1}, Lcom/google/android/gms/internal/ads/zzezy;->zzu(Lcom/google/android/gms/internal/ads/zzejf;)Lcom/google/android/gms/internal/ads/zzezy;

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzekc;)Lcom/google/android/gms/internal/ads/zzcgw;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    return-object p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzekc;)Lcom/google/android/gms/internal/ads/zzejs;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:Lcom/google/android/gms/internal/ads/zzejs;

    return-object p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzekc;)Lcom/google/android/gms/internal/ads/zzfft;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zze:Lcom/google/android/gms/internal/ads/zzfft;

    return-object p0
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzf:Lcom/google/android/gms/internal/ads/zzcrt;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcrt;->zzf()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzejt;Lcom/google/android/gms/internal/ads/zzeju;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzc:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzD(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Failed to load the ad because app ID is missing."

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 32
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzA()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzejx;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzejx;-><init>(Lcom/google/android/gms/internal/ads/zzekc;)V

    .line 33
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    const-string p1, "Ad unit ID should not be null for NativeAdLoader."

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzA()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzejy;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzejy;-><init>(Lcom/google/android/gms/internal/ads/zzekc;)V

    .line 4
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzc:Landroid/content/Context;

    .line 5
    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/zzfau;->zza(Landroid/content/Context;Z)V

    .line 6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbbk;->zzir:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p2

    .line 6
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    iget-boolean p2, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcgw;->zzj()Lcom/google/android/gms/internal/ads/zzdsz;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzdsz;->zzm(Z)V

    :cond_3
    check-cast p3, Lcom/google/android/gms/internal/ads/zzejw;

    iget p2, p3, Lcom/google/android/gms/internal/ads/zzejw;->zza:I

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zza:Lcom/google/android/gms/internal/ads/zzezy;

    .line 9
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzezy;->zzE(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzezy;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzezy;->zzz(I)Lcom/google/android/gms/internal/ads/zzezy;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzezy;->zzG()Lcom/google/android/gms/internal/ads/zzfaa;

    move-result-object p2

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzc:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzffp;->zzf(Lcom/google/android/gms/internal/ads/zzfaa;)I

    move-result v1

    const/16 v2, 0x8

    .line 10
    invoke-static {p3, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzffe;->zzb(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v7

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzfaa;->zzn:Lcom/google/android/gms/ads/internal/client/zzcb;

    if-eqz p3, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:Lcom/google/android/gms/internal/ads/zzejs;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzejs;->zzd()Lcom/google/android/gms/internal/ads/zzejf;

    move-result-object v1

    .line 11
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/zzejf;->zzi(Lcom/google/android/gms/ads/internal/client/zzcb;)V

    :cond_4
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 12
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcgw;->zzg()Lcom/google/android/gms/internal/ads/zzdfl;

    move-result-object p3

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcuq;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzc:Landroid/content/Context;

    .line 13
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzcuq;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcuq;

    .line 14
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzcuq;->zzi(Lcom/google/android/gms/internal/ads/zzfaa;)Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzj()Lcom/google/android/gms/internal/ads/zzcus;

    move-result-object p2

    .line 15
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzdfl;->zzf(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzdfl;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdat;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdat;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:Lcom/google/android/gms/internal/ads/zzejs;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzejs;->zzd()Lcom/google/android/gms/internal/ads/zzejf;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 16
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcgw;->zzA()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {p2, v1, v3}, Lcom/google/android/gms/internal/ads/zzdat;->zzk(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdat;->zzn()Lcom/google/android/gms/internal/ads/zzdav;

    move-result-object p2

    .line 17
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzdfl;->zze(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzdfl;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:Lcom/google/android/gms/internal/ads/zzejs;

    .line 18
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzejs;->zzc()Lcom/google/android/gms/internal/ads/zzdfh;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzdfl;->zzd(Lcom/google/android/gms/internal/ads/zzdfh;)Lcom/google/android/gms/internal/ads/zzdfl;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzcpa;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lcom/google/android/gms/internal/ads/zzcpa;-><init>(Landroid/view/ViewGroup;)V

    .line 19
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzdfl;->zzc(Lcom/google/android/gms/internal/ads/zzcpa;)Lcom/google/android/gms/internal/ads/zzdfl;

    .line 20
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzdfl;->zzg()Lcom/google/android/gms/internal/ads/zzdfm;

    move-result-object v8

    .line 21
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbcw;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 22
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzdfm;->zzf()Lcom/google/android/gms/internal/ads/zzffq;

    move-result-object p2

    .line 23
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzffq;->zzh(I)Lcom/google/android/gms/internal/ads/zzffq;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    .line 24
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzffq;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffq;

    move-object v6, p2

    goto :goto_1

    :cond_5
    move-object v6, v1

    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzw()Lcom/google/android/gms/internal/ads/zzfaw;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfaw;->zzc(I)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzcrt;

    .line 26
    sget-object p2, Lcom/google/android/gms/internal/ads/zzcag;->zza:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 27
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 28
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcgw;->zzB()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p3

    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzdfm;->zza()Lcom/google/android/gms/internal/ads/zzcsm;

    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcsm;->zzj()Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzcsm;->zzi(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v1

    .line 28
    invoke-direct {p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzcrt;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/zzfwb;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzf:Lcom/google/android/gms/internal/ads/zzcrt;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzekb;

    move-object v3, p2

    move-object v4, p0

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/zzekb;-><init>(Lcom/google/android/gms/internal/ads/zzekc;Lcom/google/android/gms/internal/ads/zzeju;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;Lcom/google/android/gms/internal/ads/zzdfm;)V

    .line 30
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcrt;->zze(Lcom/google/android/gms/internal/ads/zzfvn;)V

    return v0
.end method

.method final synthetic zzf()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:Lcom/google/android/gms/internal/ads/zzejs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzejs;->zza()Lcom/google/android/gms/internal/ads/zzcvl;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfba;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    .line 2
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzcvl;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method final synthetic zzg()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:Lcom/google/android/gms/internal/ads/zzejs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzejs;->zza()Lcom/google/android/gms/internal/ads/zzcvl;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfba;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    .line 2
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzcvl;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
