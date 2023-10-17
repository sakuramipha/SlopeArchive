.class final Lcom/google/android/gms/internal/ads/zzgcx;
.super Lcom/google/android/gms/internal/ads/zzgda;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzgcy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgmu;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgcy;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgcx;->zza:Lcom/google/android/gms/internal/ads/zzgcy;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzgda;-><init>(Lcom/google/android/gms/internal/ads/zzgmu;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgcz;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgen;Lcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzfxb;
    .locals 1
    .param p2    # Lcom/google/android/gms/internal/ads/zzfye;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgcx;->zza:Lcom/google/android/gms/internal/ads/zzgcy;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzgcy;->zza(Lcom/google/android/gms/internal/ads/zzgen;Lcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzfxb;

    move-result-object p1

    return-object p1
.end method
