.class public final synthetic Lcom/google/android/gms/internal/ads/zzvv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzwq;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzwv;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzwj;

.field public final synthetic zzc:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzwv;Lcom/google/android/gms/internal/ads/zzwj;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvv;->zza:Lcom/google/android/gms/internal/ads/zzwv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzb:Lcom/google/android/gms/internal/ads/zzwj;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzvv;->zzc:Z

    return-void
.end method


# virtual methods
.method public final zza(ILcom/google/android/gms/internal/ads/zzcz;[I)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzvv;->zza:Lcom/google/android/gms/internal/ads/zzwv;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzvv;->zzb:Lcom/google/android/gms/internal/ads/zzwj;

    iget-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzvv;->zzc:Z

    new-instance v12, Lcom/google/android/gms/internal/ads/zzvu;

    invoke-direct {v12, v1}, Lcom/google/android/gms/internal/ads/zzvu;-><init>(Lcom/google/android/gms/internal/ads/zzwv;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfro;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzfro;-><init>()V

    const/4 v2, 0x0

    move-object/from16 v14, p2

    const/4 v13, 0x0

    .line 2
    :goto_0
    iget v2, v14, Lcom/google/android/gms/internal/ads/zzcz;->zzb:I

    if-gtz v13, :cond_0

    new-instance v15, Lcom/google/android/gms/internal/ads/zzwd;

    .line 3
    aget v7, p3, v13

    move-object v2, v15

    move/from16 v3, p1

    move-object/from16 v4, p2

    move v5, v13

    move-object v6, v10

    move v8, v11

    move-object v9, v12

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/ads/zzwd;-><init>(ILcom/google/android/gms/internal/ads/zzcz;ILcom/google/android/gms/internal/ads/zzwj;IZLcom/google/android/gms/internal/ads/zzfpa;)V

    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzfro;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfro;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfro;->zzi()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v1

    return-object v1
.end method
