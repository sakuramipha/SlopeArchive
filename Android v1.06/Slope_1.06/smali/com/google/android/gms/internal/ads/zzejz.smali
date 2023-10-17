.class public final synthetic Lcom/google/android/gms/internal/ads/zzejz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzekb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzekb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzejz;->zza:Lcom/google/android/gms/internal/ads/zzekb;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejz;->zza:Lcom/google/android/gms/internal/ads/zzekb;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzekb;->zze:Lcom/google/android/gms/internal/ads/zzekc;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzekc;->zzd(Lcom/google/android/gms/internal/ads/zzekc;)Lcom/google/android/gms/internal/ads/zzejs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzejs;->zzb()Lcom/google/android/gms/internal/ads/zzcww;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcww;->zzn()V

    return-void
.end method
