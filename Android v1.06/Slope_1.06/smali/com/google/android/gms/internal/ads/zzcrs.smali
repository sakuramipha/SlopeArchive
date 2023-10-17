.class final Lcom/google/android/gms/internal/ads/zzcrs;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfvn;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcrt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcrt;Lcom/google/android/gms/internal/ads/zzfvn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcrs;->zzb:Lcom/google/android/gms/internal/ads/zzcrt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcrs;->zza:Lcom/google/android/gms/internal/ads/zzfvn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcrs;->zzb:Lcom/google/android/gms/internal/ads/zzcrt;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcrt;->zzc(Lcom/google/android/gms/internal/ads/zzcrt;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcrs;->zza:Lcom/google/android/gms/internal/ads/zzfvn;

    .line 2
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfvn;->zza(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcrf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcrs;->zzb:Lcom/google/android/gms/internal/ads/zzcrt;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcrt;->zzc(Lcom/google/android/gms/internal/ads/zzcrt;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcrs;->zza:Lcom/google/android/gms/internal/ads/zzfvn;

    .line 3
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfvn;->zzb(Ljava/lang/Object;)V

    return-void
.end method
