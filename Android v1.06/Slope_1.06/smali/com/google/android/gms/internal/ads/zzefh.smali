.class public final Lcom/google/android/gms/internal/ads/zzefh;
.super Lcom/google/android/gms/internal/ads/zzefa;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcgw;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcuq;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdav;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzefk;

.field private final zze:Lcom/google/android/gms/internal/ads/zzezs;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final zzf:Lcom/google/android/gms/internal/ads/zzeca;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcgw;Lcom/google/android/gms/internal/ads/zzcuq;Lcom/google/android/gms/internal/ads/zzdav;Lcom/google/android/gms/internal/ads/zzezs;Lcom/google/android/gms/internal/ads/zzefk;Lcom/google/android/gms/internal/ads/zzeca;)V
    .locals 0
    .param p4    # Lcom/google/android/gms/internal/ads/zzezs;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzefa;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzefh;->zza:Lcom/google/android/gms/internal/ads/zzcgw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzb:Lcom/google/android/gms/internal/ads/zzcuq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzc:Lcom/google/android/gms/internal/ads/zzdav;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzefh;->zze:Lcom/google/android/gms/internal/ads/zzezs;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzd:Lcom/google/android/gms/internal/ads/zzefk;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzf:Lcom/google/android/gms/internal/ads/zzeca;

    return-void
.end method


# virtual methods
.method protected final zzc(Lcom/google/android/gms/internal/ads/zzfaa;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzezr;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzb:Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzi(Lcom/google/android/gms/internal/ads/zzfaa;)Lcom/google/android/gms/internal/ads/zzcuq;

    .line 2
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzcuq;->zzf(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzcuq;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzcuk;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzd:Lcom/google/android/gms/internal/ads/zzefk;

    invoke-direct {p1, p4, p3, p2}, Lcom/google/android/gms/internal/ads/zzcuk;-><init>(Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzezf;Lcom/google/android/gms/internal/ads/zzefk;)V

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzg(Lcom/google/android/gms/internal/ads/zzcuk;)Lcom/google/android/gms/internal/ads/zzcuq;

    .line 4
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzdi:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefh;->zze:Lcom/google/android/gms/internal/ads/zzezs;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzb:Lcom/google/android/gms/internal/ads/zzcuq;

    .line 6
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzcuq;->zzh(Lcom/google/android/gms/internal/ads/zzezs;)Lcom/google/android/gms/internal/ads/zzcuq;

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzdj:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzb:Lcom/google/android/gms/internal/ads/zzcuq;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzf:Lcom/google/android/gms/internal/ads/zzeca;

    .line 9
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcuq;->zzd(Lcom/google/android/gms/internal/ads/zzeca;)Lcom/google/android/gms/internal/ads/zzcuq;

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzefh;->zza:Lcom/google/android/gms/internal/ads/zzcgw;

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgw;->zzh()Lcom/google/android/gms/internal/ads/zzdms;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzb:Lcom/google/android/gms/internal/ads/zzcuq;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcuq;->zzj()Lcom/google/android/gms/internal/ads/zzcus;

    move-result-object p2

    .line 11
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzdms;->zzd(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzdms;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzefh;->zzc:Lcom/google/android/gms/internal/ads/zzdav;

    .line 12
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzdms;->zzc(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzdms;

    .line 13
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdms;->zze()Lcom/google/android/gms/internal/ads/zzdmt;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdmt;->zzb()Lcom/google/android/gms/internal/ads/zzcsm;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcsm;->zzj()Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcsm;->zzi(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    return-object p1
.end method
