.class final Lcom/google/android/gms/internal/ads/zzgbv;
.super Lcom/google/android/gms/internal/ads/zzgef;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgef;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzgqg;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgkv;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgkv;->zzf()Lcom/google/android/gms/internal/ads/zzgky;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgky;->zzf()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfxr;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfxq;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfxq;->zzb()Lcom/google/android/gms/internal/ads/zzfww;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgbu;

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgkv;->zzf()Lcom/google/android/gms/internal/ads/zzgky;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgky;->zza()Lcom/google/android/gms/internal/ads/zzgjz;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzgbu;-><init>(Lcom/google/android/gms/internal/ads/zzgjz;Lcom/google/android/gms/internal/ads/zzfww;)V

    return-object v1
.end method
