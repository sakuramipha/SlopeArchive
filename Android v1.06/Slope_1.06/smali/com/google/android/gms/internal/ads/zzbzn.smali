.class public final synthetic Lcom/google/android/gms/internal/ads/zzbzn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbzr;


# instance fields
.field public final synthetic zza:I

.field public final synthetic zzb:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbzn;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbzn;->zzb:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final zza(Landroid/util/JsonWriter;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbzn;->zza:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbzn;->zzb:Ljava/util/Map;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzbzs;->zzb(ILjava/util/Map;Landroid/util/JsonWriter;)V

    return-void
.end method