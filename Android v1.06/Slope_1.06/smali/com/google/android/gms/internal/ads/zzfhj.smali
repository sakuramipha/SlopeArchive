.class public final Lcom/google/android/gms/internal/ads/zzfhj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field private static zza:Lcom/google/android/gms/internal/ads/zzfhj;


# instance fields
.field private zzb:F

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfhc;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfha;

.field private zze:Lcom/google/android/gms/internal/ads/zzfhb;

.field private zzf:Lcom/google/android/gms/internal/ads/zzfhd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfhc;Lcom/google/android/gms/internal/ads/zzfha;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzb:F

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzc:Lcom/google/android/gms/internal/ads/zzfhc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzd:Lcom/google/android/gms/internal/ads/zzfha;

    return-void
.end method

.method public static zzb()Lcom/google/android/gms/internal/ads/zzfhj;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfhj;->zza:Lcom/google/android/gms/internal/ads/zzfhj;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfha;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfha;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfhc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzfhc;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfhj;

    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzfhj;-><init>(Lcom/google/android/gms/internal/ads/zzfhc;Lcom/google/android/gms/internal/ads/zzfha;)V

    sput-object v2, Lcom/google/android/gms/internal/ads/zzfhj;->zza:Lcom/google/android/gms/internal/ads/zzfhj;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfhj;->zza:Lcom/google/android/gms/internal/ads/zzfhj;

    return-object v0
.end method


# virtual methods
.method public final zza()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzb:F

    return v0
.end method

.method public final zzc(Landroid/content/Context;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfgz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfgz;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfhb;

    .line 2
    invoke-direct {v2, v1, p1, v0, p0}, Lcom/google/android/gms/internal/ads/zzfhb;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfgz;Lcom/google/android/gms/internal/ads/zzfhj;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zze:Lcom/google/android/gms/internal/ads/zzfhb;

    return-void
.end method

.method public final zzd(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzb:F

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzf:Lcom/google/android/gms/internal/ads/zzfhd;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfhd;->zza()Lcom/google/android/gms/internal/ads/zzfhd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzf:Lcom/google/android/gms/internal/ads/zzfhd;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zzf:Lcom/google/android/gms/internal/ads/zzfhd;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfhd;->zzb()Ljava/util/Collection;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfgs;

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfgs;->zzg()Lcom/google/android/gms/internal/ads/zzfhp;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfhp;->zzh(F)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final zze()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfhe;->zza()Lcom/google/android/gms/internal/ads/zzfhe;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzfhe;->zzd(Lcom/google/android/gms/internal/ads/zzfhj;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfhe;->zza()Lcom/google/android/gms/internal/ads/zzfhe;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfhe;->zzb()V

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfif;->zzd()Lcom/google/android/gms/internal/ads/zzfif;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfif;->zzi()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zze:Lcom/google/android/gms/internal/ads/zzfhb;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfhb;->zza()V

    return-void
.end method

.method public final zzf()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfif;->zzd()Lcom/google/android/gms/internal/ads/zzfif;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfif;->zzj()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfhe;->zza()Lcom/google/android/gms/internal/ads/zzfhe;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfhe;->zzc()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfhj;->zze:Lcom/google/android/gms/internal/ads/zzfhb;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfhb;->zzb()V

    return-void
.end method
