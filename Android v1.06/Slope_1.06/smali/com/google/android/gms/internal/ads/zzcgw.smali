.class public abstract Lcom/google/android/gms/internal/ads/zzcgw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcmi;


# static fields
.field private static zza:Lcom/google/android/gms/internal/ads/zzcgw;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized zzC(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbny;IZILcom/google/android/gms/internal/ads/zzchz;)Lcom/google/android/gms/internal/ads/zzcgw;
    .locals 9
    .param p1    # Lcom/google/android/gms/internal/ads/zzbny;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-class p2, Lcom/google/android/gms/internal/ads/zzcgw;

    monitor-enter p2

    .line 1
    :try_start_0
    sget-object p3, Lcom/google/android/gms/internal/ads/zzcgw;->zza:Lcom/google/android/gms/internal/ads/zzcgw;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_0

    monitor-exit p2

    return-object p3

    :cond_0
    :try_start_1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbbk;->zza(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfat;->zzd(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfat;

    move-result-object p3

    const v0, 0xdcf7620

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p3, v0, v1, p4}, Lcom/google/android/gms/internal/ads/zzfat;->zzc(IZI)Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object v4

    .line 4
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzfat;->zze(Lcom/google/android/gms/internal/ads/zzbny;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzcjn;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzcjn;-><init>(Lcom/google/android/gms/internal/ads/zzcjm;)V

    new-instance p4, Lcom/google/android/gms/internal/ads/zzcgx;

    invoke-direct {p4}, Lcom/google/android/gms/internal/ads/zzcgx;-><init>()V

    .line 5
    invoke-virtual {p4, v4}, Lcom/google/android/gms/internal/ads/zzcgx;->zzd(Lcom/google/android/gms/internal/ads/zzbzz;)Lcom/google/android/gms/internal/ads/zzcgx;

    invoke-virtual {p4, p0}, Lcom/google/android/gms/internal/ads/zzcgx;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcgx;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcgz;

    invoke-direct {v0, p4, p3}, Lcom/google/android/gms/internal/ads/zzcgz;-><init>(Lcom/google/android/gms/internal/ads/zzcgx;Lcom/google/android/gms/internal/ads/zzcgy;)V

    .line 6
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzcjn;->zzb(Lcom/google/android/gms/internal/ads/zzcgz;)Lcom/google/android/gms/internal/ads/zzcjn;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzcla;

    invoke-direct {p3, p5}, Lcom/google/android/gms/internal/ads/zzcla;-><init>(Lcom/google/android/gms/internal/ads/zzchz;)V

    .line 7
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzcjn;->zzc(Lcom/google/android/gms/internal/ads/zzcla;)Lcom/google/android/gms/internal/ads/zzcjn;

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcjn;->zza()Lcom/google/android/gms/internal/ads/zzcgw;

    move-result-object p1

    .line 9
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/google/android/gms/internal/ads/zzbzc;

    move-result-object p3

    invoke-virtual {p3, p0, v4}, Lcom/google/android/gms/internal/ads/zzbzc;->zzs(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;)V

    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/internal/ads/zzawf;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzawf;->zzi(Landroid/content/Context;)V

    .line 11
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzj(Landroid/content/Context;)Z

    .line 12
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzi(Landroid/content/Context;)Z

    .line 13
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/zzd;->zza(Landroid/content/Context;)V

    .line 14
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzb()Lcom/google/android/gms/internal/ads/zzaus;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzaus;->zzd(Landroid/content/Context;)V

    .line 15
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzv()Lcom/google/android/gms/ads/internal/util/zzcg;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/ads/internal/util/zzcg;->zzb(Landroid/content/Context;)V

    .line 16
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbxz;->zzd(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbxz;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzbbk;->zzfU:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p3

    .line 18
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p3, Lcom/google/android/gms/internal/ads/zzbbk;->zzav:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 19
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p3

    .line 20
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_1

    new-instance p3, Lcom/google/android/gms/internal/ads/zzear;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzawx;

    new-instance p4, Lcom/google/android/gms/internal/ads/zzaxd;

    .line 21
    invoke-direct {p4, p0}, Lcom/google/android/gms/internal/ads/zzaxd;-><init>(Landroid/content/Context;)V

    invoke-direct {v5, p4}, Lcom/google/android/gms/internal/ads/zzawx;-><init>(Lcom/google/android/gms/internal/ads/zzaxd;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzdzv;

    new-instance p4, Lcom/google/android/gms/internal/ads/zzdzr;

    invoke-direct {p4, p0}, Lcom/google/android/gms/internal/ads/zzdzr;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzz()Lcom/google/android/gms/internal/ads/zzfwc;

    move-result-object p5

    invoke-direct {v6, p4, p5}, Lcom/google/android/gms/internal/ads/zzdzv;-><init>(Lcom/google/android/gms/internal/ads/zzdzr;Lcom/google/android/gms/internal/ads/zzfwc;)V

    .line 23
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 24
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v7

    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzx()Lcom/google/android/gms/internal/ads/zzfen;

    move-result-object v8

    move-object v2, p3

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzear;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzawx;Lcom/google/android/gms/internal/ads/zzdzv;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfen;)V

    .line 26
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/google/android/gms/internal/ads/zzbzc;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbzc;->zzh()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result p0

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzear;->zzb(Z)V

    :cond_1
    sput-object p1, Lcom/google/android/gms/internal/ads/zzcgw;->zza:Lcom/google/android/gms/internal/ads/zzcgw;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p0

    monitor-exit p2

    throw p0
.end method

.method public static zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbny;I)Lcom/google/android/gms/internal/ads/zzcgw;
    .locals 6
    .param p1    # Lcom/google/android/gms/internal/ads/zzbny;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v5, Lcom/google/android/gms/internal/ads/zzchz;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzchz;-><init>()V

    const v2, 0xdcf7620

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzcgw;->zzC(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbny;IZILcom/google/android/gms/internal/ads/zzchz;)Lcom/google/android/gms/internal/ads/zzcgw;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract zzA()Ljava/util/concurrent/Executor;
.end method

.method public abstract zzB()Ljava/util/concurrent/ScheduledExecutorService;
.end method

.method public abstract zzb()Lcom/google/android/gms/internal/ads/zzcll;
.end method

.method public abstract zzc()Lcom/google/android/gms/internal/ads/zzcoq;
.end method

.method public abstract zzd()Lcom/google/android/gms/internal/ads/zzcpz;
.end method

.method public abstract zze()Lcom/google/android/gms/internal/ads/zzcxx;
.end method

.method public abstract zzf()Lcom/google/android/gms/internal/ads/zzdep;
.end method

.method public abstract zzg()Lcom/google/android/gms/internal/ads/zzdfl;
.end method

.method public abstract zzh()Lcom/google/android/gms/internal/ads/zzdms;
.end method

.method public abstract zzi()Lcom/google/android/gms/internal/ads/zzdrk;
.end method

.method public abstract zzj()Lcom/google/android/gms/internal/ads/zzdsz;
.end method

.method public abstract zzk()Lcom/google/android/gms/internal/ads/zzdtt;
.end method

.method public abstract zzl()Lcom/google/android/gms/internal/ads/zzebn;
.end method

.method public abstract zzm()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzc;
.end method

.method public abstract zzn()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzg;
.end method

.method public abstract zzo()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzaa;
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zzbug;I)Lcom/google/android/gms/internal/ads/zzeri;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzetk;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzetk;-><init>(Lcom/google/android/gms/internal/ads/zzbug;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzcgw;->zzq(Lcom/google/android/gms/internal/ads/zzetk;)Lcom/google/android/gms/internal/ads/zzeri;

    move-result-object p1

    return-object p1
.end method

.method protected abstract zzq(Lcom/google/android/gms/internal/ads/zzetk;)Lcom/google/android/gms/internal/ads/zzeri;
.end method

.method public abstract zzr()Lcom/google/android/gms/internal/ads/zzeuf;
.end method

.method public abstract zzs()Lcom/google/android/gms/internal/ads/zzevt;
.end method

.method public abstract zzt()Lcom/google/android/gms/internal/ads/zzexk;
.end method

.method public abstract zzu()Lcom/google/android/gms/internal/ads/zzeyy;
.end method

.method public abstract zzv()Lcom/google/android/gms/internal/ads/zzfam;
.end method

.method public abstract zzw()Lcom/google/android/gms/internal/ads/zzfaw;
.end method

.method public abstract zzx()Lcom/google/android/gms/internal/ads/zzfen;
.end method

.method public abstract zzy()Lcom/google/android/gms/internal/ads/zzfft;
.end method

.method public abstract zzz()Lcom/google/android/gms/internal/ads/zzfwc;
.end method
