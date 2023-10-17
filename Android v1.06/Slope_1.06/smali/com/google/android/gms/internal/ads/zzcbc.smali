.class final Lcom/google/android/gms/internal/ads/zzcbc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:I

.field final synthetic zzb:I

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcbg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcbg;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbc;->zzc:Lcom/google/android/gms/internal/ads/zzcbg;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzcbc;->zza:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzcbc;->zzb:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbc;->zzc:Lcom/google/android/gms/internal/ads/zzcbg;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcbg;->zzi(Lcom/google/android/gms/internal/ads/zzcbg;)Lcom/google/android/gms/internal/ads/zzcbh;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcbg;->zzi(Lcom/google/android/gms/internal/ads/zzcbg;)Lcom/google/android/gms/internal/ads/zzcbh;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcbc;->zza:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzcbc;->zzb:I

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcbh;->zzj(II)V

    :cond_0
    return-void
.end method
