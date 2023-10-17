.class public final Lcom/google/android/gms/internal/ads/zzdrn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdrb;


# instance fields
.field private final zza:J

.field private final zzb:Lcom/google/android/gms/internal/ads/zzejn;


# direct methods
.method constructor <init>(JLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzdrg;Lcom/google/android/gms/internal/ads/zzcgw;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzdrn;->zza:J

    invoke-virtual {p5}, Lcom/google/android/gms/internal/ads/zzcgw;->zzt()Lcom/google/android/gms/internal/ads/zzexk;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/zzexk;->zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzexk;

    new-instance p2, Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-direct {p2}, Lcom/google/android/gms/ads/internal/client/zzq;-><init>()V

    .line 2
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzexk;->zza(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/google/android/gms/internal/ads/zzexk;

    .line 3
    invoke-interface {p1, p6}, Lcom/google/android/gms/internal/ads/zzexk;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzexk;

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzexk;->zzd()Lcom/google/android/gms/internal/ads/zzexl;

    move-result-object p1

    .line 5
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzexl;->zza()Lcom/google/android/gms/internal/ads/zzejn;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdrn;->zzb:Lcom/google/android/gms/internal/ads/zzejn;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdrm;

    .line 6
    invoke-direct {p2, p0, p4}, Lcom/google/android/gms/internal/ads/zzdrm;-><init>(Lcom/google/android/gms/internal/ads/zzdrn;Lcom/google/android/gms/internal/ads/zzdrg;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzejn;->zzD(Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-void
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzdrn;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzdrn;->zza:J

    return-wide v0
.end method


# virtual methods
.method public final zza()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdrn;->zzb:Lcom/google/android/gms/internal/ads/zzejn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzejn;->zzx()V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/ads/internal/client/zzl;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdrn;->zzb:Lcom/google/android/gms/internal/ads/zzejn;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzejn;->zzaa(Lcom/google/android/gms/ads/internal/client/zzl;)Z

    return-void
.end method

.method public final zzc()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdrn;->zzb:Lcom/google/android/gms/internal/ads/zzejn;

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzejn;->zzW(Lcom/google/android/gms/dynamic/IObjectWrapper;)V

    return-void
.end method
