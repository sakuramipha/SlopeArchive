.class public final Lcom/google/android/gms/internal/ads/zzehh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzebv;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcqa;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbci;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfwc;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfed;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcqa;Lcom/google/android/gms/internal/ads/zzfed;Lcom/google/android/gms/internal/ads/zzfwc;Lcom/google/android/gms/internal/ads/zzbci;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzehh;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzehh;->zzb:Lcom/google/android/gms/internal/ads/zzcqa;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzehh;->zze:Lcom/google/android/gms/internal/ads/zzfed;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzehh;->zzd:Lcom/google/android/gms/internal/ads/zzfwc;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzehh;->zzc:Lcom/google/android/gms/internal/ads/zzbci;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 7

    .line 1
    new-instance v6, Lcom/google/android/gms/internal/ads/zzehf;

    new-instance v2, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehh;->zza:Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object v4, Lcom/google/android/gms/internal/ads/zzehd;->zza:Lcom/google/android/gms/internal/ads/zzehd;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzv:Ljava/util/List;

    const/4 v1, 0x0

    .line 2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/internal/ads/zzezg;

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzehf;-><init>(Lcom/google/android/gms/internal/ads/zzehh;Landroid/view/View;Lcom/google/android/gms/internal/ads/zzcfb;Lcom/google/android/gms/internal/ads/zzcrd;Lcom/google/android/gms/internal/ads/zzezg;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehh;->zzb:Lcom/google/android/gms/internal/ads/zzcqa;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcru;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/zzcru;-><init>(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, v1, v6}, Lcom/google/android/gms/internal/ads/zzcqa;->zza(Lcom/google/android/gms/internal/ads/zzcru;Lcom/google/android/gms/internal/ads/zzcpk;)Lcom/google/android/gms/internal/ads/zzcpe;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbcd;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcpe;->zzk()Lcom/google/android/gms/internal/ads/zzehg;

    move-result-object v1

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzezk;->zzb:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezk;->zza:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lcom/google/android/gms/internal/ads/zzbcd;-><init>(Lcom/google/android/gms/ads/internal/zzf;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzehh;->zze:Lcom/google/android/gms/internal/ads/zzfed;

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfdx;->zzs:Lcom/google/android/gms/internal/ads/zzfdx;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzehe;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzehe;-><init>(Lcom/google/android/gms/internal/ads/zzehh;Lcom/google/android/gms/internal/ads/zzbcd;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehh;->zzd:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 6
    invoke-static {v2, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzfdn;->zzd(Lcom/google/android/gms/internal/ads/zzfdh;Lcom/google/android/gms/internal/ads/zzfwc;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfdv;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfdx;->zzt:Lcom/google/android/gms/internal/ads/zzfdx;

    .line 7
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzfdu;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p2

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcpe;->zza()Lcom/google/android/gms/internal/ads/zzcpd;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zzd(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfdu;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfdu;->zza()Lcom/google/android/gms/internal/ads/zzfdi;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzehh;->zzc:Lcom/google/android/gms/internal/ads/zzbci;

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzt:Lcom/google/android/gms/internal/ads/zzezk;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezk;->zza:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final synthetic zzc(Lcom/google/android/gms/internal/ads/zzbcd;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehh;->zzc:Lcom/google/android/gms/internal/ads/zzbci;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbci;->zze(Lcom/google/android/gms/internal/ads/zzbcf;)V

    return-void
.end method
