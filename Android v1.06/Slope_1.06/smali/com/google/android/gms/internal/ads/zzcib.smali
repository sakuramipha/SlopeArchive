.class final Lcom/google/android/gms/internal/ads/zzcib;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdfl;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcir;

.field private zzb:Lcom/google/android/gms/internal/ads/zzexa;

.field private zzc:Lcom/google/android/gms/internal/ads/zzewd;

.field private zzd:Lcom/google/android/gms/internal/ads/zzdav;

.field private zze:Lcom/google/android/gms/internal/ads/zzcus;

.field private zzf:Lcom/google/android/gms/internal/ads/zzdfh;

.field private zzg:Lcom/google/android/gms/internal/ads/zzcpa;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzcia;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcib;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzewd;)Lcom/google/android/gms/internal/ads/zzcuo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcib;->zzc:Lcom/google/android/gms/internal/ads/zzewd;

    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/ads/zzexa;)Lcom/google/android/gms/internal/ads/zzcuo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcib;->zzb:Lcom/google/android/gms/internal/ads/zzexa;

    return-object p0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzcpa;)Lcom/google/android/gms/internal/ads/zzdfl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcib;->zzg:Lcom/google/android/gms/internal/ads/zzcpa;

    return-object p0
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/ads/zzdfh;)Lcom/google/android/gms/internal/ads/zzdfl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcib;->zzf:Lcom/google/android/gms/internal/ads/zzdfh;

    return-object p0
.end method

.method public final synthetic zze(Lcom/google/android/gms/internal/ads/zzdav;)Lcom/google/android/gms/internal/ads/zzdfl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcib;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    return-object p0
.end method

.method public final synthetic zzf(Lcom/google/android/gms/internal/ads/zzcus;)Lcom/google/android/gms/internal/ads/zzdfl;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcib;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    return-object p0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzdfm;
    .locals 18

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    const-class v2, Lcom/google/android/gms/internal/ads/zzdav;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzcib;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    const-class v2, Lcom/google/android/gms/internal/ads/zzcus;

    .line 2
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzf:Lcom/google/android/gms/internal/ads/zzdfh;

    const-class v2, Lcom/google/android/gms/internal/ads/zzdfh;

    .line 3
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzg:Lcom/google/android/gms/internal/ads/zzcpa;

    const-class v2, Lcom/google/android/gms/internal/ads/zzcpa;

    .line 4
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcid;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzcib;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzg:Lcom/google/android/gms/internal/ads/zzcpa;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzf:Lcom/google/android/gms/internal/ads/zzdfh;

    new-instance v7, Lcom/google/android/gms/internal/ads/zzcso;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzcso;-><init>()V

    new-instance v8, Lcom/google/android/gms/internal/ads/zzfbe;

    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzfbe;-><init>()V

    new-instance v9, Lcom/google/android/gms/internal/ads/zzctz;

    invoke-direct {v9}, Lcom/google/android/gms/internal/ads/zzctz;-><init>()V

    new-instance v10, Lcom/google/android/gms/internal/ads/zzdqp;

    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/zzdqp;-><init>()V

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzd:Lcom/google/android/gms/internal/ads/zzdav;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzcib;->zze:Lcom/google/android/gms/internal/ads/zzcus;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzeft;->zza()Lcom/google/android/gms/internal/ads/zzefr;

    move-result-object v13

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzb:Lcom/google/android/gms/internal/ads/zzexa;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzcib;->zzc:Lcom/google/android/gms/internal/ads/zzewd;

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object v3, v1

    move-object/from16 v16, v2

    .line 5
    invoke-direct/range {v3 .. v17}, Lcom/google/android/gms/internal/ads/zzcid;-><init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzcpa;Lcom/google/android/gms/internal/ads/zzdfh;Lcom/google/android/gms/internal/ads/zzcso;Lcom/google/android/gms/internal/ads/zzfbe;Lcom/google/android/gms/internal/ads/zzctz;Lcom/google/android/gms/internal/ads/zzdqp;Lcom/google/android/gms/internal/ads/zzdav;Lcom/google/android/gms/internal/ads/zzcus;Lcom/google/android/gms/internal/ads/zzefr;Lcom/google/android/gms/internal/ads/zzezr;Lcom/google/android/gms/internal/ads/zzexa;Lcom/google/android/gms/internal/ads/zzewd;Lcom/google/android/gms/internal/ads/zzcic;)V

    return-object v1
.end method

.method public final bridge synthetic zzh()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcib;->zzg()Lcom/google/android/gms/internal/ads/zzdfm;

    move-result-object v0

    return-object v0
.end method
