.class public final Lcom/google/android/gms/internal/ads/zzgvu;
.super Lcom/google/android/gms/internal/ads/zzgvj;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method synthetic constructor <init>(ILcom/google/android/gms/internal/ads/zzgvt;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgvj;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzgwb;)Lcom/google/android/gms/internal/ads/zzgvu;
    .locals 0

    const-string p1, "Network"

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzgvj;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzgwb;)Lcom/google/android/gms/internal/ads/zzgvj;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzgvv;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgvv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgvu;->zza:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgvv;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzgvt;)V

    return-object v0
.end method
