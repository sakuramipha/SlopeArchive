.class public final Lcom/google/android/gms/internal/ads/zzevr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzejv;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcgw;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzejf;

.field private final zze:Lcom/google/android/gms/internal/ads/zzejj;

.field private final zzf:Landroid/view/ViewGroup;

.field private zzg:Lcom/google/android/gms/internal/ads/zzbci;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzcxx;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfft;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdae;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzezy;

.field private zzl:Lcom/google/android/gms/internal/ads/zzfwb;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzcgw;Lcom/google/android/gms/internal/ads/zzejf;Lcom/google/android/gms/internal/ads/zzejj;Lcom/google/android/gms/internal/ads/zzezy;Lcom/google/android/gms/internal/ads/zzdae;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzc:Lcom/google/android/gms/internal/ads/zzcgw;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzevr;->zze:Lcom/google/android/gms/internal/ads/zzejj;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzk:Lcom/google/android/gms/internal/ads/zzezy;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcgw;->zze()Lcom/google/android/gms/internal/ads/zzcxx;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzh:Lcom/google/android/gms/internal/ads/zzcxx;

    .line 2
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcgw;->zzy()Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzi:Lcom/google/android/gms/internal/ads/zzfft;

    new-instance p2, Landroid/widget/FrameLayout;

    .line 3
    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzf:Landroid/view/ViewGroup;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzj:Lcom/google/android/gms/internal/ads/zzdae;

    .line 4
    invoke-virtual {p7, p3}, Lcom/google/android/gms/internal/ads/zzezy;->zzr(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/google/android/gms/internal/ads/zzezy;

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzevr;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzf:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzcxx;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzh:Lcom/google/android/gms/internal/ads/zzcxx;

    return-object p0
.end method

.method static bridge synthetic zzf(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzdae;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzj:Lcom/google/android/gms/internal/ads/zzdae;

    return-object p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzejf;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    return-object p0
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzejj;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zze:Lcom/google/android/gms/internal/ads/zzejj;

    return-object p0
.end method

.method static bridge synthetic zzj(Lcom/google/android/gms/internal/ads/zzevr;)Lcom/google/android/gms/internal/ads/zzfft;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzi:Lcom/google/android/gms/internal/ads/zzfft;

    return-object p0
.end method

.method static bridge synthetic zzk(Lcom/google/android/gms/internal/ads/zzevr;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static bridge synthetic zzl(Lcom/google/android/gms/internal/ads/zzevr;Lcom/google/android/gms/internal/ads/zzfwb;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzl:Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzl:Lcom/google/android/gms/internal/ads/zzfwb;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfwb;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzejt;Lcom/google/android/gms/internal/ads/zzeju;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 p3, 0x0

    if-nez p2, :cond_0

    const-string p1, "Ad unit ID should not be null for banner ad."

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzevn;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzevn;-><init>(Lcom/google/android/gms/internal/ads/zzevr;)V

    .line 2
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return p3

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzevr;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    return p3

    .line 4
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzir:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzc:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcgw;->zzj()Lcom/google/android/gms/internal/ads/zzdsz;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdsz;->zzm(Z)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzk:Lcom/google/android/gms/internal/ads/zzezy;

    .line 7
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzezy;->zzs(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzezy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzezy;->zzE(Lcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzezy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzezy;->zzG()Lcom/google/android/gms/internal/ads/zzfaa;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zza:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzffp;->zzf(Lcom/google/android/gms/internal/ads/zzfaa;)I

    move-result v2

    const/4 v3, 0x3

    .line 8
    invoke-static {v0, v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzffe;->zzb(Landroid/content/Context;IILcom/google/android/gms/ads/internal/client/zzl;)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v8

    .line 9
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbdj;->zzd:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzk:Lcom/google/android/gms/internal/ads/zzezy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzezy;->zzg()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v0

    .line 10
    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/zzq;->zzk:Z

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    if-eqz p1, :cond_3

    const/4 p2, 0x7

    .line 52
    invoke-static {p2, v2, v2}, Lcom/google/android/gms/internal/ads/zzfba;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzejf;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    :cond_3
    return p3

    :cond_4
    sget-object p3, Lcom/google/android/gms/internal/ads/zzbbk;->zzhH:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 11
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p3

    .line 12
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzc:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 13
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcgw;->zzd()Lcom/google/android/gms/internal/ads/zzcpz;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcuq;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zza:Landroid/content/Context;

    .line 14
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzcuq;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcuq;

    .line 15
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzcuq;->zzi(Lcom/google/android/gms/internal/ads/zzfaa;)Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcuq;->zzj()Lcom/google/android/gms/internal/ads/zzcus;

    move-result-object p2

    .line 16
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzi(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdat;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdat;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 17
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzj(Lcom/google/android/gms/internal/ads/zzcyd;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 18
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzk(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdat;->zzn()Lcom/google/android/gms/internal/ads/zzdav;

    move-result-object p2

    .line 19
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzf(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzeho;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzg:Lcom/google/android/gms/internal/ads/zzbci;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzeho;-><init>(Lcom/google/android/gms/internal/ads/zzbci;)V

    .line 20
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zze(Lcom/google/android/gms/internal/ads/zzeho;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdfh;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdhn;->zza:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-direct {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdfh;-><init>(Lcom/google/android/gms/internal/ads/zzdhn;Lcom/google/android/gms/ads/internal/client/zzbh;)V

    .line 21
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzd(Lcom/google/android/gms/internal/ads/zzdfh;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzcqx;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzh:Lcom/google/android/gms/internal/ads/zzcxx;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzj:Lcom/google/android/gms/internal/ads/zzdae;

    invoke-direct {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzcqx;-><init>(Lcom/google/android/gms/internal/ads/zzcxx;Lcom/google/android/gms/internal/ads/zzdae;)V

    .line 22
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzg(Lcom/google/android/gms/internal/ads/zzcqx;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzcpa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzf:Landroid/view/ViewGroup;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzcpa;-><init>(Landroid/view/ViewGroup;)V

    .line 23
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzc(Lcom/google/android/gms/internal/ads/zzcpa;)Lcom/google/android/gms/internal/ads/zzcpz;

    .line 24
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcpz;->zzk()Lcom/google/android/gms/internal/ads/zzcqa;

    move-result-object p2

    goto/16 :goto_0

    .line 51
    :cond_5
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzc:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 25
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcgw;->zzd()Lcom/google/android/gms/internal/ads/zzcpz;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcuq;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zza:Landroid/content/Context;

    .line 26
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzcuq;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcuq;

    .line 27
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzcuq;->zzi(Lcom/google/android/gms/internal/ads/zzfaa;)Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcuq;->zzj()Lcom/google/android/gms/internal/ads/zzcus;

    move-result-object p2

    .line 28
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzi(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdat;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdat;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 29
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzj(Lcom/google/android/gms/internal/ads/zzcyd;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 30
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zza(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zze:Lcom/google/android/gms/internal/ads/zzejj;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 31
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zza(Lcom/google/android/gms/ads/internal/client/zza;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 32
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzl(Lcom/google/android/gms/internal/ads/zzdcw;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 33
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzd(Lcom/google/android/gms/internal/ads/zzcwc;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 34
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zze(Lcom/google/android/gms/internal/ads/zzcvi;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 35
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzf(Lcom/google/android/gms/internal/ads/zzcww;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 36
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzb(Lcom/google/android/gms/internal/ads/zzcvl;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 37
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzk(Lcom/google/android/gms/ads/admanager/AppEventListener;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 38
    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzdat;->zzi(Lcom/google/android/gms/internal/ads/zzcxt;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdat;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdat;->zzn()Lcom/google/android/gms/internal/ads/zzdav;

    move-result-object p2

    .line 39
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzf(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzeho;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzg:Lcom/google/android/gms/internal/ads/zzbci;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzeho;-><init>(Lcom/google/android/gms/internal/ads/zzbci;)V

    .line 40
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zze(Lcom/google/android/gms/internal/ads/zzeho;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdfh;

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdhn;->zza:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-direct {p2, v0, v2}, Lcom/google/android/gms/internal/ads/zzdfh;-><init>(Lcom/google/android/gms/internal/ads/zzdhn;Lcom/google/android/gms/ads/internal/client/zzbh;)V

    .line 41
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzd(Lcom/google/android/gms/internal/ads/zzdfh;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzcqx;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzh:Lcom/google/android/gms/internal/ads/zzcxx;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzj:Lcom/google/android/gms/internal/ads/zzdae;

    invoke-direct {p2, v0, v4}, Lcom/google/android/gms/internal/ads/zzcqx;-><init>(Lcom/google/android/gms/internal/ads/zzcxx;Lcom/google/android/gms/internal/ads/zzdae;)V

    .line 42
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzg(Lcom/google/android/gms/internal/ads/zzcqx;)Lcom/google/android/gms/internal/ads/zzcpz;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzcpa;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzf:Landroid/view/ViewGroup;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzcpa;-><init>(Landroid/view/ViewGroup;)V

    .line 43
    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/ads/zzcpz;->zzc(Lcom/google/android/gms/internal/ads/zzcpa;)Lcom/google/android/gms/internal/ads/zzcpz;

    .line 44
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcpz;->zzk()Lcom/google/android/gms/internal/ads/zzcqa;

    move-result-object p2

    :goto_0
    move-object v9, p2

    .line 45
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbcw;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbcp;->zze()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 46
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzcqa;->zzj()Lcom/google/android/gms/internal/ads/zzffq;

    move-result-object p2

    .line 47
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzffq;->zzh(I)Lcom/google/android/gms/internal/ads/zzffq;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    .line 48
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzffq;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzffq;

    move-object v7, p2

    goto :goto_1

    :cond_6
    move-object v7, v2

    .line 49
    :goto_1
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzcqa;->zzd()Lcom/google/android/gms/internal/ads/zzcsm;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsm;->zzj()Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcsm;->zzi(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzl:Lcom/google/android/gms/internal/ads/zzfwb;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzevq;

    move-object v4, p2

    move-object v5, p0

    move-object v6, p4

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/zzevq;-><init>(Lcom/google/android/gms/internal/ads/zzevr;Lcom/google/android/gms/internal/ads/zzeju;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;Lcom/google/android/gms/internal/ads/zzcqa;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    .line 51
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfvr;->zzq(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V

    return v1
.end method

.method public final zzd()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzf:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/internal/ads/zzezy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzk:Lcom/google/android/gms/internal/ads/zzezy;

    return-object v0
.end method

.method final synthetic zzm()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzd:Lcom/google/android/gms/internal/ads/zzejf;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfba;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzejf;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final zzn()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzh:Lcom/google/android/gms/internal/ads/zzcxx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzj:Lcom/google/android/gms/internal/ads/zzdae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdae;->zzc()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcxx;->zzd(I)V

    return-void
.end method

.method public final zzo(Lcom/google/android/gms/ads/internal/client/zzbe;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zze:Lcom/google/android/gms/internal/ads/zzejj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzejj;->zza(Lcom/google/android/gms/ads/internal/client/zzbe;)V

    return-void
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zzcxy;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzh:Lcom/google/android/gms/internal/ads/zzcxx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzb:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzdas;->zzm(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final zzq(Lcom/google/android/gms/internal/ads/zzbci;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzg:Lcom/google/android/gms/internal/ads/zzbci;

    return-void
.end method

.method public final zzr()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevr;->zzf:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3
    :cond_0
    check-cast v0, Landroid/view/View;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzS(Landroid/view/View;Landroid/content/Context;)Z

    move-result v0

    return v0
.end method
