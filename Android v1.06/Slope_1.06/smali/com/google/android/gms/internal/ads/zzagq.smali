.class final Lcom/google/android/gms/internal/ads/zzagq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzabr;

.field public final zzb:Lcom/google/android/gms/internal/ads/zzahc;

.field public final zzc:Lcom/google/android/gms/internal/ads/zzfd;

.field public zzd:Lcom/google/android/gms/internal/ads/zzahd;

.field public zze:Lcom/google/android/gms/internal/ads/zzagm;

.field public zzf:I

.field public zzg:I

.field public zzh:I

.field public zzi:I

.field private final zzj:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzfd;

.field private zzl:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzabr;Lcom/google/android/gms/internal/ads/zzahd;Lcom/google/android/gms/internal/ads/zzagm;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzagq;->zze:Lcom/google/android/gms/internal/ads/zzagm;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzahc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzahc;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    .line 2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    const/4 v0, 0x1

    .line 3
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzfd;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzj:Lcom/google/android/gms/internal/ads/zzfd;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzfd;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzfd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzk:Lcom/google/android/gms/internal/ads/zzfd;

    .line 5
    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzagq;->zzh(Lcom/google/android/gms/internal/ads/zzahd;Lcom/google/android/gms/internal/ads/zzagm;)V

    return-void
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzagq;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    return-void
.end method

.method static bridge synthetic zzj(Lcom/google/android/gms/internal/ads/zzagq;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    return p0
.end method


# virtual methods
.method public final zza()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzg:[I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    aget v0, v0, v1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzj:[Z

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    .line 2
    aget-boolean v0, v0, v1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzagq;->zzf()Lcom/google/android/gms/internal/ads/zzahb;

    move-result-object v1

    if-eqz v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public final zzb()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzd:[I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzh:[I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    .line 2
    aget v0, v0, v1

    :goto_0
    return v0
.end method

.method public final zzc(II)I
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzagq;->zzf()Lcom/google/android/gms/internal/ads/zzahb;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzahb;->zzd:I

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzn:Lcom/google/android/gms/internal/ads/zzfd;

    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahb;->zze:[B

    .line 2
    sget v2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzk:Lcom/google/android/gms/internal/ads/zzfd;

    .line 3
    array-length v3, v0

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzD([BI)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzk:Lcom/google/android/gms/internal/ads/zzfd;

    move v2, v3

    .line 1
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    .line 4
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzahc;->zzb(I)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_3

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v5, 0x1

    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzj:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v7

    if-eq v4, v5, :cond_4

    const/4 v8, 0x0

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v8, v2

    int-to-byte v8, v8

    .line 5
    aput-byte v8, v7, v1

    .line 6
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzfd;->zzF(I)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzj:Lcom/google/android/gms/internal/ads/zzfd;

    .line 7
    invoke-interface {v6, v7, v4, v4}, Lcom/google/android/gms/internal/ads/zzabr;->zzr(Lcom/google/android/gms/internal/ads/zzfd;II)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    .line 8
    invoke-interface {v6, v0, v2, v4}, Lcom/google/android/gms/internal/ads/zzabr;->zzr(Lcom/google/android/gms/internal/ads/zzfd;II)V

    if-nez v5, :cond_5

    add-int/2addr v2, v4

    return v2

    :cond_5
    const/4 v0, 0x6

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/16 v7, 0x8

    if-nez v3, :cond_6

    int-to-byte p2, p2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 9
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzfd;->zzC(I)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v8

    .line 10
    aput-byte v1, v8, v1

    .line 11
    aput-byte v4, v8, v4

    .line 12
    aput-byte v1, v8, v6

    .line 13
    aput-byte p2, v8, v5

    const/4 p2, 0x4

    shr-int/lit8 v1, p1, 0x18

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 14
    aput-byte v1, v8, p2

    const/4 p2, 0x5

    shr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 15
    aput-byte v1, v8, p2

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 16
    aput-byte p2, v8, v0

    const/4 p2, 0x7

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 17
    aput-byte p1, v8, p2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    .line 18
    invoke-interface {p1, v3, v7, v4}, Lcom/google/android/gms/internal/ads/zzabr;->zzr(Lcom/google/android/gms/internal/ads/zzfd;II)V

    add-int/lit8 v2, v2, 0x9

    return v2

    :cond_6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzahc;->zzn:Lcom/google/android/gms/internal/ads/zzfd;

    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzo()I

    move-result v3

    const/4 v8, -0x2

    .line 20
    invoke-virtual {p1, v8}, Lcom/google/android/gms/internal/ads/zzfd;->zzG(I)V

    mul-int/lit8 v3, v3, 0x6

    add-int/2addr v3, v6

    if-eqz p2, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    .line 21
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzC(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzH()[B

    move-result-object v0

    .line 22
    invoke-virtual {p1, v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzfd;->zzB([BII)V

    .line 23
    aget-byte p1, v0, v6

    and-int/lit16 p1, p1, 0xff

    shl-int/2addr p1, v7

    aget-byte v1, v0, v5

    and-int/lit16 v1, v1, 0xff

    or-int/2addr p1, v1

    add-int/2addr p1, p2

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 24
    aput-byte p2, v0, v6

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 25
    aput-byte p1, v0, v5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzc:Lcom/google/android/gms/internal/ads/zzfd;

    :cond_7
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    .line 26
    invoke-interface {p2, p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzabr;->zzr(Lcom/google/android/gms/internal/ads/zzfd;II)V

    add-int/2addr v2, v4

    add-int/2addr v2, v3

    return v2
.end method

.method public final zzd()J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzc:[J

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    aget-wide v1, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzf:[J

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzh:I

    .line 2
    aget-wide v1, v0, v1

    :goto_0
    return-wide v1
.end method

.method public final zze()J
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahd;->zzf:[J

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    aget-wide v1, v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzi:[J

    .line 2
    aget-wide v1, v0, v1

    :goto_0
    return-wide v1
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzahb;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzahc;->zza:Lcom/google/android/gms/internal/ads/zzagm;

    sget v2, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzagm;->zza:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzahc;->zzm:Lcom/google/android/gms/internal/ads/zzahb;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    .line 2
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzaha;->zza(I)Lcom/google/android/gms/internal/ads/zzahb;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_2

    .line 1
    iget-boolean v0, v2, Lcom/google/android/gms/internal/ads/zzahb;->zza:Z

    if-eqz v0, :cond_2

    return-object v2

    :cond_2
    return-object v1
.end method

.method public final zzh(Lcom/google/android/gms/internal/ads/zzahd;Lcom/google/android/gms/internal/ads/zzagm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzd:Lcom/google/android/gms/internal/ads/zzahd;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zze:Lcom/google/android/gms/internal/ads/zzagm;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zza:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzahd;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzagq;->zzi()V

    return-void
.end method

.method public final zzi()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzd:I

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzp:J

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzq:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzk:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzo:Z

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzahc;->zzm:Lcom/google/android/gms/internal/ads/zzahb;

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzh:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzg:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzi:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    return-void
.end method

.method public final zzk()Z
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzf:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzl:Z

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzg:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzg:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzb:Lcom/google/android/gms/internal/ads/zzahc;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzahc;->zzg:[I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzh:I

    aget v3, v3, v4

    if-ne v0, v3, :cond_1

    add-int/2addr v4, v1

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzh:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzagq;->zzg:I

    return v2

    :cond_1
    return v1
.end method
