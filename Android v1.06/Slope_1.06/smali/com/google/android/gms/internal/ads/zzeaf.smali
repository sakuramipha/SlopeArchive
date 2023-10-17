.class public final synthetic Lcom/google/android/gms/internal/ads/zzeaf;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfdg;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeag;

.field public final synthetic zzb:Z

.field public final synthetic zzc:Ljava/util/ArrayList;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzazb;

.field public final synthetic zze:Lcom/google/android/gms/internal/ads/zzazk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeag;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/zzazb;Lcom/google/android/gms/internal/ads/zzazk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zza:Lcom/google/android/gms/internal/ads/zzeag;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zzb:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zzc:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zzd:Lcom/google/android/gms/internal/ads/zzazb;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zze:Lcom/google/android/gms/internal/ads/zzazk;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zza:Lcom/google/android/gms/internal/ads/zzeag;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zzb:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zzc:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zzd:Lcom/google/android/gms/internal/ads/zzazb;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzeaf;->zze:Lcom/google/android/gms/internal/ads/zzazk;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 1
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzeag;->zzb:Lcom/google/android/gms/internal/ads/zzeah;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeai;->zzf()Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzeag;->zzb:Lcom/google/android/gms/internal/ads/zzeah;

    .line 2
    invoke-static {v5, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzeah;->zze(Lcom/google/android/gms/internal/ads/zzeah;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/zzazb;Lcom/google/android/gms/internal/ads/zzazk;)[B

    move-result-object v2

    const/4 v3, 0x1

    .line 3
    invoke-static {p1, v1, v3}, Lcom/google/android/gms/internal/ads/zzeak;->zzg(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeag;->zzb:Lcom/google/android/gms/internal/ads/zzeah;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeah;->zzc(Lcom/google/android/gms/internal/ads/zzeah;)Lcom/google/android/gms/internal/ads/zzdzz;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdzz;->zzd()J

    move-result-wide v0

    .line 5
    invoke-static {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzeak;->zzd(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
