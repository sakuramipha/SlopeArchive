.class final Lcom/google/android/gms/internal/ads/zzewb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfch;


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzewv;

.field public final zzb:Lcom/google/android/gms/internal/ads/zzewx;

.field public final zzc:Lcom/google/android/gms/ads/internal/client/zzl;

.field public final zzd:Ljava/lang/String;

.field public final zze:Ljava/util/concurrent/Executor;

.field public final zzf:Lcom/google/android/gms/ads/internal/client/zzw;

.field public final zzg:Lcom/google/android/gms/internal/ads/zzfbw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzewv;Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/util/concurrent/Executor;Lcom/google/android/gms/ads/internal/client/zzw;Lcom/google/android/gms/internal/ads/zzfbw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzewb;->zza:Lcom/google/android/gms/internal/ads/zzewv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzewb;->zzb:Lcom/google/android/gms/internal/ads/zzewx;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzewb;->zzc:Lcom/google/android/gms/ads/internal/client/zzl;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzewb;->zzd:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzewb;->zze:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzewb;->zzf:Lcom/google/android/gms/ads/internal/client/zzw;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzewb;->zzg:Lcom/google/android/gms/internal/ads/zzfbw;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfbw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewb;->zzg:Lcom/google/android/gms/internal/ads/zzfbw;

    return-object v0
.end method

.method public final zzb()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewb;->zze:Ljava/util/concurrent/Executor;

    return-object v0
.end method
