.class public final Lcom/google/android/gms/internal/ads/zzbdi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzbcp;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzbcp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "gads:ad_key_enabled"

    const/4 v1, 0x1

    .line 1
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdi;->zza:Lcom/google/android/gms/internal/ads/zzbcp;

    const-string v0, "gads:adshield:enable_adshield_instrumentation"

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcp;->zzd(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbdi;->zzb:Lcom/google/android/gms/internal/ads/zzbcp;

    return-void
.end method
