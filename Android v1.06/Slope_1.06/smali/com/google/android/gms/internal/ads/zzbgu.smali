.class final Lcom/google/android/gms/internal/ads/zzbgu;
.super Lcom/google/android/gms/internal/ads/zzbfw;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbgv;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbgv;Lcom/google/android/gms/internal/ads/zzbgt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgu;->zza:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbfw;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze(Lcom/google/android/gms/internal/ads/zzbfk;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgu;->zza:Lcom/google/android/gms/internal/ads/zzbgv;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgv;->zzb(Lcom/google/android/gms/internal/ads/zzbgv;)Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener;

    move-result-object v1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzbgv;->zzc(Lcom/google/android/gms/internal/ads/zzbgv;Lcom/google/android/gms/internal/ads/zzbfk;)Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener;->onCustomTemplateAdLoaded(Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;)V

    return-void
.end method
