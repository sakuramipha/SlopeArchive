.class public final Lcom/google/android/gms/internal/ads/zzsy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zztx;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzsx;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaav;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgd;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzgd;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsy;->zzd:Lcom/google/android/gms/internal/ads/zzfw;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzsx;

    .line 2
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzsx;-><init>(Lcom/google/android/gms/internal/ads/zzaav;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsy;->zzc:Lcom/google/android/gms/internal/ads/zzsx;

    .line 3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzsx;->zza(Lcom/google/android/gms/internal/ads/zzfw;)V

    return-void
.end method
