.class public final synthetic Lcom/google/android/gms/internal/ads/zzdxy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfwb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdxy;->zza:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdxy;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdxy;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxy;->zza:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdxy;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdxy;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzdyi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfwb;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzdyw;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzfwb;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzfwb;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzbuj;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdyi;-><init>(Lcom/google/android/gms/internal/ads/zzdyw;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzbuj;)V

    return-object v3
.end method
