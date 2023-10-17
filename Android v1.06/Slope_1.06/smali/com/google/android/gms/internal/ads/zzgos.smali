.class public Lcom/google/android/gms/internal/ads/zzgos;
.super Lcom/google/android/gms/internal/ads/zzgmw;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/ads/zzgow<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/ads/zzgos<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/ads/zzgmw<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field protected zza:Lcom/google/android/gms/internal/ads/zzgow;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgow;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/ads/zzgow;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgmw;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgos;->zzb:Lcom/google/android/gms/internal/ads/zzgow;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgow;->zzaY()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgow;->zzaD()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    return-void

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    .line 3
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static zza(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgqo;->zza()Lcom/google/android/gms/internal/ads/zzgqo;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgqo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgqz;

    move-result-object v0

    .line 1
    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgqz;->zzg(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzai()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzah()Lcom/google/android/gms/internal/ads/zzgmw;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzai()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v0

    return-object v0
.end method

.method public final zzai()Lcom/google/android/gms/internal/ads/zzgos;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zzb:Lcom/google/android/gms/internal/ads/zzgow;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzgow;->zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgos;

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzam()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    return-object v0
.end method

.method public final zzaj(Lcom/google/android/gms/internal/ads/zzgow;)Lcom/google/android/gms/internal/ads/zzgos;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zzb:Lcom/google/android/gms/internal/ads/zzgow;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgow;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaY()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzaq()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 4
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzgos;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final zzak([BIILcom/google/android/gms/internal/ads/zzgoi;)Lcom/google/android/gms/internal/ads/zzgos;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgpi;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzgow;->zzaY()Z

    move-result p2

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzaq()V

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgqo;->zza()Lcom/google/android/gms/internal/ads/zzgqo;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzgqo;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgqz;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    const/4 v4, 0x0

    new-instance v6, Lcom/google/android/gms/internal/ads/zzgna;

    .line 3
    invoke-direct {v6, p4}, Lcom/google/android/gms/internal/ads/zzgna;-><init>(Lcom/google/android/gms/internal/ads/zzgoi;)V

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzgqz;->zzi(Ljava/lang/Object;[BIILcom/google/android/gms/internal/ads/zzgna;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzgpi; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    .line 5
    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 6
    :catch_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgpi;->zzj()Lcom/google/android/gms/internal/ads/zzgpi;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    .line 7
    throw p1
.end method

.method public final zzal()Lcom/google/android/gms/internal/ads/zzgow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzam()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaX()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgrp;

    .line 3
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzgrp;-><init>(Lcom/google/android/gms/internal/ads/zzgqg;)V

    .line 4
    throw v1
.end method

.method public zzam()Lcom/google/android/gms/internal/ads/zzgow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaY()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaS()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    return-object v0
.end method

.method public bridge synthetic zzan()Lcom/google/android/gms/internal/ads/zzgqg;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzam()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v0

    return-object v0
.end method

.method protected final zzap()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaY()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzaq()V

    :cond_0
    return-void
.end method

.method protected zzaq()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zzb:Lcom/google/android/gms/internal/ads/zzgow;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaD()Lcom/google/android/gms/internal/ads/zzgow;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgos;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgos;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    return-void
.end method

.method public final synthetic zzbf()Lcom/google/android/gms/internal/ads/zzgqg;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
