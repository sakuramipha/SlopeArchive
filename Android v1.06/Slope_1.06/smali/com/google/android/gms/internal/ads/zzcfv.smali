.class public final synthetic Lcom/google/android/gms/internal/ads/zzcfv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzcfx;

.field public final synthetic zzb:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcfx;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcfv;->zza:Lcom/google/android/gms/internal/ads/zzcfx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcfv;->zzb:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcfv;->zza:Lcom/google/android/gms/internal/ads/zzcfx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcfv;->zzb:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcfx;->zzr(Ljava/util/Map;)V

    return-void
.end method
