.class public final Lcom/google/android/gms/internal/ads/zzbdg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzbcp;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzbcp;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzbcp;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "gads:lite_sdk_retriever:adapter:enable"

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdg;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:lite_sdk_retriever:dynamite_version"

    const-wide/16 v2, 0x0

    .line 2
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbcp;->zzb(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdg;->zzb:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:lite_sdk_retriever:version_number:enable"

    .line 3
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdg;->zzc:Lcom/google/android/gms/internal/ads/zzbcp;

    return-void
.end method
