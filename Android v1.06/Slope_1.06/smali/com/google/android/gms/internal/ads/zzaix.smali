.class public final Lcom/google/android/gms/internal/ads/zzaix;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzajg;


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzam;

.field private zzb:Lcom/google/android/gms/internal/ads/zzfl;

.field private zzc:Lcom/google/android/gms/internal/ads/zzabr;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzak;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzak;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzak;->zzS(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzak;->zzY()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaix;->zza:Lcom/google/android/gms/internal/ads/zzam;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfd;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzb:Lcom/google/android/gms/internal/ads/zzfl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdy;->zzb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget v0, Lcom/google/android/gms/internal/ads/zzfn;->zza:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzb:Lcom/google/android/gms/internal/ads/zzfl;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfl;->zzd()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzb:Lcom/google/android/gms/internal/ads/zzfl;

    .line 4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfl;->zze()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaix;->zza:Lcom/google/android/gms/internal/ads/zzam;

    .line 5
    iget-wide v5, v4, Lcom/google/android/gms/internal/ads/zzam;->zzq:J

    cmp-long v7, v0, v5

    if-eqz v7, :cond_1

    .line 6
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzam;->zzb()Lcom/google/android/gms/internal/ads/zzak;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzak;->zzW(J)Lcom/google/android/gms/internal/ads/zzak;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzak;->zzY()Lcom/google/android/gms/internal/ads/zzam;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaix;->zza:Lcom/google/android/gms/internal/ads/zzam;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzc:Lcom/google/android/gms/internal/ads/zzabr;

    .line 7
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfd;->zza()I

    move-result v5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzc:Lcom/google/android/gms/internal/ads/zzabr;

    .line 8
    invoke-interface {v0, p1, v5}, Lcom/google/android/gms/internal/ads/zzabr;->zzq(Lcom/google/android/gms/internal/ads/zzfd;I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzc:Lcom/google/android/gms/internal/ads/zzabr;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 9
    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzabr;->zzs(JIIILcom/google/android/gms/internal/ads/zzabq;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfl;Lcom/google/android/gms/internal/ads/zzaar;Lcom/google/android/gms/internal/ads/zzajt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzb:Lcom/google/android/gms/internal/ads/zzfl;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzajt;->zzc()V

    .line 2
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzajt;->zza()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lcom/google/android/gms/internal/ads/zzaar;->zzv(II)Lcom/google/android/gms/internal/ads/zzabr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaix;->zzc:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzaix;->zza:Lcom/google/android/gms/internal/ads/zzam;

    .line 3
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzabr;->zzk(Lcom/google/android/gms/internal/ads/zzam;)V

    return-void
.end method
