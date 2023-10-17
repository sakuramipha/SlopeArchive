.class public final synthetic Lcom/google/android/gms/internal/ads/zzffs;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfft;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzffj;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfft;Lcom/google/android/gms/internal/ads/zzffj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzffs;->zza:Lcom/google/android/gms/internal/ads/zzfft;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzffs;->zzb:Lcom/google/android/gms/internal/ads/zzffj;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzffs;->zza:Lcom/google/android/gms/internal/ads/zzfft;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzffs;->zzb:Lcom/google/android/gms/internal/ads/zzffj;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfft;->zzc(Lcom/google/android/gms/internal/ads/zzffj;)V

    return-void
.end method
