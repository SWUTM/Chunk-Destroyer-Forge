
package net.swutm.chunkdestroyer.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.swutm.chunkdestroyer.procedures.ChunkDestroyerTier5BlockDestroyedWithToolProcedure;

public class ChunkDestroyerTier5Item extends PickaxeItem {
	public ChunkDestroyerTier5Item() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 50f;
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
		ChunkDestroyerTier5BlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
