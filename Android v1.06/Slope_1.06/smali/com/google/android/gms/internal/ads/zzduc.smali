.class public final synthetic Lcom/google/android/gms/internal/ads/zzduc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfuy;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdud;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbug;

.field public final synthetic zzc:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdud;Lcom/google/android/gms/internal/ads/zzbug;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzduc;->zza:Lcom/google/android/gms/internal/ads/zzdud;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzduc;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzduc;->zzc:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzduc;->zza:Lcom/google/android/gms/internal/ads/zzdud;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzduc;->zzb:Lcom/google/android/gms/internal/ads/zzbug;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzduc;->zzc:I

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdwc;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzdud;->zza(Lcom/google/android/gms/internal/ads/zzbug;ILcom/google/android/gms/internal/ads/zzdwc;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
