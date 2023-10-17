.class final Lcom/google/android/gms/internal/ads/zzdtr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdtt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdtt;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdtr;->zzb:Lcom/google/android/gms/internal/ads/zzdtt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdtr;->zza:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdsn;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdsn;->zze()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdtr;->zzb:Lcom/google/android/gms/internal/ads/zzdtt;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdtt;->zzb(Lcom/google/android/gms/internal/ads/zzdtt;)Lcom/google/android/gms/internal/ads/zzdth;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdtr;->zza:Ljava/lang/String;

    .line 3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzdth;->zzk(Ljava/lang/String;)V

    return-void
.end method
