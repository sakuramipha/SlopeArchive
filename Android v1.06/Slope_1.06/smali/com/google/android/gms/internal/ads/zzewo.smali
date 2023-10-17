.class final Lcom/google/android/gms/internal/ads/zzewo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfon;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzews;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzews;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzewo;->zza:Lcom/google/android/gms/internal/ads/zzews;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdwc;

    const-string v0, ""

    .line 2
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p1, "Failed to get a cache key, reverting to legacy flow."

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzewo;->zza:Lcom/google/android/gms/internal/ads/zzews;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzewr;

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzews;->zzb(Lcom/google/android/gms/internal/ads/zzews;)Lcom/google/android/gms/internal/ads/zzfbw;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/google/android/gms/internal/ads/zzewr;-><init>(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfbw;Lcom/google/android/gms/internal/ads/zzewq;)V

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzews;->zzd(Lcom/google/android/gms/internal/ads/zzews;Lcom/google/android/gms/internal/ads/zzewr;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzewo;->zza:Lcom/google/android/gms/internal/ads/zzews;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzews;->zza(Lcom/google/android/gms/internal/ads/zzews;)Lcom/google/android/gms/internal/ads/zzewr;

    move-result-object p1

    return-object p1
.end method
