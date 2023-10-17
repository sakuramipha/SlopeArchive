.class final Lcom/google/android/gms/internal/ads/zzagv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzaha;

.field public final zzb:Lcom/google/android/gms/internal/ads/zzahd;

.field public final zzc:Lcom/google/android/gms/internal/ads/zzabr;

.field public final zzd:Lcom/google/android/gms/internal/ads/zzabs;

.field public zze:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaha;Lcom/google/android/gms/internal/ads/zzahd;Lcom/google/android/gms/internal/ads/zzabr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagv;->zza:Lcom/google/android/gms/internal/ads/zzaha;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzagv;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzagv;->zzc:Lcom/google/android/gms/internal/ads/zzabr;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzaha;->zzf:Lcom/google/android/gms/internal/ads/zzam;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzabs;

    .line 2
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzabs;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzagv;->zzd:Lcom/google/android/gms/internal/ads/zzabs;

    return-void
.end method
