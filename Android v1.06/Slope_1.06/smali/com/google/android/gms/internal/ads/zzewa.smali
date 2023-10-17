.class final Lcom/google/android/gms/internal/ads/zzewa;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeww;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzeww;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzewa;->zza:Lcom/google/android/gms/internal/ads/zzeww;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfch;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzewb;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewa;->zza:Lcom/google/android/gms/internal/ads/zzeww;

    .line 2
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzewb;->zzb:Lcom/google/android/gms/internal/ads/zzewx;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzewb;->zza:Lcom/google/android/gms/internal/ads/zzewv;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzevx;

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzevx;->zzb(Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/internal/ads/zzewv;Lcom/google/android/gms/internal/ads/zzcup;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfbv;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewa;->zza:Lcom/google/android/gms/internal/ads/zzeww;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzevx;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzevx;->zza()Lcom/google/android/gms/internal/ads/zzcup;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/zzfbv;->zza:Lcom/google/android/gms/internal/ads/zzcup;

    return-void
.end method
