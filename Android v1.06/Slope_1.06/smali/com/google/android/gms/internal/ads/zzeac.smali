.class public final synthetic Lcom/google/android/gms/internal/ads/zzeac;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfdg;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzead;

.field public final synthetic zzb:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzead;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeac;->zza:Lcom/google/android/gms/internal/ads/zzead;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzeac;->zzb:J

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeac;->zza:Lcom/google/android/gms/internal/ads/zzead;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzeac;->zzb:J

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeai;->zzf()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzazg;->zzg()Lcom/google/android/gms/internal/ads/zzazf;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzazf;->zzh(J)Lcom/google/android/gms/internal/ads/zzazf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzazg;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgmx;->zzax()[B

    move-result-object v0

    const/4 v3, 0x0

    .line 4
    invoke-static {p1, v3, v3}, Lcom/google/android/gms/internal/ads/zzeak;->zzg(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    .line 5
    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzeak;->zzd(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
