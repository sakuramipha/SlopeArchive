.class final Lcom/google/android/gms/internal/ads/zzfpw;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field final zza:Ljava/util/Iterator;

.field zzb:Ljava/util/Collection;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfpx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfpx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzc:Lcom/google/android/gms/internal/ads/zzfpx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfpx;->zza:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zza:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zza:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zza:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzb:Ljava/util/Collection;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzc:Lcom/google/android/gms/internal/ads/zzfpx;

    .line 3
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfpx;->zza(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzb:Ljava/util/Collection;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfoz;->zzi(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zza:Ljava/util/Iterator;

    .line 2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzc:Lcom/google/android/gms/internal/ads/zzfpx;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfpx;->zzb:Lcom/google/android/gms/internal/ads/zzfqk;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfqk;->zzd(Lcom/google/android/gms/internal/ads/zzfqk;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzb:Ljava/util/Collection;

    .line 3
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfqk;->zzn(Lcom/google/android/gms/internal/ads/zzfqk;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzb:Ljava/util/Collection;

    .line 4
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfpw;->zzb:Ljava/util/Collection;

    return-void
.end method
