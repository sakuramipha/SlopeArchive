.class public final Lcom/google/android/gms/internal/ads/zzefz;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzecb;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdmt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdmt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzefz;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzefz;->zzb:Lcom/google/android/gms/internal/ads/zzdmt;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzeby;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzfaf;,
            Lcom/google/android/gms/internal/ads/zzefn;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeea;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzbpv;

    sget-object v2, Lcom/google/android/gms/ads/AdFormat;->REWARDED:Lcom/google/android/gms/ads/AdFormat;

    invoke-direct {v0, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzeea;-><init>(Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzbpv;Lcom/google/android/gms/ads/AdFormat;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzefz;->zzb:Lcom/google/android/gms/internal/ads/zzdmt;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcru;

    iget-object v3, p3, Lcom/google/android/gms/internal/ads/zzeby;->zza:Ljava/lang/String;

    invoke-direct {v2, p1, p2, v3}, Lcom/google/android/gms/internal/ads/zzcru;-><init>(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzdmq;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzdmq;-><init>(Lcom/google/android/gms/internal/ads/zzdey;)V

    .line 2
    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzdmt;->zze(Lcom/google/android/gms/internal/ads/zzcru;Lcom/google/android/gms/internal/ads/zzdmq;)Lcom/google/android/gms/internal/ads/zzdmp;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdmp;->zzc()Lcom/google/android/gms/internal/ads/zzcwa;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzeea;->zzb(Lcom/google/android/gms/internal/ads/zzcwa;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    .line 4
    check-cast p2, Lcom/google/android/gms/internal/ads/zzedr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdmp;->zzn()Lcom/google/android/gms/internal/ads/zzegv;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzedr;->zzc(Lcom/google/android/gms/internal/ads/zzboe;)V

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdmp;->zzk()Lcom/google/android/gms/internal/ads/zzdmo;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzeby;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzfaf;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbpv;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzaa:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzbpv;->zzq(Ljava/lang/String;)V

    .line 2
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzo:Lcom/google/android/gms/internal/ads/zzezn;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzezn;->zza:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    .line 3
    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/zzbpv;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzV:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzw:Lorg/json/JSONObject;

    .line 4
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefz;->zza:Landroid/content/Context;

    .line 5
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/zzefy;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/zzefy;-><init>(Lcom/google/android/gms/internal/ads/zzefz;Lcom/google/android/gms/internal/ads/zzeby;Lcom/google/android/gms/internal/ads/zzefx;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/zzboe;

    .line 3
    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzbpv;->zzo(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzbps;Lcom/google/android/gms/internal/ads/zzboe;)V

    return-void

    :cond_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    .line 6
    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/zzbpv;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzV:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzw:Lorg/json/JSONObject;

    .line 7
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefz;->zza:Landroid/content/Context;

    .line 8
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/zzefy;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/zzefy;-><init>(Lcom/google/android/gms/internal/ads/zzefz;Lcom/google/android/gms/internal/ads/zzeby;Lcom/google/android/gms/internal/ads/zzefx;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/zzboe;

    .line 6
    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzbpv;->zzp(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzbps;Lcom/google/android/gms/internal/ads/zzboe;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Remote exception loading a rewarded RTB ad"

    .line 9
    invoke-static {p2, p1}, Lcom/google/android/gms/ads/internal/util/zze;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
