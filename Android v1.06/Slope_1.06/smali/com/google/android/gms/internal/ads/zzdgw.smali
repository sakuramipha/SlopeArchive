.class final Lcom/google/android/gms/internal/ads/zzdgw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdgx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzdgx;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgw;->zzb:Lcom/google/android/gms/internal/ads/zzdgx;

    const-string p1, "Google"

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgw;->zza:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcfb;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgw;->zzb:Lcom/google/android/gms/internal/ads/zzdgx;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzd(Lcom/google/android/gms/internal/ads/zzdgx;)Lcom/google/android/gms/internal/ads/zzdhc;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhc;->zzS(Lcom/google/android/gms/internal/ads/zzcfb;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgw;->zzb:Lcom/google/android/gms/internal/ads/zzdgx;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgw;->zza:Ljava/lang/String;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzdgx;->zzt(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgw;->zzb:Lcom/google/android/gms/internal/ads/zzdgx;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdgx;->zzf(Lcom/google/android/gms/internal/ads/zzdgx;)Lcom/google/android/gms/internal/ads/zzfwk;

    move-result-object p1

    .line 4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfwk;->zzd(Ljava/lang/Object;)Z

    return-void
.end method
