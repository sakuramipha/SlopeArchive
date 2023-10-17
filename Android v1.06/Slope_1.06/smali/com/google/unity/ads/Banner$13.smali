.class Lcom/google/unity/ads/Banner$13;
.super Ljava/lang/Object;
.source "Banner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/Banner;->setPosition(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/unity/ads/Banner;

.field final synthetic val$positionX:I

.field final synthetic val$positionY:I


# direct methods
.method constructor <init>(Lcom/google/unity/ads/Banner;II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            "this$0",
            "val$positionX",
            "val$positionY"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 472
    iput-object p1, p0, Lcom/google/unity/ads/Banner$13;->this$0:Lcom/google/unity/ads/Banner;

    iput p2, p0, Lcom/google/unity/ads/Banner$13;->val$positionX:I

    iput p3, p0, Lcom/google/unity/ads/Banner$13;->val$positionY:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 475
    iget-object v0, p0, Lcom/google/unity/ads/Banner$13;->this$0:Lcom/google/unity/ads/Banner;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/google/unity/ads/Banner;->-$$Nest$fputmPositionCode(Lcom/google/unity/ads/Banner;I)V

    .line 476
    iget-object v0, p0, Lcom/google/unity/ads/Banner$13;->this$0:Lcom/google/unity/ads/Banner;

    iget v1, p0, Lcom/google/unity/ads/Banner$13;->val$positionX:I

    invoke-static {v0, v1}, Lcom/google/unity/ads/Banner;->-$$Nest$fputmHorizontalOffset(Lcom/google/unity/ads/Banner;I)V

    .line 477
    iget-object v0, p0, Lcom/google/unity/ads/Banner$13;->this$0:Lcom/google/unity/ads/Banner;

    iget v1, p0, Lcom/google/unity/ads/Banner$13;->val$positionY:I

    invoke-static {v0, v1}, Lcom/google/unity/ads/Banner;->-$$Nest$fputmVerticalOffset(Lcom/google/unity/ads/Banner;I)V

    .line 478
    iget-object v0, p0, Lcom/google/unity/ads/Banner$13;->this$0:Lcom/google/unity/ads/Banner;

    invoke-static {v0}, Lcom/google/unity/ads/Banner;->-$$Nest$mupdatePosition(Lcom/google/unity/ads/Banner;)V

    return-void
.end method
