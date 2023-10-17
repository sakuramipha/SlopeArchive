.class public final Lcom/google/android/gms/internal/ads/zzfys;
.super Lcom/google/android/gms/internal/ads/zzgdh;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/zzgef;

    .line 1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfyq;

    const-class v2, Lcom/google/android/gms/internal/ads/zzfww;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzfyq;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/ads/zzghr;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/zzgdh;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/ads/zzgef;)V

    return-void
.end method

.method static bridge synthetic zzg(IIIIII)Lcom/google/android/gms/internal/ads/zzgdf;
    .locals 1

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgdf;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgia;->zzc()Lcom/google/android/gms/internal/ads/zzghz;

    move-result-object p2

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgid;->zzc()Lcom/google/android/gms/internal/ads/zzgic;

    move-result-object p4

    const/16 v0, 0x10

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/ads/zzgic;->zza(I)Lcom/google/android/gms/internal/ads/zzgic;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/ads/zzgid;

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/ads/zzghz;->zzb(Lcom/google/android/gms/internal/ads/zzgid;)Lcom/google/android/gms/internal/ads/zzghz;

    .line 3
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/zzghz;->zza(I)Lcom/google/android/gms/internal/ads/zzghz;

    .line 4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzgia;

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgjm;->zzc()Lcom/google/android/gms/internal/ads/zzgjl;

    move-result-object p2

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgjp;->zzc()Lcom/google/android/gms/internal/ads/zzgjo;

    move-result-object p4

    const/4 v0, 0x5

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/ads/zzgjo;->zzb(I)Lcom/google/android/gms/internal/ads/zzgjo;

    invoke-virtual {p4, p3}, Lcom/google/android/gms/internal/ads/zzgjo;->zza(I)Lcom/google/android/gms/internal/ads/zzgjo;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/ads/zzgjp;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(Lcom/google/android/gms/internal/ads/zzgjp;)Lcom/google/android/gms/internal/ads/zzgjl;

    const/16 p3, 0x20

    .line 7
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzgjl;->zza(I)Lcom/google/android/gms/internal/ads/zzgjl;

    .line 8
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/zzgjm;

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzghu;->zza()Lcom/google/android/gms/internal/ads/zzght;

    move-result-object p3

    .line 10
    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/ads/zzght;->zza(Lcom/google/android/gms/internal/ads/zzgia;)Lcom/google/android/gms/internal/ads/zzght;

    .line 11
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzght;->zzb(Lcom/google/android/gms/internal/ads/zzgjm;)Lcom/google/android/gms/internal/ads/zzght;

    .line 12
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzgos;->zzal()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzghu;

    invoke-direct {p1, p0, p5}, Lcom/google/android/gms/internal/ads/zzgdf;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzgdg;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/ads/zzghu;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfyr;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzfyr;-><init>(Lcom/google/android/gms/internal/ads/zzfys;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzgjt;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgjt;->zzb:Lcom/google/android/gms/internal/ads/zzgjt;

    return-object v0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzgno;)Lcom/google/android/gms/internal/ads/zzgqg;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgpi;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgoi;->zza()Lcom/google/android/gms/internal/ads/zzgoi;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzghr;->zze(Lcom/google/android/gms/internal/ads/zzgno;Lcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzghr;

    move-result-object p1

    return-object p1
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public final bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzgqg;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzghr;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghr;->zza()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgms;->zzb(II)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzg;

    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfzg;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghr;->zzf()Lcom/google/android/gms/internal/ads/zzghx;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfzg;->zzh(Lcom/google/android/gms/internal/ads/zzghx;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgga;

    .line 4
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgga;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghr;->zzg()Lcom/google/android/gms/internal/ads/zzgjj;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgga;->zzm(Lcom/google/android/gms/internal/ads/zzgjj;)V

    return-void
.end method

.method public final zzf()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
