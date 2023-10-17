package androidx.room;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
public @interface ColumnInfo
{
  public static final int BINARY = 2;
  public static final int BLOB = 5;
  public static final String INHERIT_FIELD_NAME = "[field-name]";
  public static final int INTEGER = 3;
  public static final int LOCALIZED = 5;
  public static final int NOCASE = 3;
  public static final int REAL = 4;
  public static final int RTRIM = 4;
  public static final int TEXT = 2;
  public static final int UNDEFINED = 1;
  public static final int UNICODE = 6;
  public static final int UNSPECIFIED = 1;
  public static final String VALUE_UNSPECIFIED = "[value-unspecified]";
  
  int collate() default 1;
  
  String defaultValue() default "[value-unspecified]";
  
  boolean index() default false;
  
  String name() default "[field-name]";
  
  int typeAffinity() default 1;
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface Collate {}
  
  @Retention(RetentionPolicy.CLASS)
  public static @interface SQLiteTypeAffinity {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\room\ColumnInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */