.class final Lcom/google/android/gms/internal/ads/zzcrr;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcrr;->zzb:Lcom/google/android/gms/internal/ads/zzcrt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcrr;->zza:Lcom/google/android/gms/internal/ads/zzfvn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcrr;->zza:Lcom/google/android/gms/internal/ads/zzfvn;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfvn;->zza(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcrr;->zzb:Lcom/google/android/gms/internal/ads/zzcrt;

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcrt;->zzc(Lcom/google/android/gms/internal/ads/zzcrt;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcrm;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcrr;->zzb:Lcom/google/android/gms/internal/ads/zzcrt;

    .line 2
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzcrm;->zza:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcrr;->zza:Lcom/google/android/gms/internal/ads/zzfvn;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzcrt;->zzb(Lcom/google/android/gms/internal/ads/zzcrt;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzfvn;)V

    return-void
.end method
