.class public final synthetic Lcom/google/android/gms/internal/ads/zzin;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzel;


# instance fields
.field public final synthetic zza:I

.field public final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzin;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzin;->zzb:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzin;->zza:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzin;->zzb:I

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcn;

    sget v2, Lcom/google/android/gms/internal/ads/zzjt;->zzd:I

    .line 1
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzcn;->zzr(II)V

    return-void
.end method
