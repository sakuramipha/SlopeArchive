.class public final synthetic Lcom/google/android/gms/internal/ads/zzebh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzebc;

.field public final synthetic zzb:Ljava/lang/String;

.field public final synthetic zzc:Landroid/app/Activity;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzdqc;

.field public final synthetic zze:Lcom/google/android/gms/internal/ads/zzfen;

.field public final synthetic zzf:Lcom/google/android/gms/ads/internal/overlay/zzl;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzebc;Ljava/lang/String;Landroid/app/Activity;Lcom/google/android/gms/internal/ads/zzdqc;Lcom/google/android/gms/internal/ads/zzfen;Lcom/google/android/gms/ads/internal/overlay/zzl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzebh;->zza:Lcom/google/android/gms/internal/ads/zzebc;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzc:Landroid/app/Activity;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzd:Lcom/google/android/gms/internal/ads/zzdqc;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzebh;->zze:Lcom/google/android/gms/internal/ads/zzfen;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzf:Lcom/google/android/gms/ads/internal/overlay/zzl;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 8

    .line 1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzebh;->zza:Lcom/google/android/gms/internal/ads/zzebc;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzb:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzc:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzd:Lcom/google/android/gms/internal/ads/zzdqc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzebh;->zze:Lcom/google/android/gms/internal/ads/zzfen;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzebh;->zzf:Lcom/google/android/gms/ads/internal/overlay/zzl;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzebc;->zzc(Ljava/lang/String;)V

    new-instance v6, Ljava/util/HashMap;

    .line 2
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v5, "dialog_action"

    const-string v7, "dismiss"

    .line 3
    invoke-interface {v6, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "rtsdc"

    .line 4
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzebn;->zzd(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdqc;Lcom/google/android/gms/internal/ads/zzfen;Lcom/google/android/gms/internal/ads/zzebc;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/overlay/zzl;->zzb()V

    :cond_0
    return-void
.end method
