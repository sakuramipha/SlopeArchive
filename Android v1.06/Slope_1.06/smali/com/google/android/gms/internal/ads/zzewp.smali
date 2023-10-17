.class final Lcom/google/android/gms/internal/ads/zzewp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfon;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzews;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzews;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzewp;->zza:Lcom/google/android/gms/internal/ads/zzews;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbug;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewp;->zza:Lcom/google/android/gms/internal/ads/zzews;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzewr;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfby;

    .line 2
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzj:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzfby;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzewr;-><init>(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfbw;Lcom/google/android/gms/internal/ads/zzewq;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzews;->zzd(Lcom/google/android/gms/internal/ads/zzews;Lcom/google/android/gms/internal/ads/zzewr;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzewp;->zza:Lcom/google/android/gms/internal/ads/zzews;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzews;->zza(Lcom/google/android/gms/internal/ads/zzews;)Lcom/google/android/gms/internal/ads/zzewr;

    move-result-object p1

    return-object p1
.end method
