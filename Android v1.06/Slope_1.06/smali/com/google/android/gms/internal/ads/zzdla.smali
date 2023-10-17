.class public final Lcom/google/android/gms/internal/ads/zzdla;
.super Lcom/google/android/gms/internal/ads/zzbks;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Lcom/google/android/gms/internal/ads/zzbeb;


# instance fields
.field private zza:Landroid/view/View;

.field private zzb:Lcom/google/android/gms/ads/internal/client/zzdq;

.field private zzc:Lcom/google/android/gms/internal/ads/zzdgx;

.field private zzd:Z

.field private zze:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdgx;Lcom/google/android/gms/internal/ads/zzdhc;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbks;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdhc;->zzf()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdhc;->zzj()Lcom/google/android/gms/ads/internal/client/zzdq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzb:Lcom/google/android/gms/ads/internal/client/zzdq;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzc:Lcom/google/android/gms/internal/ads/zzdgx;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzd:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zze:Z

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdhc;->zzr()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdhc;->zzr()Lcom/google/android/gms/internal/ads/zzcfb;

    move-result-object p1

    .line 2
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/zzcfb;->zzam(Lcom/google/android/gms/internal/ads/zzbeb;)V

    :cond_0
    return-void
.end method

.method private final zzg()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzc:Lcom/google/android/gms/internal/ads/zzdgx;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    .line 3
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzdgx;->zzW(Landroid/view/View;)Z

    move-result v4

    .line 4
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzdgx;->zzA(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V

    :cond_0
    return-void
.end method

.method private final zzh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final zzi(Lcom/google/android/gms/internal/ads/zzbkw;I)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzbkw;->zze(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "#007 Could not call remote method."

    .line 2
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdla;->zzg()V

    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdla;->zzg()V

    return-void
.end method

.method public final zzb()Lcom/google/android/gms/ads/internal/client/zzdq;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "#008 Must be called on the main UI thread."

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzd:Z

    if-eqz v0, :cond_0

    const-string v0, "getVideoController: Instream ad should not be used after destroyed"

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzb:Lcom/google/android/gms/ads/internal/client/zzdq;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzben;
    .locals 3

    const-string v0, "#008 Must be called on the main UI thread."

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzd:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "getVideoController: Instream ad should not be used after destroyed"

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzc:Lcom/google/android/gms/internal/ads/zzdgx;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzc()Lcom/google/android/gms/internal/ads/zzdgz;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgx;->zzc()Lcom/google/android/gms/internal/ads/zzdgz;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdgz;->zza()Lcom/google/android/gms/internal/ads/zzben;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final zzd()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "#008 Must be called on the main UI thread."

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdla;->zzh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzc:Lcom/google/android/gms/internal/ads/zzdgx;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcrf;->zzb()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzc:Lcom/google/android/gms/internal/ads/zzdgx;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzb:Lcom/google/android/gms/ads/internal/client/zzdq;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzd:Z

    return-void
.end method

.method public final zze(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "#008 Must be called on the main UI thread."

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdkz;

    .line 2
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzdkz;-><init>(Lcom/google/android/gms/internal/ads/zzdla;)V

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzdla;->zzf(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzbkw;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzbkw;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string v0, "#008 Must be called on the main UI thread."

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzd:Z

    if-eqz v0, :cond_0

    const-string p1, "Instream ad can not be shown after destroy()."

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    const/4 p1, 0x2

    .line 3
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzdla;->zzi(Lcom/google/android/gms/internal/ads/zzbkw;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zzb:Lcom/google/android/gms/ads/internal/client/zzdq;

    if-nez v1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zze:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const-string p1, "Instream ad should not be used again."

    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    .line 7
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/ads/zzdla;->zzi(Lcom/google/android/gms/internal/ads/zzbkw;I)V

    return-void

    :cond_2
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zze:Z

    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdla;->zzh()V

    .line 9
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    .line 10
    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzx()Lcom/google/android/gms/internal/ads/zzcat;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzcat;->zza(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 12
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzx()Lcom/google/android/gms/internal/ads/zzcat;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdla;->zza:Landroid/view/View;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzcat;->zzb(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzdla;->zzg()V

    .line 14
    :try_start_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzbkw;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    .line 15
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_0
    if-nez v0, :cond_4

    const-string p1, "can not get video view."

    goto :goto_1

    :cond_4
    const-string p1, "can not get video controller."

    :goto_1
    const-string v0, "Instream internal error: "

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzg(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 5
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzdla;->zzi(Lcom/google/android/gms/internal/ads/zzbkw;I)V

    return-void
.end method
