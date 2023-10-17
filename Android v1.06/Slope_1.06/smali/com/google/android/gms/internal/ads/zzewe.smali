.class public final synthetic Lcom/google/android/gms/internal/ads/zzewe;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfuy;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzewi;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcup;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzewi;Lcom/google/android/gms/internal/ads/zzcup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzewe;->zza:Lcom/google/android/gms/internal/ads/zzewi;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzewe;->zzb:Lcom/google/android/gms/internal/ads/zzcup;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewe;->zza:Lcom/google/android/gms/internal/ads/zzewi;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzewe;->zzb:Lcom/google/android/gms/internal/ads/zzcup;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzewr;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzewi;->zza(Lcom/google/android/gms/internal/ads/zzcup;Lcom/google/android/gms/internal/ads/zzewr;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
