.class final Lcom/google/android/gms/internal/ads/zzckr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdms;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcir;

.field private zzb:Lcom/google/android/gms/internal/ads/zzexa;

.field private zzc:Lcom/google/android/gms/internal/ads/zzewd;

.field private zzd:Lcom/google/android/gms/internal/ads/zzdav;

.field private zze:Lcom/google/android/gms/internal/ads/zzcus;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzckq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckr;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzewd;)Lcom/google/android/gms/internal/ads/zzcuo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckr;->zzc:Lcom/google/android/gms/internal/ads/zzewd;

    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/ads/zzexa;)Lcom/google/android/gms/internal/ads/zzcuo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckr;->zzb:Lcom/google/android/gms/internal/ads/zzexa;

    return-object p0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzdms;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckr;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    return-object p0
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzdms;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckr;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzdmt;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzckr;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    const-class v1, Lcom/google/android/gms/internal/ads/zzdav;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzckr;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    const-class v1, Lcom/google/android/gms/internal/ads/zzcus;

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzckt;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzckr;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzcso;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzcso;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/ads/zzfbe;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzfbe;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzctz;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzctz;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzdqp;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzdqp;-><init>()V

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzckr;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzckr;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzeft;->zza()Lcom/google/android/gms/internal/ads/zzefr;

    move-result-object v10

    iget-object v12, p0, Lcom/google/android/gms/internal/ads/zzckr;->zzb:Lcom/google/android/gms/internal/ads/zzexa;

    iget-object v13, p0, Lcom/google/android/gms/internal/ads/zzckr;->zzc:Lcom/google/android/gms/internal/ads/zzewd;

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v2, v0

    .line 3
    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/internal/ads/zzckt;-><init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzcso;Lcom/google/android/gms/internal/ads/zzfbe;Lcom/google/android/gms/internal/ads/zzctz;Lcom/google/android/gms/internal/ads/zzdqp;Lcom/google/android/gms/internal/ads/zzdav;Lcom/google/android/gms/internal/ads/zzcus;Lcom/google/android/gms/internal/ads/zzefr;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzexa;Lcom/google/android/gms/internal/ads/zzewd;Lcom/google/android/gms/internal/ads/zzcks;)V

    return-object v0
.end method

.method public final bridge synthetic zzh()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzckr;->zze()Lcom/google/android/gms/internal/ads/zzdmt;

    move-result-object v0

    return-object v0
.end method
