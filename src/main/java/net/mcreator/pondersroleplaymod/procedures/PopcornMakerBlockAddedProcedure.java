package net.mcreator.pondersroleplaymod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.Map;

public class PopcornMakerBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		PondersRoleplayModMod.queueServerWork(3600, () -> {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PondersRoleplayModModBlocks.POPCORN_MAKER_TOP_3.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PondersRoleplayModModBlocks.POPCORN_MAKER_TOP_4.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("popcorn", Math.round(Mth.nextInt(RandomSource.create(), 12, 17)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		});
	}
}
