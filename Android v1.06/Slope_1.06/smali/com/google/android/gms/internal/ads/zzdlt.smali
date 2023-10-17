.class final Lcom/google/android/gms/internal/ads/zzdlt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzezf;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzezi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdlz;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdlt;->zza:Lcom/google/android/gms/internal/ads/zzezf;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdlt;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcfb;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdlt;->zza:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdlt;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    .line 2
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzT(Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;)V

    return-void
.end method
