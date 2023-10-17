.class public final Lcom/google/android/gms/internal/ads/zzeei;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzebx;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdnx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdnx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeei;->zza:Lcom/google/android/gms/internal/ads/zzdnx;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeei;->zza:Lcom/google/android/gms/internal/ads/zzdnx;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdnx;->zzc(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzfav;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzedr;

    .line 2
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzedr;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzeby;

    invoke-direct {v1, p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzeby;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcws;Ljava/lang/String;)V

    return-object v1
.end method
