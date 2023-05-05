
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.swutm.chunkdestroyer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.swutm.chunkdestroyer.item.ChunkDestroyerTier5Item;
import net.swutm.chunkdestroyer.item.ChunkDestroyerTier4Item;
import net.swutm.chunkdestroyer.item.ChunkDestroyerTier3Item;
import net.swutm.chunkdestroyer.item.ChunkDestroyerTier2Item;
import net.swutm.chunkdestroyer.item.ChunkDestroyerTier1Item;
import net.swutm.chunkdestroyer.chunkdestroyer;

public class ChunkDestroyerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, chunkdestroyer.MOD_ID);
	public static final RegistryObject<Item> CHUNK_DESTROYER_TIER_1 = REGISTRY.register("chunk_destroyer_tier_1",
			() -> new ChunkDestroyerTier1Item());
	public static final RegistryObject<Item> CHUNK_DESTROYER_TIER_2 = REGISTRY.register("chunk_destroyer_tier_2",
			() -> new ChunkDestroyerTier2Item());
	public static final RegistryObject<Item> CHUNK_DESTROYER_TIER_3 = REGISTRY.register("chunk_destroyer_tier_3",
			() -> new ChunkDestroyerTier3Item());
	public static final RegistryObject<Item> CHUNK_DESTROYER_TIER_4 = REGISTRY.register("chunk_destroyer_tier_4",
			() -> new ChunkDestroyerTier4Item());
	public static final RegistryObject<Item> CHUNK_DESTROYER_TIER_5 = REGISTRY.register("chunk_destroyer_tier_5",
			() -> new ChunkDestroyerTier5Item());
}
