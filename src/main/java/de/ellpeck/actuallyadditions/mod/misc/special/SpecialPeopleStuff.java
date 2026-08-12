/*
 * This file ("SpecialPeopleStuff.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * 漏 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.misc.special;

import java.util.Properties;

public final class SpecialPeopleStuff {

    private SpecialPeopleStuff() {
    }

    public static void load() {
        Properties specialProperties = new Properties();

        // Because he's me
        add(specialProperties, "ellpeck", "actuallyadditions:blockAtomicReconstructor");
        // Because he submitted tons of ideas for the mod
        add(specialProperties, "dqmhose", "minecraft:torch");
        // Because he does all of the textures
        add(specialProperties, "twoofeight", "actuallyadditions:blockHeatCollector");
        // Because she is awesome and squids are cool
        add(specialProperties, "larixine", "actuallyadditions:blockBlackLotus");
        // Because he helps me with models and stuff
        add(specialProperties, "canitzp", "actuallyadditions:blockCoffeeMachine");
        // Because he's an awesome guy and helps with lots of stuff
        add(specialProperties, "xdjackiexd", "actuallyadditions:itemDrill@14");
        // Because worms
        add(specialProperties, "bootytoast", "actuallyadditions:itemWorm");
        // Because he does the ActAdd doc on the FTB Wiki
        add(specialProperties, "xbony2", "actuallyadditions:itemBooklet");

        // Patreon stuff
        add(specialProperties, "ftog_thorgal", "actuallyadditions:itemCrystal");
        add(specialProperties, "minetechniker", "actuallyadditions:itemCrystalEmpowered@2");
        add(specialProperties, "3pixel", "actuallyadditions:itemMoreDamageLens");
        add(specialProperties, "kirindave", "actuallyadditions:itemCrystalEmpowered@3");
        add(specialProperties, "theonewhohunts", "actuallyadditions:itemCrystalEmpowered@4");
        add(specialProperties, "garantiertnicht", "actuallyadditions:itemFillingWand");
        add(specialProperties, "heathcliff1998", "actuallyadditions:itemCrystalEmpowered@4");
        add(specialProperties, "saphrym", "actuallyadditions:itemCrystal@3");
        add(specialProperties, "lyxthegamer", "actuallyadditions:itemCrystalEmpowered@4");
        add(specialProperties, "skedone", "actuallyadditions:itemCrystalEmpowered@4");
        add(specialProperties, "r33s3s", "actuallyadditions:itemCrystalEmpowered@2");
        add(specialProperties, "roadrunner116", "actuallyadditions:itemCrystal@4");
        add(specialProperties, "albrechtboucher", "actuallyadditions:itemCrystalEmpowered@2");
        add(specialProperties, "fobok", "actuallyadditions:itemCrystal@4");
        add(specialProperties, "dankfrog", "actuallyadditions:itemCrystalEmpowered@2");
        add(specialProperties, "deanwhufc", "actuallyadditions:itemCrystalEmpowered@2");
        add(specialProperties, "witsend66", "actuallyadditions:itemCrystalEmpowered@1");
        add(specialProperties, "broccoli_bob", "actuallyadditions:itemCrystal@3");
        add(specialProperties, "dolinmyster", "actuallyadditions:itemCrystalEmpowered@4");
        add(specialProperties, "savos_darkran", "actuallyadditions:itemCrystal@4");
        add(specialProperties, "flanks255", "actuallyadditions:itemCrystalEmpowered@3");
        add(specialProperties, "spectacular101", "actuallyadditions:itemCrystal@5");
        add(specialProperties, "scottradish", "actuallyadditions:itemCrystal");
        add(specialProperties, "slothicornstudio", "actuallyadditions:itemCrystalEmpowered@5");
        add(specialProperties, "mecharm", "actuallyadditions:itemCrystal@5");

        SpecialRenderInit.parse(specialProperties);
    }

    private static void add(Properties properties, String playerName, String itemName) {
        properties.setProperty(playerName, itemName);
    }
}
