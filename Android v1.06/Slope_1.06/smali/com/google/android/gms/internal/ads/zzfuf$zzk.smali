.class final Lcom/google/android/gms/internal/ads/zzfuf$zzk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field static final zza:Lcom/google/android/gms/internal/ads/zzfuf$zzk;


# instance fields
.field volatile next:Lcom/google/android/gms/internal/ads/zzfuf$zzk;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field volatile thread:Ljava/lang/Thread;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfuf$zzk;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfuf$zzk;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfuf$zzk;->zza:Lcom/google/android/gms/internal/ads/zzfuf$zzk;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfuf;->zzh()Lcom/google/android/gms/internal/ads/zzfuf$zza;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzfuf$zza;->zzd(Lcom/google/android/gms/internal/ads/zzfuf$zzk;Ljava/lang/Thread;)V

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
