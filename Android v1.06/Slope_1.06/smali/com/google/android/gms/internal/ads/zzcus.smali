.class public final Lcom/google/android/gms/internal/ads/zzcus;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zzc:Landroid/os/Bundle;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzezs;

.field private final zze:Lcom/google/android/gms/internal/ads/zzcuk;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzeca;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcuq;Lcom/google/android/gms/internal/ads/zzcur;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zza(Lcom/google/android/gms/internal/ads/zzcuq;)Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcus;->zza:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzm(Lcom/google/android/gms/internal/ads/zzcuq;)Lcom/google/android/gms/internal/ads/zzfaa;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzb:Lcom/google/android/gms/internal/ads/zzfaa;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzb(Lcom/google/android/gms/internal/ads/zzcuq;)Landroid/os/Bundle;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzc:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzl(Lcom/google/android/gms/internal/ads/zzcuq;)Lcom/google/android/gms/internal/ads/zzezs;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzd:Lcom/google/android/gms/internal/ads/zzezs;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzc(Lcom/google/android/gms/internal/ads/zzcuq;)Lcom/google/android/gms/internal/ads/zzcuk;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcus;->zze:Lcom/google/android/gms/internal/ads/zzcuk;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzk(Lcom/google/android/gms/internal/ads/zzcuq;)Lcom/google/android/gms/internal/ads/zzeca;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzf:Lcom/google/android/gms/internal/ads/zzeca;

    return-void
.end method


# virtual methods
.method final zza(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcus;->zza:Landroid/content/Context;

    return-object p1
.end method

.method final zzb()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzc:Landroid/os/Bundle;

    return-object v0
.end method

.method final zzc()Lcom/google/android/gms/internal/ads/zzcuk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcus;->zze:Lcom/google/android/gms/internal/ads/zzcuk;

    return-object v0
.end method

.method final zzd()Lcom/google/android/gms/internal/ads/zzcuq;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcuq;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcus;->zza:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcuq;->zze(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcuq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzb:Lcom/google/android/gms/internal/ads/zzfaa;

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzi(Lcom/google/android/gms/internal/ads/zzfaa;)Lcom/google/android/gms/internal/ads/zzcuq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzc:Landroid/os/Bundle;

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzf(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzcuq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcus;->zze:Lcom/google/android/gms/internal/ads/zzcuk;

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzg(Lcom/google/android/gms/internal/ads/zzcuk;)Lcom/google/android/gms/internal/ads/zzcuq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzf:Lcom/google/android/gms/internal/ads/zzeca;

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzd(Lcom/google/android/gms/internal/ads/zzeca;)Lcom/google/android/gms/internal/ads/zzcuq;

    return-object v0
.end method

.method final zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzeca;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzf:Lcom/google/android/gms/internal/ads/zzeca;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeca;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzeca;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method final zzf()Lcom/google/android/gms/internal/ads/zzezs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzd:Lcom/google/android/gms/internal/ads/zzezs;

    return-object v0
.end method

.method final zzg()Lcom/google/android/gms/internal/ads/zzfaa;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcus;->zzb:Lcom/google/android/gms/internal/ads/zzfaa;

    return-object v0
.end method
