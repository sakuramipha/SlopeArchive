.class public final synthetic Lcom/google/android/gms/internal/ads/zzdvx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfuy;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzgwb;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbug;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzbug;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdvx;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdvx;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdvx;->zza:Lcom/google/android/gms/internal/ads/zzgwb;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdvx;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdtz;

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdwb;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzdwb;->zzb(Lcom/google/android/gms/internal/ads/zzbug;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
