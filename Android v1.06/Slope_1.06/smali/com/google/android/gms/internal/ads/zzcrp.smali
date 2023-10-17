.class public final synthetic Lcom/google/android/gms/internal/ads/zzcrp;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfuy;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzcrt;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfvn;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfwb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcrt;Lcom/google/android/gms/internal/ads/zzfvn;Lcom/google/android/gms/internal/ads/zzfwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcrp;->zza:Lcom/google/android/gms/internal/ads/zzcrt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcrp;->zzb:Lcom/google/android/gms/internal/ads/zzfvn;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcrp;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcrp;->zza:Lcom/google/android/gms/internal/ads/zzcrt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcrp;->zzb:Lcom/google/android/gms/internal/ads/zzfvn;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcrp;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcrf;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzcrt;->zza(Lcom/google/android/gms/internal/ads/zzfvn;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzcrf;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
