.class public final Lcom/google/android/gms/internal/ads/zzdgd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdgb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdgb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgd;->zza:Lcom/google/android/gms/internal/ads/zzdgb;

    return-void
.end method


# virtual methods
.method public final zza()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgd;->zza:Lcom/google/android/gms/internal/ads/zzdgb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgb;->zzb()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgvw;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgd;->zza:Lcom/google/android/gms/internal/ads/zzdgb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgb;->zzb()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgvw;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
