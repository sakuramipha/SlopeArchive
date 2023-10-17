.class final Lcom/google/android/gms/internal/ads/zzfds;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfdi;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfdu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfdu;Lcom/google/android/gms/internal/ads/zzfdi;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfds;->zzb:Lcom/google/android/gms/internal/ads/zzfdu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfds;->zza:Lcom/google/android/gms/internal/ads/zzfdi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfds;->zzb:Lcom/google/android/gms/internal/ads/zzfdu;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfdu;->zza:Lcom/google/android/gms/internal/ads/zzfdv;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfdv;->zzc(Lcom/google/android/gms/internal/ads/zzfdv;)Lcom/google/android/gms/internal/ads/zzfdw;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfds;->zza:Lcom/google/android/gms/internal/ads/zzfdi;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfdw;->zzb(Lcom/google/android/gms/internal/ads/zzfdi;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzb(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfds;->zzb:Lcom/google/android/gms/internal/ads/zzfdu;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfdu;->zza:Lcom/google/android/gms/internal/ads/zzfdv;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfdv;->zzc(Lcom/google/android/gms/internal/ads/zzfdv;)Lcom/google/android/gms/internal/ads/zzfdw;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfds;->zza:Lcom/google/android/gms/internal/ads/zzfdi;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzfdw;->zzd(Lcom/google/android/gms/internal/ads/zzfdi;)V

    return-void
.end method
