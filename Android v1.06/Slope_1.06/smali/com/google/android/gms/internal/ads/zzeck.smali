.class public final Lcom/google/android/gms/internal/ads/zzeck;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzecb;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcor;

.field private final zzc:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcor;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeck;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeck;->zzb:Lcom/google/android/gms/internal/ads/zzcor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeck;->zzc:Ljava/util/concurrent/Executor;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeck;->zzb:Lcom/google/android/gms/internal/ads/zzcor;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcru;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/zzeby;->zza:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/zzcru;-><init>(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzddt;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzecj;

    invoke-direct {v2, p3}, Lcom/google/android/gms/internal/ads/zzecj;-><init>(Lcom/google/android/gms/internal/ads/zzeby;)V

    const/4 v3, 0x0

    invoke-direct {p1, v2, v3}, Lcom/google/android/gms/internal/ads/zzddt;-><init>(Lcom/google/android/gms/internal/ads/zzdey;Lcom/google/android/gms/internal/ads/zzcfb;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcop;

    iget p2, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzab:I

    invoke-direct {v2, p2}, Lcom/google/android/gms/internal/ads/zzcop;-><init>(I)V

    .line 2
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzcor;->zza(Lcom/google/android/gms/internal/ads/zzcru;Lcom/google/android/gms/internal/ads/zzddt;Lcom/google/android/gms/internal/ads/zzcop;)Lcom/google/android/gms/internal/ads/zzcoo;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcoo;->zzd()Lcom/google/android/gms/internal/ads/zzcwh;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcnf;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    .line 4
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfav;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzcnf;-><init>(Lcom/google/android/gms/internal/ads/zzfav;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeck;->zzc:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzdas;->zzm(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    .line 5
    check-cast p2, Lcom/google/android/gms/internal/ads/zzedr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcoo;->zzj()Lcom/google/android/gms/internal/ads/zzehc;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzedr;->zzc(Lcom/google/android/gms/internal/ads/zzboe;)V

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcoo;->zza()Lcom/google/android/gms/internal/ads/zzcox;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzeby;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzfaf;
        }
    .end annotation

    .line 1
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzb:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfav;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeck;->zza:Landroid/content/Context;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezr;->zza:Lcom/google/android/gms/internal/ads/zzezo;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezo;->zza:Lcom/google/android/gms/internal/ads/zzfaa;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfaa;->zzd:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzezf;->zzw:Lorg/json/JSONObject;

    .line 2
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzeby;->zzc:Lcom/google/android/gms/internal/ads/zzcws;

    check-cast p3, Lcom/google/android/gms/internal/ads/zzboe;

    .line 1
    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfav;->zzl(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzboe;)V

    return-void
.end method
