.class public final Lcom/google/android/gms/internal/ads/zzdbe;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgvo;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdav;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdav;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdbe;->zza:Lcom/google/android/gms/internal/ads/zzdav;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdbe;->zza:Lcom/google/android/gms/internal/ads/zzdav;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdav;->zzg()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
