# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.pratyush.numberprogress.NumberProgress {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/pratyush/numberprogress/repack'
-flattenpackagehierarchy
-dontpreverify
-dontwarn