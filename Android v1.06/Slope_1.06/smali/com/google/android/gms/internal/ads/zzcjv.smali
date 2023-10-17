.class final Lcom/google/android/gms/internal/ads/zzcjv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdrd;


# instance fields
.field private final zza:Ljava/lang/Long;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcir;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcjz;

.field private final zze:Lcom/google/android/gms/internal/ads/zzcjv;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzcjz;Ljava/lang/Long;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcju;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zze:Lcom/google/android/gms/internal/ads/zzcjv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzc:Lcom/google/android/gms/internal/ads/zzcir;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzd:Lcom/google/android/gms/internal/ads/zzcjz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zza:Ljava/lang/Long;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzb:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzdrn;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zza:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzd:Lcom/google/android/gms/internal/ads/zzcjz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcjz;->zza(Lcom/google/android/gms/internal/ads/zzcjz;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcjz;->zzc(Lcom/google/android/gms/internal/ads/zzcjz;)Lcom/google/android/gms/internal/ads/zzdrg;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzc:Lcom/google/android/gms/internal/ads/zzcir;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzb:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzdro;->zza(JLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzdrg;Lcom/google/android/gms/internal/ads/zzcgw;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdrn;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzdrr;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zza:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzd:Lcom/google/android/gms/internal/ads/zzcjz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcjz;->zza(Lcom/google/android/gms/internal/ads/zzcjz;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcjz;->zzc(Lcom/google/android/gms/internal/ads/zzcjz;)Lcom/google/android/gms/internal/ads/zzdrg;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzc:Lcom/google/android/gms/internal/ads/zzcir;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcjv;->zzb:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzdrs;->zza(JLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzdrg;Lcom/google/android/gms/internal/ads/zzcgw;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdrr;

    move-result-object v0

    return-object v0
.end method
