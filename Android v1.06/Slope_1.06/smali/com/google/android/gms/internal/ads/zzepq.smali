.class public final Lcom/google/android/gms/internal/ads/zzepq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeqq;


# instance fields
.field final zza:Ljava/lang/String;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfwc;

.field private final zzc:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzeib;

.field private final zze:Landroid/content/Context;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzehx;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdnx;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzdsg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfwc;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzeib;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfaa;Lcom/google/android/gms/internal/ads/zzehx;Lcom/google/android/gms/internal/ads/zzdnx;Lcom/google/android/gms/internal/ads/zzdsg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzc:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzepq;->zza:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzd:Lcom/google/android/gms/internal/ads/zzeib;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzepq;->zze:Landroid/content/Context;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzf:Lcom/google/android/gms/internal/ads/zzfaa;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzg:Lcom/google/android/gms/internal/ads/zzehx;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzh:Lcom/google/android/gms/internal/ads/zzdnx;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzi:Lcom/google/android/gms/internal/ads/zzdsg;

    return-void
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/ads/zzepq;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 12

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzjs:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzf:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzf:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzf:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzf:Ljava/lang/String;

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzd:Lcom/google/android/gms/internal/ads/zzeib;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzepq;->zza:Ljava/lang/String;

    .line 4
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzeib;->zza(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzbz:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 6
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzi:Lcom/google/android/gms/internal/ads/zzdsg;

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdsg;->zzg()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_1

    .line 27
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 7
    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    check-cast v0, Lcom/google/android/gms/internal/ads/zzfru;

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfru;->zzg()Lcom/google/android/gms/internal/ads/zzfrw;

    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 12
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/String;

    .line 13
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/util/List;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzf:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    if-eqz v3, :cond_2

    .line 14
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    :cond_2
    move-object v9, v4

    const/4 v10, 0x1

    const/4 v11, 0x1

    move-object v6, p0

    .line 15
    invoke-direct/range {v6 .. v11}, Lcom/google/android/gms/internal/ads/zzepq;->zzf(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/google/android/gms/internal/ads/zzfvi;

    move-result-object v3

    .line 16
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzd:Lcom/google/android/gms/internal/ads/zzeib;

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeib;->zzb()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfru;

    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfru;->zzg()Lcom/google/android/gms/internal/ads/zzfrw;

    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 20
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzeif;

    .line 21
    iget-object v6, v3, Lcom/google/android/gms/internal/ads/zzeif;->zza:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzf:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    if-eqz v5, :cond_4

    .line 22
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    move-object v8, v5

    goto :goto_4

    :cond_4
    move-object v8, v4

    .line 23
    :goto_4
    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzeif;->zzd:Landroid/os/Bundle;

    .line 24
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    iget-boolean v9, v3, Lcom/google/android/gms/internal/ads/zzeif;->zzb:Z

    iget-boolean v10, v3, Lcom/google/android/gms/internal/ads/zzeif;->zzc:Z

    move-object v5, p0

    .line 25
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzepq;->zzf(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/google/android/gms/internal/ads/zzfvi;

    move-result-object v3

    .line 23
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 26
    :cond_5
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfvq;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/zzepn;

    invoke-direct {v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzepn;-><init>(Ljava/util/List;Landroid/os/Bundle;)V

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 27
    invoke-virtual {v0, v3, p0}, Lcom/google/android/gms/internal/ads/zzfvq;->zza(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p0

    return-object p0
.end method

.method private final zzf(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/google/android/gms/internal/ads/zzfvi;
    .locals 8

    .line 1
    new-instance v7, Lcom/google/android/gms/internal/ads/zzepo;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzepo;-><init>(Lcom/google/android/gms/internal/ads/zzepq;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-static {v7, p2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzk(Lcom/google/android/gms/internal/ads/zzfux;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p2

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzfvi;->zzv(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfvi;

    move-result-object p2

    .line 3
    sget-object p3, Lcom/google/android/gms/internal/ads/zzbbk;->zzbv:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p3

    .line 3
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p3, Lcom/google/android/gms/internal/ads/zzbbk;->zzbo:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p3

    .line 6
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    invoke-static {p2, p3, p4, p5, v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzn(Lcom/google/android/gms/internal/ads/zzfwb;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/zzfvi;

    :cond_0
    new-instance p3, Lcom/google/android/gms/internal/ads/zzepp;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/zzepp;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    const-class p4, Ljava/lang/Throwable;

    .line 8
    invoke-static {p2, p4, p3, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zze(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzfvi;

    return-object p1
.end method

.method private final zzg(Lcom/google/android/gms/internal/ads/zzbpv;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzeie;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepq;->zze:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzepq;->zza:Ljava/lang/String;

    const/4 v0, 0x0

    .line 2
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    move-object v5, p3

    check-cast v5, Landroid/os/Bundle;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzf:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v6, p3, Lcom/google/android/gms/internal/ads/zzfaa;->zze:Lcom/google/android/gms/ads/internal/client/zzq;

    move-object v1, p1

    move-object v4, p2

    move-object v7, p4

    .line 3
    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzbpv;->zzh(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lcom/google/android/gms/ads/internal/client/zzq;Lcom/google/android/gms/internal/ads/zzbpy;)V

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzepk;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzepk;-><init>(Lcom/google/android/gms/internal/ads/zzepq;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzk(Lcom/google/android/gms/internal/ads/zzfux;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0
.end method

.method final synthetic zzd(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;ZZ)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v7, Lcom/google/android/gms/internal/ads/zzcal;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzg:Lcom/google/android/gms/internal/ads/zzehx;

    .line 2
    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/ads/zzehx;->zzb(Ljava/lang/String;)V

    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzg:Lcom/google/android/gms/internal/ads/zzehx;

    .line 3
    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/ads/zzehx;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbpv;

    move-result-object p5

    goto :goto_0

    .line 20
    :cond_0
    :try_start_0
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzh:Lcom/google/android/gms/internal/ads/zzdnx;

    .line 4
    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/ads/zzdnx;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbpv;

    move-result-object p5
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p5

    const-string v1, "Couldn\'t create RTB adapter : "

    .line 5
    invoke-static {v1, p5}, Lcom/google/android/gms/internal/ads/zzbzt;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p5, v0

    :goto_0
    if-nez p5, :cond_2

    .line 6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbbk;->zzbq:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p2

    .line 6
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 8
    invoke-static {p1, v7}, Lcom/google/android/gms/internal/ads/zzeie;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcal;)V

    goto/16 :goto_1

    .line 9
    :cond_1
    throw v0

    .line 8
    :cond_2
    new-instance v6, Lcom/google/android/gms/internal/ads/zzeie;

    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v4

    move-object v0, v6

    move-object v1, p1

    move-object v2, p5

    move-object v3, v7

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzeie;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbpv;Lcom/google/android/gms/internal/ads/zzcal;J)V

    .line 11
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzbv:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 12
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzc:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzepl;

    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzepl;-><init>(Lcom/google/android/gms/internal/ads/zzeie;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzbo:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    invoke-interface {p1, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    if-eqz p4, :cond_5

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzbA:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 16
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p4

    invoke-virtual {p4, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzepq;->zzb:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance p4, Lcom/google/android/gms/internal/ads/zzepm;

    move-object v0, p4

    move-object v1, p0

    move-object v2, p5

    move-object v3, p3

    move-object v4, p2

    move-object v5, v6

    move-object v6, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzepm;-><init>(Lcom/google/android/gms/internal/ads/zzepq;Lcom/google/android/gms/internal/ads/zzbpv;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzeie;Lcom/google/android/gms/internal/ads/zzcal;)V

    .line 18
    invoke-interface {p1, p4}, Lcom/google/android/gms/internal/ads/zzfwc;->zza(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/zzfwb;

    goto :goto_1

    .line 19
    :cond_4
    invoke-direct {p0, p5, p3, p2, v6}, Lcom/google/android/gms/internal/ads/zzepq;->zzg(Lcom/google/android/gms/internal/ads/zzbpv;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzeie;)V

    goto :goto_1

    .line 20
    :cond_5
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeie;->zzd()V

    :goto_1
    return-object v7
.end method

.method final synthetic zze(Lcom/google/android/gms/internal/ads/zzbpv;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzeie;Lcom/google/android/gms/internal/ads/zzcal;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzepq;->zzg(Lcom/google/android/gms/internal/ads/zzbpv;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzeie;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/ads/zzcal;->zze(Ljava/lang/Throwable;)Z

    return-void
.end method
