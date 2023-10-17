.class public final Lcom/google/android/gms/internal/ads/zzfhm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfho;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfhn;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfho;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfho;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhm;->zza:Lcom/google/android/gms/internal/ads/zzfho;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfhn;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzfhn;-><init>(Lcom/google/android/gms/internal/ads/zzfhl;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfhm;->zzb:Lcom/google/android/gms/internal/ads/zzfhn;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfhl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhm;->zzb:Lcom/google/android/gms/internal/ads/zzfhn;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfhl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhm;->zza:Lcom/google/android/gms/internal/ads/zzfho;

    return-object v0
.end method
