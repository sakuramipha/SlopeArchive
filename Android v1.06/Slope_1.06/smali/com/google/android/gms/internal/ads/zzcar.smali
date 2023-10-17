.class final Lcom/google/android/gms/internal/ads/zzcar;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzcap;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcan;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcas;Lcom/google/android/gms/internal/ads/zzcap;Lcom/google/android/gms/internal/ads/zzcan;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcar;->zza:Lcom/google/android/gms/internal/ads/zzcap;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcar;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcar;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcan;->zza()V

    return-void
.end method

.method public final zzb(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcar;->zza:Lcom/google/android/gms/internal/ads/zzcap;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzcap;->zza(Ljava/lang/Object;)V

    return-void
.end method
