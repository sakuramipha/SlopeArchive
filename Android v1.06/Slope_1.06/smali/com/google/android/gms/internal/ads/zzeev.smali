.class public final Lcom/google/android/gms/internal/ads/zzeev;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzecb;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdfm;

.field private zzc:Lcom/google/android/gms/internal/ads/zzbon;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbzz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdfm;Lcom/google/android/gms/internal/ads/zzbzz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeev;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeev;->zzb:Lcom/google/android/gms/internal/ads/zzdfm;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeev;->zzd:Lcom/google/android/gms/internal/ads/zzbzz;

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzeev;Lcom/google/android/gms/internal/ads/zzbon;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeev;->zzc:Lcom/google/android/gms/internal/ads/zzbon;

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
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzg:Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeev;->zzc:Lcom/google/android/gms/internal/ads/zzbon;

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzs(Lcom/google/android/gms/internal/ads/zzbon;)Lcom/google/android/gms/internal/ads/zzdhc;

    move-result-object v0

    .line 4
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzfaa;->zzg:Ljava/util/ArrayList;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdhc;->zzc()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeev;->zzb:Lcom/google/android/gms/internal/ads/zzdfm;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcru;

    iget-object v3, p3, Lcom/google/android/gms/internal/ads/zzeby;->zza:Ljava/lang/String;

    invoke-direct {v2, p1, p2, v3}, Lcom/google/android/gms/internal/ads/zzcru;-><init>(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzdho;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzdho;-><init>(Lcom/google/android/gms/internal/ads/zzdhc;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdjd;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeev;->zzc:Lcom/google/android/gms/internal/ads/zzbon;

    const/4 v3, 0x0

    invoke-direct {p2, v3, v3, v0}, Lcom/google/android/gms/internal/ads/zzdjd;-><init>(Lcom/google/android/gms/internal/ads/zzbok;Lcom/google/android/gms/internal/ads/zzboj;Lcom/google/android/gms/internal/ads/zzbon;)V

    .line 7
    invoke-virtual {v1, v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzdfm;->zze(Lcom/google/android/gms/internal/ads/zzcru;Lcom/google/android/gms/internal/ads/zzdho;Lcom/google/android/gms/internal/ads/zzdjd;)Lcom/google/android/gms/internal/ads/zzdhe;

    move-result-object p1

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    .line 8
    check-cast p2, Lcom/google/android/gms/internal/ads/zzedr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdhf;->zzi()Lcom/google/android/gms/internal/ads/zzegw;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzedr;->zzc(Lcom/google/android/gms/internal/ads/zzboe;)V

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdhf;->zza()Lcom/google/android/gms/internal/ads/zzdgx;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzefn;

    const/4 p2, 0x1

    const-string p3, "No corresponding native ad listener"

    .line 6
    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzefn;-><init>(ILjava/lang/String;)V

    throw p1

    .line 1
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzefn;

    const/4 p2, 0x2

    const-string p3, "Unified must be used for RTB."

    .line 2
    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzefn;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzeby;)V
    .locals 11
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeev;->zzd:Lcom/google/android/gms/internal/ads/zzbzz;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzbzz;->zzc:I

    .line 2
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzbB:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 2
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    .line 4
    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/zzbpv;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzV:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzw:Lorg/json/JSONObject;

    .line 5
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeev;->zza:Landroid/content/Context;

    .line 6
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/zzeeu;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/zzeeu;-><init>(Lcom/google/android/gms/internal/ads/zzeev;Lcom/google/android/gms/internal/ads/zzeby;Lcom/google/android/gms/internal/ads/zzeet;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/zzboe;

    .line 4
    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzbpv;->zzm(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzbpp;Lcom/google/android/gms/internal/ads/zzboe;)V

    return-void

    :cond_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    .line 7
    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/zzbpv;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzV:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzw:Lorg/json/JSONObject;

    .line 8
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v6, p2, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzeev;->zza:Landroid/content/Context;

    .line 9
    invoke-static {p2}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v7

    .line 10
    new-instance v8, Lcom/google/android/gms/internal/ads/zzeeu;

    .line 9
    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/zzeeu;-><init>(Lcom/google/android/gms/internal/ads/zzeev;Lcom/google/android/gms/internal/ads/zzeby;Lcom/google/android/gms/internal/ads/zzeet;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    move-object v9, p2

    check-cast v9, Lcom/google/android/gms/internal/ads/zzboe;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v10, p1, Lcom/google/android/gms/internal/ads/zzfaa;->zzi:Lcom/google/android/gms/internal/ads/zzbee;

    .line 7
    invoke-interface/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/zzbpv;->zzn(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzl;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/ads/zzbpp;Lcom/google/android/gms/internal/ads/zzboe;Lcom/google/android/gms/internal/ads/zzbee;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 9
    new-instance p2, Lcom/google/android/gms/internal/ads/zzfaf;

    .line 10
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzfaf;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
