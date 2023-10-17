.class public final Lcom/google/android/gms/internal/ads/zzbnh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzbmk;

.field private zzb:Lcom/google/android/gms/internal/ads/zzfwb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbmk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zza:Lcom/google/android/gms/internal/ads/zzbmk;

    return-void
.end method

.method private final zzd()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcal;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcal;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zza:Lcom/google/android/gms/internal/ads/zzbmk;

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbmk;->zzb(Lcom/google/android/gms/internal/ads/zzaqq;)Lcom/google/android/gms/internal/ads/zzbme;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzbnf;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzbnf;-><init>(Lcom/google/android/gms/internal/ads/zzcal;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzbng;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/zzbng;-><init>(Lcom/google/android/gms/internal/ads/zzcal;)V

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcas;->zzi(Lcom/google/android/gms/internal/ads/zzcap;Lcom/google/android/gms/internal/ads/zzcan;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)Lcom/google/android/gms/internal/ads/zzbnk;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbnh;->zzd()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbnk;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    const-string v1, "google.afma.activeView.handleUpdate"

    invoke-direct {p1, v0, v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzbnk;-><init>(Lcom/google/android/gms/internal/ads/zzfwb;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbmr;Lcom/google/android/gms/internal/ads/zzbmq;)V

    return-object p1
.end method

.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbii;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbnh;->zzd()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbnd;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzbnd;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbii;)V

    .line 2
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 3
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method

.method public final zzc(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbii;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbne;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzbne;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbii;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/zzcag;->zzf:Lcom/google/android/gms/internal/ads/zzfwc;

    .line 2
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbnh;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    return-void
.end method
