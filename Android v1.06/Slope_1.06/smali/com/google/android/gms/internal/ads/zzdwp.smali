.class public final synthetic Lcom/google/android/gms/internal/ads/zzdwp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfux;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdws;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbto;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdws;Lcom/google/android/gms/internal/ads/zzbto;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdwp;->zza:Lcom/google/android/gms/internal/ads/zzdws;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdwp;->zzb:Lcom/google/android/gms/internal/ads/zzbto;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdwp;->zza:Lcom/google/android/gms/internal/ads/zzdws;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdwp;->zzb:Lcom/google/android/gms/internal/ads/zzbto;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdws;->zza(Lcom/google/android/gms/internal/ads/zzbto;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0
.end method
