.class public final synthetic Lcom/google/android/gms/internal/ads/zzkq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzkt;

.field public final synthetic zzb:Landroid/util/Pair;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zztc;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzth;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzkt;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzkq;->zza:Lcom/google/android/gms/internal/ads/zzkt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzkq;->zzb:Landroid/util/Pair;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzkq;->zzc:Lcom/google/android/gms/internal/ads/zztc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzkq;->zzd:Lcom/google/android/gms/internal/ads/zzth;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzkq;->zza:Lcom/google/android/gms/internal/ads/zzkt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzkq;->zzb:Landroid/util/Pair;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzkq;->zzc:Lcom/google/android/gms/internal/ads/zztc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzkq;->zzd:Lcom/google/android/gms/internal/ads/zzth;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzkt;->zza:Lcom/google/android/gms/internal/ads/zzkx;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzkx;->zzd(Lcom/google/android/gms/internal/ads/zzkx;)Lcom/google/android/gms/internal/ads/zzls;

    move-result-object v0

    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    .line 2
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/zztl;

    .line 1
    invoke-interface {v0, v4, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzls;->zzag(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V

    return-void
.end method
