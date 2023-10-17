.class public final synthetic Lcom/google/android/gms/internal/ads/zzdrw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdse;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfff;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdse;Lcom/google/android/gms/internal/ads/zzfff;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdrw;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdrw;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdrw;->zza:Lcom/google/android/gms/internal/ads/zzdse;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdrw;->zzb:Lcom/google/android/gms/internal/ads/zzfff;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdse;->zzf(Lcom/google/android/gms/internal/ads/zzfff;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
