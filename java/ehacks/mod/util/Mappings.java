package ehacks.mod.util;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.client.Minecraft;

public class Mappings {
    public static String timer = Mappings.isMCP() ? "timer" : "field_71428_T";
    public static String isInWeb = Mappings.isMCP() ? "isInWeb" : "field_70134_J";
    public static String registerReloadListener = Mappings.isMCP() ? "registerReloadListener" : "func_110542_a";
    public static String chunkListing = Mappings.isMCP() ? "chunkListing" : "field_73237_c";

    private static boolean isMCP() {
        try {
            if (ReflectionHelper.findField(Minecraft.class, (String[])new String[]{"theMinecraft"}) != null) {
                return true;
            }
            return false;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
 