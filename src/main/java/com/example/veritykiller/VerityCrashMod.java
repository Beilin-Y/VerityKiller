package com.example.veritykiller;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.forgespi.language.IModInfo;
import java.util.List;

@Mod("veritykiller")
public class VerityCrashMod {
    private static final List<String> BANNED_MODS = List.of(
        "verity", "verityje", "verity_horror", "verityhorror"
    );

    public VerityCrashMod() {
        for (IModInfo mod : ModList.get().getMods()) {
            if (BANNED_MODS.contains(mod.getModId().toLowerCase())) {
                throw new RuntimeException(
                    "§c检测到Verity自动崩溃 [" + mod.getDisplayName() + "]！\n" +
                    "§6恭喜你中大奖了！\n" +
                    "§7(把本模组删掉即可恢复正常)"
                );
            }
        }
    }
            }
