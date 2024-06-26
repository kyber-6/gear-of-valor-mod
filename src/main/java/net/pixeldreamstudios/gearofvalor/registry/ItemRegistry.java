package net.pixeldreamstudios.gearofvalor.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.pixeldreamstudios.gearofvalor.GearOfValor;
import net.pixeldreamstudios.gearofvalor.item.armor.sets.*;
import net.pixeldreamstudios.gearofvalor.item.weapon.AncientVanguardShieldItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.AncientVanguardSwordItem;
import net.pixeldreamstudios.gearofvalor.item.weapon.NightRiderAxeItem;

public class ItemRegistry {
    // ARMOR SETS
    public static Item PALADIN_HELMET;
    public static Item PALADIN_CHESTPLATE;
    public static Item PALADIN_LEGGINGS;
    public static Item PALADIN_BOOTS;

    public static Item WOODLAND_SPIRIT_HELMET;
    public static Item WOODLAND_SPIRIT_CHESTPLATE;
    public static Item WOODLAND_SPIRIT_LEGGINGS;
    public static Item WOODLAND_SPIRIT_BOOTS;

    public static Item ARISMAS_AWAKENING_HELMET;
    public static Item ARISMAS_AWAKENING_CHESTPLATE;
    public static Item ARISMAS_AWAKENING_LEGGINGS;
    public static Item ARISMAS_AWAKENING_BOOTS;

    public static Item REAPERS_EMBRACE_HELMET;
    public static Item REAPERS_EMBRACE_CHESTPLATE;
    public static Item REAPERS_EMBRACE_LEGGINGS;
    public static Item REAPERS_EMBRACE_BOOTS;

    public static Item ANCIENT_VANGUARD_HELMET;
    public static Item ANCIENT_VANGUARD_CHESTPLATE;
    public static Item ANCIENT_VANGUARD_LEGGINGS;
    public static Item ANCIENT_VANGUARD_BOOTS;

    public static Item NIGHT_RIDER_HELMET;
    public static Item NIGHT_RIDER_CHESTPLATE;
    public static Item NIGHT_RIDER_LEGGINGS;
    public static Item NIGHT_RIDER_BOOTS;

    // WEAPONS
    public static Item ANCIENT_VANGUARD_SWORD;
    public static Item ANCIENT_VANGUARD_SHIELD;

    public static Item NIGHT_RIDER_AXE;

    static <T extends Item> T item(String id, T c) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(GearOfValor.MOD_ID, id), c);
        return c;
    }

    public static void init() {
        GearOfValor.LOGGER.info("registering items for " + GearOfValor.MOD_ID);

        PALADIN_HELMET = item("paladin_helmet", new PaladinArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        PALADIN_CHESTPLATE = item("paladin_chestplate", new PaladinArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        PALADIN_LEGGINGS = item("paladin_leggings", new PaladinArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        PALADIN_BOOTS = item("paladin_boots", new PaladinArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));

        WOODLAND_SPIRIT_HELMET = item("woodland_spirit_helmet", new WoodlandSpiritArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        WOODLAND_SPIRIT_CHESTPLATE = item("woodland_spirit_chestplate", new WoodlandSpiritArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        WOODLAND_SPIRIT_LEGGINGS = item("woodland_spirit_leggings", new WoodlandSpiritArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        WOODLAND_SPIRIT_BOOTS = item("woodland_spirit_boots", new WoodlandSpiritArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));

        ARISMAS_AWAKENING_HELMET = item("arismas_awakening_helmet", new ArismasAwakeningArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        ARISMAS_AWAKENING_CHESTPLATE = item("arismas_awakening_chestplate", new ArismasAwakeningArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        ARISMAS_AWAKENING_LEGGINGS = item("arismas_awakening_leggings", new ArismasAwakeningArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        ARISMAS_AWAKENING_BOOTS = item("arismas_awakening_boots", new ArismasAwakeningArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));

        REAPERS_EMBRACE_HELMET = item("reapers_embrace_helmet", new ReapersEmbraceArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        REAPERS_EMBRACE_CHESTPLATE = item("reapers_embrace_chestplate", new ReapersEmbraceArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        REAPERS_EMBRACE_LEGGINGS = item("reapers_embrace_leggings", new ReapersEmbraceArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        REAPERS_EMBRACE_BOOTS = item("reapers_embrace_boots", new ReapersEmbraceArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));

        ANCIENT_VANGUARD_HELMET = item("ancient_vanguard_helmet", new AncientVanguardArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        ANCIENT_VANGUARD_CHESTPLATE = item("ancient_vanguard_chestplate", new AncientVanguardArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        ANCIENT_VANGUARD_LEGGINGS = item("ancient_vanguard_leggings", new AncientVanguardArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        ANCIENT_VANGUARD_BOOTS = item("ancient_vanguard_boots", new AncientVanguardArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));

        ANCIENT_VANGUARD_SWORD = item("ancient_vanguard_sword", new AncientVanguardSwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties()));
        ANCIENT_VANGUARD_SHIELD = item("ancient_vanguard_shield", new AncientVanguardShieldItem((new Item.Properties()).durability(672)));

        NIGHT_RIDER_HELMET = item("night_rider_helmet", new NightRiderArmorItem(ArmorItem.Type.HELMET, new FabricItemSettings()));
        NIGHT_RIDER_CHESTPLATE = item("night_rider_chestplate", new NightRiderArmorItem(ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        NIGHT_RIDER_LEGGINGS = item("night_rider_leggings", new NightRiderArmorItem(ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        NIGHT_RIDER_BOOTS = item("night_rider_boots", new NightRiderArmorItem(ArmorItem.Type.BOOTS, new FabricItemSettings()));

        NIGHT_RIDER_AXE = item("night_rider_axe", new NightRiderAxeItem(Tiers.IRON, 3, -2.4F, new Item.Properties()));
    }
}
