.class public final synthetic Lcom/google/android/gms/internal/ads/zzedw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfon;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzedy;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcfb;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzezf;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzddq;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzedy;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzddq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedw;->zza:Lcom/google/android/gms/internal/ads/zzedy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzedw;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzedw;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzedw;->zzd:Lcom/google/android/gms/internal/ads/zzddq;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzedw;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedw;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzedw;->zzd:Lcom/google/android/gms/internal/ads/zzddq;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzN:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzae()V

    .line 3
    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzY()V

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->onPause()V

    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzddq;->zzg()Lcom/google/android/gms/internal/ads/zzddp;

    move-result-object p1

    return-object p1
.end method
