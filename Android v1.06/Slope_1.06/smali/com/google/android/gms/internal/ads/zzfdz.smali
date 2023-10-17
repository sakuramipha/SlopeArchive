.class public final synthetic Lcom/google/android/gms/internal/ads/zzfdz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdar;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfdi;

.field public final synthetic zzb:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfdi;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdz;->zza:Lcom/google/android/gms/internal/ads/zzfdi;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdz;->zzb:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdz;->zza:Lcom/google/android/gms/internal/ads/zzfdi;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfdz;->zzb:Ljava/lang/Throwable;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzfee;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfdi;->zza()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfdi;->zzb()Ljava/lang/String;

    move-result-object v0

    check-cast v2, Lcom/google/android/gms/internal/ads/zzfdx;

    .line 1
    invoke-interface {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfee;->zzbC(Lcom/google/android/gms/internal/ads/zzfdx;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
