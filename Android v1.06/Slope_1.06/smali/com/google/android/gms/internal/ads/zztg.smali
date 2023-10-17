.class public final Lcom/google/android/gms/internal/ads/zztg;
.super Lcom/google/android/gms/internal/ads/zzvm;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zzb:Z

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcw;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcu;

.field private zze:Lcom/google/android/gms/internal/ads/zzte;

.field private zzf:Lcom/google/android/gms/internal/ads/zztd;

.field private zzg:Z

.field private zzh:Z

.field private zzi:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zztn;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzvm;-><init>(Lcom/google/android/gms/internal/ads/zztn;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzu()Z

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zztg;->zzb:Z

    .line 3
    new-instance p2, Lcom/google/android/gms/internal/ads/zzcw;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzcw;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztg;->zzc:Lcom/google/android/gms/internal/ads/zzcw;

    .line 4
    new-instance p2, Lcom/google/android/gms/internal/ads/zzcu;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzcu;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztg;->zzd:Lcom/google/android/gms/internal/ads/zzcu;

    .line 5
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzL()Lcom/google/android/gms/internal/ads/zzcx;

    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zztn;->zzI()Lcom/google/android/gms/internal/ads/zzbq;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzte;->zzq(Lcom/google/android/gms/internal/ads/zzbq;)Lcom/google/android/gms/internal/ads/zzte;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    return-void
.end method

.method private final zzJ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzte;->zzs(Lcom/google/android/gms/internal/ads/zzte;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzte;->zzd:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzte;->zzs(Lcom/google/android/gms/internal/ads/zzte;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final zzK(J)V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "unpreparedMaskingMediaPeriod"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zztd;->zza:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzsz;->zza(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zztg;->zzd:Lcom/google/android/gms/internal/ads/zzcu;

    const/4 v4, 0x0

    .line 2
    invoke-virtual {v2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zzd(ILcom/google/android/gms/internal/ads/zzcu;Z)Lcom/google/android/gms/internal/ads/zzcu;

    iget-wide v1, v3, Lcom/google/android/gms/internal/ads/zzcu;->zze:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x0

    const-wide/16 v3, -0x1

    add-long/2addr v1, v3

    .line 3
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 4
    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zztd;->zzs(J)V

    return-void
.end method


# virtual methods
.method public final zzB()Lcom/google/android/gms/internal/ads/zzcx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    return-object v0
.end method

.method protected final zzC(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zztl;
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzte;->zzs(Lcom/google/android/gms/internal/ads/zzte;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzte;->zzs(Lcom/google/android/gms/internal/ads/zzte;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzte;->zzd:Ljava/lang/Object;

    .line 2
    :cond_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zztl;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zztl;

    move-result-object p1

    return-object p1
.end method

.method protected final zzD(Lcom/google/android/gms/internal/ads/zzcx;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzh:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzte;->zzp(Lcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzte;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zztd;->zzn()J

    move-result-wide v2

    .line 2
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zztg;->zzK(J)V

    goto/16 :goto_3

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzo()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzi:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzte;->zzp(Lcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzte;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcw;->zza:Ljava/lang/Object;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzte;->zzd:Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/ads/zzte;->zzr(Lcom/google/android/gms/internal/ads/zzcx;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzte;

    move-result-object p1

    .line 4
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    goto :goto_3

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzc:Lcom/google/android/gms/internal/ads/zzcw;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    .line 6
    invoke-virtual {p1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzc:Lcom/google/android/gms/internal/ads/zzcw;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzcw;->zzc:Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zztd;->zzq()J

    move-result-wide v6

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zztd;->zza:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zztg;->zzd:Lcom/google/android/gms/internal/ads/zzcu;

    .line 7
    invoke-virtual {v8, v5, v9}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcu;)Lcom/google/android/gms/internal/ads/zzcu;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zztg;->zzc:Lcom/google/android/gms/internal/ads/zzcw;

    .line 8
    invoke-virtual {v5, v2, v8, v3, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zze(ILcom/google/android/gms/internal/ads/zzcw;J)Lcom/google/android/gms/internal/ads/zzcw;

    cmp-long v2, v6, v3

    if-eqz v2, :cond_3

    move-wide v12, v6

    goto :goto_1

    :cond_3
    move-wide v12, v3

    :goto_1
    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zztg;->zzc:Lcom/google/android/gms/internal/ads/zzcw;

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zztg;->zzd:Lcom/google/android/gms/internal/ads/zzcu;

    const/4 v11, 0x0

    move-object v8, p1

    .line 9
    invoke-virtual/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/zzcx;->zzl(Lcom/google/android/gms/internal/ads/zzcw;Lcom/google/android/gms/internal/ads/zzcu;IJ)Landroid/util/Pair;

    move-result-object v2

    .line 10
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 11
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zztg;->zzi:Z

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    .line 12
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzte;->zzp(Lcom/google/android/gms/internal/ads/zzcx;)Lcom/google/android/gms/internal/ads/zzte;

    move-result-object p1

    goto :goto_2

    .line 13
    :cond_4
    invoke-static {p1, v0, v3}, Lcom/google/android/gms/internal/ads/zzte;->zzr(Lcom/google/android/gms/internal/ads/zzcx;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzte;

    move-result-object p1

    .line 12
    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    if-eqz p1, :cond_5

    .line 14
    invoke-direct {p0, v4, v5}, Lcom/google/android/gms/internal/ads/zztg;->zzK(J)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zztd;->zza:Lcom/google/android/gms/internal/ads/zztl;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    .line 15
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zztg;->zzJ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zztl;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zztl;

    move-result-object v1

    :cond_5
    :goto_3
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzi:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzh:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zze:Lcom/google/android/gms/internal/ads/zzte;

    .line 16
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzsm;->zzo(Lcom/google/android/gms/internal/ads/zzcx;)V

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    .line 18
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zztd;->zzr(Lcom/google/android/gms/internal/ads/zztl;)V

    :cond_6
    return-void
.end method

.method public final zzE()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzb:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzg:Z

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvm;->zza:Lcom/google/android/gms/internal/ads/zztn;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzsu;->zzA(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zztn;)V

    :cond_0
    return-void
.end method

.method public final zzF(Lcom/google/android/gms/internal/ads/zztj;)V
    .locals 1

    .line 1
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zztd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zztd;->zzt()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    :cond_0
    return-void
.end method

.method public final zzG(Lcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzxm;J)Lcom/google/android/gms/internal/ads/zztd;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zztd;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zztd;-><init>(Lcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzxm;J)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztg;->zza:Lcom/google/android/gms/internal/ads/zztn;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zztd;->zzu(Lcom/google/android/gms/internal/ads/zztn;)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zztg;->zzh:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zztl;->zza:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zztg;->zzJ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zztl;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zztl;

    move-result-object p1

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zztd;->zzr(Lcom/google/android/gms/internal/ads/zztl;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzf:Lcom/google/android/gms/internal/ads/zztd;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzg:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzg:Z

    const/4 p1, 0x0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvm;->zza:Lcom/google/android/gms/internal/ads/zztn;

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzsu;->zzA(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zztn;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final bridge synthetic zzH(Lcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzxm;J)Lcom/google/android/gms/internal/ads/zztj;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zztg;->zzG(Lcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzxm;J)Lcom/google/android/gms/internal/ads/zztd;

    move-result-object p1

    return-object p1
.end method

.method public final zzq()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzh:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzg:Z

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzvm;->zzq()V

    return-void
.end method

.method public final zzy()V
    .locals 0

    return-void
.end method
