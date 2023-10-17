.class public final synthetic Lcom/google/android/gms/internal/ads/zzbxl;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbxy;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbxx;

.field public final synthetic zzc:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbxy;Lcom/google/android/gms/internal/ads/zzbxx;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbxl;->zza:Lcom/google/android/gms/internal/ads/zzbxy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbxl;->zzb:Lcom/google/android/gms/internal/ads/zzbxx;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbxl;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbxl;->zza:Lcom/google/android/gms/internal/ads/zzbxy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbxl;->zzb:Lcom/google/android/gms/internal/ads/zzbxx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbxl;->zzc:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbxy;->zzj(Lcom/google/android/gms/internal/ads/zzbxx;Ljava/lang/String;)V

    return-void
.end method
