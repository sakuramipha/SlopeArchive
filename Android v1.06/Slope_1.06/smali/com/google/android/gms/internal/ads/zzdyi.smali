.class public final Lcom/google/android/gms/internal/ads/zzdyi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzbmr;


# instance fields
.field public final zzb:Lcom/google/android/gms/internal/ads/zzdyw;

.field public final zzc:Lorg/json/JSONObject;

.field public final zzd:Lcom/google/android/gms/internal/ads/zzbuj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdyh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzdyh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdyi;->zza:Lcom/google/android/gms/internal/ads/zzbmr;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdyw;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzbuj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdyi;->zzb:Lcom/google/android/gms/internal/ads/zzdyw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdyi;->zzc:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdyi;->zzd:Lcom/google/android/gms/internal/ads/zzbuj;

    return-void
.end method
