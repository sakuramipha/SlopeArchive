.class public final Lcom/google/android/gms/internal/ads/zzdiz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcwc;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdhc;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdhh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdhc;Lcom/google/android/gms/internal/ads/zzdhh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdiz;->zza:Lcom/google/android/gms/internal/ads/zzdhc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdiz;->zzb:Lcom/google/android/gms/internal/ads/zzdhh;

    return-void
.end method


# virtual methods
.method public final zzl()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdiz;->zza:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzt()Lcom/google/android/gms/internal/ads/zzfgo;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzq()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzr()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdiz;->zzb:Lcom/google/android/gms/internal/ads/zzdhh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhh;->zzd()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    new-instance v0, Landroidx/collection/ArrayMap;

    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcfb;->zzd(Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return-void
.end method
