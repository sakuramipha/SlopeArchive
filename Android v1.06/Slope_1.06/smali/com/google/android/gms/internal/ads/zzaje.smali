.class final Lcom/google/android/gms/internal/ads/zzaje;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzaih;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfl;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfc;

.field private zzd:Z

.field private zze:Z

.field private zzf:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaih;Lcom/google/android/gms/internal/ads/zzfl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaje;->zza:Lcom/google/android/gms/internal/ads/zzaih;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaje;->zzb:Lcom/google/android/gms/internal/ads/zzfl;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfc;

    const/16 p2, 0x40

    new-array v0, p2, [B

    invoke-direct {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzfc;-><init>([BI)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfd;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzce;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfc;->zza:[B

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 2
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfc;->zzj(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    const/16 v5, 0x8

    .line 3
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfc;->zzn()Z

    move-result v2

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzd:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfc;->zzn()Z

    move-result v2

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zze:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    const/4 v6, 0x6

    .line 6
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 7
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v2

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfc;->zza:[B

    .line 8
    invoke-virtual {v1, v5, v3, v2}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 9
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfc;->zzj(I)V

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzd:Z

    const/4 v3, 0x4

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 10
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 11
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v2

    int-to-long v5, v2

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    const/4 v7, 0x1

    .line 12
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    const/16 v8, 0xf

    .line 13
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v2

    shl-int/2addr v2, v8

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 14
    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 15
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v9

    int-to-long v9, v9

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 16
    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzf:Z

    const/16 v12, 0x1e

    if-nez v11, :cond_0

    iget-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzaje;->zze:Z

    if-eqz v11, :cond_0

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 17
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 18
    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v4

    int-to-long v13, v4

    shl-long/2addr v13, v12

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 19
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 20
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v4

    shl-int/2addr v4, v8

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 21
    invoke-virtual {v11, v7}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 22
    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v8

    move-wide v15, v13

    int-to-long v12, v8

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzc:Lcom/google/android/gms/internal/ads/zzfc;

    .line 23
    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzfc;->zzl(I)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzb:Lcom/google/android/gms/internal/ads/zzfl;

    int-to-long v3, v4

    or-long/2addr v3, v15

    or-long/2addr v3, v12

    .line 24
    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/ads/zzfl;->zzb(J)J

    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzf:Z

    :cond_0
    const/16 v3, 0x1e

    shl-long v3, v5, v3

    int-to-long v5, v2

    or-long v2, v3, v5

    or-long/2addr v2, v9

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaje;->zzb:Lcom/google/android/gms/internal/ads/zzfl;

    .line 25
    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzfl;->zzb(J)J

    move-result-wide v2

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x0

    :goto_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaje;->zza:Lcom/google/android/gms/internal/ads/zzaih;

    const/4 v5, 0x4

    .line 26
    invoke-interface {v4, v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzaih;->zzd(JI)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaje;->zza:Lcom/google/android/gms/internal/ads/zzaih;

    .line 27
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzaih;->zza(Lcom/google/android/gms/internal/ads/zzfd;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaje;->zza:Lcom/google/android/gms/internal/ads/zzaih;

    .line 28
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaih;->zzc()V

    return-void
.end method

.method public final zzb()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaje;->zzf:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaje;->zza:Lcom/google/android/gms/internal/ads/zzaih;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaih;->zze()V

    return-void
.end method
