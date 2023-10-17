.class public final Lcom/google/android/gms/internal/ads/zzge;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfx;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/List;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfx;

.field private zzd:Lcom/google/android/gms/internal/ads/zzfx;

.field private zze:Lcom/google/android/gms/internal/ads/zzfx;

.field private zzf:Lcom/google/android/gms/internal/ads/zzfx;

.field private zzg:Lcom/google/android/gms/internal/ads/zzfx;

.field private zzh:Lcom/google/android/gms/internal/ads/zzfx;

.field private zzi:Lcom/google/android/gms/internal/ads/zzfx;

.field private zzj:Lcom/google/android/gms/internal/ads/zzfx;

.field private zzk:Lcom/google/android/gms/internal/ads/zzfx;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzge;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzge;->zzc:Lcom/google/android/gms/internal/ads/zzfx;

    new-instance p1, Ljava/util/ArrayList;

    .line 2
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzge;->zzb:Ljava/util/List;

    return-void
.end method

.method private final zzg()Lcom/google/android/gms/internal/ads/zzfx;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zze:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzge;->zza:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zze:Lcom/google/android/gms/internal/ads/zzfx;

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzge;->zzh(Lcom/google/android/gms/internal/ads/zzfx;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zze:Lcom/google/android/gms/internal/ads/zzfx;

    return-object v0
.end method

.method private final zzh(Lcom/google/android/gms/internal/ads/zzfx;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzge;->zzb:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzge;->zzb:Ljava/util/List;

    .line 2
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzgz;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzfx;->zzf(Lcom/google/android/gms/internal/ads/zzgz;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzfx;->zzf(Lcom/google/android/gms/internal/ads/zzgz;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final zza([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfx;->zza([BII)I

    move-result p1

    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzgc;)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzf(Z)V

    .line 2
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzgc;->zza:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzgc;->zza:Landroid/net/Uri;

    sget v3, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    .line 4
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, "file"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v2, "asset"

    .line 11
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzge;->zzg()Lcom/google/android/gms/internal/ads/zzfx;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    goto/16 :goto_5

    :cond_2
    const-string v2, "content"

    .line 13
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzf:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzge;->zza:Landroid/content/Context;

    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzf:Lcom/google/android/gms/internal/ads/zzfx;

    .line 15
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzge;->zzh(Lcom/google/android/gms/internal/ads/zzfx;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzf:Lcom/google/android/gms/internal/ads/zzfx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    goto/16 :goto_5

    :cond_4
    const-string v2, "rtmp"

    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzg:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_5

    :try_start_0
    const-string v0, "androidx.media3.datasource.rtmp.RtmpDataSource"

    .line 17
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Class;

    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzg:Lcom/google/android/gms/internal/ads/zzfx;

    .line 19
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzge;->zzh(Lcom/google/android/gms/internal/ads/zzfx;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 30
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error instantiating RTMP extension"

    .line 20
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    const-string v0, "DefaultDataSource"

    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    .line 21
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzg:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzc:Lcom/google/android/gms/internal/ads/zzfx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzg:Lcom/google/android/gms/internal/ads/zzfx;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzg:Lcom/google/android/gms/internal/ads/zzfx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    goto/16 :goto_5

    :cond_6
    const-string v1, "udp"

    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzh:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_7

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhb;

    const/16 v1, 0x7d0

    .line 23
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhb;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzh:Lcom/google/android/gms/internal/ads/zzfx;

    .line 24
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzge;->zzh(Lcom/google/android/gms/internal/ads/zzfx;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzh:Lcom/google/android/gms/internal/ads/zzfx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    goto/16 :goto_5

    :cond_8
    const-string v1, "data"

    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzi:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_9

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfv;

    .line 26
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfv;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzi:Lcom/google/android/gms/internal/ads/zzfx;

    .line 27
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzge;->zzh(Lcom/google/android/gms/internal/ads/zzfx;)V

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzi:Lcom/google/android/gms/internal/ads/zzfx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    goto :goto_5

    :cond_a
    const-string v1, "rawresource"

    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "android.resource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_2

    .line 30
    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzc:Lcom/google/android/gms/internal/ads/zzfx;

    goto :goto_3

    .line 28
    :cond_c
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzj:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_d

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzge;->zza:Landroid/content/Context;

    .line 29
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzj:Lcom/google/android/gms/internal/ads/zzfx;

    .line 30
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzge;->zzh(Lcom/google/android/gms/internal/ads/zzfx;)V

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzj:Lcom/google/android/gms/internal/ads/zzfx;

    :goto_3
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    goto :goto_5

    .line 6
    :cond_e
    :goto_4
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzgc;->zza:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    const-string v1, "/android_asset/"

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 10
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzge;->zzg()Lcom/google/android/gms/internal/ads/zzfx;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    goto :goto_5

    .line 31
    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzd:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_10

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgn;

    .line 8
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgn;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzd:Lcom/google/android/gms/internal/ads/zzfx;

    .line 9
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzge;->zzh(Lcom/google/android/gms/internal/ads/zzfx;)V

    :cond_10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzd:Lcom/google/android/gms/internal/ads/zzfx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    .line 10
    :goto_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    .line 31
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfx;->zzb(Lcom/google/android/gms/internal/ads/zzgc;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfx;->zzc()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfx;->zzd()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    .line 2
    throw v0

    :cond_0
    return-void
.end method

.method public final zze()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzk:Lcom/google/android/gms/internal/ads/zzfx;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfx;->zze()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzgz;)V
    .locals 1

    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzc:Lcom/google/android/gms/internal/ads/zzfx;

    .line 1
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzfx;->zzf(Lcom/google/android/gms/internal/ads/zzgz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzb:Ljava/util/List;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzd:Lcom/google/android/gms/internal/ads/zzfx;

    .line 3
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzge;->zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zze:Lcom/google/android/gms/internal/ads/zzfx;

    .line 4
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzge;->zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzf:Lcom/google/android/gms/internal/ads/zzfx;

    .line 5
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzge;->zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzg:Lcom/google/android/gms/internal/ads/zzfx;

    .line 6
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzge;->zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzh:Lcom/google/android/gms/internal/ads/zzfx;

    .line 7
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzge;->zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzi:Lcom/google/android/gms/internal/ads/zzfx;

    .line 8
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzge;->zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzge;->zzj:Lcom/google/android/gms/internal/ads/zzfx;

    .line 9
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzge;->zzi(Lcom/google/android/gms/internal/ads/zzfx;Lcom/google/android/gms/internal/ads/zzgz;)V

    return-void
.end method
