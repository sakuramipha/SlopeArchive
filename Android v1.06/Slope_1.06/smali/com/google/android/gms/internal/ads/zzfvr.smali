.class public final Lcom/google/android/gms/internal/ads/zzfvr;
.super Lcom/google/android/gms/internal/ads/zzfvt;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public static zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfvq;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfvq;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfrr;->zzj(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzfvq;-><init>(ZLcom/google/android/gms/internal/ads/zzfrr;Lcom/google/android/gms/internal/ads/zzfvp;)V

    return-object v0
.end method

.method public static zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfvq;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfvq;

    sget v1, Lcom/google/android/gms/internal/ads/zzfrr;->zzd:I

    .line 3
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfrr;->zzj(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p0

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzfvq;-><init>(ZLcom/google/android/gms/internal/ads/zzfrr;Lcom/google/android/gms/internal/ads/zzfvp;)V

    return-object v0
.end method

.method public static varargs zzc([Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfvq;
    .locals 3
    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfvq;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfrr;->zzk([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzfvq;-><init>(ZLcom/google/android/gms/internal/ads/zzfrr;Lcom/google/android/gms/internal/ads/zzfvp;)V

    return-object v0
.end method

.method public static zzd(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfuz;

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfrr;->zzj(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object p0

    const/4 v1, 0x1

    .line 3
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzfuz;-><init>(Lcom/google/android/gms/internal/ads/zzfrm;Z)V

    return-object v0
.end method

.method public static zze(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfuc;

    .line 2
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfuc;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfon;)V

    .line 3
    invoke-static {p3, v0}, Lcom/google/android/gms/internal/ads/zzfwi;->zzc(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzfuf;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static zzf(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfub;

    .line 2
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfub;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzfuy;)V

    .line 3
    invoke-static {p3, v0}, Lcom/google/android/gms/internal/ads/zzfwi;->zzc(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzfuf;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 2
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfvu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfvu;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfvv;->zza:Lcom/google/android/gms/internal/ads/zzfwb;

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfvv;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfvv;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static zzi()Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfvv;->zza:Lcom/google/android/gms/internal/ads/zzfwb;

    return-object v0
.end method

.method public static zzj(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfwr;

    .line 2
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfwr;-><init>(Ljava/util/concurrent/Callable;)V

    .line 3
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static zzk(Lcom/google/android/gms/internal/ads/zzfux;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfwr;

    .line 2
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfwr;-><init>(Lcom/google/android/gms/internal/ads/zzfux;)V

    .line 3
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzfun;->zzc:I

    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfum;

    .line 2
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzfum;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;)V

    .line 3
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/zzfwi;->zzc(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzfuf;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzfun;->zzc:I

    .line 4
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzful;

    .line 2
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzful;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;)V

    .line 3
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/zzfwi;->zzc(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzfuf;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static zzn(Lcom/google/android/gms/internal/ads/zzfwb;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzfwb;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzfwo;->zzg(Lcom/google/android/gms/internal/ads/zzfwb;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p0

    return-object p0
.end method

.method public static zzo(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfwt;->zza(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Future was expected to be done: %s"

    .line 3
    invoke-static {p0, v1}, Lcom/google/android/gms/internal/ads/zzfpo;->zzb(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static zzp(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfwt;->zza(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    invoke-virtual {p0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 3
    instance-of v0, p0, Ljava/lang/Error;

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfvg;

    .line 4
    check-cast p0, Ljava/lang/Error;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfvg;-><init>(Ljava/lang/Error;)V

    throw v0

    .line 1
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfws;

    .line 5
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfws;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static zzq(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfvo;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzfvo;-><init>(Ljava/util/concurrent/Future;Lcom/google/android/gms/internal/ads/zzfvn;)V

    .line 1
    invoke-interface {p0, v0, p2}, Lcom/google/android/gms/internal/ads/zzfwb;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
