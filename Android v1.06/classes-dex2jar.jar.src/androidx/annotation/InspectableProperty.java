package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface InspectableProperty
{
  int attributeId() default 0;
  
  EnumEntry[] enumMapping() default {};
  
  FlagEntry[] flagMapping() default {};
  
  boolean hasAttributeId() default true;
  
  String name() default "";
  
  ValueType valueType() default ValueType.INFERRED;
  
  @Retention(RetentionPolicy.SOURCE)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface EnumEntry
  {
    String name();
    
    int value();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface FlagEntry
  {
    int mask() default 0;
    
    String name();
    
    int target();
  }
  
  public static enum ValueType
  {
    private static final ValueType[] $VALUES;
    
    static
    {
      ValueType localValueType7 = new ValueType("NONE", 0);
      NONE = localValueType7;
      ValueType localValueType3 = new ValueType("INFERRED", 1);
      INFERRED = localValueType3;
      ValueType localValueType4 = new ValueType("INT_ENUM", 2);
      INT_ENUM = localValueType4;
      ValueType localValueType5 = new ValueType("INT_FLAG", 3);
      INT_FLAG = localValueType5;
      ValueType localValueType1 = new ValueType("COLOR", 4);
      COLOR = localValueType1;
      ValueType localValueType6 = new ValueType("GRAVITY", 5);
      GRAVITY = localValueType6;
      ValueType localValueType2 = new ValueType("RESOURCE_ID", 6);
      RESOURCE_ID = localValueType2;
      $VALUES = new ValueType[] { localValueType7, localValueType3, localValueType4, localValueType5, localValueType1, localValueType6, localValueType2 };
    }
    
    private ValueType() {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\annotation\InspectableProperty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */