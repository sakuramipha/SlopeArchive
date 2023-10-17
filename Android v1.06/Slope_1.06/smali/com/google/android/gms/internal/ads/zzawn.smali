.class final Lcom/google/android/gms/internal/ads/zzawn;
.super Lcom/google/android/gms/internal/ads/zzcal;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzawt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzawt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzawn;->zza:Lcom/google/android/gms/internal/ads/zzawt;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzawn;->zza:Lcom/google/android/gms/internal/ads/zzawt;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzawt;->zze(Lcom/google/android/gms/internal/ads/zzawt;)V

    .line 2
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzcal;->cancel(Z)Z

    move-result p1

    return p1
.end method
