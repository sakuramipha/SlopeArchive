.class public final Lcom/google/android/gms/internal/ads/zzabb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field public final zza:I

.field public final zzb:I

.field public final zzc:I

.field public final zzd:I

.field public final zze:I

.field public final zzf:I

.field public final zzg:I

.field public final zzh:I

.field public final zzi:I

.field public final zzj:J

.field public final zzk:Lcom/google/android/gms/internal/ads/zzaba;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzca;


# direct methods
.method private constructor <init>(IIIIIIIJLcom/google/android/gms/internal/ads/zzaba;Lcom/google/android/gms/internal/ads/zzca;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzc:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzd:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzabb;->zzi(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzf:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzg:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzh:I

    invoke-static {p7}, Lcom/google/android/gms/internal/ads/zzabb;->zzh(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzi:I

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzk:Lcom/google/android/gms/internal/ads/zzaba;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzl:Lcom/google/android/gms/internal/ads/zzca;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfc;

    array-length v1, p1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzfc;-><init>([BI)V

    mul-int/lit8 p2, p2, 0x8

    .line 2
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzfc;->zzj(I)V

    const/16 p1, 0x10

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zza:I

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzb:I

    const/16 p1, 0x18

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzc:I

    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzd:I

    const/16 p1, 0x14

    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzabb;->zzi(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzf:I

    const/4 p1, 0x3

    .line 8
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzg:I

    const/4 p1, 0x5

    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzh:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzabb;->zzh(I)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzi:I

    const/4 p1, 0x4

    .line 10
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result p1

    const/16 p2, 0x20

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzfc;->zzd(I)I

    move-result v0

    sget v1, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    int-to-long v0, v0

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    shl-long p1, v2, p2

    and-long/2addr v0, v4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzk:Lcom/google/android/gms/internal/ads/zzaba;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzl:Lcom/google/android/gms/internal/ads/zzca;

    return-void
.end method

.method private static zzh(I)I
    .locals 1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_4

    const/16 v0, 0xc

    if-eq p0, v0, :cond_3

    const/16 v0, 0x10

    if-eq p0, v0, :cond_2

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 p0, 0x6

    return p0

    :cond_1
    const/4 p0, 0x5

    return p0

    :cond_2
    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x2

    return p0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method private static zzi(I)I
    .locals 0

    sparse-switch p0, :sswitch_data_0

    const/4 p0, -0x1

    return p0

    :sswitch_0
    const/4 p0, 0x3

    return p0

    :sswitch_1
    const/4 p0, 0x2

    return p0

    :sswitch_2
    const/16 p0, 0xb

    return p0

    :sswitch_3
    const/4 p0, 0x1

    return p0

    :sswitch_4
    const/16 p0, 0xa

    return p0

    :sswitch_5
    const/16 p0, 0x9

    return p0

    :sswitch_6
    const/16 p0, 0x8

    return p0

    :sswitch_7
    const/4 p0, 0x7

    return p0

    :sswitch_8
    const/4 p0, 0x6

    return p0

    :sswitch_9
    const/4 p0, 0x5

    return p0

    :sswitch_a
    const/4 p0, 0x4

    return p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final zza()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    :cond_0
    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public final zzb(J)J
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    const-wide/16 v4, -0x1

    add-long/2addr v2, v4

    mul-long p1, p1, v0

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final zzc([BLcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzam;
    .locals 3

    const/4 v0, 0x4

    const/16 v1, -0x80

    .line 1
    aput-byte v1, p1, v0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzd:I

    if-gtz v0, :cond_0

    const/4 v0, -0x1

    .line 2
    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/zzabb;->zzd(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object p2

    new-instance v1, Lcom/google/android/gms/internal/ads/zzak;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzak;-><init>()V

    const-string v2, "audio/flac"

    .line 3
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzak;->zzS(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;

    .line 4
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzak;->zzL(I)Lcom/google/android/gms/internal/ads/zzak;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzg:I

    .line 5
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzak;->zzw(I)Lcom/google/android/gms/internal/ads/zzak;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    .line 6
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzak;->zzT(I)Lcom/google/android/gms/internal/ads/zzak;

    .line 7
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzak;->zzI(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzak;

    .line 8
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzak;->zzM(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzak;

    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzak;->zzY()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object p1

    return-object p1
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzca;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzl:Lcom/google/android/gms/internal/ads/zzca;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzca;->zzd(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object p1

    return-object p1
.end method

.method public final zze(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzabb;
    .locals 13

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzca;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzca;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzabb;->zzd(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object v12

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabb;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zza:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzb:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzc:I

    iget v5, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzd:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzg:I

    iget v8, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzh:I

    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    iget-object v11, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzk:Lcom/google/android/gms/internal/ads/zzaba;

    move-object v1, p1

    invoke-direct/range {v1 .. v12}, Lcom/google/android/gms/internal/ads/zzabb;-><init>(IIIIIIIJLcom/google/android/gms/internal/ads/zzaba;Lcom/google/android/gms/internal/ads/zzca;)V

    return-object p1
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzaba;)Lcom/google/android/gms/internal/ads/zzabb;
    .locals 13

    new-instance v12, Lcom/google/android/gms/internal/ads/zzabb;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zza:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzb:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzc:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzd:I

    iget v5, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzg:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzh:I

    iget-wide v8, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    iget-object v11, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzl:Lcom/google/android/gms/internal/ads/zzca;

    move-object v0, v12

    move-object v10, p1

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ads/zzabb;-><init>(IIIIIIIJLcom/google/android/gms/internal/ads/zzaba;Lcom/google/android/gms/internal/ads/zzca;)V

    return-object v12
.end method

.method public final zzg(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzabb;
    .locals 12

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzabx;->zzb(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzabb;->zzd(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzca;

    move-result-object v11

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabb;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzabb;->zza:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzb:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzc:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzd:I

    iget v5, p0, Lcom/google/android/gms/internal/ads/zzabb;->zze:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzg:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzh:I

    iget-wide v8, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzj:J

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzabb;->zzk:Lcom/google/android/gms/internal/ads/zzaba;

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ads/zzabb;-><init>(IIIIIIIJLcom/google/android/gms/internal/ads/zzaba;Lcom/google/android/gms/internal/ads/zzca;)V

    return-object p1
.end method
