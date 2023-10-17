.class public final synthetic Lcom/google/android/gms/internal/ads/zzemf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzemg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzemg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzemf;->zza:Lcom/google/android/gms/internal/ads/zzemg;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzemf;->zza:Lcom/google/android/gms/internal/ads/zzemg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzemg;->zzc()Lcom/google/android/gms/internal/ads/zzemh;

    move-result-object v0

    return-object v0
.end method
