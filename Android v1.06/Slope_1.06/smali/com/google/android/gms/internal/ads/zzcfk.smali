.class public final synthetic Lcom/google/android/gms/internal/ads/zzcfk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfux;


# instance fields
.field public final synthetic zza:Landroid/content/Context;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzaqq;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzbzz;

.field public final synthetic zzd:Lcom/google/android/gms/ads/internal/zza;

.field public final synthetic zze:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaqq;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/ads/internal/zza;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zzb:Lcom/google/android/gms/internal/ads/zzaqq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zzc:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zzd:Lcom/google/android/gms/ads/internal/zza;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zze:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zza:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zzb:Lcom/google/android/gms/internal/ads/zzaqq;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zzc:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zzd:Lcom/google/android/gms/ads/internal/zza;

    iget-object v14, p0, Lcom/google/android/gms/internal/ads/zzcfk;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzz()Lcom/google/android/gms/internal/ads/zzcfn;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcgq;->zza()Lcom/google/android/gms/internal/ads/zzcgq;

    move-result-object v1

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawx;->zza()Lcom/google/android/gms/internal/ads/zzawx;

    move-result-object v11

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 3
    invoke-static/range {v0 .. v13}, Lcom/google/android/gms/internal/ads/zzcfn;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcgq;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzaqq;Lcom/google/android/gms/internal/ads/zzbcm;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzbcc;Lcom/google/android/gms/ads/internal/zzl;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzawx;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;)Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcak;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzcak;

    move-result-object v1

    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfb;->zzN()Lcom/google/android/gms/internal/ads/zzcgo;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzcfl;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/zzcfl;-><init>(Lcom/google/android/gms/internal/ads/zzcak;)V

    .line 6
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzcgo;->zzA(Lcom/google/android/gms/internal/ads/zzcgm;)V

    .line 7
    invoke-interface {v0, v14}, Lcom/google/android/gms/internal/ads/zzcfb;->loadUrl(Ljava/lang/String;)V

    return-object v1
.end method
