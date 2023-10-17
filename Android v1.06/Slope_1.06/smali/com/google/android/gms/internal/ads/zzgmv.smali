.class public final Lcom/google/android/gms/internal/ads/zzgmv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgmu;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzgmu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgmv;->zza:Lcom/google/android/gms/internal/ads/zzgmu;

    return-void
.end method

.method public static zzb([BLcom/google/android/gms/internal/ads/zzfye;)Lcom/google/android/gms/internal/ads/zzgmv;
    .locals 0

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgmv;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgmu;->zzb([B)Lcom/google/android/gms/internal/ads/zzgmu;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzgmv;-><init>(Lcom/google/android/gms/internal/ads/zzgmu;)V

    return-object p1
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgmv;->zza:Lcom/google/android/gms/internal/ads/zzgmu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgmu;->zza()I

    move-result v0

    return v0
.end method
