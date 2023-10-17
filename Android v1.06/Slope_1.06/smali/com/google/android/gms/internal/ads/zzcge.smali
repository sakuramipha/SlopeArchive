.class public Lcom/google/android/gms/internal/ads/zzcge;
.super Lcom/google/android/gms/internal/ads/zzcfi;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzawx;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzcfi;-><init>(Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzawx;Z)V

    return-void
.end method


# virtual methods
.method protected final zzN(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzcfb;

    if-nez v0, :cond_0

    const-string p1, "Tried to intercept request from a WebView that wasn\'t an AdWebView."

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcfb;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcge;->zza:Lcom/google/android/gms/internal/ads/zzbwu;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 4
    invoke-interface {v0, p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzbwu;->zzd(Ljava/lang/String;Ljava/util/Map;I)V

    :cond_1
    new-instance v0, Ljava/io/File;

    .line 5
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mraid.js"

    .line 6
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p3, :cond_2

    .line 7
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p3

    .line 8
    :cond_2
    invoke-super {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzcfi;->zzc(Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 9
    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzN()Lcom/google/android/gms/internal/ads/zzcgo;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 10
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzN()Lcom/google/android/gms/internal/ads/zzcgo;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzcgo;->zzE()V

    .line 11
    :cond_4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzO()Lcom/google/android/gms/internal/ads/zzcgq;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcgq;->zzi()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 12
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbbk;->zzP:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p2

    .line 12
    check-cast p2, Ljava/lang/String;

    goto :goto_0

    .line 14
    :cond_5
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzaA()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 15
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbbk;->zzO:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 16
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p2

    .line 15
    check-cast p2, Ljava/lang/String;

    goto :goto_0

    .line 17
    :cond_6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbbk;->zzN:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 18
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p2

    .line 17
    check-cast p2, Ljava/lang/String;

    .line 19
    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 20
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzn()Lcom/google/android/gms/internal/ads/zzbzz;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzbzz;->zza:Ljava/lang/String;

    .line 21
    invoke-static {p3, p1, p2}, Lcom/google/android/gms/ads/internal/util/zzs;->zzt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
