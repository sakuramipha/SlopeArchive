.class public final synthetic Lcom/google/android/gms/internal/ads/zzmj;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzel;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzlt;

.field public final synthetic zzb:I

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcp;

.field public final synthetic zzd:Lcom/google/android/gms/internal/ads/zzcp;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzlt;ILcom/google/android/gms/internal/ads/zzcp;Lcom/google/android/gms/internal/ads/zzcp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzmj;->zza:Lcom/google/android/gms/internal/ads/zzlt;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzc:Lcom/google/android/gms/internal/ads/zzcp;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzd:Lcom/google/android/gms/internal/ads/zzcp;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzmj;->zza:Lcom/google/android/gms/internal/ads/zzlt;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzb:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzc:Lcom/google/android/gms/internal/ads/zzcp;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzmj;->zzd:Lcom/google/android/gms/internal/ads/zzcp;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzlv;

    .line 1
    invoke-interface {p1, v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzlv;->zzm(Lcom/google/android/gms/internal/ads/zzlt;Lcom/google/android/gms/internal/ads/zzcp;Lcom/google/android/gms/internal/ads/zzcp;I)V

    return-void
.end method
