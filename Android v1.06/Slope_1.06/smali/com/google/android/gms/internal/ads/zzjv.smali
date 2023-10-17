.class public final synthetic Lcom/google/android/gms/internal/ads/zzjv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzkd;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzlb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzkd;Lcom/google/android/gms/internal/ads/zzlb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjv;->zza:Lcom/google/android/gms/internal/ads/zzkd;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzjv;->zzb:Lcom/google/android/gms/internal/ads/zzlb;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzjv;->zzb:Lcom/google/android/gms/internal/ads/zzlb;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzkd;->zzr(Lcom/google/android/gms/internal/ads/zzlb;)V

    return-void
.end method
