.class public final synthetic Lcom/google/android/gms/internal/ads/zzeyo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeyp;

.field public final synthetic zzb:Lcom/google/android/gms/ads/internal/client/zze;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeyp;Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeyo;->zza:Lcom/google/android/gms/internal/ads/zzeyp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeyo;->zzb:Lcom/google/android/gms/ads/internal/client/zze;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeyo;->zza:Lcom/google/android/gms/internal/ads/zzeyp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeyo;->zzb:Lcom/google/android/gms/ads/internal/client/zze;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeyp;->zze:Lcom/google/android/gms/internal/ads/zzeys;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeys;->zzf(Lcom/google/android/gms/internal/ads/zzeys;)Lcom/google/android/gms/internal/ads/zzeyi;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeyi;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
