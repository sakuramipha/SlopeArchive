.class final Lcom/google/android/gms/internal/ads/zzfra;
.super Ljava/util/AbstractMap;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final zzd:Ljava/lang/Object;


# instance fields
.field transient zza:[I
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field transient zzb:[Ljava/lang/Object;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field transient zzc:[Ljava/lang/Object;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field private transient zze:Ljava/lang/Object;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field private transient zzf:I

.field private transient zzg:I

.field private transient zzh:Ljava/util/Set;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field private transient zzi:Ljava/util/Set;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field private transient zzj:Ljava/util/Collection;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfra;->zzd:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfra;->zzm(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/16 p1, 0x8

    .line 4
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzfra;->zzm(I)V

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzfra;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    return p0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzfra;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    return p0
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzfra;)I
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzp()I

    move-result p0

    return p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzfra;Ljava/lang/Object;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfra;->zzq(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzfra;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfra;->zzs(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic zzh(Lcom/google/android/gms/internal/ads/zzfra;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method static bridge synthetic zzi()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfra;->zzd:Ljava/lang/Object;

    return-object v0
.end method

.method static bridge synthetic zzk(Lcom/google/android/gms/internal/ads/zzfra;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    return-void
.end method

.method private final zzp()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    and-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    shl-int v0, v1, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method private final zzq(Ljava/lang/Object;)I
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzo()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfrj;->zzb(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzp()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    .line 2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    and-int v4, v0, v2

    .line 3
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzfrb;->zzc(Ljava/lang/Object;I)I

    move-result v3

    if-eqz v3, :cond_4

    not-int v4, v2

    and-int/2addr v0, v4

    :cond_1
    add-int/2addr v3, v1

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    aget v5, v5, v3

    and-int v6, v5, v4

    if-ne v6, v0, :cond_3

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    aget-object v6, v6, v3

    .line 8
    invoke-static {p1, v6}, Lcom/google/android/gms/internal/ads/zzfou;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    return v3

    :cond_3
    :goto_0
    and-int v3, v5, v2

    if-nez v3, :cond_1

    :cond_4
    return v1
.end method

.method private final zzr(IIII)I
    .locals 8

    add-int/lit8 v0, p2, -0x1

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzfrb;->zzd(I)Ljava/lang/Object;

    move-result-object p2

    if-eqz p4, :cond_0

    and-int/2addr p3, v0

    add-int/lit8 p4, p4, 0x1

    .line 2
    invoke-static {p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzfrb;->zze(Ljava/lang/Object;II)V

    :cond_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    :goto_0
    if-gt v1, p1, :cond_2

    .line 5
    invoke-static {p3, v1}, Lcom/google/android/gms/internal/ads/zzfrb;->zzc(Ljava/lang/Object;I)I

    move-result v2

    :goto_1
    if-eqz v2, :cond_1

    add-int/lit8 v3, v2, -0x1

    .line 6
    aget v4, p4, v3

    not-int v5, p1

    and-int/2addr v5, v4

    or-int/2addr v5, v1

    and-int v6, v5, v0

    .line 7
    invoke-static {p2, v6}, Lcom/google/android/gms/internal/ads/zzfrb;->zzc(Ljava/lang/Object;I)I

    move-result v7

    .line 8
    invoke-static {p2, v6, v2}, Lcom/google/android/gms/internal/ads/zzfrb;->zze(Ljava/lang/Object;II)V

    not-int v2, v0

    and-int v6, v7, v0

    and-int/2addr v2, v5

    or-int/2addr v2, v6

    .line 9
    aput v2, p4, v3

    and-int v2, v4, p1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzfra;->zzt(I)V

    return v0
.end method

.method private final zzs(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzo()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zzfra;->zzd:Ljava/lang/Object;

    return-object p1

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzp()I

    move-result v7

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, 0x0

    move-object v0, p1

    move v2, v7

    .line 4
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzfrb;->zzb(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/google/android/gms/internal/ads/zzfra;->zzd:Ljava/lang/Object;

    return-object p1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    aget-object v1, v1, p1

    .line 7
    invoke-virtual {p0, p1, v7}, Lcom/google/android/gms/internal/ads/zzfra;->zzn(II)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzl()V

    return-object v1
.end method

.method private final zzt(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x20

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    and-int/lit8 v0, v0, -0x20

    and-int/lit8 p1, p1, 0x1f

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzo()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzl()V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzj()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    .line 4
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    .line 6
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    instance-of v1, v0, [B

    if-eqz v1, :cond_1

    .line 9
    check-cast v0, [B

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V

    goto :goto_0

    .line 10
    :cond_1
    instance-of v1, v0, [S

    if-eqz v1, :cond_2

    .line 11
    check-cast v0, [S

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([SS)V

    goto :goto_0

    .line 12
    :cond_2
    check-cast v0, [I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    .line 14
    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    return-void

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->size()I

    move-result v3

    const/4 v4, 0x3

    const v5, 0x3fffffff    # 1.9999999f

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzftz;->zzb(III)I

    move-result v3

    iput v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    .line 16
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzj()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfra;->zzq(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzj()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    aget-object v2, v2, v1

    .line 4
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/ads/zzfou;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0

    .line 5
    :cond_2
    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzi:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfqu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfqu;-><init>(Lcom/google/android/gms/internal/ads/zzfra;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzi:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzj()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfra;->zzq(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    aget-object p1, v0, p1

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzh:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfqx;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfqx;-><init>(Lcom/google/android/gms/internal/ads/zzfra;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzh:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzo()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzo()Z

    move-result v3

    const-string v4, "Arrays already allocated"

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzfoz;->zzi(ZLjava/lang/Object;)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    add-int/lit8 v4, v3, 0x1

    const/4 v5, 0x2

    .line 2
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 3
    invoke-static {v4}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v5

    int-to-double v6, v5

    double-to-int v6, v6

    if-le v4, v6, :cond_0

    add-int/2addr v5, v5

    if-gtz v5, :cond_0

    const/high16 v5, 0x40000000    # 2.0f

    :cond_0
    const/4 v4, 0x4

    .line 4
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 5
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzfrb;->zzd(I)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    add-int/lit8 v4, v4, -0x1

    .line 6
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ads/zzfra;->zzt(I)V

    .line 7
    new-array v4, v3, [I

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 8
    new-array v4, v3, [Ljava/lang/Object;

    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 9
    new-array v3, v3, [Ljava/lang/Object;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 10
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzj()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_b

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 12
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 13
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    add-int/lit8 v8, v7, 0x1

    .line 14
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfrj;->zzb(Ljava/lang/Object;)I

    move-result v9

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzp()I

    move-result v10

    and-int v3, v9, v10

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    .line 15
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-static {v11, v3}, Lcom/google/android/gms/internal/ads/zzfrb;->zzc(Ljava/lang/Object;I)I

    move-result v11

    if-nez v11, :cond_3

    if-le v8, v10, :cond_2

    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzfrb;->zza(I)I

    move-result v3

    .line 35
    invoke-direct {v0, v10, v3, v9, v7}, Lcom/google/android/gms/internal/ads/zzfra;->zzr(IIII)I

    move-result v10

    goto/16 :goto_3

    .line 51
    :cond_2
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/ads/zzfrb;->zze(Ljava/lang/Object;II)V

    goto :goto_3

    :cond_3
    not-int v14, v10

    and-int v15, v9, v14

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v11, v11, -0x1

    .line 17
    aget v16, v4, v11

    and-int v12, v16, v14

    if-ne v12, v15, :cond_5

    .line 18
    aget-object v13, v5, v11

    .line 19
    invoke-static {v1, v13}, Lcom/google/android/gms/internal/ads/zzfou;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    goto :goto_1

    .line 31
    :cond_4
    aget-object v1, v6, v11

    .line 32
    aput-object v2, v6, v11

    return-object v1

    :cond_5
    :goto_1
    and-int v13, v16, v10

    const/16 v16, 0x1

    add-int/lit8 v3, v3, 0x1

    if-nez v13, :cond_a

    const/16 v5, 0x9

    if-lt v3, v5, :cond_7

    .line 19
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzp()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-instance v4, Ljava/util/LinkedHashMap;

    const/high16 v5, 0x3f800000    # 1.0f

    .line 20
    invoke-direct {v4, v3, v5}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 21
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zze()I

    move-result v3

    :goto_2
    if-ltz v3, :cond_6

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    aget-object v5, v5, v3

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    aget-object v6, v6, v3

    .line 26
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfra;->zzf(I)I

    move-result v3

    goto :goto_2

    :cond_6
    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 27
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzl()V

    .line 28
    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_7
    if-le v8, v10, :cond_8

    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzfrb;->zza(I)I

    move-result v3

    .line 29
    invoke-direct {v0, v10, v3, v9, v7}, Lcom/google/android/gms/internal/ads/zzfra;->zzr(IIII)I

    move-result v10

    goto :goto_3

    :cond_8
    and-int v3, v8, v10

    or-int/2addr v3, v12

    .line 30
    aput v3, v4, v11

    .line 35
    :goto_3
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    array-length v3, v3

    if-le v8, v3, :cond_9

    const v4, 0x3fffffff    # 1.9999999f

    ushr-int/lit8 v5, v3, 0x1

    const/4 v11, 0x1

    .line 38
    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/2addr v5, v3

    or-int/2addr v5, v11

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-eq v4, v3, :cond_9

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    :cond_9
    not-int v3, v10

    and-int/2addr v3, v9

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    aput v3, v4, v7

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    aput-object v1, v3, v7

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    aput-object v2, v1, v7

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    .line 51
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzl()V

    const/4 v12, 0x0

    return-object v12

    :cond_a
    move v11, v13

    goto/16 :goto_0

    .line 52
    :cond_b
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzj()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfra;->zzs(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfra;->zzd:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzj()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    :goto_0
    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzj:Ljava/util/Collection;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfqz;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfqz;-><init>(Lcom/google/android/gms/internal/ads/zzfra;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzj:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method

.method final zze()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzf(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:I

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method final zzj()Ljava/util/Map;
    .locals 2
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Ljava/util/Map;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method final zzl()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    return-void
.end method

.method final zzm(I)V
    .locals 2

    const/16 p1, 0x8

    const/4 v0, 0x1

    const v1, 0x3fffffff    # 1.9999999f

    .line 1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzftz;->zzb(III)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:I

    return-void
.end method

.method final zzn(II)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zza:[I

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:[Ljava/lang/Object;

    .line 3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:[Ljava/lang/Object;

    .line 4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-ge p1, v4, :cond_2

    .line 6
    aget-object v7, v2, v4

    .line 7
    aput-object v7, v2, p1

    .line 8
    aget-object v8, v3, v4

    aput-object v8, v3, p1

    .line 9
    aput-object v6, v2, v4

    .line 10
    aput-object v6, v3, v4

    .line 11
    aget v2, v1, v4

    aput v2, v1, p1

    .line 12
    aput v5, v1, v4

    .line 13
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzfrj;->zzb(Ljava/lang/Object;)I

    move-result v2

    and-int/2addr v2, p2

    .line 14
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzfrb;->zzc(Ljava/lang/Object;I)I

    move-result v3

    add-int/lit8 v4, v4, 0x1

    if-eq v3, v4, :cond_1

    :goto_0
    add-int/lit8 v3, v3, -0x1

    .line 15
    aget v0, v1, v3

    and-int v2, v0, p2

    if-eq v2, v4, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    not-int v2, p2

    and-int/2addr v0, v2

    and-int/2addr p1, p2

    or-int/2addr p1, v0

    .line 16
    aput p1, v1, v3

    return-void

    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 17
    invoke-static {v0, v2, p1}, Lcom/google/android/gms/internal/ads/zzfrb;->zze(Ljava/lang/Object;II)V

    return-void

    .line 18
    :cond_2
    aput-object v6, v2, p1

    .line 19
    aput-object v6, v3, p1

    .line 20
    aput v5, v1, p1

    return-void
.end method

.method final zzo()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
