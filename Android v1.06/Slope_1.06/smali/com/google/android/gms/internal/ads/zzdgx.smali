.class public final Lcom/google/android/gms/internal/ads/zzdgx;
.super Lcom/google/android/gms/internal/ads/zzcrf;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final zzc:Lcom/google/android/gms/internal/ads/zzfrr;


# instance fields
.field private final zzA:Lcom/google/android/gms/internal/ads/zzaua;

.field private zzB:Lcom/google/android/gms/internal/ads/zzfwk;

.field private final zzd:Ljava/util/concurrent/Executor;

.field private final zze:Lcom/google/android/gms/internal/ads/zzdhc;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzdhk;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzdic;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdhh;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzdhn;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzgvi;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzgvi;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzgvi;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzgvi;

.field private final zzn:Lcom/google/android/gms/internal/ads/zzgvi;

.field private zzo:Lcom/google/android/gms/internal/ads/zzdiy;

.field private zzp:Z

.field private zzq:Z

.field private zzr:Z

.field private final zzs:Lcom/google/android/gms/internal/ads/zzbxg;

.field private final zzt:Lcom/google/android/gms/internal/ads/zzaqq;

.field private final zzu:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zzv:Landroid/content/Context;

.field private final zzw:Lcom/google/android/gms/internal/ads/zzdgz;

.field private final zzx:Lcom/google/android/gms/internal/ads/zzeji;

.field private final zzy:Ljava/util/Map;

.field private final zzz:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v0, "3010"

    const-string v1, "3008"

    const-string v2, "1005"

    const-string v3, "1009"

    const-string v4, "2011"

    const-string v5, "2007"

    .line 1
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzfrr;->zzq(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfrr;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzc:Lcom/google/android/gms/internal/ads/zzfrr;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcre;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzdhc;Lcom/google/android/gms/internal/ads/zzdhk;Lcom/google/android/gms/internal/ads/zzdic;Lcom/google/android/gms/internal/ads/zzdhh;Lcom/google/android/gms/internal/ads/zzdhn;Lcom/google/android/gms/internal/ads/zzgvi;Lcom/google/android/gms/internal/ads/zzgvi;Lcom/google/android/gms/internal/ads/zzgvi;Lcom/google/android/gms/internal/ads/zzgvi;Lcom/google/android/gms/internal/ads/zzgvi;Lcom/google/android/gms/internal/ads/zzbxg;Lcom/google/android/gms/internal/ads/zzaqq;Lcom/google/android/gms/internal/ads/zzbzz;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdgz;Lcom/google/android/gms/internal/ads/zzeji;Lcom/google/android/gms/internal/ads/zzaua;)V
    .locals 2

    move-object v0, p0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzcrf;-><init>(Lcom/google/android/gms/internal/ads/zzcre;)V

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    move-object v1, p4

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzg:Lcom/google/android/gms/internal/ads/zzdic;

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    move-object v1, p7

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzj:Lcom/google/android/gms/internal/ads/zzgvi;

    move-object v1, p9

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzk:Lcom/google/android/gms/internal/ads/zzgvi;

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzl:Lcom/google/android/gms/internal/ads/zzgvi;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzm:Lcom/google/android/gms/internal/ads/zzgvi;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzn:Lcom/google/android/gms/internal/ads/zzgvi;

    move-object v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzs:Lcom/google/android/gms/internal/ads/zzbxg;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzt:Lcom/google/android/gms/internal/ads/zzaqq;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzu:Lcom/google/android/gms/internal/ads/zzbzz;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzv:Landroid/content/Context;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzw:Lcom/google/android/gms/internal/ads/zzdgz;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzx:Lcom/google/android/gms/internal/ads/zzeji;

    new-instance v1, Ljava/util/HashMap;

    .line 2
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzy:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzz:Ljava/util/List;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzA:Lcom/google/android/gms/internal/ads/zzaua;

    return-void
.end method

.method public static zzW(Landroid/view/View;)Z
    .locals 8

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzjh:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzs(Landroid/view/View;)J

    move-result-wide v4

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 5
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/zzbbk;->zzji:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 6
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v6, p0

    cmp-long p0, v4, v6

    if-ltz p0, :cond_0

    return v1

    :cond_0
    return v3

    .line 8
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    return v3
.end method

.method private final declared-synchronized zzY(Ljava/util/Map;)Landroid/view/View;
    .locals 5

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdgx;->zzc:Lcom/google/android/gms/internal/ads/zzfrr;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :cond_1
    if-ge v3, v2, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 1
    check-cast v4, Ljava/lang/String;

    .line 2
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    add-int/lit8 v3, v3, 0x1

    if-eqz v4, :cond_1

    .line 3
    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_2
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized zzZ()Landroid/widget/ImageView$ScaleType;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzhy:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    if-nez v0, :cond_1

    const-string v0, "Ad should be associated with an ad view before calling getMediaviewScaleType()"

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zze(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdiy;->zzj()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView$ScaleType;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_2
    :try_start_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdic;->zza:Landroid/widget/ImageView$ScaleType;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final zzaa(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzeQ:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 p2, 0x1

    const-string v0, "Google"

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdhc;->zzv()Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfwk;->zzf()Lcom/google/android/gms/internal/ads/zzfwk;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzB:Lcom/google/android/gms/internal/ads/zzfwk;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdgw;

    invoke-direct {v1, p0, v0, p2}, Lcom/google/android/gms/internal/ads/zzdgw;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;Ljava/lang/String;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    .line 4
    invoke-static {p1, v1, p2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzq(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/ads/zzdgx;->zzt(Ljava/lang/String;Z)V

    return-void
.end method

.method private final declared-synchronized zzab(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzg:Lcom/google/android/gms/internal/ads/zzdic;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdic;->zzd(Lcom/google/android/gms/internal/ads/zzdiy;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzZ()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    .line 3
    invoke-interface {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzq(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzq:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final zzac(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfgo;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzq()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdhh;->zzd()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p2, :cond_0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzebs;->zzc(Lcom/google/android/gms/internal/ads/zzfgo;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private final declared-synchronized zzad(Lcom/google/android/gms/internal/ads/zzdiy;)V
    .locals 7

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzp:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzg:Lcom/google/android/gms/internal/ads/zzdic;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdic;->zze(Lcom/google/android/gms/internal/ads/zzdiy;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf()Landroid/view/View;

    move-result-object v2

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzm()Ljava/util/Map;

    move-result-object v3

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzn()Ljava/util/Map;

    move-result-object v4

    move-object v5, p1

    move-object v6, p1

    .line 5
    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzdhk;->zzy(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/view/View$OnTouchListener;Landroid/view/View$OnClickListener;)V

    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzcn:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 6
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzt:Lcom/google/android/gms/internal/ads/zzaqq;

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqq;->zzc()Lcom/google/android/gms/internal/ads/zzaqm;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzaqm;->zzo(Landroid/view/View;)V

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzbE:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzb:Lcom/google/android/gms/internal/ads/zzezf;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzal:Z

    if-nez v1, :cond_2

    goto :goto_1

    .line 12
    :cond_2
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzak:Lorg/json/JSONObject;

    .line 13
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 14
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    .line 16
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzl()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzy:Ljava/util/Map;

    const/4 v4, 0x0

    .line 17
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_3

    .line 18
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzv:Landroid/content/Context;

    .line 19
    new-instance v4, Lcom/google/android/gms/internal/ads/zzatz;

    invoke-direct {v4, v3, v2}, Lcom/google/android/gms/internal/ads/zzatz;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzz:Ljava/util/List;

    .line 20
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/ads/zzdgv;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/zzdgv;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzatz;->zzc(Lcom/google/android/gms/internal/ads/zzaty;)V

    goto :goto_0

    .line 22
    :cond_4
    :goto_1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzi()Lcom/google/android/gms/internal/ads/zzatz;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 23
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzi()Lcom/google/android/gms/internal/ads/zzatz;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzs:Lcom/google/android/gms/internal/ads/zzbxg;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzatz;->zzc(Lcom/google/android/gms/internal/ads/zzaty;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final zzae(Lcom/google/android/gms/internal/ads/zzdiy;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzl()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdhk;->zzz(Landroid/view/View;Ljava/util/Map;)V

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzh()Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzh()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzh()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 5
    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzi()Lcom/google/android/gms/internal/ads/zzatz;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzi()Lcom/google/android/gms/internal/ads/zzatz;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzs:Lcom/google/android/gms/internal/ads/zzbxg;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzatz;->zze(Lcom/google/android/gms/internal/ads/zzaty;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    return-void
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzdgx;)Lcom/google/android/gms/internal/ads/zzdhc;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    return-object p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzdgx;)Lcom/google/android/gms/internal/ads/zzdiy;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    return-object p0
.end method

.method static bridge synthetic zzf(Lcom/google/android/gms/internal/ads/zzdgx;)Lcom/google/android/gms/internal/ads/zzfwk;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzB:Lcom/google/android/gms/internal/ads/zzfwk;

    return-object p0
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/ads/zzdgx;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzy:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic zzq(Lcom/google/android/gms/internal/ads/zzdgx;)V
    .locals 5

    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzc()I

    move-result v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Google"

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5

    const/4 v4, 0x2

    if-eq v1, v4, :cond_4

    const/4 v4, 0x3

    if-eq v1, v4, :cond_2

    const/4 v0, 0x6

    if-eq v1, v0, :cond_1

    const/4 v0, 0x7

    if-eq v1, v0, :cond_0

    :try_start_1
    const-string p0, "Wrong native template id!"

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zzg()Lcom/google/android/gms/internal/ads/zzbkz;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zzg()Lcom/google/android/gms/internal/ads/zzbkz;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzm:Lcom/google/android/gms/internal/ads/zzgvi;

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzgvi;->zzb()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbkt;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzbkz;->zzg(Lcom/google/android/gms/internal/ads/zzbkt;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zzf()Lcom/google/android/gms/internal/ads/zzbge;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 2
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzaa(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zzf()Lcom/google/android/gms/internal/ads/zzbge;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzl:Lcom/google/android/gms/internal/ads/zzgvi;

    .line 3
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzgvi;->zzb()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbgn;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzbge;->zze(Lcom/google/android/gms/internal/ads/zzbgn;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzz()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbfx;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzr()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzt(Ljava/lang/String;Z)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdhc;->zzz()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdhn;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbfx;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzn:Lcom/google/android/gms/internal/ads/zzgvi;

    .line 7
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzgvi;->zzb()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbfk;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzbfx;->zze(Lcom/google/android/gms/internal/ads/zzbfk;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zza()Lcom/google/android/gms/internal/ads/zzbfo;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 8
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzaa(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zza()Lcom/google/android/gms/internal/ads/zzbfo;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzk:Lcom/google/android/gms/internal/ads/zzgvi;

    .line 9
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzgvi;->zzb()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbff;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzbfo;->zze(Lcom/google/android/gms/internal/ads/zzbff;)V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zzb()Lcom/google/android/gms/internal/ads/zzbfr;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 10
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzaa(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzi:Lcom/google/android/gms/internal/ads/zzdhn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhn;->zzb()Lcom/google/android/gms/internal/ads/zzbfr;

    move-result-object v0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzj:Lcom/google/android/gms/internal/ads/zzgvi;

    .line 11
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzgvi;->zzb()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzbfh;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzbfr;->zze(Lcom/google/android/gms/internal/ads/zzbfh;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_6
    return-void

    :catch_0
    move-exception p0

    const-string v0, "RemoteException when notifyAdLoad is called"

    .line 13
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized zzA(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzq:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzbE:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzb:Lcom/google/android/gms/internal/ads/zzezf;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzezf;->zzal:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzy:Ljava/util/Map;

    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzy:Ljava/util/Map;

    .line 4
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    monitor-exit p0

    return-void

    :cond_2
    if-nez p4, :cond_5

    :try_start_2
    sget-object p4, Lcom/google/android/gms/internal/ads/zzbbk;->zzdC:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p4

    .line 6
    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_4

    if-eqz p2, :cond_4

    .line 7
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 8
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_3

    .line 9
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzW(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzab(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    monitor-exit p0

    return-void

    .line 11
    :cond_5
    :try_start_3
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzdgx;->zzY(Ljava/util/Map;)Landroid/view/View;

    move-result-object p4

    if-nez p4, :cond_6

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzab(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzdD:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 15
    invoke-static {p4}, Lcom/google/android/gms/internal/ads/zzdgx;->zzW(Landroid/view/View;)Z

    move-result p4

    if-eqz p4, :cond_7

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzab(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    monitor-exit p0

    return-void

    :cond_8
    :try_start_5
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzdE:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Landroid/graphics/Rect;

    .line 19
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    .line 20
    invoke-virtual {p4, v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 21
    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    if-ne v1, v2, :cond_9

    .line 22
    invoke-virtual {p4}, Landroid/view/View;->getWidth()I

    move-result p4

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-ne p4, v0, :cond_9

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzab(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :cond_9
    monitor-exit p0

    return-void

    .line 24
    :cond_a
    :try_start_6
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdgx;->zzab(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzB(Lcom/google/android/gms/ads/internal/client/zzcw;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzj(Lcom/google/android/gms/ads/internal/client/zzcw;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzC(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    .locals 9

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzg:Lcom/google/android/gms/internal/ads/zzdic;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdic;->zzc(Lcom/google/android/gms/internal/ads/zzdiy;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzZ()Landroid/widget/ImageView$ScaleType;

    move-result-object v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    .line 3
    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzdhk;->zzk(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;)V

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzr:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdhc;->zzr()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdhc;->zzr()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object p1

    .line 4
    new-instance p2, Landroidx/collection/ArrayMap;

    invoke-direct {p2}, Landroidx/collection/ArrayMap;-><init>()V

    const-string p3, "onSdkAdUserInteractionClick"

    .line 5
    invoke-interface {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzcfb;->zzd(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 3
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzD(Landroid/view/View;I)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzjP:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    if-nez v0, :cond_1

    const-string p1, "Ad should be associated with an ad view before calling performClickForCustomGesture()"

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zze(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    .line 4
    :cond_1
    :try_start_2
    instance-of v0, v0, Lcom/google/android/gms/internal/ads/zzdhw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzdgn;

    invoke-direct {v2, p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzdgn;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;Landroid/view/View;ZI)V

    .line 5
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzE(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzl(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzF(Landroid/os/Bundle;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzm(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzG()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    if-nez v0, :cond_0

    const-string v0, "Ad should be associated with an ad view before calling recordCustomClickGesture()"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zze(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 2
    :cond_0
    :try_start_1
    instance-of v0, v0, Lcom/google/android/gms/internal/ads/zzdhw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzdgs;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzdgs;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;Z)V

    .line 3
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzH()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzq:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdhk;->zzr()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzI(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzeQ:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzB:Lcom/google/android/gms/internal/ads/zzfwk;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdgo;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzdgo;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;Landroid/view/View;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    .line 3
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfwk;->zzc(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzt()Lcom/google/android/gms/internal/ads/zzfgo;

    move-result-object v0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzac(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfgo;)V

    return-void
.end method

.method public final declared-synchronized zzJ(Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/View;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdhk;->zzs(Landroid/view/View;Landroid/view/MotionEvent;Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzK(Landroid/os/Bundle;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzt(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzL(Landroid/view/View;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzu(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzM()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdhk;->zzv()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzN(Lcom/google/android/gms/ads/internal/client/zzcs;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzw(Lcom/google/android/gms/ads/internal/client/zzcs;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzO(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzx:Lcom/google/android/gms/internal/ads/zzeji;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzeji;->zza(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzP(Lcom/google/android/gms/internal/ads/zzbgk;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzx(Lcom/google/android/gms/internal/ads/zzbgk;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzQ(Lcom/google/android/gms/internal/ads/zzdiy;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzbC:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/google/android/gms/internal/ads/zzflv;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdgt;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzdgt;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;Lcom/google/android/gms/internal/ads/zzdiy;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzflv;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 4
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzdgx;->zzad(Lcom/google/android/gms/internal/ads/zzdiy;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzR(Lcom/google/android/gms/internal/ads/zzdiy;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbbk;->zzbC:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v0

    .line 1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/google/android/gms/internal/ads/zzflv;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdgp;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzdgp;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;Lcom/google/android/gms/internal/ads/zzdiy;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzflv;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 4
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzdgx;->zzae(Lcom/google/android/gms/internal/ads/zzdiy;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzS()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhh;->zze()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized zzT()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdhk;->zzA()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzU()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdhk;->zzB()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzV()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhh;->zzd()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized zzX(Landroid/os/Bundle;)Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzq:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzC(Landroid/os/Bundle;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzq:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza()I
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdhk;->zza()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzb()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzp:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdgu;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzdgu;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzcrf;->zzb()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzdgz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzw:Lcom/google/android/gms/internal/ads/zzdgz;

    return-object v0
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhh;->zzb()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized zzi(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzZ()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    .line 2
    invoke-interface {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdhk;->zze(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzj()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdgq;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzdgq;-><init>(Lcom/google/android/gms/internal/ads/zzdgx;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzc()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzd:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzdgr;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/zzdgr;-><init>(Lcom/google/android/gms/internal/ads/zzdhk;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzcrf;->zzj()V

    return-void
.end method

.method public final declared-synchronized zzk(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzZ()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    .line 2
    invoke-interface {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzdhk;->zzf(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final zzr(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzt()Lcom/google/android/gms/internal/ads/zzfgo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdhh;->zzd()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    .line 3
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzeK:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 3
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfgm;->zzb()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfgu;->zzc:Lcom/google/android/gms/internal/ads/zzfgu;

    const-string v2, "Ad overlay"

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzfgo;->zzb(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfgu;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final declared-synchronized zzs()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdhk;->zzh()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzt(Ljava/lang/String;Z)V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdhh;->zzd()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 2
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdhc;->zzq()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdhc;->zzr()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object v1

    if-nez v2, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "Omid display and video webview are null. Skipping initialization."

    .line 30
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    if-eqz v1, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    .line 3
    :goto_2
    sget-object v7, Lcom/google/android/gms/internal/ads/zzbbk;->zzeO:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v7

    .line 3
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_b

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    .line 5
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzdhh;->zza()Lcom/google/android/gms/internal/ads/zzfad;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzh:Lcom/google/android/gms/internal/ads/zzdhh;

    .line 6
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzdhh;->zza()Lcom/google/android/gms/internal/ads/zzfad;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfad;->zzb()I

    move-result v5

    add-int/lit8 v6, v5, -0x1

    if-eqz v6, :cond_9

    if-eq v6, v4, :cond_7

    if-eq v5, v4, :cond_6

    const/4 v1, 0x2

    if-eq v5, v1, :cond_5

    const-string v1, "UNKNOWN"

    goto :goto_3

    :cond_5
    const-string v1, "DISPLAY"

    goto :goto_3

    :cond_6
    const-string v1, "VIDEO"

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown omid media type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Not initializing Omid."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    :cond_7
    if-eqz v2, :cond_8

    const/4 v3, 0x1

    const/4 v6, 0x0

    goto :goto_4

    :cond_8
    const-string v1, "Omid media type was display but there was no display webview."

    .line 29
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    :cond_9
    if-eqz v1, :cond_a

    const/4 v6, 0x1

    goto :goto_4

    :cond_a
    const-string v1, "Omid media type was video but there was no video webview."

    .line 9
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    :cond_b
    move v3, v5

    :goto_4
    if-eqz v3, :cond_c

    const/4 v3, 0x0

    goto :goto_5

    :cond_c
    const-string v3, "javascript"

    move-object v2, v1

    :goto_5
    move-object v12, v3

    .line 10
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcfb;->zzG()Landroid/webkit/WebView;

    .line 11
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v3

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzv:Landroid/content/Context;

    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/ads/zzebs;->zze(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v1, "Failed to initialize omid in InternalNativeAd"

    .line 12
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    :cond_d
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzu:Lcom/google/android/gms/internal/ads/zzbzz;

    iget v5, v3, Lcom/google/android/gms/internal/ads/zzbzz;->zzb:I

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzbzz;->zzc:I

    new-instance v7, Ljava/lang/StringBuilder;

    .line 13
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    if-eqz v6, :cond_e

    .line 14
    sget-object v3, Lcom/google/android/gms/internal/ads/zzebt;->zzc:Lcom/google/android/gms/internal/ads/zzebt;

    .line 15
    sget-object v5, Lcom/google/android/gms/internal/ads/zzebu;->zzb:Lcom/google/android/gms/internal/ads/zzebu;

    :goto_6
    move-object v15, v3

    move-object v14, v5

    goto :goto_7

    .line 16
    :cond_e
    sget-object v3, Lcom/google/android/gms/internal/ads/zzebt;->zzb:Lcom/google/android/gms/internal/ads/zzebt;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzdhc;->zzc()I

    move-result v5

    const/4 v7, 0x3

    if-ne v5, v7, :cond_f

    .line 17
    sget-object v5, Lcom/google/android/gms/internal/ads/zzebu;->zzd:Lcom/google/android/gms/internal/ads/zzebu;

    goto :goto_6

    .line 18
    :cond_f
    sget-object v5, Lcom/google/android/gms/internal/ads/zzebu;->zzc:Lcom/google/android/gms/internal/ads/zzebu;

    goto :goto_6

    .line 19
    :goto_7
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v7

    .line 20
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcfb;->zzG()Landroid/webkit/WebView;

    move-result-object v9

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzb:Lcom/google/android/gms/internal/ads/zzezf;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzezf;->zzam:Ljava/lang/String;

    const-string v10, ""

    const-string v11, "javascript"

    move-object/from16 v13, p1

    move-object/from16 v16, v3

    .line 21
    invoke-interface/range {v7 .. v16}, Lcom/google/android/gms/internal/ads/zzebs;->zzb(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzebu;Lcom/google/android/gms/internal/ads/zzebt;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfgo;

    move-result-object v3

    if-nez v3, :cond_10

    const-string v1, "Failed to create omid session in InternalNativeAd"

    .line 22
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-void

    :cond_10
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    .line 23
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzdhc;->zzV(Lcom/google/android/gms/internal/ads/zzfgo;)V

    .line 24
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzcfb;->zzap(Lcom/google/android/gms/internal/ads/zzfgo;)V

    if-eqz v6, :cond_11

    .line 25
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzF()Landroid/view/View;

    move-result-object v1

    .line 26
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v5

    invoke-interface {v5, v3, v1}, Lcom/google/android/gms/internal/ads/zzebs;->zzc(Lcom/google/android/gms/internal/ads/zzfgo;Landroid/view/View;)V

    iput-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzdgx;->zzr:Z

    :cond_11
    if-eqz p2, :cond_12

    .line 27
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzA()Lcom/google/android/gms/internal/ads/zzebs;

    move-result-object v1

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzebs;->zzd(Lcom/google/android/gms/internal/ads/zzfgo;)V

    .line 28
    new-instance v1, Landroidx/collection/ArrayMap;

    invoke-direct {v1}, Landroidx/collection/ArrayMap;-><init>()V

    const-string v3, "onSdkLoaded"

    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzd(Ljava/lang/String;Ljava/util/Map;)V

    :cond_12
    :goto_8
    return-void
.end method

.method final synthetic zzu()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdhk;->zzi()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzH()V

    return-void
.end method

.method final synthetic zzv(Landroid/view/View;ZI)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf()Landroid/view/View;

    move-result-object v2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    .line 2
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzl()Ljava/util/Map;

    move-result-object v3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    .line 3
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzm()Ljava/util/Map;

    move-result-object v4

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzZ()Landroid/widget/ImageView$ScaleType;

    move-result-object v6

    move-object v1, p1

    move v5, p2

    move v7, p3

    .line 5
    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzdhk;->zzo(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;I)V

    return-void
.end method

.method final synthetic zzw(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzf:Lcom/google/android/gms/internal/ads/zzdhk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf()Landroid/view/View;

    move-result-object v2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    .line 2
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzl()Ljava/util/Map;

    move-result-object v3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zzo:Lcom/google/android/gms/internal/ads/zzdiy;

    .line 3
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzm()Ljava/util/Map;

    move-result-object v4

    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzZ()Landroid/widget/ImageView$ScaleType;

    move-result-object v6

    const/4 v1, 0x0

    const/4 v7, 0x0

    move v5, p1

    .line 5
    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzdhk;->zzo(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;I)V

    return-void
.end method

.method final synthetic zzx(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdgx;->zze:Lcom/google/android/gms/internal/ads/zzdhc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzt()Lcom/google/android/gms/internal/ads/zzfgo;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzac(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfgo;)V

    return-void
.end method

.method final synthetic zzy(Lcom/google/android/gms/internal/ads/zzdiy;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzdgx;->zzad(Lcom/google/android/gms/internal/ads/zzdiy;)V

    return-void
.end method

.method final synthetic zzz(Lcom/google/android/gms/internal/ads/zzdiy;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzdgx;->zzae(Lcom/google/android/gms/internal/ads/zzdiy;)V

    return-void
.end method
