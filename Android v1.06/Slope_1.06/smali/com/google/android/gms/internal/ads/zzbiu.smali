.class final Lcom/google/android/gms/internal/ads/zzbiu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbiv;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzcal;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbiw;Lcom/google/android/gms/internal/ads/zzcal;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbiu;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbiu;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbmn;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzbmn;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcal;->zze(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final zzb(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbiu;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcal;->zzd(Ljava/lang/Object;)Z

    return-void
.end method
