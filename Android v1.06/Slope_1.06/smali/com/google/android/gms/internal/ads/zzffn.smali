.class final Lcom/google/android/gms/internal/ads/zzffn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzffq;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfff;

.field final synthetic zzc:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffn;->zza:Lcom/google/android/gms/internal/ads/zzffq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzffn;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzffn;->zzc:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffn;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfff;->zzj()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzffn;->zza:Lcom/google/android/gms/internal/ads/zzffq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfff;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfff;

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzffq;->zza(Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzffq;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzffn;->zzc:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzffn;->zza:Lcom/google/android/gms/internal/ads/zzffq;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffq;->zzg()V

    :cond_0
    return-void
.end method

.method public final zzb(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzffn;->zza:Lcom/google/android/gms/internal/ads/zzffq;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffn;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzffq;->zza(Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzffq;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzffn;->zzc:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzffn;->zza:Lcom/google/android/gms/internal/ads/zzffq;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzffq;->zzg()V

    :cond_0
    return-void
.end method
