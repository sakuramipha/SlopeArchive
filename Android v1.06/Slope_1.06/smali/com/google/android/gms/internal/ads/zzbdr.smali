.class public final Lcom/google/android/gms/internal/ads/zzbdr;
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

    const-string v0, "gads:always_collect_trustless_token_at_native_side"

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdr;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:invalidate_token_at_refresh_start"

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdr;->zzb:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gms:expose_token_for_gma:enabled"

    const/4 v1, 0x1

    .line 3
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdr;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:timeout_for_trustless_token:millis"

    const-wide/16 v1, 0x7d0

    .line 4
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbcp;->zzb(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdr;->zzd:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:cached_token:ttl_millis"

    const-wide/32 v1, 0xa4cb80

    .line 5
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbcp;->zzb(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdr;->zze:Lcom/google/android/gms/internal/ads/zzbcp;

    return-void
.end method
