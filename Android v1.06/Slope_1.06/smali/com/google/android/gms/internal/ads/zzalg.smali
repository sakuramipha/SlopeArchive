.class final Lcom/google/android/gms/internal/ads/zzalg;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:J

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzali;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzali;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzalg;->zzc:Lcom/google/android/gms/internal/ads/zzali;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzalg;->zza:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzalg;->zzb:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzalg;->zzc:Lcom/google/android/gms/internal/ads/zzali;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzali;->zzi(Lcom/google/android/gms/internal/ads/zzali;)Lcom/google/android/gms/internal/ads/zzalt;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzalg;->zza:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzalg;->zzb:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzalt;->zza(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzalg;->zzc:Lcom/google/android/gms/internal/ads/zzali;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzali;->zzi(Lcom/google/android/gms/internal/ads/zzali;)Lcom/google/android/gms/internal/ads/zzalt;

    move-result-object v1

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzali;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzalt;->zzb(Ljava/lang/String;)V

    return-void
.end method
