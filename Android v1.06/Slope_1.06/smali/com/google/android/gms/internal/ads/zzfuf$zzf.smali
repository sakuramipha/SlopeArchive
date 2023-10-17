.class final Lcom/google/android/gms/internal/ads/zzfuf$zzf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzfuf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzfuf<",
            "TV;>;"
        }
    .end annotation
.end field

.field final zzb:Lcom/google/android/gms/internal/ads/zzfwb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzfwb<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfuf;Lcom/google/android/gms/internal/ads/zzfwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfuf$zzf;->zza:Lcom/google/android/gms/internal/ads/zzfuf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfuf$zzf;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfuf$zzf;->zza:Lcom/google/android/gms/internal/ads/zzfuf;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfuf;->zzk(Lcom/google/android/gms/internal/ads/zzfuf;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfuf$zzf;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfuf;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfuf;->zzh()Lcom/google/android/gms/internal/ads/zzfuf$zza;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfuf$zzf;->zza:Lcom/google/android/gms/internal/ads/zzfuf;

    .line 3
    invoke-virtual {v1, v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzfuf$zza;->zzf(Lcom/google/android/gms/internal/ads/zzfuf;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfuf$zzf;->zza:Lcom/google/android/gms/internal/ads/zzfuf;

    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfuf;->zzq(Lcom/google/android/gms/internal/ads/zzfuf;Z)V

    :cond_1
    return-void
.end method
