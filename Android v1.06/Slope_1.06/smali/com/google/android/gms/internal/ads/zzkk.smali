.class public final synthetic Lcom/google/android/gms/internal/ads/zzkk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzkl;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfro;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zztl;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzkl;Lcom/google/android/gms/internal/ads/zzfro;Lcom/google/android/gms/internal/ads/zztl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzkk;->zza:Lcom/google/android/gms/internal/ads/zzkl;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzkk;->zzb:Lcom/google/android/gms/internal/ads/zzfro;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzkk;->zzc:Lcom/google/android/gms/internal/ads/zztl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzkk;->zza:Lcom/google/android/gms/internal/ads/zzkl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzkk;->zzb:Lcom/google/android/gms/internal/ads/zzfro;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzkk;->zzc:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzkl;->zzj(Lcom/google/android/gms/internal/ads/zzfro;Lcom/google/android/gms/internal/ads/zztl;)V

    return-void
.end method
