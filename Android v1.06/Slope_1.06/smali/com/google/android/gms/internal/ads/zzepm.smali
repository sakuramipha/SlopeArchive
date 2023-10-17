.class public final synthetic Lcom/google/android/gms/internal/ads/zzepm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzepq;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbpv;

.field public final synthetic zzc:Landroid/os/Bundle;

.field public final synthetic zzd:Ljava/util/List;

.field public final synthetic zze:Lcom/google/android/gms/internal/ads/zzeie;

.field public final synthetic zzf:Lcom/google/android/gms/internal/ads/zzcal;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzepq;Lcom/google/android/gms/internal/ads/zzbpv;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzeie;Lcom/google/android/gms/internal/ads/zzcal;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzepm;->zza:Lcom/google/android/gms/internal/ads/zzepq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzb:Lcom/google/android/gms/internal/ads/zzbpv;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzc:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzd:Ljava/util/List;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzepm;->zze:Lcom/google/android/gms/internal/ads/zzeie;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzf:Lcom/google/android/gms/internal/ads/zzcal;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzepm;->zza:Lcom/google/android/gms/internal/ads/zzepq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzb:Lcom/google/android/gms/internal/ads/zzbpv;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzc:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzd:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzepm;->zze:Lcom/google/android/gms/internal/ads/zzeie;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzepm;->zzf:Lcom/google/android/gms/internal/ads/zzcal;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzepq;->zze(Lcom/google/android/gms/internal/ads/zzbpv;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzeie;Lcom/google/android/gms/internal/ads/zzcal;)V

    return-void
.end method
