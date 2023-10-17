.class final Lcom/google/android/gms/internal/ads/zzki;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zztj;

.field public final zzb:Ljava/lang/Object;

.field public final zzc:[Lcom/google/android/gms/internal/ads/zzvc;

.field public zzd:Z

.field public zze:Z

.field public zzf:Lcom/google/android/gms/internal/ads/zzkj;

.field public zzg:Z

.field private final zzh:[Z

.field private final zzi:[Lcom/google/android/gms/internal/ads/zzlf;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzxd;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzkx;

.field private zzl:Lcom/google/android/gms/internal/ads/zzki;

.field private zzm:Lcom/google/android/gms/internal/ads/zzvk;

.field private zzn:Lcom/google/android/gms/internal/ads/zzxe;

.field private zzo:J


# direct methods
.method public constructor <init>([Lcom/google/android/gms/internal/ads/zzlf;JLcom/google/android/gms/internal/ads/zzxd;Lcom/google/android/gms/internal/ads/zzxm;Lcom/google/android/gms/internal/ads/zzkx;Lcom/google/android/gms/internal/ads/zzkj;Lcom/google/android/gms/internal/ads/zzxe;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzi:[Lcom/google/android/gms/internal/ads/zzlf;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzki;->zzj:Lcom/google/android/gms/internal/ads/zzxd;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzki;->zzk:Lcom/google/android/gms/internal/ads/zzkx;

    iget-object p1, p7, Lcom/google/android/gms/internal/ads/zzkj;->zza:Lcom/google/android/gms/internal/ads/zztl;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzb:Ljava/lang/Object;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzvk;->zza:Lcom/google/android/gms/internal/ads/zzvk;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzm:Lcom/google/android/gms/internal/ads/zzvk;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    const/4 p1, 0x2

    new-array p2, p1, [Lcom/google/android/gms/internal/ads/zzvc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzki;->zzc:[Lcom/google/android/gms/internal/ads/zzvc;

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzh:[Z

    iget-object p1, p7, Lcom/google/android/gms/internal/ads/zzkj;->zza:Lcom/google/android/gms/internal/ads/zztl;

    iget-wide p2, p7, Lcom/google/android/gms/internal/ads/zzkj;->zzb:J

    iget-wide v5, p7, Lcom/google/android/gms/internal/ads/zzkj;->zzd:J

    .line 2
    invoke-virtual {p6, p1, p5, p2, p3}, Lcom/google/android/gms/internal/ads/zzkx;->zzo(Lcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzxm;J)Lcom/google/android/gms/internal/ads/zztj;

    move-result-object v1

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v5, p1

    if-eqz p3, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzsq;

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzsq;-><init>(Lcom/google/android/gms/internal/ads/zztj;ZJJ)V

    move-object v1, p1

    :cond_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    return-void
.end method

.method private final zzs()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzu()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzxe;->zza:I

    if-ge v0, v2, :cond_0

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzxe;->zzb(I)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    .line 3
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzxe;->zzc:[Lcom/google/android/gms/internal/ads/zzwx;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final zzt()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzu()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzxe;->zza:I

    if-ge v0, v2, :cond_0

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzxe;->zzb(I)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    .line 3
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzxe;->zzc:[Lcom/google/android/gms/internal/ads/zzwx;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final zzu()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzl:Lcom/google/android/gms/internal/ads/zzki;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzxe;JZ)J
    .locals 6

    const/4 p4, 0x2

    new-array v5, p4, [Z

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzki;->zzb(Lcom/google/android/gms/internal/ads/zzxe;JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzxe;JZ[Z)J
    .locals 14

    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1
    :goto_0
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzxe;->zza:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzki;->zzh:[Z

    if-nez p4, :cond_0

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    invoke-virtual {p1, v6, v3}, Lcom/google/android/gms/internal/ads/zzxe;->zza(Lcom/google/android/gms/internal/ads/zzxe;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_2
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzki;->zzi:[Lcom/google/android/gms/internal/ads/zzlf;

    const/4 v6, 0x2

    if-ge v3, v6, :cond_2

    .line 2
    aget-object v4, v4, v3

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzlf;->zzb()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 3
    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzs()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzt()V

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzxe;->zzc:[Lcom/google/android/gms/internal/ads/zzwx;

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzki;->zzh:[Z

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzki;->zzc:[Lcom/google/android/gms/internal/ads/zzvc;

    move-object/from16 v11, p5

    move-wide/from16 v12, p2

    .line 5
    invoke-interface/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zztj;->zzf([Lcom/google/android/gms/internal/ads/zzwx;[Z[Lcom/google/android/gms/internal/ads/zzvc;[ZJ)J

    move-result-wide v3

    const/4 v7, 0x0

    :goto_3
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzki;->zzi:[Lcom/google/android/gms/internal/ads/zzlf;

    if-ge v7, v6, :cond_3

    .line 6
    aget-object v8, v8, v7

    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzlf;->zzb()I

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_3
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzki;->zze:Z

    const/4 v7, 0x0

    :goto_4
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzki;->zzc:[Lcom/google/android/gms/internal/ads/zzvc;

    if-ge v7, v6, :cond_6

    aget-object v8, v8, v7

    if-eqz v8, :cond_4

    .line 7
    invoke-virtual {p1, v7}, Lcom/google/android/gms/internal/ads/zzxe;->zzb(I)Z

    move-result v8

    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzki;->zzi:[Lcom/google/android/gms/internal/ads/zzlf;

    aget-object v8, v8, v7

    .line 8
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzlf;->zzb()I

    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzki;->zze:Z

    goto :goto_6

    :cond_4
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzxe;->zzc:[Lcom/google/android/gms/internal/ads/zzwx;

    .line 9
    aget-object v8, v8, v7

    if-nez v8, :cond_5

    const/4 v8, 0x1

    goto :goto_5

    :cond_5
    const/4 v8, 0x0

    :goto_5
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    return-wide v3
.end method

.method public final zzc()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzd:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzkj;->zzb:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zze:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zztj;->zzb()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    .line 3
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzkj;->zze:J

    return-wide v0

    :cond_2
    return-wide v3
.end method

.method public final zzd()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzd:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zztj;->zzc()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    return-wide v0
.end method

.method public final zzf()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzkj;->zzb:J

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzki;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzl:Lcom/google/android/gms/internal/ads/zzki;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/ads/zzvk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzm:Lcom/google/android/gms/internal/ads/zzvk;

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/internal/ads/zzxe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzn:Lcom/google/android/gms/internal/ads/zzxe;

    return-object v0
.end method

.method public final zzj(FLcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzxe;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzj:Lcom/google/android/gms/internal/ads/zzxd;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzi:[Lcom/google/android/gms/internal/ads/zzlf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzm:Lcom/google/android/gms/internal/ads/zzvk;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzkj;->zza:Lcom/google/android/gms/internal/ads/zztl;

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/google/android/gms/internal/ads/zzxd;->zzn([Lcom/google/android/gms/internal/ads/zzlf;Lcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzxe;

    move-result-object p1

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzxe;->zzc:[Lcom/google/android/gms/internal/ads/zzwx;

    .line 2
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final zzk(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzu()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zztj;->zzo(J)Z

    return-void
.end method

.method public final zzl(FLcom/google/android/gms/internal/ads/zzcx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzd:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zztj;->zzh()Lcom/google/android/gms/internal/ads/zzvk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzm:Lcom/google/android/gms/internal/ads/zzvk;

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzki;->zzj(FLcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzxe;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    .line 3
    iget-wide v0, p2, Lcom/google/android/gms/internal/ads/zzkj;->zzb:J

    .line 4
    iget-wide v2, p2, Lcom/google/android/gms/internal/ads/zzkj;->zze:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v2, v4

    if-eqz p2, :cond_0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_0

    const-wide/16 v0, 0x0

    const-wide/16 v4, -0x1

    add-long/2addr v2, v4

    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_0
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzki;->zza(Lcom/google/android/gms/internal/ads/zzxe;JZ)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    .line 7
    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzkj;->zzb:J

    sub-long/2addr v3, p1

    add-long/2addr v0, v3

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    .line 8
    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzkj;->zzb(J)Lcom/google/android/gms/internal/ads/zzkj;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    return-void
.end method

.method public final zzm(J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzu()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzd:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    sub-long/2addr p1, v1

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zztj;->zzm(J)V

    :cond_0
    return-void
.end method

.method public final zzn()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzs()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzk:Lcom/google/android/gms/internal/ads/zzkx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    .line 2
    :try_start_0
    instance-of v2, v1, Lcom/google/android/gms/internal/ads/zzsq;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/google/android/gms/internal/ads/zzsq;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzsq;->zza:Lcom/google/android/gms/internal/ads/zztj;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzkx;->zzh(Lcom/google/android/gms/internal/ads/zztj;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzkx;->zzh(Lcom/google/android/gms/internal/ads/zztj;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "MediaPeriodHolder"

    const-string v2, "Period release failed."

    .line 5
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzc(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzki;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzl:Lcom/google/android/gms/internal/ads/zzki;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzs()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzl:Lcom/google/android/gms/internal/ads/zzki;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzki;->zzt()V

    return-void
.end method

.method public final zzp(J)V
    .locals 0

    const-wide p1, 0xe8d4a51000L

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzo:J

    return-void
.end method

.method public final zzq()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzsq;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzki;->zzf:Lcom/google/android/gms/internal/ads/zzkj;

    .line 2
    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzkj;->zzd:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    .line 3
    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/ads/zzsq;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzsq;->zzn(JJ)V

    :cond_1
    return-void
.end method

.method public final zzr()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zzd:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zze:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzki;->zza:Lcom/google/android/gms/internal/ads/zztj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zztj;->zzb()J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, v3, v5

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method
