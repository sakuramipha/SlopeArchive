.class public final Lcom/google/android/gms/internal/ads/zzcjn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzcgz;

.field private zzb:Lcom/google/android/gms/internal/ads/zzcla;

.field private zzc:Lcom/google/android/gms/internal/ads/zzfeh;

.field private zzd:Lcom/google/android/gms/internal/ads/zzcln;

.field private zze:Lcom/google/android/gms/internal/ads/zzfbb;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcjm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzcgw;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zza:Lcom/google/android/gms/internal/ads/zzcgz;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcgz;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzb:Lcom/google/android/gms/internal/ads/zzcla;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcla;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzc:Lcom/google/android/gms/internal/ads/zzfeh;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfeh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfeh;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzc:Lcom/google/android/gms/internal/ads/zzfeh;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzd:Lcom/google/android/gms/internal/ads/zzcln;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcln;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcln;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzd:Lcom/google/android/gms/internal/ads/zzcln;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zze:Lcom/google/android/gms/internal/ads/zzfbb;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfbb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfbb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zze:Lcom/google/android/gms/internal/ads/zzfbb;

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcir;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zza:Lcom/google/android/gms/internal/ads/zzcgz;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzb:Lcom/google/android/gms/internal/ads/zzcla;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzc:Lcom/google/android/gms/internal/ads/zzfeh;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzd:Lcom/google/android/gms/internal/ads/zzcln;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zze:Lcom/google/android/gms/internal/ads/zzfbb;

    const/4 v7, 0x0

    move-object v1, v0

    .line 3
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzcir;-><init>(Lcom/google/android/gms/internal/ads/zzcgz;Lcom/google/android/gms/internal/ads/zzcla;Lcom/google/android/gms/internal/ads/zzfeh;Lcom/google/android/gms/internal/ads/zzcln;Lcom/google/android/gms/internal/ads/zzfbb;Lcom/google/android/gms/internal/ads/zzciq;)V

    return-object v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzcgz;)Lcom/google/android/gms/internal/ads/zzcjn;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zza:Lcom/google/android/gms/internal/ads/zzcgz;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzcla;)Lcom/google/android/gms/internal/ads/zzcjn;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjn;->zzb:Lcom/google/android/gms/internal/ads/zzcla;

    return-object p0
.end method
