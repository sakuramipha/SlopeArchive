.class public final synthetic Lcom/google/android/gms/internal/ads/zzeoj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeom;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeol;

.field public final synthetic zzb:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeol;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeoj;->zza:Lcom/google/android/gms/internal/ads/zzeol;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeoj;->zzb:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final zzh(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeoj;->zza:Lcom/google/android/gms/internal/ads/zzeol;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeoj;->zzb:Ljava/util/ArrayList;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzeol;->zzd(Ljava/util/ArrayList;Landroid/os/Bundle;)V

    return-void
.end method
