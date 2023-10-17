.class public final synthetic Lcom/google/android/gms/internal/ads/zzeqr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeqt;

.field public final synthetic zzb:J

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzeqq;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeqt;JLcom/google/android/gms/internal/ads/zzeqq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeqr;->zza:Lcom/google/android/gms/internal/ads/zzeqt;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzeqr;->zzb:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeqr;->zzc:Lcom/google/android/gms/internal/ads/zzeqq;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeqr;->zza:Lcom/google/android/gms/internal/ads/zzeqt;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzeqr;->zzb:J

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeqr;->zzc:Lcom/google/android/gms/internal/ads/zzeqq;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzeqt;->zzb(JLcom/google/android/gms/internal/ads/zzeqq;)V

    return-void
.end method
