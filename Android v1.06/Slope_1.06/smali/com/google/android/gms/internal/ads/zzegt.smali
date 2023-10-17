.class public final Lcom/google/android/gms/internal/ads/zzegt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzebx;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzehx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzehx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzegt;->zza:Lcom/google/android/gms/internal/ads/zzehx;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzeby;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzfaf;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzegt;->zza:Lcom/google/android/gms/internal/ads/zzehx;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzehx;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbpv;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzedr;

    .line 2
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzedr;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzeby;

    invoke-direct {v1, p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzeby;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcws;Ljava/lang/String;)V

    return-object v1
.end method
