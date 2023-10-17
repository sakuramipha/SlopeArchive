.class public final synthetic Lcom/google/android/gms/internal/ads/zzdxi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfon;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdxk;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbug;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdxk;Lcom/google/android/gms/internal/ads/zzbug;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdxi;->zza:Lcom/google/android/gms/internal/ads/zzdxk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdxi;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxi;->zza:Lcom/google/android/gms/internal/ads/zzdxk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdxi;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdyv;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzdxk;->zza(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzdyv;)Lcom/google/android/gms/internal/ads/zzbto;

    move-result-object p1

    return-object p1
.end method
