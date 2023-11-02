package fr.roi.jobs.utils;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemUtils {
    public static void  ItemDisplayName(ItemStack itemStack, String name){
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemStack.setItemMeta(itemMeta);
    }
    public static void ItemEnchant(ItemStack itemStack){
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        itemStack.setItemMeta(itemMeta);
    }
    public static void ItemVeritablesEnchant(ItemStack itemStack, Enchantment enchantment, int level){
        EnchantmentStorageMeta meta_rider = (EnchantmentStorageMeta) itemStack.getItemMeta();
        meta_rider.addStoredEnchant(enchantment, level, true);
        itemStack.setItemMeta(meta_rider);
    }
    public static void ItemVeritableEnchant(ItemStack itemStack, Enchantment enchantment, int level){

        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.addEnchant(enchantment, level, true);
        itemStack.setItemMeta(itemMeta);
    }

    public static void ItemDesEnchant(ItemStack itemStack, Enchantment enchantment){
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.removeEnchant(enchantment);
        itemStack.setItemMeta(itemMeta);

    }
    public static void ItemAddLore(int slot, ArrayList lore, Inventory inventory ){
        ItemMeta itemMeta = inventory.getItem(slot).getItemMeta();
        itemMeta.setLore(lore);
        inventory.getItem(slot).setItemMeta(itemMeta);

    }
}
