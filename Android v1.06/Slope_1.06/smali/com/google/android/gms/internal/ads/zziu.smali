.class public final synthetic Lcom/google/android/gms/internal/ads/zziu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzel;


# instance fields
.field public final synthetic zza:I

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcp;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcp;


# direct methods
.method public synthetic constructor <init>(ILcom/google/android/gms/internal/ads/zzcp;Lcom/google/android/gms/internal/ads/zzcp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zziu;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zziu;->zzb:Lcom/google/android/gms/internal/ads/zzcp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zziu;->zzc:Lcom/google/android/gms/internal/ads/zzcp;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zza:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzb:Lcom/google/android/gms/internal/ads/zzcp;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zziu;->zzc:Lcom/google/android/gms/internal/ads/zzcp;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcn;

    sget v3, Lcom/google/android/gms/internal/ads/zzjt;->zzd:I

    .line 1
    invoke-interface {p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcn;->zzo(Lcom/google/android/gms/internal/ads/zzcp;Lcom/google/android/gms/internal/ads/zzcp;I)V

    return-void
.end method
