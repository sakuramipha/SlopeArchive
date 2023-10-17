.class public final synthetic Lcom/google/android/gms/internal/ads/zzfeb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdar;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfdi;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfdi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfeb;->zza:Lcom/google/android/gms/internal/ads/zzfdi;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfeb;->zza:Lcom/google/android/gms/internal/ads/zzfdi;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzfee;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfdi;->zza()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfdi;->zzb()Ljava/lang/String;

    move-result-object v0

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfdx;

    .line 1
    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzfee;->zzd(Lcom/google/android/gms/internal/ads/zzfdx;Ljava/lang/String;)V

    return-void
.end method
