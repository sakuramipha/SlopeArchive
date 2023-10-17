.class public final Lcom/google/android/gms/internal/ads/zzfvq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Z

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfrr;


# direct methods
.method synthetic constructor <init>(ZLcom/google/android/gms/internal/ads/zzfrr;Lcom/google/android/gms/internal/ads/zzfvp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfvq;->zza:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfvq;->zzb:Lcom/google/android/gms/internal/ads/zzfrr;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfve;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfvq;->zzb:Lcom/google/android/gms/internal/ads/zzfrr;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzfvq;->zza:Z

    invoke-direct {v0, v1, v2, p2, p1}, Lcom/google/android/gms/internal/ads/zzfve;-><init>(Lcom/google/android/gms/internal/ads/zzfrm;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method
