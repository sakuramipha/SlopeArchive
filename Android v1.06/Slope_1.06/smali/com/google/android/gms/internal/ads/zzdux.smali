.class public final synthetic Lcom/google/android/gms/internal/ads/zzdux;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfuy;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzduy;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbug;

.field public final synthetic zzc:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzduy;Lcom/google/android/gms/internal/ads/zzbug;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdux;->zza:Lcom/google/android/gms/internal/ads/zzduy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdux;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzdux;->zzc:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdux;->zza:Lcom/google/android/gms/internal/ads/zzduy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdux;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzdux;->zzc:I

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzduy;->zza(Lcom/google/android/gms/internal/ads/zzbug;ILjava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
