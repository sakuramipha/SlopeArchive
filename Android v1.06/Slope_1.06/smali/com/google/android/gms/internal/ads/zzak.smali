.class public final Lcom/google/android/gms/internal/ads/zzak;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zzA:I

.field private zzB:I

.field private zzC:I

.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:Ljava/lang/String;

.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:Lcom/google/android/gms/internal/ads/zzca;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:I

.field private zzl:Ljava/util/List;

.field private zzm:Lcom/google/android/gms/internal/ads/zzad;

.field private zzn:J

.field private zzo:I

.field private zzp:I

.field private zzq:F

.field private zzr:I

.field private zzs:F

.field private zzt:[B

.field private zzu:I

.field private zzv:Lcom/google/android/gms/internal/ads/zzs;

.field private zzw:I

.field private zzx:I

.field private zzy:I

.field private zzz:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zze:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzf:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzk:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzn:J

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzo:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzp:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzq:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzs:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzu:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzw:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzx:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzy:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzB:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzC:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzam;Lcom/google/android/gms/internal/ads/zzaj;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzb:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zza:Ljava/lang/String;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzc:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzb:Ljava/lang/String;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzd:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzc:Ljava/lang/String;

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zze:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzd:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzg:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zze:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzh:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzf:I

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzj:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzg:Ljava/lang/String;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzk:Lcom/google/android/gms/internal/ads/zzca;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzh:Lcom/google/android/gms/internal/ads/zzca;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzl:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzi:Ljava/lang/String;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzm:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzj:Ljava/lang/String;

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzn:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzk:I

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzo:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzl:Ljava/util/List;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzp:Lcom/google/android/gms/internal/ads/zzad;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzm:Lcom/google/android/gms/internal/ads/zzad;

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzam;->zzq:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzn:J

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzr:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzo:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzs:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzp:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzt:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzq:F

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzu:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzr:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzv:F

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzs:F

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzw:[B

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzt:[B

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzx:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzu:I

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzy:Lcom/google/android/gms/internal/ads/zzs;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzv:Lcom/google/android/gms/internal/ads/zzs;

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzz:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzw:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzA:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzx:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzB:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzy:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzC:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzz:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzD:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzA:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzam;->zzE:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzak;->zzB:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzam;->zzF:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzC:I

    return-void
.end method

.method static bridge synthetic zzZ(Lcom/google/android/gms/internal/ads/zzak;)Lcom/google/android/gms/internal/ads/zzca;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzh:Lcom/google/android/gms/internal/ads/zzca;

    return-object p0
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzak;)F
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzq:F

    return p0
.end method

.method static bridge synthetic zzaa(Lcom/google/android/gms/internal/ads/zzak;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzg:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic zzab(Lcom/google/android/gms/internal/ads/zzak;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzi:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic zzac(Lcom/google/android/gms/internal/ads/zzak;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zza:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic zzad(Lcom/google/android/gms/internal/ads/zzak;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzb:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic zzae(Lcom/google/android/gms/internal/ads/zzak;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzc:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic zzaf(Lcom/google/android/gms/internal/ads/zzak;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzj:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic zzag(Lcom/google/android/gms/internal/ads/zzak;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzl:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic zzah(Lcom/google/android/gms/internal/ads/zzak;)[B
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzt:[B

    return-object p0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzak;)F
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzs:F

    return p0
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzB:I

    return p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zze:I

    return p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzw:I

    return p0
.end method

.method static bridge synthetic zzf(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzC:I

    return p0
.end method

.method static bridge synthetic zzg(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzz:I

    return p0
.end method

.method static bridge synthetic zzh(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzA:I

    return p0
.end method

.method static bridge synthetic zzi(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzp:I

    return p0
.end method

.method static bridge synthetic zzj(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzk:I

    return p0
.end method

.method static bridge synthetic zzk(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzy:I

    return p0
.end method

.method static bridge synthetic zzl(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzf:I

    return p0
.end method

.method static bridge synthetic zzm(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzr:I

    return p0
.end method

.method static bridge synthetic zzn(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzx:I

    return p0
.end method

.method static bridge synthetic zzo(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzd:I

    return p0
.end method

.method static bridge synthetic zzp(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzu:I

    return p0
.end method

.method static bridge synthetic zzq(Lcom/google/android/gms/internal/ads/zzak;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzo:I

    return p0
.end method

.method static bridge synthetic zzr(Lcom/google/android/gms/internal/ads/zzak;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzn:J

    return-wide v0
.end method

.method static bridge synthetic zzs(Lcom/google/android/gms/internal/ads/zzak;)Lcom/google/android/gms/internal/ads/zzs;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzv:Lcom/google/android/gms/internal/ads/zzs;

    return-object p0
.end method

.method static bridge synthetic zzt(Lcom/google/android/gms/internal/ads/zzak;)Lcom/google/android/gms/internal/ads/zzad;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzak;->zzm:Lcom/google/android/gms/internal/ads/zzad;

    return-object p0
.end method


# virtual methods
.method public final zzA(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzC:I

    return-object p0
.end method

.method public final zzB(Lcom/google/android/gms/internal/ads/zzad;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzm:Lcom/google/android/gms/internal/ads/zzad;

    return-object p0
.end method

.method public final zzC(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzz:I

    return-object p0
.end method

.method public final zzD(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzA:I

    return-object p0
.end method

.method public final zzE(F)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzq:F

    return-object p0
.end method

.method public final zzF(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzp:I

    return-object p0
.end method

.method public final zzG(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public final zzH(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public final zzI(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzl:Ljava/util/List;

    return-object p0
.end method

.method public final zzJ(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzb:Ljava/lang/String;

    return-object p0
.end method

.method public final zzK(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzc:Ljava/lang/String;

    return-object p0
.end method

.method public final zzL(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzk:I

    return-object p0
.end method

.method public final zzM(Lcom/google/android/gms/internal/ads/zzca;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzh:Lcom/google/android/gms/internal/ads/zzca;

    return-object p0
.end method

.method public final zzN(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzy:I

    return-object p0
.end method

.method public final zzO(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzf:I

    return-object p0
.end method

.method public final zzP(F)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzs:F

    return-object p0
.end method

.method public final zzQ([B)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzt:[B

    return-object p0
.end method

.method public final zzR(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzr:I

    return-object p0
.end method

.method public final zzS(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzj:Ljava/lang/String;

    return-object p0
.end method

.method public final zzT(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzx:I

    return-object p0
.end method

.method public final zzU(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzd:I

    return-object p0
.end method

.method public final zzV(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzu:I

    return-object p0
.end method

.method public final zzW(J)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzn:J

    return-object p0
.end method

.method public final zzX(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzo:I

    return-object p0
.end method

.method public final zzY()Lcom/google/android/gms/internal/ads/zzam;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzam;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzam;-><init>(Lcom/google/android/gms/internal/ads/zzak;Lcom/google/android/gms/internal/ads/zzal;)V

    return-object v0
.end method

.method public final zzu(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzB:I

    return-object p0
.end method

.method public final zzv(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zze:I

    return-object p0
.end method

.method public final zzw(I)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzw:I

    return-object p0
.end method

.method public final zzx(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzg:Ljava/lang/String;

    return-object p0
.end method

.method public final zzy(Lcom/google/android/gms/internal/ads/zzs;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzv:Lcom/google/android/gms/internal/ads/zzs;

    return-object p0
.end method

.method public final zzz(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzak;
    .locals 0

    const-string p1, "image/jpeg"

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzak;->zzi:Ljava/lang/String;

    return-object p0
.end method
