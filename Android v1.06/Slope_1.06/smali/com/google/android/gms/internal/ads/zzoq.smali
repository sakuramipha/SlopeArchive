.class public final synthetic Lcom/google/android/gms/internal/ads/zzoq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzos;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzam;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzht;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzos;Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzht;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zza:Lcom/google/android/gms/internal/ads/zzos;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzb:Lcom/google/android/gms/internal/ads/zzam;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzc:Lcom/google/android/gms/internal/ads/zzht;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoq;->zza:Lcom/google/android/gms/internal/ads/zzos;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzb:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzoq;->zzc:Lcom/google/android/gms/internal/ads/zzht;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzos;->zzn(Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzht;)V

    return-void
.end method
