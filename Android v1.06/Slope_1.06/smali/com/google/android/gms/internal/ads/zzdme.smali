.class public final Lcom/google/android/gms/internal/ads/zzdme;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcvg;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcwp;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcxc;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcxo;

.field private final zze:Lcom/google/android/gms/internal/ads/zzdac;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzdcu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcvg;Lcom/google/android/gms/internal/ads/zzcwp;Lcom/google/android/gms/internal/ads/zzcxc;Lcom/google/android/gms/internal/ads/zzcxo;Lcom/google/android/gms/internal/ads/zzdac;Lcom/google/android/gms/internal/ads/zzdcu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdme;->zza:Lcom/google/android/gms/internal/ads/zzcvg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzb:Lcom/google/android/gms/internal/ads/zzcwp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzc:Lcom/google/android/gms/internal/ads/zzcxc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzd:Lcom/google/android/gms/internal/ads/zzcxo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdme;->zze:Lcom/google/android/gms/internal/ads/zzdac;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzf:Lcom/google/android/gms/internal/ads/zzdcu;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzdmf;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdmf;->zza(Lcom/google/android/gms/internal/ads/zzdmf;)Lcom/google/android/gms/internal/ads/zzdmc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdme;->zza:Lcom/google/android/gms/internal/ads/zzcvg;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzc:Lcom/google/android/gms/internal/ads/zzcxc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzd:Lcom/google/android/gms/internal/ads/zzcxo;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdme;->zze:Lcom/google/android/gms/internal/ads/zzdac;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzb:Lcom/google/android/gms/internal/ads/zzcwp;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzdmd;

    invoke-direct {v5, p1}, Lcom/google/android/gms/internal/ads/zzdmd;-><init>(Lcom/google/android/gms/internal/ads/zzcwp;)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzdme;->zzf:Lcom/google/android/gms/internal/ads/zzdcu;

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzdmc;->zzi(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/internal/ads/zzbhb;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/google/android/gms/internal/ads/zzbhd;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/google/android/gms/internal/ads/zzdcw;)V

    return-void
.end method
