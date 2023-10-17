.class public final synthetic Lcom/google/android/gms/internal/ads/zzely;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeqp;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzelz;

.field public final synthetic zzb:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzelz;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzely;->zza:Lcom/google/android/gms/internal/ads/zzelz;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzely;->zzb:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final zzh(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzely;->zza:Lcom/google/android/gms/internal/ads/zzelz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzely;->zzb:Landroid/os/Bundle;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzelz;->zzc(Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void
.end method
