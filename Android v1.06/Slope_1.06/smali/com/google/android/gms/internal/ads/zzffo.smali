.class final Lcom/google/android/gms/internal/ads/zzffo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzffq;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfff;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffo;->zza:Lcom/google/android/gms/internal/ads/zzffq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzffo;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffo;->zza:Lcom/google/android/gms/internal/ads/zzffq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzffo;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzfff;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfff;

    const/4 p1, 0x0

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/zzfff;->zzf(Z)Lcom/google/android/gms/internal/ads/zzfff;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzffq;->zza(Lcom/google/android/gms/internal/ads/zzfff;)Lcom/google/android/gms/internal/ads/zzffq;

    return-void
.end method

.method public final zzb(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
