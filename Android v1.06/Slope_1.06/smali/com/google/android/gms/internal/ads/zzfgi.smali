.class public final synthetic Lcom/google/android/gms/internal/ads/zzfgi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfgj;

.field public final synthetic zzb:Ljava/lang/String;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzffq;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfgj;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzffq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zzc:Lcom/google/android/gms/internal/ads/zzffq;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zza:Lcom/google/android/gms/internal/ads/zzfgj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zzb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zzc:Lcom/google/android/gms/internal/ads/zzffq;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfgj;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzffq;)V

    return-void
.end method
