.class final Lcom/google/android/gms/internal/ads/zzbxf;
.super Lcom/google/android/gms/internal/ads/zzbxz;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zzb:Lcom/google/android/gms/common/util/Clock;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbxf;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zze:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzgwb;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzgwb;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/ads/internal/util/zzg;Lcom/google/android/gms/internal/ads/zzbxy;Lcom/google/android/gms/internal/ads/zzbxe;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbxz;-><init>()V

    iput-object p0, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzc:Lcom/google/android/gms/internal/ads/zzbxf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzb:Lcom/google/android/gms/common/util/Clock;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgvp;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgvo;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzd:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 2
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzgvp;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgvo;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zze:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 3
    invoke-static {p4}, Lcom/google/android/gms/internal/ads/zzgvp;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgvo;

    move-result-object p4

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzf:Lcom/google/android/gms/internal/ads/zzgwb;

    new-instance p5, Lcom/google/android/gms/internal/ads/zzbwx;

    invoke-direct {p5, p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzbwx;-><init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V

    .line 4
    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzgvn;->zzc(Lcom/google/android/gms/internal/ads/zzgwb;)Lcom/google/android/gms/internal/ads/zzgwb;

    move-result-object p5

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzg:Lcom/google/android/gms/internal/ads/zzgwb;

    .line 5
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgvp;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgvo;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzh:Lcom/google/android/gms/internal/ads/zzgwb;

    new-instance p5, Lcom/google/android/gms/internal/ads/zzbwz;

    invoke-direct {p5, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzbwz;-><init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V

    .line 6
    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzgvn;->zzc(Lcom/google/android/gms/internal/ads/zzgwb;)Lcom/google/android/gms/internal/ads/zzgwb;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzi:Lcom/google/android/gms/internal/ads/zzgwb;

    new-instance p4, Lcom/google/android/gms/internal/ads/zzbxb;

    invoke-direct {p4, p2, p3}, Lcom/google/android/gms/internal/ads/zzbxb;-><init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzj:Lcom/google/android/gms/internal/ads/zzgwb;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzbye;

    invoke-direct {p2, p1, p4}, Lcom/google/android/gms/internal/ads/zzbye;-><init>(Lcom/google/android/gms/internal/ads/zzgwb;Lcom/google/android/gms/internal/ads/zzgwb;)V

    .line 7
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgvn;->zzc(Lcom/google/android/gms/internal/ads/zzgwb;)Lcom/google/android/gms/internal/ads/zzgwb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzk:Lcom/google/android/gms/internal/ads/zzgwb;

    return-void
.end method


# virtual methods
.method final zza()Lcom/google/android/gms/internal/ads/zzbww;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzg:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbww;

    return-object v0
.end method

.method final zzb()Lcom/google/android/gms/internal/ads/zzbxa;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbxa;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzb:Lcom/google/android/gms/common/util/Clock;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzi:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzbwy;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbxa;-><init>(Lcom/google/android/gms/common/util/Clock;Lcom/google/android/gms/internal/ads/zzbwy;)V

    return-object v0
.end method

.method final zzc()Lcom/google/android/gms/internal/ads/zzbyd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbxf;->zzk:Lcom/google/android/gms/internal/ads/zzgwb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzgwb;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbyd;

    return-object v0
.end method
