.class public final synthetic Lcom/google/android/gms/internal/ads/zzesa;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzesb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzesb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzesa;->zza:Lcom/google/android/gms/internal/ads/zzesb;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzesc;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzesc;-><init>(Lorg/json/JSONObject;)V

    return-object v1
.end method
