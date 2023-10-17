.class public final synthetic Lcom/google/android/gms/internal/ads/zztq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zztu;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zztv;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zztc;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzth;

.field public final synthetic zze:Ljava/io/IOException;

.field public final synthetic zzf:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zztu;Lcom/google/android/gms/internal/ads/zztv;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztq;->zza:Lcom/google/android/gms/internal/ads/zztu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztq;->zzb:Lcom/google/android/gms/internal/ads/zztv;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztq;->zzc:Lcom/google/android/gms/internal/ads/zztc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zztq;->zzd:Lcom/google/android/gms/internal/ads/zzth;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zztq;->zze:Ljava/io/IOException;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/zztq;->zzf:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztq;->zza:Lcom/google/android/gms/internal/ads/zztu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztq;->zzb:Lcom/google/android/gms/internal/ads/zztv;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zztq;->zzc:Lcom/google/android/gms/internal/ads/zztc;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztq;->zzd:Lcom/google/android/gms/internal/ads/zzth;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztq;->zze:Ljava/io/IOException;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zztq;->zzf:Z

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zztu;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    const/4 v2, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zztv;->zzai(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;Ljava/io/IOException;Z)V

    return-void
.end method
