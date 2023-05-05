
package net.swutm.chunkdestroyer.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.swutm.chunkdestroyer.procedures.ChunkDestroyerTier3BlockDestroyedWithToolProcedure;

public class ChunkDestroyerTier3Item extends PickaxeItem {
	public ChunkDestroyerTier3Item() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 25f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		ChunkDestroyerTier3BlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
