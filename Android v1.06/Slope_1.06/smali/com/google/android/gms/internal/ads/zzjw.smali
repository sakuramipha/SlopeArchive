.class final Lcom/google/android/gms/internal/ads/zzjw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzld;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzkd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzkd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjw;->zza:Lcom/google/android/gms/internal/ads/zzkd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjw;->zza:Lcom/google/android/gms/internal/ads/zzkd;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzkd;->zzf(Lcom/google/android/gms/internal/ads/zzkd;Z)V

    return-void
.end method

.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjw;->zza:Lcom/google/android/gms/internal/ads/zzkd;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzkd;->zzc(Lcom/google/android/gms/internal/ads/zzkd;)Lcom/google/android/gms/internal/ads/zzei;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzei;->zzi(I)Z

    return-void
.end method
