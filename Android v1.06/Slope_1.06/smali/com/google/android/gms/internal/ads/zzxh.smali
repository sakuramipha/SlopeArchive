.class public final synthetic Lcom/google/android/gms/internal/ads/zzxh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzxi;

.field public final synthetic zzb:I

.field public final synthetic zzc:J

.field public final synthetic zzd:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzxi;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzxh;->zza:Lcom/google/android/gms/internal/ads/zzxi;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzxh;->zzb:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzxh;->zzc:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzxh;->zzd:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxh;->zza:Lcom/google/android/gms/internal/ads/zzxi;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzxh;->zzb:I

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzxh;->zzc:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzxh;->zzd:J

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzxi;->zzb(Lcom/google/android/gms/internal/ads/zzxi;)Lcom/google/android/gms/internal/ads/zzxk;

    move-result-object v1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzxk;->zzY(IJJ)V

    return-void
.end method
