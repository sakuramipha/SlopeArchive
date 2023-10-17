.class public final synthetic Lcom/google/android/gms/internal/ads/zzcsf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzcsm;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzfwb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcsm;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zza:Lcom/google/android/gms/internal/ads/zzcsm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zzd:Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zza:Lcom/google/android/gms/internal/ads/zzcsm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcsf;->zzd:Lcom/google/android/gms/internal/ads/zzfwb;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcsm;->zzg(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0
.end method
