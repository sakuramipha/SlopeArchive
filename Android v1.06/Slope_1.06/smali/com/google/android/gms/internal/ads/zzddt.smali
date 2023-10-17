.class public Lcom/google/android/gms/internal/ads/zzddt;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdey;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcfb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdey;Lcom/google/android/gms/internal/ads/zzcfb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzddt;->zza:Lcom/google/android/gms/internal/ads/zzdey;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzddt;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    return-void
.end method

.method public static final zzh(Lcom/google/android/gms/internal/ads/zzffc;)Lcom/google/android/gms/internal/ads/zzdco;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdco;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzdco;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static final zzi(Lcom/google/android/gms/internal/ads/zzdfd;)Lcom/google/android/gms/internal/ads/zzdco;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdco;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzdco;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzddt;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfb;->zzG()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzddt;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfb;->zzG()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzcfb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzddt;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    return-object v0
.end method

.method public final zzd(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdco;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzddt;->zzb:Lcom/google/android/gms/internal/ads/zzcfb;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdco;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzddr;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzddr;-><init>(Lcom/google/android/gms/internal/ads/zzcfb;)V

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzdco;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzdey;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzddt;->zza:Lcom/google/android/gms/internal/ads/zzdey;

    return-object v0
.end method

.method public zzf(Lcom/google/android/gms/internal/ads/zzcuf;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdco;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzdco;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public zzg(Lcom/google/android/gms/internal/ads/zzcuf;)Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdco;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzdco;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
