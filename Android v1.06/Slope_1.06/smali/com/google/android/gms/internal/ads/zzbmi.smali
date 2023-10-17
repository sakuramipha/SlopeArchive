.class final Lcom/google/android/gms/internal/ads/zzbmi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcap;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbmj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbmj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbmi;->zza:Lcom/google/android/gms/internal/ads/zzbmj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzblf;

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zze:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbmh;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzbmh;-><init>(Lcom/google/android/gms/internal/ads/zzbmi;Lcom/google/android/gms/internal/ads/zzblf;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzfwc;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
