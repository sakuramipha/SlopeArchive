.class final Lcom/google/android/gms/internal/ads/zzfia;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfif;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfif;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfia;->zza:Lcom/google/android/gms/internal/ads/zzfif;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfia;->zza:Lcom/google/android/gms/internal/ads/zzfif;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfif;->zzc(Lcom/google/android/gms/internal/ads/zzfif;)Lcom/google/android/gms/internal/ads/zzfhz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfhz;->zzb()V

    return-void
.end method
