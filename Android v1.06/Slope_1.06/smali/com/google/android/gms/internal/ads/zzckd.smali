.class final Lcom/google/android/gms/internal/ads/zzckd;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdep;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcir;

.field private zzb:Lcom/google/android/gms/internal/ads/zzexa;

.field private zzc:Lcom/google/android/gms/internal/ads/zzewd;

.field private zzd:Lcom/google/android/gms/internal/ads/zzdav;

.field private zze:Lcom/google/android/gms/internal/ads/zzcus;

.field private zzf:Lcom/google/android/gms/internal/ads/zzeho;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzckc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckd;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzewd;)Lcom/google/android/gms/internal/ads/zzcuo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckd;->zzc:Lcom/google/android/gms/internal/ads/zzewd;

    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/ads/zzexa;)Lcom/google/android/gms/internal/ads/zzcuo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckd;->zzb:Lcom/google/android/gms/internal/ads/zzexa;

    return-object p0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzeho;)Lcom/google/android/gms/internal/ads/zzdep;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckd;->zzf:Lcom/google/android/gms/internal/ads/zzeho;

    return-object p0
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzdep;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckd;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    return-object p0
.end method

.method public final synthetic zze(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzdep;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckd;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    return-object p0
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzdeq;
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzckd;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    const-class v2, Lcom/google/android/gms/internal/ads/zzdav;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzckd;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    const-class v2, Lcom/google/android/gms/internal/ads/zzcus;

    .line 2
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzckd;->zzf:Lcom/google/android/gms/internal/ads/zzeho;

    const-class v2, Lcom/google/android/gms/internal/ads/zzeho;

    .line 3
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzckf;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzckd;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzcso;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzcso;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzfbe;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzfbe;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/zzctz;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzctz;-><init>()V

    new-instance v8, Lcom/google/android/gms/internal/ads/zzdqp;

    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzdqp;-><init>()V

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzckd;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzckd;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzeft;->zza()Lcom/google/android/gms/internal/ads/zzefr;

    move-result-object v11

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzckd;->zzf:Lcom/google/android/gms/internal/ads/zzeho;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzckd;->zzb:Lcom/google/android/gms/internal/ads/zzexa;

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzckd;->zzc:Lcom/google/android/gms/internal/ads/zzewd;

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object v3, v1

    .line 4
    invoke-direct/range {v3 .. v16}, Lcom/google/android/gms/internal/ads/zzckf;-><init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzcso;Lcom/google/android/gms/internal/ads/zzfbe;Lcom/google/android/gms/internal/ads/zzctz;Lcom/google/android/gms/internal/ads/zzdqp;Lcom/google/android/gms/internal/ads/zzdav;Lcom/google/android/gms/internal/ads/zzcus;Lcom/google/android/gms/internal/ads/zzefr;Lcom/google/android/gms/internal/ads/zzeho;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzexa;Lcom/google/android/gms/internal/ads/zzewd;Lcom/google/android/gms/internal/ads/zzcke;)V

    return-object v1
.end method

.method public final bridge synthetic zzh()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzckd;->zzf()Lcom/google/android/gms/internal/ads/zzdeq;

    move-result-object v0

    return-object v0
.end method
