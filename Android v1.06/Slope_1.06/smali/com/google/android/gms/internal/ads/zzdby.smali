.class public final synthetic Lcom/google/android/gms/internal/ads/zzdby;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdar;


# instance fields
.field public final synthetic zza:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "MalformedJson"

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdby;->zza:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdby;->zza:Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzdcb;

    .line 1
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzdcb;->zza(Ljava/lang/String;)V

    return-void
.end method
