.class public final synthetic Lcom/google/android/gms/internal/ads/zzip;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzel;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzky;

.field public final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzky;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzip;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzip;->zzb:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzip;->zza:Lcom/google/android/gms/internal/ads/zzky;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzip;->zzb:I

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcn;

    sget v2, Lcom/google/android/gms/internal/ads/zzjt;->zzd:I

    .line 1
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzky;->zzl:Z

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzcn;->zzh(ZI)V

    return-void
.end method
