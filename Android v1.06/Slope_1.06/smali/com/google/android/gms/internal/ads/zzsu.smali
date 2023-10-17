.class public abstract Lcom/google/android/gms/internal/ads/zzsu;
.super Lcom/google/android/gms/internal/ads/zzsm;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Ljava/util/HashMap;

.field private zzb:Landroid/os/Handler;

.field private zzc:Lcom/google/android/gms/internal/ads/zzgz;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsm;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    .line 2
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method protected final zzA(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zztn;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzsr;

    .line 2
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzsr;-><init>(Lcom/google/android/gms/internal/ads/zzsu;Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzss;

    .line 3
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzss;-><init>(Lcom/google/android/gms/internal/ads/zzsu;Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzst;

    invoke-direct {v3, p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzst;-><init>(Lcom/google/android/gms/internal/ads/zztn;Lcom/google/android/gms/internal/ads/zztm;Lcom/google/android/gms/internal/ads/zzss;)V

    .line 4
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsu;->zzb:Landroid/os/Handler;

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-interface {p2, p1, v1}, Lcom/google/android/gms/internal/ads/zztn;->zzh(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zztv;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsu;->zzb:Landroid/os/Handler;

    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-interface {p2, p1, v1}, Lcom/google/android/gms/internal/ads/zztn;->zzg(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzqm;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsu;->zzc:Lcom/google/android/gms/internal/ads/zzgz;

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsm;->zzb()Lcom/google/android/gms/internal/ads/zzof;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lcom/google/android/gms/internal/ads/zztn;->zzm(Lcom/google/android/gms/internal/ads/zztm;Lcom/google/android/gms/internal/ads/zzgz;Lcom/google/android/gms/internal/ads/zzof;)V

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsm;->zzt()Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/zztn;->zzi(Lcom/google/android/gms/internal/ads/zztm;)V

    :cond_0
    return-void
.end method

.method protected final zzj()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzst;

    .line 2
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzst;->zza:Lcom/google/android/gms/internal/ads/zztn;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzst;->zzb:Lcom/google/android/gms/internal/ads/zztm;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zztn;->zzi(Lcom/google/android/gms/internal/ads/zztm;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final zzl()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzst;

    .line 2
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzst;->zza:Lcom/google/android/gms/internal/ads/zztn;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzst;->zzb:Lcom/google/android/gms/internal/ads/zztm;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zztn;->zzk(Lcom/google/android/gms/internal/ads/zztm;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected zzn(Lcom/google/android/gms/internal/ads/zzgz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsu;->zzc:Lcom/google/android/gms/internal/ads/zzgz;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfn;->zzs(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsu;->zzb:Landroid/os/Handler;

    return-void
.end method

.method protected zzq()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzst;

    .line 2
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzst;->zza:Lcom/google/android/gms/internal/ads/zztn;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzst;->zzb:Lcom/google/android/gms/internal/ads/zztm;

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zztn;->zzp(Lcom/google/android/gms/internal/ads/zztm;)V

    .line 3
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzst;->zza:Lcom/google/android/gms/internal/ads/zztn;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzst;->zzc:Lcom/google/android/gms/internal/ads/zzss;

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zztn;->zzs(Lcom/google/android/gms/internal/ads/zztv;)V

    .line 4
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzst;->zza:Lcom/google/android/gms/internal/ads/zztn;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzst;->zzc:Lcom/google/android/gms/internal/ads/zzss;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zztn;->zzr(Lcom/google/android/gms/internal/ads/zzqm;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method protected zzv(Ljava/lang/Object;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected zzw(Ljava/lang/Object;J)J
    .locals 0

    return-wide p2
.end method

.method protected zzx(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zztl;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public zzy()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsu;->zza:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzst;

    .line 2
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzst;->zza:Lcom/google/android/gms/internal/ads/zztn;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zztn;->zzy()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected abstract zzz(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zztn;Lcom/google/android/gms/internal/ads/zzcx;)V
.end method
