.class public final Lcom/google/android/gms/internal/ads/zzx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zza:I

.field private zzb:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzx;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzx;->zzb:I

    return p0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzx;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzx;->zza:I

    return p0
.end method


# virtual methods
.method public final zzc(I)Lcom/google/android/gms/internal/ads/zzx;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzx;->zzb:I

    return-object p0
.end method

.method public final zzd(I)Lcom/google/android/gms/internal/ads/zzx;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzx;->zza:I

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzz;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzx;->zza:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzx;->zzb:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzd(Z)V

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzz;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzz;-><init>(Lcom/google/android/gms/internal/ads/zzx;Lcom/google/android/gms/internal/ads/zzy;)V

    return-object v0
.end method
