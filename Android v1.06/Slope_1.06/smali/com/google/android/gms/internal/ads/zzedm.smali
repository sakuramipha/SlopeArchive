.class public final synthetic Lcom/google/android/gms/internal/ads/zzedm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzedp;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzezr;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzezf;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzedp;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedm;->zza:Lcom/google/android/gms/internal/ads/zzedp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzedm;->zzb:Lcom/google/android/gms/internal/ads/zzezr;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzedm;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedm;->zza:Lcom/google/android/gms/internal/ads/zzedp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzedm;->zzb:Lcom/google/android/gms/internal/ads/zzezr;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzedm;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzedp;->zzc(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;)Lcom/google/android/gms/internal/ads/zzcpd;

    move-result-object v0

    return-object v0
.end method
