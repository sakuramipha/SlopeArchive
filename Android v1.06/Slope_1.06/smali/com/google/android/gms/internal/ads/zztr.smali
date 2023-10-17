.class public final synthetic Lcom/google/android/gms/internal/ads/zztr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zztu;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zztv;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zztc;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzth;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zztu;Lcom/google/android/gms/internal/ads/zztv;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztr;->zza:Lcom/google/android/gms/internal/ads/zztu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztr;->zzb:Lcom/google/android/gms/internal/ads/zztv;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztr;->zzc:Lcom/google/android/gms/internal/ads/zztc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zztr;->zzd:Lcom/google/android/gms/internal/ads/zzth;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztr;->zza:Lcom/google/android/gms/internal/ads/zztu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztr;->zzb:Lcom/google/android/gms/internal/ads/zztv;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztr;->zzc:Lcom/google/android/gms/internal/ads/zztc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zztr;->zzd:Lcom/google/android/gms/internal/ads/zzth;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztu;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    const/4 v4, 0x0

    invoke-interface {v1, v4, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zztv;->zzaj(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V

    return-void
.end method
