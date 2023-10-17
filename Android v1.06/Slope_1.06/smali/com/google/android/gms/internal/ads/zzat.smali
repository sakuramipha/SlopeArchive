.class public final Lcom/google/android/gms/internal/ads/zzat;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Landroid/net/Uri;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzav;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbb;

.field private final zze:Ljava/util/List;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfrr;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbe;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzbn;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzav;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzav;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzat;->zzc:Lcom/google/android/gms/internal/ads/zzav;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbb;-><init>(Lcom/google/android/gms/internal/ads/zzba;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzat;->zzd:Lcom/google/android/gms/internal/ads/zzbb;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzat;->zze:Ljava/util/List;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfrr;->zzl()Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzat;->zzf:Lcom/google/android/gms/internal/ads/zzfrr;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbe;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzat;->zzg:Lcom/google/android/gms/internal/ads/zzbe;

    .line 4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbn;->zza:Lcom/google/android/gms/internal/ads/zzbn;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzat;->zzh:Lcom/google/android/gms/internal/ads/zzbn;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzat;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public final zzb(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzat;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzat;->zzb:Landroid/net/Uri;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzbq;
    .locals 21

    move-object/from16 v0, p0

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzat;->zzb:Landroid/net/Uri;

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    new-instance v12, Lcom/google/android/gms/internal/ads/zzbk;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzat;->zze:Ljava/util/List;

    const/4 v7, 0x0

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzat;->zzf:Lcom/google/android/gms/internal/ads/zzfrr;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v12

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/zzbk;-><init>(Landroid/net/Uri;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbc;Lcom/google/android/gms/internal/ads/zzas;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfrr;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbj;)V

    move-object/from16 v16, v12

    goto :goto_0

    :cond_0
    move-object/from16 v16, v11

    .line 2
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbq;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzat;->zza:Ljava/lang/String;

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    move-object v14, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzat;->zzc:Lcom/google/android/gms/internal/ads/zzav;

    .line 3
    new-instance v15, Lcom/google/android/gms/internal/ads/zzaz;

    invoke-direct {v15, v2, v11}, Lcom/google/android/gms/internal/ads/zzaz;-><init>(Lcom/google/android/gms/internal/ads/zzav;Lcom/google/android/gms/internal/ads/zzay;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzat;->zzg:Lcom/google/android/gms/internal/ads/zzbe;

    .line 4
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbg;

    invoke-direct {v3, v2, v11}, Lcom/google/android/gms/internal/ads/zzbg;-><init>(Lcom/google/android/gms/internal/ads/zzbe;Lcom/google/android/gms/internal/ads/zzbf;)V

    .line 5
    sget-object v18, Lcom/google/android/gms/internal/ads/zzbw;->zza:Lcom/google/android/gms/internal/ads/zzbw;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzat;->zzh:Lcom/google/android/gms/internal/ads/zzbn;

    const/16 v20, 0x0

    move-object v13, v1

    move-object/from16 v17, v3

    move-object/from16 v19, v2

    invoke-direct/range {v13 .. v20}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaz;Lcom/google/android/gms/internal/ads/zzbk;Lcom/google/android/gms/internal/ads/zzbg;Lcom/google/android/gms/internal/ads/zzbw;Lcom/google/android/gms/internal/ads/zzbn;Lcom/google/android/gms/internal/ads/zzbp;)V

    return-object v1
.end method
