.class abstract Lcom/google/android/gms/internal/ads/zzgpu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgpu;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgpu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgpq;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgpq;-><init>(Lcom/google/android/gms/internal/ads/zzgpp;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgpu;->zza:Lcom/google/android/gms/internal/ads/zzgpu;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgps;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgps;-><init>(Lcom/google/android/gms/internal/ads/zzgpr;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgpu;->zzb:Lcom/google/android/gms/internal/ads/zzgpu;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgpt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static zzd()Lcom/google/android/gms/internal/ads/zzgpu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgpu;->zza:Lcom/google/android/gms/internal/ads/zzgpu;

    return-object v0
.end method

.method static zze()Lcom/google/android/gms/internal/ads/zzgpu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgpu;->zzb:Lcom/google/android/gms/internal/ads/zzgpu;

    return-object v0
.end method


# virtual methods
.method abstract zza(Ljava/lang/Object;J)Ljava/util/List;
.end method

.method abstract zzb(Ljava/lang/Object;J)V
.end method

.method abstract zzc(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
