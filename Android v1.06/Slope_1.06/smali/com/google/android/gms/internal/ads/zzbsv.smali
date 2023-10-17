.class public final synthetic Lcom/google/android/gms/internal/ads/zzbsv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbzy;

.field public final synthetic zzb:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbzy;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbsv;->zza:Lcom/google/android/gms/internal/ads/zzbzy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbsv;->zzb:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbsv;->zza:Lcom/google/android/gms/internal/ads/zzbzy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbsv;->zzb:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbzy;->zza(Ljava/lang/String;)Z

    return-void
.end method
