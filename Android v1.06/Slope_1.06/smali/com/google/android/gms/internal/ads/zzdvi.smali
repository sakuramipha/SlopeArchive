.class public final Lcom/google/android/gms/internal/ads/zzdvi;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcgw;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbzz;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfaa;

.field private final zze:Ljava/util/concurrent/Executor;

.field private final zzf:Ljava/lang/String;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzffq;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzfam;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzdpx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcgw;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfaa;Ljava/util/concurrent/Executor;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzdpx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zza:Lcom/google/android/gms/internal/ads/zzcgw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzb:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzc:Lcom/google/android/gms/internal/ads/zzbzz;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zze:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzf:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzg:Lcom/google/android/gms/internal/ads/zzffq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzv()Lcom/google/android/gms/internal/ads/zzfam;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzh:Lcom/google/android/gms/internal/ads/zzfam;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzi:Lcom/google/android/gms/internal/ads/zzdpx;

    return-void
.end method

.method private final zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzb:Landroid/content/Context;

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzffe;->zza(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfff;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfff;->zzh()Lcom/google/android/gms/internal/ads/zzfff;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/google/android/gms/internal/ads/zzbmp;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzb:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzc:Lcom/google/android/gms/internal/ads/zzbzz;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zza:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 4
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzcgw;->zzy()Lcom/google/android/gms/internal/ads/zzfft;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzbmp;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbzz;Lcom/google/android/gms/internal/ads/zzfft;)Lcom/google/android/gms/internal/ads/zzbmy;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbmv;->zza:Lcom/google/android/gms/internal/ads/zzbms;

    sget-object v3, Lcom/google/android/gms/internal/ads/zzbmv;->zza:Lcom/google/android/gms/internal/ads/zzbms;

    const-string v4, "google.afma.response.normalize"

    .line 5
    invoke-virtual {v1, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmy;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)Lcom/google/android/gms/internal/ads/zzbmo;

    move-result-object v1

    const-string v2, ""

    .line 6
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/zzdvf;

    invoke-direct {v3, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdvf;-><init>(Lcom/google/android/gms/internal/ads/zzdvi;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zze:Ljava/util/concurrent/Executor;

    .line 7
    invoke-static {v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdvg;

    invoke-direct {p2, v1}, Lcom/google/android/gms/internal/ads/zzdvg;-><init>(Lcom/google/android/gms/internal/ads/zzbmo;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zze:Ljava/util/concurrent/Executor;

    .line 8
    invoke-static {p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdvh;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzdvh;-><init>(Lcom/google/android/gms/internal/ads/zzdvi;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zze:Ljava/util/concurrent/Executor;

    .line 9
    invoke-static {p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzg:Lcom/google/android/gms/internal/ads/zzffq;

    .line 10
    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzffp;->zza(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzffq;Lcom/google/android/gms/internal/ads/zzfff;)V

    return-object p1
.end method

.method private final zzd(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "ad_types"

    .line 1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "unknown"

    const/4 v4, 0x0

    .line 3
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lorg/json/JSONArray;

    .line 4
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzf:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 5
    :cond_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Failed to update the ad types for rendering. "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    return-object p1
.end method

.method private static final zze(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string p0, "request_id"

    .line 2
    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzl;->zzx:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "true"

    if-nez v1, :cond_9

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzgI:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 2
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 1
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdvi;->zze(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/ads/zzbbk;->zzgU:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v3

    .line 5
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v1, "&request_id="

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v4, :cond_0

    add-int/lit8 v1, v1, 0xc

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 8
    :cond_1
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzefn;

    const/16 v1, 0xf

    const-string v2, "Invalid ad string."

    .line 9
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzefn;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zza:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 10
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcgw;->zzm()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzc;

    move-result-object v3

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzi:Lcom/google/android/gms/internal/ads/zzdpx;

    invoke-virtual {v3, v1, v5}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzc;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdpx;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lcom/google/android/gms/internal/ads/zzbbk;->zzgU:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 11
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v5

    .line 12
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzi:Lcom/google/android/gms/internal/ads/zzdpx;

    .line 13
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_7

    const/4 v6, 0x0

    .line 14
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v8, "is_gbid"

    .line 15
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/4 v7, 0x1

    .line 16
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 17
    :catch_0
    :cond_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 13
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_4

    :cond_4
    const-string v7, "&"

    .line 18
    invoke-virtual {v0, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x0

    if-eq v7, v4, :cond_5

    .line 19
    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_5
    move-object v4, v8

    .line 20
    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    const/16 v6, 0xb

    .line 21
    :try_start_1
    invoke-static {v4, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    const-string v6, "UTF-8"

    .line 22
    invoke-virtual {v1, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2

    .line 23
    :try_start_2
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v7, "arek"

    .line 24
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_1
    move-exception v6

    .line 25
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v9, "Failed to get key from QueryJSONMap"

    invoke-virtual {v9, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 26
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/google/android/gms/internal/ads/zzbzc;

    move-result-object v7

    const-string v9, "CryptoUtils.getKeyFromQueryJsonMap"

    invoke-virtual {v7, v6, v9}, Lcom/google/android/gms/internal/ads/zzbzc;->zzu(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 27
    :goto_3
    invoke-static {v4, v1, v8, v5}, Lcom/google/android/gms/internal/ads/zzfam;->zzb([B[BLjava/lang/String;Lcom/google/android/gms/internal/ads/zzdpx;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_4

    :catch_2
    move-exception v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Failed to decode the adResponse. "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 29
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/google/android/gms/internal/ads/zzbzc;

    move-result-object v4

    const-string v5, "PreloadedLoader.decryptAdResponseIfNecessary"

    .line 30
    invoke-virtual {v4, v1, v5}, Lcom/google/android/gms/internal/ads/zzbzc;->zzu(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 31
    :cond_7
    :goto_4
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_5

    .line 45
    :cond_8
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/zzdvi;->zzd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzdvi;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0

    .line 31
    :cond_9
    :goto_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzl;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    if-eqz v0, :cond_c

    .line 32
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbk;->zzgG:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 33
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_6

    .line 44
    :cond_a
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zza:Ljava/lang/String;

    .line 34
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdvi;->zze(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zzb:Ljava/lang/String;

    .line 35
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzdvi;->zze(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 36
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_b

    .line 37
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zza:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcgw;->zzm()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzc;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzc;->zzf(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzi:Lcom/google/android/gms/internal/ads/zzdpx;

    .line 41
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdpx;->zza()Ljava/util/Map;

    move-result-object v2

    const-string v3, "rid"

    .line 42
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :goto_6
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zza:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zzb:Ljava/lang/String;

    .line 43
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzdvi;->zzd(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/zzdvi;->zzc(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0

    .line 42
    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzi:Lcom/google/android/gms/internal/ads/zzdpx;

    .line 38
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdpx;->zza()Ljava/util/Map;

    move-result-object v0

    const-string v1, "ridmm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzefn;

    const/16 v1, 0xe

    const-string v2, "Mismatch request IDs."

    .line 39
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzefn;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzg(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object v0

    return-object v0
.end method

.method final synthetic zzb(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzezr;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzezo;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdvi;->zzd:Lcom/google/android/gms/internal/ads/zzfaa;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzezo;-><init>(Lcom/google/android/gms/internal/ads/zzfaa;)V

    .line 2
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzezq;->zza(Ljava/io/Reader;)Lcom/google/android/gms/internal/ads/zzezq;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzezr;-><init>(Lcom/google/android/gms/internal/ads/zzezo;Lcom/google/android/gms/internal/ads/zzezq;)V

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
