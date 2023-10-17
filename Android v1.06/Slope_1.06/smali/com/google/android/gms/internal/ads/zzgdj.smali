.class public final Lcom/google/android/gms/internal/ads/zzgdj;
.super Lcom/google/android/gms/internal/ads/zzfxb;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgel;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgel;Lcom/google/android/gms/internal/ads/zzfye;)V
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
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfxb;-><init>()V

    sget-object p2, Lcom/google/android/gms/internal/ads/zzgdi;->zzb:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgel;->zzb()Lcom/google/android/gms/internal/ads/zzgjt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgjt;->ordinal()I

    move-result v0

    aget p2, p2, v0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgdj;->zza:Lcom/google/android/gms/internal/ads/zzgel;

    return-void
.end method
