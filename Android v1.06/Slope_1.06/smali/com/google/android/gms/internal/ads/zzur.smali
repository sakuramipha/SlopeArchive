.class public final Lcom/google/android/gms/internal/ads/zzur;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zztx;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzfw;

.field private zzd:I

.field private final zze:Lcom/google/android/gms/internal/ads/zzuq;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzxq;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzqi;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfw;Lcom/google/android/gms/internal/ads/zzuq;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzqi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzqi;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzxq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzxq;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzur;->zzc:Lcom/google/android/gms/internal/ads/zzfw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzur;->zze:Lcom/google/android/gms/internal/ads/zzuq;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzur;->zzg:Lcom/google/android/gms/internal/ads/zzqi;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzur;->zzf:Lcom/google/android/gms/internal/ads/zzxq;

    const/high16 p1, 0x100000

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzur;->zzd:I

    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/ads/zzur;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzur;->zzd:I

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbq;)Lcom/google/android/gms/internal/ads/zzut;
    .locals 9

    .line 2
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzbq;->zzd:Lcom/google/android/gms/internal/ads/zzbi;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzut;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzur;->zzc:Lcom/google/android/gms/internal/ads/zzfw;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzur;->zze:Lcom/google/android/gms/internal/ads/zzuq;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzqr;->zza:Lcom/google/android/gms/internal/ads/zzqr;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzur;->zzf:Lcom/google/android/gms/internal/ads/zzxq;

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzur;->zzd:I

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    .line 1
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzut;-><init>(Lcom/google/android/gms/internal/ads/zzbq;Lcom/google/android/gms/internal/ads/zzfw;Lcom/google/android/gms/internal/ads/zzuq;Lcom/google/android/gms/internal/ads/zzqr;Lcom/google/android/gms/internal/ads/zzxq;ILcom/google/android/gms/internal/ads/zzus;)V

    return-object v0
.end method
