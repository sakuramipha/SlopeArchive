.class public final Lcom/google/android/gms/internal/ads/zzdzk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzdzk;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdzj;->zza()Lcom/google/android/gms/internal/ads/zzdzk;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdzl;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfdx;->zza:Lcom/google/android/gms/internal/ads/zzfdx;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzfdx;->zzd:Lcom/google/android/gms/internal/ads/zzfdx;

    const-string v3, "ttc"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzl;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfdx;Lcom/google/android/gms/internal/ads/zzfdx;)V

    return-object v0
.end method