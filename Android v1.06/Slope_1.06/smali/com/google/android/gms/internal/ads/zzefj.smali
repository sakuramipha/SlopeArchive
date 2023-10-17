.class final Lcom/google/android/gms/internal/ads/zzefj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfvn;


# instance fields
.field final synthetic zza:J

.field final synthetic zzb:Ljava/lang/String;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzezf;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzezi;

.field final synthetic zze:Lcom/google/android/gms/internal/ads/zzfgf;

.field final synthetic zzf:Lcom/google/android/gms/internal/ads/zzezr;

.field final synthetic zzg:Lcom/google/android/gms/internal/ads/zzefk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzefk;JLjava/lang/String;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezi;Lcom/google/android/gms/internal/ads/zzfgf;Lcom/google/android/gms/internal/ads/zzezr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zza:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzb:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzd:Lcom/google/android/gms/internal/ads/zzezi;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzefj;->zze:Lcom/google/android/gms/internal/ads/zzfgf;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzf:Lcom/google/android/gms/internal/ads/zzezr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzefk;->zzd(Lcom/google/android/gms/internal/ads/zzefk;)Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zza:J

    sub-long/2addr v0, v2

    .line 2
    instance-of v2, p1, Ljava/util/concurrent/TimeoutException;

    const/4 v3, 0x6

    const/4 v11, 0x3

    const/4 v12, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    move-object v10, v12

    const/4 v3, 0x2

    goto :goto_0

    .line 3
    :cond_0
    instance-of v2, p1, Lcom/google/android/gms/internal/ads/zzeex;

    if-eqz v2, :cond_1

    move-object v10, v12

    const/4 v3, 0x3

    goto :goto_0

    .line 4
    :cond_1
    instance-of v2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_2

    const/4 v2, 0x4

    move-object v10, v12

    const/4 v3, 0x4

    goto :goto_0

    .line 5
    :cond_2
    instance-of v2, p1, Lcom/google/android/gms/internal/ads/zzfaf;

    if-eqz v2, :cond_3

    const/4 v2, 0x5

    move-object v10, v12

    const/4 v3, 0x5

    goto :goto_0

    .line 6
    :cond_3
    instance-of v2, p1, Lcom/google/android/gms/internal/ads/zzdtz;

    if-eqz v2, :cond_5

    .line 7
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfba;->zza(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v2

    .line 8
    iget v2, v2, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    if-ne v2, v11, :cond_4

    const/4 v3, 0x1

    .line 9
    :cond_4
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbk;->zzby:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v2

    .line 9
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    instance-of v2, p1, Lcom/google/android/gms/internal/ads/zzebz;

    if-eqz v2, :cond_5

    .line 11
    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzebz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzebz;->zzb()Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v2

    if-eqz v2, :cond_5

    iget v2, v2, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v10, v2

    goto :goto_0

    :cond_5
    move-object v10, v12

    .line 2
    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    .line 13
    iget-object v9, v2, Lcom/google/android/gms/internal/ads/zzezf;->zzag:Ljava/lang/String;

    move v6, v3

    move-wide v7, v0

    invoke-static/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzefk;->zzg(Lcom/google/android/gms/internal/ads/zzefk;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzefk;->zzh(Lcom/google/android/gms/internal/ads/zzefk;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzefk;->zzb(Lcom/google/android/gms/internal/ads/zzefk;)Lcom/google/android/gms/internal/ads/zzefl;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzd:Lcom/google/android/gms/internal/ads/zzezi;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    .line 14
    instance-of v2, p1, Lcom/google/android/gms/internal/ads/zzebz;

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/ads/zzebz;

    move-object v8, v2

    goto :goto_1

    :cond_6
    move-object v8, v12

    :goto_1
    move v7, v3

    move-wide v9, v0

    .line 15
    invoke-virtual/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzefl;->zza(Lcom/google/android/gms/internal/ads/zzezi;Lcom/google/android/gms/internal/ads/zzezf;ILcom/google/android/gms/internal/ads/zzebz;J)V

    .line 16
    :cond_7
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbk;->zzhR:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzefk;->zzc(Lcom/google/android/gms/internal/ads/zzefk;)Lcom/google/android/gms/internal/ads/zzfgj;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzefj;->zze:Lcom/google/android/gms/internal/ads/zzfgf;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzf:Lcom/google/android/gms/internal/ads/zzezr;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    .line 18
    iget-object v6, v5, Lcom/google/android/gms/internal/ads/zzezf;->zzo:Ljava/util/List;

    .line 19
    invoke-virtual {v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzfgf;->zzc(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 18
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzfgj;->zzd(Ljava/util/List;)V

    .line 20
    :cond_8
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfba;->zza(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p1

    .line 21
    iget v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    if-eq v2, v11, :cond_9

    if-nez v2, :cond_a

    :cond_9
    iget-object v2, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zze;->zzc:Ljava/lang/String;

    const-string v3, "com.google.android.gms.ads"

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v2, Lcom/google/android/gms/internal/ads/zzebz;

    const/16 v3, 0xd

    .line 23
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zzd:Lcom/google/android/gms/ads/internal/client/zze;

    invoke-direct {v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzebz;-><init>(ILcom/google/android/gms/ads/internal/client/zze;)V

    .line 24
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfba;->zza(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p1

    :cond_a
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzefk;->zza(Lcom/google/android/gms/internal/ads/zzefk;)Lcom/google/android/gms/internal/ads/zzeca;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    .line 25
    invoke-virtual {v2, v3, v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzeca;->zze(Lcom/google/android/gms/internal/ads/zzezf;JLcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final zzb(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzefk;->zzd(Lcom/google/android/gms/internal/ads/zzefk;)Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zza:J

    sub-long/2addr v0, v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzb:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    .line 2
    iget-object v9, p1, Lcom/google/android/gms/internal/ads/zzezf;->zzag:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-wide v7, v0

    invoke-static/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzefk;->zzg(Lcom/google/android/gms/internal/ads/zzefk;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzefk;->zzh(Lcom/google/android/gms/internal/ads/zzefk;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzefk;->zzb(Lcom/google/android/gms/internal/ads/zzefk;)Lcom/google/android/gms/internal/ads/zzefl;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzd:Lcom/google/android/gms/internal/ads/zzezi;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v9, v0

    .line 3
    invoke-virtual/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzefl;->zza(Lcom/google/android/gms/internal/ads/zzezi;Lcom/google/android/gms/internal/ads/zzezf;ILcom/google/android/gms/internal/ads/zzebz;J)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzg:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzefk;->zza(Lcom/google/android/gms/internal/ads/zzefk;)Lcom/google/android/gms/internal/ads/zzeca;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzefj;->zzc:Lcom/google/android/gms/internal/ads/zzezf;

    const/4 v3, 0x0

    .line 4
    invoke-virtual {p1, v2, v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzeca;->zzf(Lcom/google/android/gms/internal/ads/zzezf;JLcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
