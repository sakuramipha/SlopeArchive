.class final Lcom/google/android/gms/internal/ads/zzbna;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcan;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzcal;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbme;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbnc;Lcom/google/android/gms/internal/ads/zzcal;Lcom/google/android/gms/internal/ads/zzbme;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbna;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbna;->zzb:Lcom/google/android/gms/internal/ads/zzbme;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbna;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbmn;

    const-string v2, "Unable to obtain a JavascriptEngine."

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzbmn;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcal;->zze(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbna;->zzb:Lcom/google/android/gms/internal/ads/zzbme;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbme;->zzb()V

    return-void
.end method
