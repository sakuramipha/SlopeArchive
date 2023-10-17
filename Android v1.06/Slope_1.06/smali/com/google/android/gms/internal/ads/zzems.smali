.class public final synthetic Lcom/google/android/gms/internal/ads/zzems;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzemt;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzemt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzems;->zza:Lcom/google/android/gms/internal/ads/zzemt;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzems;->zza:Lcom/google/android/gms/internal/ads/zzemt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzemt;->zzc()Lcom/google/android/gms/internal/ads/zzemu;

    move-result-object v0

    return-object v0
.end method
