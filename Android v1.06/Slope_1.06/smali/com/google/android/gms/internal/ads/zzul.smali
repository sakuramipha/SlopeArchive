.class final Lcom/google/android/gms/internal/ads/zzul;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzvc;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzuo;

.field private final zzb:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzuo;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzul;->zza:Lcom/google/android/gms/internal/ads/zzuo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzul;->zzb:I

    return-void
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzul;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzul;->zzb:I

    return p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzkf;Lcom/google/android/gms/internal/ads/zzhi;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzul;->zza:Lcom/google/android/gms/internal/ads/zzuo;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzul;->zzb:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzuo;->zzg(ILcom/google/android/gms/internal/ads/zzkf;Lcom/google/android/gms/internal/ads/zzhi;I)I

    move-result p1

    return p1
.end method

.method public final zzb(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzul;->zza:Lcom/google/android/gms/internal/ads/zzuo;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzul;->zzb:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzuo;->zzi(IJ)I

    move-result p1

    return p1
.end method

.method public final zzd()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzul;->zza:Lcom/google/android/gms/internal/ads/zzuo;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzul;->zzb:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzuo;->zzH(I)V

    return-void
.end method

.method public final zze()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzul;->zza:Lcom/google/android/gms/internal/ads/zzuo;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzul;->zzb:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzuo;->zzO(I)Z

    move-result v0

    return v0
.end method
