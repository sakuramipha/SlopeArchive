.class final Lcom/google/android/gms/internal/ads/zzfte;
.super Lcom/google/android/gms/internal/ads/zzfrw;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final transient zza:Lcom/google/android/gms/internal/ads/zzfru;

.field private final transient zzb:Lcom/google/android/gms/internal/ads/zzfrr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfru;Lcom/google/android/gms/internal/ads/zzfrr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfrw;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfte;->zza:Lcom/google/android/gms/internal/ads/zzfru;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfte;->zzb:Lcom/google/android/gms/internal/ads/zzfrr;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfte;->zza:Lcom/google/android/gms/internal/ads/zzfru;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfru;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfte;->zzb:Lcom/google/android/gms/internal/ads/zzfrr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfrr;->zzr(I)Lcom/google/android/gms/internal/ads/zzfts;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfte;->zza:Lcom/google/android/gms/internal/ads/zzfru;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfru;->size()I

    move-result v0

    return v0
.end method

.method final zza([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfte;->zzb:Lcom/google/android/gms/internal/ads/zzfrr;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfrm;->zza([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzfrr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfte;->zzb:Lcom/google/android/gms/internal/ads/zzfrr;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzftr;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfte;->zzb:Lcom/google/android/gms/internal/ads/zzfrr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfrr;->zzr(I)Lcom/google/android/gms/internal/ads/zzfts;

    move-result-object v0

    return-object v0
.end method

.method final zzf()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
