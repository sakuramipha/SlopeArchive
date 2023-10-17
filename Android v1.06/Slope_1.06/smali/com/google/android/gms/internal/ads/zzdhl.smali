.class public final Lcom/google/android/gms/internal/ads/zzdhl;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field zza:Lcom/google/android/gms/internal/ads/zzbfr;

.field zzb:Lcom/google/android/gms/internal/ads/zzbfo;

.field zzc:Lcom/google/android/gms/internal/ads/zzbge;

.field zzd:Lcom/google/android/gms/internal/ads/zzbgb;

.field zze:Lcom/google/android/gms/internal/ads/zzbkz;

.field final zzf:Landroidx/collection/SimpleArrayMap;

.field final zzg:Landroidx/collection/SimpleArrayMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/collection/SimpleArrayMap;

    invoke-direct {v0}, Landroidx/collection/SimpleArrayMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zzf:Landroidx/collection/SimpleArrayMap;

    new-instance v0, Landroidx/collection/SimpleArrayMap;

    .line 2
    invoke-direct {v0}, Landroidx/collection/SimpleArrayMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zzg:Landroidx/collection/SimpleArrayMap;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbfo;)Lcom/google/android/gms/internal/ads/zzdhl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zzb:Lcom/google/android/gms/internal/ads/zzbfo;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbfr;)Lcom/google/android/gms/internal/ads/zzdhl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zza:Lcom/google/android/gms/internal/ads/zzbfr;

    return-object p0
.end method

.method public final zzc(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbfx;Lcom/google/android/gms/internal/ads/zzbfu;)Lcom/google/android/gms/internal/ads/zzdhl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zzf:Landroidx/collection/SimpleArrayMap;

    invoke-virtual {v0, p1, p2}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zzg:Landroidx/collection/SimpleArrayMap;

    .line 2
    invoke-virtual {p2, p1, p3}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzbkz;)Lcom/google/android/gms/internal/ads/zzdhl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zze:Lcom/google/android/gms/internal/ads/zzbkz;

    return-object p0
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzbgb;)Lcom/google/android/gms/internal/ads/zzdhl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zzd:Lcom/google/android/gms/internal/ads/zzbgb;

    return-object p0
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzbge;)Lcom/google/android/gms/internal/ads/zzdhl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdhl;->zzc:Lcom/google/android/gms/internal/ads/zzbge;

    return-object p0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzdhn;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdhn;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzdhn;-><init>(Lcom/google/android/gms/internal/ads/zzdhl;Lcom/google/android/gms/internal/ads/zzdhm;)V

    return-object v0
.end method
