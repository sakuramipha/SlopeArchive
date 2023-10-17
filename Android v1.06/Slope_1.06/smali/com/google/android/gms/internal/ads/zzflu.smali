.class public final Lcom/google/android/gms/internal/ads/zzflu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads-lite@@22.2.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzflr;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/zzflr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzflt;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzflt;-><init>(Lcom/google/android/gms/internal/ads/zzfls;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzflu;->zza:Lcom/google/android/gms/internal/ads/zzflr;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzflu;->zzb:Lcom/google/android/gms/internal/ads/zzflr;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzflr;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzflu;->zzb:Lcom/google/android/gms/internal/ads/zzflr;

    return-object v0
.end method
