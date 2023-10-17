.class public final Lcom/google/android/gms/internal/ads/zzfet;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfen;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfex;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfev;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfek;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfek;Lcom/google/android/gms/internal/ads/zzfex;Lcom/google/android/gms/internal/ads/zzfev;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfet;->zzc:Lcom/google/android/gms/internal/ads/zzfek;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfet;->zza:Lcom/google/android/gms/internal/ads/zzfex;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfet;->zzb:Lcom/google/android/gms/internal/ads/zzfev;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfem;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfet;->zza:Lcom/google/android/gms/internal/ads/zzfex;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfem;->zzj()Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfet;->zzb:Lcom/google/android/gms/internal/ads/zzfev;

    .line 2
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfev;->zza(Ljava/util/Map;)V

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfex;->zza(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfem;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfet;->zzc:Lcom/google/android/gms/internal/ads/zzfek;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzfet;->zza(Lcom/google/android/gms/internal/ads/zzfem;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfek;->zzb(Ljava/lang/String;)V

    return-void
.end method
