.class public final Lcom/google/android/gms/internal/ads/zzdxk;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field public zza:Lcom/google/android/gms/internal/ads/zzfwb;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcyb;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdws;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfed;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfft;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzffq;

.field private final zzi:Landroid/content/Context;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzfwc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcyb;Lcom/google/android/gms/internal/ads/zzdws;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzfaa;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfft;Lcom/google/android/gms/internal/ads/zzffq;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfwc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzb:Lcom/google/android/gms/internal/ads/zzcyb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzc:Lcom/google/android/gms/internal/ads/zzdws;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzd:Lcom/google/android/gms/internal/ads/zzfed;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zze:Lcom/google/android/gms/internal/ads/zzfaa;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzg:Lcom/google/android/gms/internal/ads/zzfft;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzh:Lcom/google/android/gms/internal/ads/zzffq;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzi:Landroid/content/Context;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzj:Lcom/google/android/gms/internal/ads/zzfwc;

    return-void
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzdxk;)Lcom/google/android/gms/internal/ads/zzcyb;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzb:Lcom/google/android/gms/internal/ads/zzcyb;

    return-object p0
.end method


# virtual methods
.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzbug;Lcom/google/android/gms/internal/ads/zzdyv;)Lcom/google/android/gms/internal/ads/zzbto;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzi:Landroid/content/Context;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zzc:Ljava/util/Map;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zze:Ljava/lang/String;

    const-string v3, "Content-Type"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zzc:Ljava/util/Map;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzb:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzbzz;->zza:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/ads/internal/util/zzs;->zzc(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "User-Agent"

    .line 3
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbto;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zza:Ljava/lang/String;

    iget v5, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zzb:I

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zzc:Ljava/util/Map;

    new-instance v6, Landroid/os/Bundle;

    .line 5
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 6
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 7
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v6, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v7, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zzd:[B

    iget-boolean v8, p2, Lcom/google/android/gms/internal/ads/zzdyv;->zzf:Z

    .line 8
    iget-object v9, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzd:Ljava/lang/String;

    iget-object v10, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzh:Ljava/lang/String;

    move-object v3, v0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/zzbto;-><init>(Ljava/lang/String;ILandroid/os/Bundle;[BZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbug;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzbuj;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzb:Lcom/google/android/gms/internal/ads/zzcyb;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcyb;->zzbA(Lcom/google/android/gms/internal/ads/zzbug;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzi:Landroid/content/Context;

    const/16 v1, 0x9

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdza;

    .line 3
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzbug;->zzg:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzh:Lcom/google/android/gms/internal/ads/zzffq;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzdza;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzd:Lcom/google/android/gms/internal/ads/zzfed;

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfdx;->zzh:Lcom/google/android/gms/internal/ads/zzfdx;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzdyz;

    invoke-direct {v3, p2, p3}, Lcom/google/android/gms/internal/ads/zzdyz;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzbuj;)V

    .line 5
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v3

    .line 6
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzfdv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v0

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdxi;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzdxi;-><init>(Lcom/google/android/gms/internal/ads/zzdxk;Lcom/google/android/gms/internal/ads/zzbug;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzj:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 9
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzd:Lcom/google/android/gms/internal/ads/zzfed;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzfdx;->zzj:Lcom/google/android/gms/internal/ads/zzfdx;

    .line 10
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfdv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzc:Lcom/google/android/gms/internal/ads/zzdws;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdxf;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzdxf;-><init>(Lcom/google/android/gms/internal/ads/zzdws;)V

    .line 11
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zza:Lcom/google/android/gms/internal/ads/zzfwb;

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/google/android/gms/internal/ads/zzbmp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzi:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzf:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzg:Lcom/google/android/gms/internal/ads/zzfft;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmp;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfft;)Lcom/google/android/gms/internal/ads/zzbmy;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzdyi;->zza:Lcom/google/android/gms/internal/ads/zzbmr;

    .line 14
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbmv;->zzb:Lcom/google/android/gms/internal/ads/zzbmq;

    const-string v3, "google.afma.response.normalize"

    .line 15
    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzbmy;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)Lcom/google/android/gms/internal/ads/zzbmo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzd:Lcom/google/android/gms/internal/ads/zzfed;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzfdx;->zzk:Lcom/google/android/gms/internal/ads/zzfdx;

    .line 16
    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzfdv;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/zzdxh;

    invoke-direct {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdxh;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzbuj;)V

    .line 17
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzfdu;->zze(Lcom/google/android/gms/internal/ads/zzfdg;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 18
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzfdu;->zzf(Lcom/google/android/gms/internal/ads/zzfuy;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdxg;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzdxg;-><init>(Lcom/google/android/gms/internal/ads/zzdxk;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzj:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 20
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdxj;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzdxj;-><init>(Lcom/google/android/gms/internal/ads/zzdxk;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zzj:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 21
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfvr;->zzq(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfvn;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method final synthetic zzd(Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzezr;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzezo;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdxk;->zze:Lcom/google/android/gms/internal/ads/zzfaa;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzezo;-><init>(Lcom/google/android/gms/internal/ads/zzfaa;)V

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 2
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzezq;->zza(Ljava/io/Reader;)Lcom/google/android/gms/internal/ads/zzezq;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzezr;-><init>(Lcom/google/android/gms/internal/ads/zzezo;Lcom/google/android/gms/internal/ads/zzezq;)V

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
