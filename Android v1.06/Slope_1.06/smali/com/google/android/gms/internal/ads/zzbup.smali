.class public final synthetic Lcom/google/android/gms/internal/ads/zzbup;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfon;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbuq;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbuq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbup;->zza:Lcom/google/android/gms/internal/ads/zzbuq;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbup;->zza:Lcom/google/android/gms/internal/ads/zzbuq;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbuq;->zzb(Lorg/json/JSONObject;)Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method
