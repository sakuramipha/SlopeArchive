.class public Lcom/google/android/gms/internal/ads/zzegb;
.super Lcom/google/android/gms/internal/ads/zzehc;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzddf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcvg;Lcom/google/android/gms/internal/ads/zzdcu;Lcom/google/android/gms/internal/ads/zzcwa;Lcom/google/android/gms/internal/ads/zzcwp;Lcom/google/android/gms/internal/ads/zzcwu;Lcom/google/android/gms/internal/ads/zzcvv;Lcom/google/android/gms/internal/ads/zzdac;Lcom/google/android/gms/internal/ads/zzddm;Lcom/google/android/gms/internal/ads/zzcxo;Lcom/google/android/gms/internal/ads/zzddf;Lcom/google/android/gms/internal/ads/zzczy;)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p9

    move-object/from16 v8, p8

    move-object/from16 v9, p11

    move-object/from16 v10, p6

    .line 1
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzehc;-><init>(Lcom/google/android/gms/internal/ads/zzcvg;Lcom/google/android/gms/internal/ads/zzdcu;Lcom/google/android/gms/internal/ads/zzcwa;Lcom/google/android/gms/internal/ads/zzcwp;Lcom/google/android/gms/internal/ads/zzcwu;Lcom/google/android/gms/internal/ads/zzdac;Lcom/google/android/gms/internal/ads/zzcxo;Lcom/google/android/gms/internal/ads/zzddm;Lcom/google/android/gms/internal/ads/zzczy;Lcom/google/android/gms/internal/ads/zzcvv;)V

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzegb;->zza:Lcom/google/android/gms/internal/ads/zzddf;

    return-void
.end method


# virtual methods
.method public final zzs(Lcom/google/android/gms/internal/ads/zzbvi;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegb;->zza:Lcom/google/android/gms/internal/ads/zzddf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzddf;->zza(Lcom/google/android/gms/internal/ads/zzbvi;)V

    return-void
.end method

.method public final zzt(Lcom/google/android/gms/internal/ads/zzbvm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegb;->zza:Lcom/google/android/gms/internal/ads/zzddf;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbvi;

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbvm;->zzf()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbvm;->zze()I

    move-result p1

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzbvi;-><init>(Ljava/lang/String;I)V

    .line 1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzddf;->zza(Lcom/google/android/gms/internal/ads/zzbvi;)V

    return-void
.end method

.method public final zzu()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegb;->zza:Lcom/google/android/gms/internal/ads/zzddf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzddf;->zzb()V

    return-void
.end method

.method public final zzv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegb;->zza:Lcom/google/android/gms/internal/ads/zzddf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzddf;->zzb()V

    return-void
.end method

.method public final zzy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzegb;->zza:Lcom/google/android/gms/internal/ads/zzddf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzddf;->zzc()V

    return-void
.end method
