.class public final synthetic Lcom/google/android/gms/internal/ads/zzeeb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdey;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeec;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzeby;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeec;Lcom/google/android/gms/internal/ads/zzeby;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zza:Lcom/google/android/gms/internal/ads/zzeec;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zzb:Lcom/google/android/gms/internal/ads/zzeby;

    return-void
.end method


# virtual methods
.method public final zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzcvv;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zza:Lcom/google/android/gms/internal/ads/zzeec;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zzb:Lcom/google/android/gms/internal/ads/zzeby;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzeec;->zzc(Lcom/google/android/gms/internal/ads/zzeby;ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzcvv;)V

    return-void
.end method
