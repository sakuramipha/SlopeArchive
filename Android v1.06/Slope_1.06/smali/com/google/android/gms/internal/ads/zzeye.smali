.class public final synthetic Lcom/google/android/gms/internal/ads/zzeye;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzewj;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbuw;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbuw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeye;->zza:Lcom/google/android/gms/internal/ads/zzbuw;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeye;->zza:Lcom/google/android/gms/internal/ads/zzbuw;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbvs;

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbwg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbuw;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbuw;->zzb()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbwg;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzbvs;->zzk(Lcom/google/android/gms/internal/ads/zzbvm;)V

    return-void
.end method
