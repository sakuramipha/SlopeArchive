.class public final Lcom/google/android/gms/internal/ads/zzgbx;
.super Lcom/google/android/gms/internal/ads/zzgdh;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/zzgef;

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgbv;

    const-class v2, Lcom/google/android/gms/internal/ads/zzfww;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzgbv;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/ads/zzgkv;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/zzgdh;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/ads/zzgef;)V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzgdg;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/ads/zzgky;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgbw;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzgbw;-><init>(Lcom/google/android/gms/internal/ads/zzgbx;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzgjt;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgjt;->zze:Lcom/google/android/gms/internal/ads/zzgjt;

    return-object v0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzgno;)Lcom/google/android/gms/internal/ads/zzgqg;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgpi;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoi;->zza()Lcom/google/android/gms/internal/ads/zzgoi;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzgkv;->zze(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzgkv;

    move-result-object p1

    return-object p1
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    return-object v0
.end method

.method public final bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzgqg;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgkv;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgkv;->zza()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzgms;->zzb(II)V

    return-void
.end method
