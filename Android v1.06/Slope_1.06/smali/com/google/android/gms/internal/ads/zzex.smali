.class public final synthetic Lcom/google/android/gms/internal/ads/zzex;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfb;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzxn;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfb;Lcom/google/android/gms/internal/ads/zzxn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzex;->zza:Lcom/google/android/gms/internal/ads/zzfb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzex;->zzb:Lcom/google/android/gms/internal/ads/zzxn;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzex;->zza:Lcom/google/android/gms/internal/ads/zzfb;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzex;->zzb:Lcom/google/android/gms/internal/ads/zzxn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfb;->zza()I

    move-result v0

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzxn;->zza:Lcom/google/android/gms/internal/ads/zzxp;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzxp;->zzh(Lcom/google/android/gms/internal/ads/zzxp;I)V

    return-void
.end method
