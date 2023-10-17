.class public final synthetic Lcom/google/android/gms/internal/ads/zzeek;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeep;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzezr;

.field public final synthetic zze:Lcom/google/android/gms/internal/ads/zzezf;

.field public final synthetic zzf:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeep;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeek;->zza:Lcom/google/android/gms/internal/ads/zzeep;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzd:Lcom/google/android/gms/internal/ads/zzezr;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeek;->zze:Lcom/google/android/gms/internal/ads/zzezf;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzf:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeek;->zza:Lcom/google/android/gms/internal/ads/zzeep;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzc:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzd:Lcom/google/android/gms/internal/ads/zzezr;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzeek;->zze:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeek;->zzf:Lorg/json/JSONObject;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzeep;->zzc(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzdgx;

    move-result-object v0

    return-object v0
.end method
