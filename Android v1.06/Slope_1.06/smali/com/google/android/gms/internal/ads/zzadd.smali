.class public final Lcom/google/android/gms/internal/ads/zzadd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaar;


# instance fields
.field private final zzb:J

.field private final zzc:Lcom/google/android/gms/internal/ads/zzaar;


# direct methods
.method public constructor <init>(JLcom/google/android/gms/internal/ads/zzaar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzadd;->zzb:J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzadd;->zzc:Lcom/google/android/gms/internal/ads/zzaar;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzadd;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzadd;->zzb:J

    return-wide v0
.end method


# virtual methods
.method public final zzC()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadd;->zzc:Lcom/google/android/gms/internal/ads/zzaar;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaar;->zzC()V

    return-void
.end method

.method public final zzN(Lcom/google/android/gms/internal/ads/zzabn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadd;->zzc:Lcom/google/android/gms/internal/ads/zzaar;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzadc;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzadc;-><init>(Lcom/google/android/gms/internal/ads/zzadd;Lcom/google/android/gms/internal/ads/zzabn;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzaar;->zzN(Lcom/google/android/gms/internal/ads/zzabn;)V

    return-void
.end method

.method public final zzv(II)Lcom/google/android/gms/internal/ads/zzabr;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadd;->zzc:Lcom/google/android/gms/internal/ads/zzaar;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object p1

    return-object p1
.end method
