.class public final synthetic Lcom/google/android/gms/internal/ads/zzdxz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdyj;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzbug;

.field public final synthetic zze:Lcom/google/android/gms/internal/ads/zzfff;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdyj;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfff;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zza:Lcom/google/android/gms/internal/ads/zzdyj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zzd:Lcom/google/android/gms/internal/ads/zzbug;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zze:Lcom/google/android/gms/internal/ads/zzfff;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zza:Lcom/google/android/gms/internal/ads/zzdyj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zzd:Lcom/google/android/gms/internal/ads/zzbug;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdxz;->zze:Lcom/google/android/gms/internal/ads/zzfff;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzdyj;->zzj(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzfff;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
