.class public final synthetic Lcom/google/android/gms/internal/ads/zzir;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzel;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzky;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzky;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzir;->zza:Lcom/google/android/gms/internal/ads/zzky;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzir;->zza:Lcom/google/android/gms/internal/ads/zzky;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcn;

    sget v1, Lcom/google/android/gms/internal/ads/zzjt;->zzd:I

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzky;->zzk()Z

    move-result v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzcn;->zze(Z)V

    return-void
.end method
