.class public final synthetic Lcom/google/android/gms/internal/ads/zzjk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzel;


# instance fields
.field public final synthetic zza:I

.field public final synthetic zzb:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzjk;->zza:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzjk;->zzb:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzjk;->zza:I

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzjk;->zzb:Z

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcn;

    sget v2, Lcom/google/android/gms/internal/ads/zzjp;->zzb:I

    .line 1
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzcn;->zzc(IZ)V

    return-void
.end method
