.class final Lcom/google/android/gms/internal/ads/zzss;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zztv;
.implements Lcom/google/android/gms/internal/ads/zzqm;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzsu;

.field private final zzb:Ljava/lang/Object;

.field private zzc:Lcom/google/android/gms/internal/ads/zztu;

.field private zzd:Lcom/google/android/gms/internal/ads/zzql;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzsu;Ljava/lang/Object;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zza:Lcom/google/android/gms/internal/ads/zzsu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzsm;->zze(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zztu;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzsm;->zzc(Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzql;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzd:Lcom/google/android/gms/internal/ads/zzql;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzss;->zzb:Ljava/lang/Object;

    return-void
.end method

.method private final zzf(Lcom/google/android/gms/internal/ads/zzth;)Lcom/google/android/gms/internal/ads/zzth;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zza:Lcom/google/android/gms/internal/ads/zzsu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzb:Ljava/lang/Object;

    iget-wide v8, p1, Lcom/google/android/gms/internal/ads/zzth;->zzc:J

    invoke-virtual {v0, v1, v8, v9}, Lcom/google/android/gms/internal/ads/zzsu;->zzw(Ljava/lang/Object;J)J

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zza:Lcom/google/android/gms/internal/ads/zzsu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzb:Ljava/lang/Object;

    iget-wide v10, p1, Lcom/google/android/gms/internal/ads/zzth;->zzd:J

    .line 2
    invoke-virtual {v0, v1, v10, v11}, Lcom/google/android/gms/internal/ads/zzsu;->zzw(Ljava/lang/Object;J)J

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzth;->zzc:J

    cmp-long v2, v8, v0

    if-nez v2, :cond_0

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzth;->zzd:J

    cmp-long v2, v10, v0

    if-nez v2, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzth;

    const/4 v3, 0x1

    iget v4, p1, Lcom/google/android/gms/internal/ads/zzth;->zza:I

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zzth;->zzb:Lcom/google/android/gms/internal/ads/zzam;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/ads/zzth;-><init>(IILcom/google/android/gms/internal/ads/zzam;ILjava/lang/Object;JJ)V

    return-object v0
.end method

.method private final zzg(ILcom/google/android/gms/internal/ads/zztl;)Z
    .locals 2

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zza:Lcom/google/android/gms/internal/ads/zzsu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzb:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzsu;->zzx(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zztl;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return p1

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zza:Lcom/google/android/gms/internal/ads/zzsu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzb:Ljava/lang/Object;

    .line 2
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzsu;->zzv(Ljava/lang/Object;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    .line 3
    iget v1, v0, Lcom/google/android/gms/internal/ads/zztu;->zza:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zztu;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    .line 4
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zza:Lcom/google/android/gms/internal/ads/zzsu;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzsm;->zzf(ILcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zztu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zzd:Lcom/google/android/gms/internal/ads/zzql;

    .line 5
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzql;->zzb:Lcom/google/android/gms/internal/ads/zztl;

    .line 6
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/zzfn;->zzB(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzss;->zza:Lcom/google/android/gms/internal/ads/zzsu;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzsm;->zzd(ILcom/google/android/gms/internal/ads/zztl;)Lcom/google/android/gms/internal/ads/zzql;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzd:Lcom/google/android/gms/internal/ads/zzql;

    :cond_3
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final zzaf(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zzth;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzss;->zzg(ILcom/google/android/gms/internal/ads/zztl;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    .line 2
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzss;->zzf(Lcom/google/android/gms/internal/ads/zzth;)Lcom/google/android/gms/internal/ads/zzth;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zztu;->zzc(Lcom/google/android/gms/internal/ads/zzth;)V

    :cond_0
    return-void
.end method

.method public final zzag(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzss;->zzg(ILcom/google/android/gms/internal/ads/zztl;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    .line 2
    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/ads/zzss;->zzf(Lcom/google/android/gms/internal/ads/zzth;)Lcom/google/android/gms/internal/ads/zzth;

    move-result-object p2

    .line 3
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zztu;->zzd(Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V

    :cond_0
    return-void
.end method

.method public final zzah(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzss;->zzg(ILcom/google/android/gms/internal/ads/zztl;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    .line 2
    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/ads/zzss;->zzf(Lcom/google/android/gms/internal/ads/zzth;)Lcom/google/android/gms/internal/ads/zzth;

    move-result-object p2

    .line 3
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zztu;->zze(Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V

    :cond_0
    return-void
.end method

.method public final zzai(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;Ljava/io/IOException;Z)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzss;->zzg(ILcom/google/android/gms/internal/ads/zztl;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    .line 2
    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/ads/zzss;->zzf(Lcom/google/android/gms/internal/ads/zzth;)Lcom/google/android/gms/internal/ads/zzth;

    move-result-object p2

    .line 3
    invoke-virtual {p1, p3, p2, p5, p6}, Lcom/google/android/gms/internal/ads/zztu;->zzf(Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public final zzaj(ILcom/google/android/gms/internal/ads/zztl;Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzss;->zzg(ILcom/google/android/gms/internal/ads/zztl;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzss;->zzc:Lcom/google/android/gms/internal/ads/zztu;

    .line 2
    invoke-direct {p0, p4}, Lcom/google/android/gms/internal/ads/zzss;->zzf(Lcom/google/android/gms/internal/ads/zzth;)Lcom/google/android/gms/internal/ads/zzth;

    move-result-object p2

    .line 3
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zztu;->zzg(Lcom/google/android/gms/internal/ads/zztc;Lcom/google/android/gms/internal/ads/zzth;)V

    :cond_0
    return-void
.end method
