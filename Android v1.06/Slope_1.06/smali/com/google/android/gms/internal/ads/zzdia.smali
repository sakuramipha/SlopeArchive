.class public final synthetic Lcom/google/android/gms/internal/ads/zzdia;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdic;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdiy;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdic;Lcom/google/android/gms/internal/ads/zzdiy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdia;->zza:Lcom/google/android/gms/internal/ads/zzdic;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdia;->zzb:Lcom/google/android/gms/internal/ads/zzdiy;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdia;->zza:Lcom/google/android/gms/internal/ads/zzdic;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdia;->zzb:Lcom/google/android/gms/internal/ads/zzdiy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdic;->zzb(Lcom/google/android/gms/internal/ads/zzdiy;)V

    return-void
.end method
