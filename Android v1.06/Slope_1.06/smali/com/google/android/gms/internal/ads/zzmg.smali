.class public final synthetic Lcom/google/android/gms/internal/ads/zzmg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzel;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzlt;

.field public final synthetic zzb:I

.field public final synthetic zzc:J

.field public final synthetic zzd:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzlt;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzmg;->zza:Lcom/google/android/gms/internal/ads/zzlt;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzb:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzc:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzd:J

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 7

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzmg;->zza:Lcom/google/android/gms/internal/ads/zzlt;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzb:I

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzc:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzd:J

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzlv;

    .line 1
    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzlv;->zzf(Lcom/google/android/gms/internal/ads/zzlt;IJJ)V

    return-void
.end method
