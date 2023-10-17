.class public final Lcom/google/android/gms/internal/ads/zzcdq;
.super Lcom/google/android/gms/internal/ads/zzcdn;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final synthetic zzd:I

.field private static final zze:Ljava/util/Set;

.field private static final zzf:Ljava/text/DecimalFormat;


# instance fields
.field private zzg:Ljava/io/File;

.field private zzh:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzcdq;->zze:Ljava/util/Set;

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#,###"

    .line 2
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzcdq;->zzf:Ljava/text/DecimalFormat;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzccc;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzcdn;-><init>(Lcom/google/android/gms/internal/ads/zzccc;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zza:Landroid/content/Context;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Context.getCacheDir() returned null"

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "admobVideoStreams"

    .line 4
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Could not create preload cache directory at "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    return-void

    .line 5
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 6
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setReadable(ZZ)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    .line 7
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setExecutable(ZZ)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    .line 8
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Could not set cache file permissions at "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    return-void
.end method

.method private final zza(Ljava/io/File;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, ".done"

    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final zzf()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcdq;->zzh:Z

    return-void
.end method

.method public final zzt(Ljava/lang/String;)Z
    .locals 29

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    .line 3
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v0, :cond_1c

    :cond_0
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    if-nez v0, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    .line 1
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v4, v0, v2

    .line 2
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".done"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_3
    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzu:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v3, v0, :cond_9

    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    if-nez v0, :cond_4

    goto :goto_4

    .line 5
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const-wide v2, 0x7fffffffffffffffL

    move-object v5, v11

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_6

    aget-object v6, v0, v4

    .line 6
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v12, ".done"

    invoke-virtual {v7, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 7
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    move-result-wide v12

    cmp-long v7, v12, v2

    if-gez v7, :cond_5

    move-object v5, v6

    move-wide v2, v12

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    if-eqz v5, :cond_7

    .line 8
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    .line 9
    invoke-direct {v8, v5}, Lcom/google/android/gms/internal/ads/zzcdq;->zza(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 11
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    and-int/2addr v0, v1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :cond_8
    :goto_3
    if-nez v0, :cond_0

    :goto_4
    const-string v0, "Unable to expire stream cache"

    .line 95
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    const-string v0, "expireFailed"

    .line 96
    invoke-virtual {v8, v9, v11, v0, v11}, Lcom/google/android/gms/internal/ads/zzcdn;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v10

    .line 12
    :cond_9
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbzm;->zze(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ljava/io/File;

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    .line 13
    invoke-direct {v12, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    invoke-direct {v8, v12}, Lcom/google/android/gms/internal/ads/zzcdq;->zza(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    .line 15
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    move-result v1

    const/4 v13, 0x1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_5

    .line 92
    :cond_a
    invoke-virtual {v12}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Stream cache hit at "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zze(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v9, v0, v1}, Lcom/google/android/gms/internal/ads/zzcdn;->zzh(Ljava/lang/String;Ljava/lang/String;I)V

    return v13

    .line 15
    :cond_b
    :goto_5
    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzcdq;->zzg:Ljava/io/File;

    .line 16
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/zzcdq;->zze:Ljava/util/Set;

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 17
    monitor-enter v3

    .line 18
    :try_start_0
    invoke-interface {v3, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stream cache already in progress at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "inProgress"

    invoke-virtual {v8, v9, v0, v1, v11}, Lcom/google/android/gms/internal/ads/zzcdn;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    monitor-exit v3

    return v10

    .line 23
    :cond_c
    invoke-interface {v3, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 24
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v15, "error"

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzflq;->zza()Lcom/google/android/gms/internal/ads/zzflq;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcdp;

    invoke-direct {v2, v9}, Lcom/google/android/gms/internal/ads/zzcdp;-><init>(Ljava/lang/String;)V

    const/16 v4, 0x109

    const/4 v5, -0x1

    .line 25
    invoke-virtual {v1, v2, v4, v5}, Lcom/google/android/gms/internal/ads/zzflq;->zzn(Lcom/google/android/gms/internal/ads/zzflp;II)Ljava/net/HttpURLConnection;

    move-result-object v1

    .line 26
    instance-of v2, v1, Ljava/net/HttpURLConnection;

    if-eqz v2, :cond_e

    .line 27
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const/16 v4, 0x190

    if-ge v2, v4, :cond_d

    goto :goto_9

    :cond_d
    const-string v15, "badUrl"
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_13

    .line 78
    :try_start_2
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HTTP request failed. Code: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    .line 79
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HTTP status code "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    :goto_6
    move-object v2, v1

    goto :goto_8

    :catch_2
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v0

    :goto_7
    move-object v2, v11

    :goto_8
    move-object v1, v14

    goto/16 :goto_17

    .line 28
    :cond_e
    :goto_9
    :try_start_4
    invoke-virtual {v1}, Ljava/net/URLConnection;->getContentLength()I

    move-result v7

    if-gez v7, :cond_f

    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stream cache aborted, missing content-length header at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "contentLengthMissing"

    invoke-virtual {v8, v9, v0, v1, v11}, Lcom/google/android/gms/internal/ads/zzcdn;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-interface {v3, v14}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return v10

    :cond_f
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcdq;->zzf:Ljava/text/DecimalFormat;

    int-to-long v4, v7

    .line 33
    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/internal/ads/zzbbk;->zzv:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 34
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-le v7, v6, :cond_10

    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content length "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " exceeds limit at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "File too big for full file cache. Size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sizeExceeded"

    invoke-virtual {v8, v9, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcdn;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-interface {v3, v14}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return v10

    :cond_10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Caching "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " bytes from "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbzt;->zze(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    .line 44
    invoke-static {v1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    move-result-object v5

    new-instance v4, Ljava/io/FileOutputStream;

    .line 45
    invoke-direct {v4, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_13

    .line 46
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v3

    const/high16 v1, 0x100000

    .line 47
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 48
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/common/util/Clock;

    move-result-object v16

    .line 49
    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v17

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzy:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 50
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v11

    invoke-virtual {v11, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 51
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    new-instance v1, Lcom/google/android/gms/ads/internal/util/zzbz;

    invoke-direct {v1, v10, v11}, Lcom/google/android/gms/ads/internal/util/zzbz;-><init>(J)V

    sget-object v10, Lcom/google/android/gms/internal/ads/zzbbk;->zzx:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 52
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v11

    invoke-virtual {v11, v10}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v10

    .line 53
    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    const/4 v13, 0x0

    .line 54
    :goto_a
    invoke-interface {v5, v2}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v19
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_12
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_11

    if-ltz v19, :cond_16

    add-int v13, v13, v19

    if-gt v13, v6, :cond_15

    .line 55
    :try_start_6
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 56
    :cond_11
    invoke-virtual {v3, v2}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v19

    if-gtz v19, :cond_11

    .line 57
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 58
    invoke-interface/range {v16 .. v16}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v19

    sub-long v19, v19, v17

    const-wide/16 v21, 0x3e8

    mul-long v21, v21, v10

    cmp-long v23, v19, v21

    if-gtz v23, :cond_14

    move-object/from16 v19, v2

    .line 65
    iget-boolean v2, v8, Lcom/google/android/gms/internal/ads/zzcdq;->zzh:Z

    if-nez v2, :cond_13

    .line 59
    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/util/zzbz;->zzb()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 60
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v20

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbzm;->zza:Landroid/os/Handler;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_6

    move-object/from16 v21, v15

    :try_start_7
    new-instance v15, Lcom/google/android/gms/internal/ads/zzcdh;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4

    const/16 v22, 0x0

    move-object/from16 v23, v1

    move-object v1, v15

    move-object/from16 v24, v14

    move-object v14, v2

    move-object/from16 v2, p0

    move-object/from16 v25, v3

    move-object/from16 v3, p1

    move-object/from16 v26, v4

    move-object/from16 v4, v20

    move-object/from16 v20, v5

    move v5, v13

    move/from16 v27, v6

    move v6, v7

    move/from16 v28, v7

    move/from16 v7, v22

    :try_start_8
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzcdh;-><init>(Lcom/google/android/gms/internal/ads/zzcdn;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 61
    invoke-virtual {v14, v15}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_c

    :catch_4
    move-exception v0

    goto :goto_b

    :catch_5
    move-exception v0

    :goto_b
    move-object/from16 v26, v4

    goto/16 :goto_e

    :cond_12
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move-object/from16 v20, v5

    move/from16 v27, v6

    move/from16 v28, v7

    move-object/from16 v24, v14

    move-object/from16 v21, v15

    :goto_c
    move-object/from16 v2, v19

    move-object/from16 v5, v20

    move-object/from16 v15, v21

    move-object/from16 v1, v23

    move-object/from16 v14, v24

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    move/from16 v6, v27

    move/from16 v7, v28

    goto/16 :goto_a

    :cond_13
    move-object/from16 v26, v4

    move-object/from16 v24, v14

    move-object/from16 v21, v15

    const-string v15, "externalAbort"
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_f

    .line 65
    :try_start_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "abort requested"

    .line 66
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_a

    :cond_14
    move-object/from16 v26, v4

    move-object/from16 v24, v14

    move-object/from16 v21, v15

    :try_start_a
    const-string v15, "downloadTimeout"
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_f

    .line 64
    :try_start_b
    invoke-static {v10, v11}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Timeout exceeded. Limit: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sec"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_a

    :try_start_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream cache time limit exceeded"

    .line 65
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_8

    :catch_6
    move-exception v0

    goto :goto_d

    :catch_7
    move-exception v0

    :goto_d
    move-object/from16 v26, v4

    move-object/from16 v21, v15

    :goto_e
    move-object v1, v14

    goto/16 :goto_14

    :cond_15
    move-object/from16 v26, v4

    move-object/from16 v24, v14

    move-object/from16 v21, v15

    :try_start_d
    const-string v15, "sizeExceeded"
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_f

    .line 62
    :try_start_e
    invoke-static {v13}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "File too big for full file cache. Size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_a

    :try_start_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream cache file size limit exceeded"

    .line 63
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_8

    :catch_8
    move-exception v0

    goto :goto_f

    :catch_9
    move-exception v0

    :goto_f
    move-object v2, v11

    move-object/from16 v1, v24

    move-object/from16 v11, v26

    goto/16 :goto_17

    :catch_a
    move-exception v0

    goto :goto_10

    :catch_b
    move-exception v0

    :goto_10
    move-object/from16 v1, v24

    goto/16 :goto_15

    :cond_16
    move-object/from16 v26, v4

    move-object/from16 v24, v14

    move-object/from16 v21, v15

    .line 67
    :try_start_10
    invoke-virtual/range {v26 .. v26}, Ljava/io/FileOutputStream;->close()V

    const/4 v1, 0x3

    .line 68
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zze;->zzm(I)Z

    move-result v1

    if-eqz v1, :cond_17

    sget-object v1, Lcom/google/android/gms/internal/ads/zzcdq;->zzf:Ljava/text/DecimalFormat;

    int-to-long v2, v13

    .line 69
    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Preloaded "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bytes from "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzt;->zze(Ljava/lang/String;)V

    :cond_17
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 72
    invoke-virtual {v12, v1, v2}, Ljava/io/File;->setReadable(ZZ)Z

    .line 73
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/File;->setLastModified(J)Z
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_f

    goto :goto_11

    .line 75
    :cond_18
    :try_start_11
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_c
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_f

    .line 76
    :catch_c
    :goto_11
    :try_start_12
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v9, v0, v13}, Lcom/google/android/gms/internal/ads/zzcdn;->zzh(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdq;->zze:Ljava/util/Set;
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_f

    move-object/from16 v1, v24

    .line 77
    :try_start_13
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_d

    const/4 v0, 0x1

    return v0

    :catch_d
    move-exception v0

    goto :goto_14

    :catch_e
    move-exception v0

    goto :goto_14

    :catch_f
    move-exception v0

    goto :goto_12

    :catch_10
    move-exception v0

    :goto_12
    move-object/from16 v1, v24

    goto :goto_14

    :catch_11
    move-exception v0

    goto :goto_13

    :catch_12
    move-exception v0

    :goto_13
    move-object/from16 v26, v4

    move-object v1, v14

    move-object/from16 v21, v15

    :goto_14
    move-object/from16 v15, v21

    :goto_15
    move-object/from16 v11, v26

    const/4 v2, 0x0

    goto :goto_17

    :catch_13
    move-exception v0

    goto :goto_16

    :catch_14
    move-exception v0

    :goto_16
    move-object v1, v14

    move-object/from16 v21, v15

    move-object/from16 v15, v21

    const/4 v2, 0x0

    const/4 v11, 0x0

    .line 80
    :goto_17
    instance-of v3, v0, Ljava/lang/RuntimeException;

    if-eqz v3, :cond_19

    const-string v3, "VideoStreamFullFileCache.preload"

    .line 81
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/google/android/gms/internal/ads/zzbzc;

    move-result-object v4

    invoke-virtual {v4, v0, v3}, Lcom/google/android/gms/internal/ads/zzbzc;->zzu(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 82
    :cond_19
    :try_start_14
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_15
    .catch Ljava/lang/NullPointerException; {:try_start_14 .. :try_end_14} :catch_15

    goto :goto_18

    :catch_15
    nop

    :goto_18
    iget-boolean v3, v8, Lcom/google/android/gms/internal/ads/zzcdq;->zzh:Z

    if-eqz v3, :cond_1a

    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Preload aborted for URL \""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzi(Ljava/lang/String;)V

    goto :goto_19

    .line 91
    :cond_1a
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Preload failed for URL \""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 86
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    :goto_19
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1b

    .line 88
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Could not delete partial cache file at "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    .line 90
    :cond_1b
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v9, v0, v15, v2}, Lcom/google/android/gms/internal/ads/zzcdn;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdq;->zze:Ljava/util/Set;

    .line 91
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_1a
    const/4 v1, 0x0

    return v1

    :catchall_0
    move-exception v0

    .line 24
    :try_start_15
    monitor-exit v3
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    throw v0

    :cond_1c
    const-string v0, "noCacheDir"

    const/4 v1, 0x0

    .line 97
    invoke-virtual {v8, v9, v1, v0, v1}, Lcom/google/android/gms/internal/ads/zzcdn;->zzg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1a
.end method
