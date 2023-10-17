.class public final Lcom/google/android/gms/internal/ads/zzfwz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public static zza(Lcom/google/android/gms/internal/ads/zzfwx;)Lcom/google/android/gms/internal/ads/zzfxp;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfwx;->zza()Lcom/google/android/gms/internal/ads/zzgkh;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfxp;->zza(Lcom/google/android/gms/internal/ads/zzgkh;)Lcom/google/android/gms/internal/ads/zzfxp;

    move-result-object p0

    return-object p0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzfxp;Lcom/google/android/gms/internal/ads/zzfwy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfxp;->zzd()Lcom/google/android/gms/internal/ads/zzgkh;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzfwy;->zza(Lcom/google/android/gms/internal/ads/zzgkh;)V

    return-void
.end method
