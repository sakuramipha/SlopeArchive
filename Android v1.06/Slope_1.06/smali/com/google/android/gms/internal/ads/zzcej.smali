.class public final synthetic Lcom/google/android/gms/internal/ads/zzcej;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfw;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfw;

.field public final synthetic zzb:[B


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfw;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcej;->zza:Lcom/google/android/gms/internal/ads/zzfw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcej;->zzb:[B

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfx;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcej;->zza:Lcom/google/android/gms/internal/ads/zzfw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcej;->zzb:[B

    sget v2, Lcom/google/android/gms/internal/ads/zzceo;->zza:I

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfw;->zza()Lcom/google/android/gms/internal/ads/zzfx;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfs;

    .line 2
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/zzfs;-><init>([B)V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcec;

    .line 3
    array-length v1, v1

    invoke-direct {v3, v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;-><init>(Lcom/google/android/gms/internal/ads/zzfx;ILcom/google/android/gms/internal/ads/zzfx;)V

    return-object v3
.end method
