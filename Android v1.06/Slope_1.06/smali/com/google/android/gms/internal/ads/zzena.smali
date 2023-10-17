.class public final synthetic Lcom/google/android/gms/internal/ads/zzena;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzend;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzend;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzena;->zza:Lcom/google/android/gms/internal/ads/zzend;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzena;->zza:Lcom/google/android/gms/internal/ads/zzend;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzend;->zzc()Lcom/google/android/gms/internal/ads/zzenc;

    move-result-object v0

    return-object v0
.end method
