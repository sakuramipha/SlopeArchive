.class final Lcom/google/android/gms/internal/ads/zzblm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbii;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbln;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzbii;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbln;Lcom/google/android/gms/internal/ads/zzbii;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzblm;->zza:Lcom/google/android/gms/internal/ads/zzbln;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzblm;->zzb:Lcom/google/android/gms/internal/ads/zzbii;

    return-void
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzblm;)Lcom/google/android/gms/internal/ads/zzbii;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzblm;->zzb:Lcom/google/android/gms/internal/ads/zzbii;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcfb;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzblm;->zzb:Lcom/google/android/gms/internal/ads/zzbii;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblm;->zza:Lcom/google/android/gms/internal/ads/zzbln;

    .line 2
    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzbii;->zza(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
