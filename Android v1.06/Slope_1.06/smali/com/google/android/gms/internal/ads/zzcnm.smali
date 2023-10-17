.class final Lcom/google/android/gms/internal/ads/zzcnm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzcno;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcno;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnm;->zza:Lcom/google/android/gms/internal/ads/zzcno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 8

    .line 1
    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnm;->zza:Lcom/google/android/gms/internal/ads/zzcno;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcno;->zzd(Lcom/google/android/gms/internal/ads/zzcno;)Lcom/google/android/gms/internal/ads/zzfaj;

    move-result-object v7

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcno;->zze(Lcom/google/android/gms/internal/ads/zzcno;)Lcom/google/android/gms/internal/ads/zzfgf;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcno;->zzc(Lcom/google/android/gms/internal/ads/zzcno;)Lcom/google/android/gms/internal/ads/zzezr;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcno;->zzb(Lcom/google/android/gms/internal/ads/zzcno;)Lcom/google/android/gms/internal/ads/zzezf;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcno;->zzb(Lcom/google/android/gms/internal/ads/zzcno;)Lcom/google/android/gms/internal/ads/zzezf;

    move-result-object p1

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzezf;->zzc:Ljava/util/List;

    const/4 v3, 0x0

    const-string v4, ""

    .line 2
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzfgf;->zzd(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/google/android/gms/internal/ads/zzbzc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcnm;->zza:Lcom/google/android/gms/internal/ads/zzcno;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzcno;->zza(Lcom/google/android/gms/internal/ads/zzcno;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbzc;->zzx(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    .line 4
    :goto_0
    invoke-virtual {v7, p1, v1}, Lcom/google/android/gms/internal/ads/zzfaj;->zzc(Ljava/util/List;I)V

    return-void
.end method
