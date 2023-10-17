.class final Lcom/google/android/gms/internal/ads/zzgfd;
.super Lcom/google/android/gms/internal/ads/zzgdg;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgfe;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzgdg;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzgqg;)Lcom/google/android/gms/internal/ads/zzgqg;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzghl;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzghi;->zzc()Lcom/google/android/gms/internal/ads/zzghh;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzghh;->zzc(I)Lcom/google/android/gms/internal/ads/zzghh;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghl;->zza()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgmq;->zza(I)[B

    move-result-object v2

    array-length v3, v2

    .line 5
    invoke-static {v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzgno;->zzv([BII)Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzghh;->zza(Lcom/google/android/gms/internal/ads/zzgno;)Lcom/google/android/gms/internal/ads/zzghh;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghl;->zzf()Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzghh;->zzb(Lcom/google/android/gms/internal/ads/zzgho;)Lcom/google/android/gms/internal/ads/zzghh;

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzghi;

    return-object p1
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/ads/zzgno;)Lcom/google/android/gms/internal/ads/zzgqg;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgpi;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoi;->zza()Lcom/google/android/gms/internal/ads/zzgoi;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzghl;->zze(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzghl;

    move-result-object p1

    return-object p1
.end method

.method public final zzc()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgdf;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzghl;->zzc()Lcom/google/android/gms/internal/ads/zzghk;

    move-result-object v2

    const/16 v3, 0x20

    .line 3
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzghk;->zza(I)Lcom/google/android/gms/internal/ads/zzghk;

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgho;->zzc()Lcom/google/android/gms/internal/ads/zzghn;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzghn;->zza(I)Lcom/google/android/gms/internal/ads/zzghn;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzgho;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzghk;->zzb(Lcom/google/android/gms/internal/ads/zzgho;)Lcom/google/android/gms/internal/ads/zzghk;

    .line 5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzghl;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzgdf;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES_CMAC"

    .line 6
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgdf;

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzghl;->zzc()Lcom/google/android/gms/internal/ads/zzghk;

    move-result-object v2

    .line 8
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzghk;->zza(I)Lcom/google/android/gms/internal/ads/zzghk;

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgho;->zzc()Lcom/google/android/gms/internal/ads/zzghn;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzghn;->zza(I)Lcom/google/android/gms/internal/ads/zzghn;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zzgho;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzghk;->zzb(Lcom/google/android/gms/internal/ads/zzgho;)Lcom/google/android/gms/internal/ads/zzghk;

    .line 10
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzghl;

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzgdf;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_CMAC"

    .line 11
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgdf;

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzghl;->zzc()Lcom/google/android/gms/internal/ads/zzghk;

    move-result-object v2

    .line 13
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzghk;->zza(I)Lcom/google/android/gms/internal/ads/zzghk;

    .line 14
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgho;->zzc()Lcom/google/android/gms/internal/ads/zzghn;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzghn;->zza(I)Lcom/google/android/gms/internal/ads/zzghn;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzgho;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzghk;->zzb(Lcom/google/android/gms/internal/ads/zzgho;)Lcom/google/android/gms/internal/ads/zzghk;

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzghl;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgdf;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_CMAC_RAW"

    .line 16
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzgqg;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzghl;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghl;->zzf()Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgfe;->zzg(Lcom/google/android/gms/internal/ads/zzgho;)V

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghl;->zza()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgfe;->zzh(I)V

    return-void
.end method
