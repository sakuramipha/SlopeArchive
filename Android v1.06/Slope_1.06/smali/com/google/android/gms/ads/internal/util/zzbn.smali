.class public final Lcom/google/android/gms/ads/internal/util/zzbn;
.super Lcom/google/android/gms/internal/ads/zzali;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcal;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzbzs;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzcal;)V
    .locals 1

    .line 1
    new-instance p2, Lcom/google/android/gms/ads/internal/util/zzbm;

    invoke-direct {p2, p3}, Lcom/google/android/gms/ads/internal/util/zzbm;-><init>(Lcom/google/android/gms/internal/ads/zzcal;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzali;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzalm;)V

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    .line 2
    new-instance p2, Lcom/google/android/gms/internal/ads/zzbzs;

    const/4 p3, 0x0

    .line 3
    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/zzbzs;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->zzb:Lcom/google/android/gms/internal/ads/zzbzs;

    const-string v0, "GET"

    .line 4
    invoke-virtual {p2, p1, v0, p3, p3}, Lcom/google/android/gms/internal/ads/zzbzs;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    return-void
.end method


# virtual methods
.method protected final zzh(Lcom/google/android/gms/internal/ads/zzale;)Lcom/google/android/gms/internal/ads/zzalo;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzamf;->zzb(Lcom/google/android/gms/internal/ads/zzale;)Lcom/google/android/gms/internal/ads/zzakr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzalo;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzakr;)Lcom/google/android/gms/internal/ads/zzalo;

    move-result-object p1

    return-object p1
.end method

.method protected final bridge synthetic zzo(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzale;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->zzb:Lcom/google/android/gms/internal/ads/zzbzs;

    .line 2
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzale;->zzc:Ljava/util/Map;

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzale;->zza:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbzs;->zzf(Ljava/util/Map;I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->zzb:Lcom/google/android/gms/internal/ads/zzbzs;

    .line 3
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzale;->zzb:[B

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbzs;->zzk()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbzs;->zzh([B)V

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/zzbn;->zza:Lcom/google/android/gms/internal/ads/zzcal;

    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcal;->zzd(Ljava/lang/Object;)Z

    return-void
.end method
