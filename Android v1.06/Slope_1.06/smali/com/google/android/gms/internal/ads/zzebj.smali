.class public final synthetic Lcom/google/android/gms/internal/ads/zzebj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic zza:Landroid/app/Activity;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdqc;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfen;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzebc;

.field public final synthetic zze:Ljava/lang/String;

.field public final synthetic zzf:Lcom/google/android/gms/ads/internal/util/zzbr;

.field public final synthetic zzg:Ljava/lang/String;

.field public final synthetic zzh:Lcom/google/android/gms/ads/internal/overlay/zzl;

.field public final synthetic zzi:Z


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/google/android/gms/internal/ads/zzdqc;Lcom/google/android/gms/internal/ads/zzfen;Lcom/google/android/gms/internal/ads/zzebc;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzbr;Ljava/lang/String;Lcom/google/android/gms/ads/internal/overlay/zzl;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzebj;->zza:Landroid/app/Activity;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzb:Lcom/google/android/gms/internal/ads/zzdqc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzc:Lcom/google/android/gms/internal/ads/zzfen;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzd:Lcom/google/android/gms/internal/ads/zzebc;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzebj;->zze:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzf:Lcom/google/android/gms/ads/internal/util/zzbr;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzg:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzh:Lcom/google/android/gms/ads/internal/overlay/zzl;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzi:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzebj;->zza:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzb:Lcom/google/android/gms/internal/ads/zzdqc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzc:Lcom/google/android/gms/internal/ads/zzfen;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzd:Lcom/google/android/gms/internal/ads/zzebc;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzebj;->zze:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzf:Lcom/google/android/gms/ads/internal/util/zzbr;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzg:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzh:Lcom/google/android/gms/ads/internal/overlay/zzl;

    iget-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzebj;->zzi:Z

    move-object v9, p1

    move v10, p2

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzebn;->zzj(Landroid/app/Activity;Lcom/google/android/gms/internal/ads/zzdqc;Lcom/google/android/gms/internal/ads/zzfen;Lcom/google/android/gms/internal/ads/zzebc;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzbr;Ljava/lang/String;Lcom/google/android/gms/ads/internal/overlay/zzl;ZLandroid/content/DialogInterface;I)V

    return-void
.end method
