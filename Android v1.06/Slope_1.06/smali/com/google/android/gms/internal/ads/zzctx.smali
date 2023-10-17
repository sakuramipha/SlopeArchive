.class public final Lcom/google/android/gms/internal/ads/zzctx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcyd;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zzd:Lcom/google/android/gms/ads/internal/util/zzg;

.field private final zze:Lcom/google/android/gms/internal/ads/zzdse;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfft;

.field private final zzg:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfaa;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/ads/internal/util/zzg;Lcom/google/android/gms/internal/ads/zzdse;Lcom/google/android/gms/internal/ads/zzfft;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzctx;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzb:Lcom/google/android/gms/internal/ads/zzfaa;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzc:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzd:Lcom/google/android/gms/ads/internal/util/zzg;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzctx;->zze:Lcom/google/android/gms/internal/ads/zzdse;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzf:Lcom/google/android/gms/internal/ads/zzfft;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/ads/zzezr;)V
    .locals 0

    return-void
.end method

.method public final zzbA(Lcom/google/android/gms/internal/ads/zzbug;)V
    .locals 6

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzdH:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzd:Lcom/google/android/gms/ads/internal/util/zzg;

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/util/zzg;->zzh()Lcom/google/android/gms/internal/ads/zzbyw;

    move-result-object v4

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zza()Lcom/google/android/gms/ads/internal/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzctx;->zza:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzc:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzb:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzfaa;->zzf:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzf:Lcom/google/android/gms/internal/ads/zzfft;

    .line 5
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/zze;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbyw;Lcom/google/android/gms/internal/ads/zzfft;)V

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzfu:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 6
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzctx;->zzg:Ljava/lang/String;

    const-string v0, "app_open_ad"

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    return-void

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzctx;->zze:Lcom/google/android/gms/internal/ads/zzdse;

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdse;->zzr()V

    return-void
.end method
