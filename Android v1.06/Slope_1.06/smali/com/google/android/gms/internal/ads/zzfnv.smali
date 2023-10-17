.class final Lcom/google/android/gms/internal/ads/zzfnv;
.super Lcom/google/android/gms/internal/ads/zzfnp;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Landroid/os/IBinder;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfny;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfny;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zzb:Lcom/google/android/gms/internal/ads/zzfny;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zza:Landroid/os/IBinder;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfnp;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zzb:Lcom/google/android/gms/internal/ads/zzfny;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfny;->zza:Lcom/google/android/gms/internal/ads/zzfnz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zza:Landroid/os/IBinder;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfnk;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzfnl;

    move-result-object v1

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfnz;->zzm(Lcom/google/android/gms/internal/ads/zzfnz;Landroid/os/IInterface;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zzb:Lcom/google/android/gms/internal/ads/zzfny;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfny;->zza:Lcom/google/android/gms/internal/ads/zzfnz;

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfnz;->zzq(Lcom/google/android/gms/internal/ads/zzfnz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zzb:Lcom/google/android/gms/internal/ads/zzfny;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfny;->zza:Lcom/google/android/gms/internal/ads/zzfnz;

    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfnz;->zzl(Lcom/google/android/gms/internal/ads/zzfnz;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zzb:Lcom/google/android/gms/internal/ads/zzfny;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfny;->zza:Lcom/google/android/gms/internal/ads/zzfnz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfnz;->zzh(Lcom/google/android/gms/internal/ads/zzfnz;)Ljava/util/List;

    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 6
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnv;->zzb:Lcom/google/android/gms/internal/ads/zzfny;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfny;->zza:Lcom/google/android/gms/internal/ads/zzfnz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfnz;->zzh(Lcom/google/android/gms/internal/ads/zzfnz;)Ljava/util/List;

    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
