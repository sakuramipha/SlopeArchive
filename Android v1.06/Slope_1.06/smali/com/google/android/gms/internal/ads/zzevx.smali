.class public final Lcom/google/android/gms/internal/ads/zzevx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeww;


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzcup;

.field private final zzb:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfwi;->zzb()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzevx;->zzb:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzcup;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevx;->zza:Lcom/google/android/gms/internal/ads/zzcup;

    return-object v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/internal/ads/zzewv;Lcom/google/android/gms/internal/ads/zzcup;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzewx;->zzb:Lcom/google/android/gms/internal/ads/zzewu;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzewv;->zza(Lcom/google/android/gms/internal/ads/zzewu;)Lcom/google/android/gms/internal/ads/zzcuo;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzexa;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/zzexa;-><init>(Z)V

    .line 2
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzcuo;->zzb(Lcom/google/android/gms/internal/ads/zzexa;)Lcom/google/android/gms/internal/ads/zzcuo;

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcuo;->zzh()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcup;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevx;->zza:Lcom/google/android/gms/internal/ads/zzcup;

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcup;->zzb()Lcom/google/android/gms/internal/ads/zzcsm;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfbv;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzfbv;-><init>()V

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsm;->zzj()Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p3

    .line 6
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzfvi;->zzv(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfvi;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzevv;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/internal/ads/zzevv;-><init>(Lcom/google/android/gms/internal/ads/zzevx;Lcom/google/android/gms/internal/ads/zzfbv;Lcom/google/android/gms/internal/ads/zzcsm;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzevx;->zzb:Ljava/util/concurrent/Executor;

    .line 7
    invoke-static {p3, v0, p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzm(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfuy;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    new-instance p3, Lcom/google/android/gms/internal/ads/zzevw;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/ads/zzevw;-><init>(Lcom/google/android/gms/internal/ads/zzfbv;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzevx;->zzb:Ljava/util/concurrent/Executor;

    .line 8
    invoke-static {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzfvr;->zzl(Lcom/google/android/gms/internal/ads/zzfwb;Lcom/google/android/gms/internal/ads/zzfon;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/internal/ads/zzewv;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 0

    const/4 p3, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzevx;->zzb(Lcom/google/android/gms/internal/ads/zzewx;Lcom/google/android/gms/internal/ads/zzewv;Lcom/google/android/gms/internal/ads/zzcup;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzd()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevx;->zza:Lcom/google/android/gms/internal/ads/zzcup;

    return-object v0
.end method
