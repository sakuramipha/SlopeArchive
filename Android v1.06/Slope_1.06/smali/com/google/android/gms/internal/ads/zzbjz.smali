.class final Lcom/google/android/gms/internal/ads/zzbjz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfuy;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbjr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbkd;Lcom/google/android/gms/internal/ads/zzbjr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbjz;->zza:Lcom/google/android/gms/internal/ads/zzbjr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbjx;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcal;

    .line 2
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbjz;->zza:Lcom/google/android/gms/internal/ads/zzbjr;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzbjy;

    .line 3
    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzbjy;-><init>(Lcom/google/android/gms/internal/ads/zzbjz;Lcom/google/android/gms/internal/ads/zzcal;)V

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzbjx;->zze(Lcom/google/android/gms/internal/ads/zzbjr;Lcom/google/android/gms/internal/ads/zzbjw;)V

    return-object v0
.end method
