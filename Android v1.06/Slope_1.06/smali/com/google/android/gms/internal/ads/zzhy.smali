.class final Lcom/google/android/gms/internal/ads/zzhy;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzkh;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzlk;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhx;

.field private zzc:Lcom/google/android/gms/internal/ads/zzle;

.field private zzd:Lcom/google/android/gms/internal/ads/zzkh;

.field private zze:Z

.field private zzf:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhx;Lcom/google/android/gms/internal/ads/zzdz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzb:Lcom/google/android/gms/internal/ads/zzhx;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzlk;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzlk;-><init>(Lcom/google/android/gms/internal/ads/zzdz;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zze:Z

    return-void
.end method


# virtual methods
.method public final zza()J
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final zzb(Z)J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzc:Lcom/google/android/gms/internal/ads/zzle;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzle;->zzO()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzc:Lcom/google/android/gms/internal/ads/zzle;

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzle;->zzP()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzc:Lcom/google/android/gms/internal/ads/zzle;

    .line 3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzle;->zzI()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    .line 12
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzkh;->zza()J

    move-result-wide v0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzhy;->zze:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzlk;->zza()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzlk;->zze()V

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzhy;->zze:Z

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzf:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzlk;->zzd()V

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 8
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzlk;->zzb(J)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzkh;->zzc()Lcom/google/android/gms/internal/ads/zzci;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzlk;->zzc()Lcom/google/android/gms/internal/ads/zzci;

    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzci;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 16
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 10
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzlk;->zzg(Lcom/google/android/gms/internal/ads/zzci;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzb:Lcom/google/android/gms/internal/ads/zzhx;

    .line 11
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zza(Lcom/google/android/gms/internal/ads/zzci;)V

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zze:Z

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzf:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzlk;->zzd()V

    :cond_4
    :goto_1
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zze:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzlk;->zza()J

    move-result-wide v0

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    .line 16
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzkh;->zza()J

    move-result-wide v0

    :goto_2
    return-wide v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzci;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzkh;->zzc()Lcom/google/android/gms/internal/ads/zzci;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzlk;->zzc()Lcom/google/android/gms/internal/ads/zzci;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzc:Lcom/google/android/gms/internal/ads/zzle;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzc:Lcom/google/android/gms/internal/ads/zzle;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zze:Z

    :cond_0
    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzia;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzle;->zzi()Lcom/google/android/gms/internal/ads/zzkh;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzc:Lcom/google/android/gms/internal/ads/zzle;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzlk;->zzc()Lcom/google/android/gms/internal/ads/zzci;

    move-result-object p1

    .line 4
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzkh;->zzg(Lcom/google/android/gms/internal/ads/zzci;)V

    return-void

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    .line 2
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x3e8

    .line 3
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzia;->zzd(Ljava/lang/RuntimeException;I)Lcom/google/android/gms/internal/ads/zzia;

    move-result-object p1

    .line 2
    throw p1

    :cond_1
    return-void
.end method

.method public final zzf(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzlk;->zzb(J)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzci;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzkh;->zzg(Lcom/google/android/gms/internal/ads/zzci;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzd:Lcom/google/android/gms/internal/ads/zzkh;

    .line 2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzkh;->zzc()Lcom/google/android/gms/internal/ads/zzci;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzlk;->zzg(Lcom/google/android/gms/internal/ads/zzci;)V

    return-void
.end method

.method public final zzh()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzf:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzlk;->zzd()V

    return-void
.end method

.method public final zzi()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zzf:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhy;->zza:Lcom/google/android/gms/internal/ads/zzlk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzlk;->zze()V

    return-void
.end method
