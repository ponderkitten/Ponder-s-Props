package net.mcreator.pondersroleplaymod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

import java.util.Map;

public class TableLongMiddleCodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((PondersRoleplayModModBlocks.TABLE_LONG.get() == (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() || PondersRoleplayModModBlocks.TABLE_LONG_MIDDLE.get() == (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())
				&& (PondersRoleplayModModBlocks.TABLE_LONG.get() == (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() || PondersRoleplayModModBlocks.TABLE_LONG_MIDDLE.get() == (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())
				|| (PondersRoleplayModModBlocks.TABLE_LONG_MIDDLE.get() == (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() || PondersRoleplayModModBlocks.TABLE_LONG.get() == (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())
						&& (PondersRoleplayModModBlocks.TABLE_LONG_MIDDLE.get() == (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()
								|| PondersRoleplayModModBlocks.TABLE_LONG.get() == (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PondersRoleplayModModBlocks.TABLE_LONG_MIDDLE.get().defaultBlockState();
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
		} else {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PondersRoleplayModModBlocks.TABLE_LONG.get().defaultBlockState();
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
		}
	}
}
