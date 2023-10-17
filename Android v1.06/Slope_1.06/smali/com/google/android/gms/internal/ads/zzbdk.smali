.class public final Lcom/google/android/gms/internal/ads/zzbdk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzbcp;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzbcp;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzbcp;

.field public static final zzd:Lcom/google/android/gms/internal/ads/zzbcp;

.field public static final zze:Lcom/google/android/gms/internal/ads/zzbcp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "gads:separate_url_generation:enabled"

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:invoke_leibniz:enabled"

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zzb:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:google_ad_request_domains"

    const-string v1, "googleads.g.doubleclick.net;pubads.g.doubleclick.net"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:url_cache:max_size"

    const-wide/16 v1, 0xc8

    .line 3
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbcp;->zzb(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zzd:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:use_request_id_as_url_cache_key:enabled"

    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdk;->zze:Lcom/google/android/gms/internal/ads/zzbcp;

    return-void
.end method
