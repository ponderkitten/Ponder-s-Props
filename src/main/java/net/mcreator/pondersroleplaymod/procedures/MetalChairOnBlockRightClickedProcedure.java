package net.mcreator.pondersroleplaymod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;
import net.mcreator.pondersroleplaymod.entity.SeatEntity;

import java.util.Map;
import java.util.Comparator;

public class MetalChairOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PondersRoleplayModModBlocks.METAL_FOLD_UP_CHAIR.get()) {
			if (entity.isShiftKeyDown()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = PondersRoleplayModModBlocks.METAL_FOLDED_UP_CHAIR.get().defaultBlockState();
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
				if (!entity.isPassenger()) {
					if ((new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
								return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(new BlockPos(x, y, z))) == Direction.SOUTH) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"summon ponders_roleplay_mod:seat ~0.5 ~ ~0.5 {Rotation:[0f,0f],Invulnerable:1,NoAI:1,ActiveEffects:[{Id:14,Amplifier:1,Duration:199999980,ShowParticles:0b}]}");
						if (!world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
							entity.startRiding(((Entity) world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)));
						}
					} else if ((new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
								return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(new BlockPos(x, y, z))) == Direction.NORTH) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"summon ponders_roleplay_mod:seat ~0.5 ~ ~0.5 {Rotation:[180f,0f],Invulnerable:1,NoAI:1,ActiveEffects:[{Id:14,Amplifier:1,Duration:199999980,ShowParticles:0b}]}");
						if (!world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
							entity.startRiding(((Entity) world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)));
						}
					} else if ((new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
								return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(new BlockPos(x, y, z))) == Direction.EAST) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"summon ponders_roleplay_mod:seat ~0.5 ~ ~0.5 {Rotation:[270f,0f],Invulnerable:1,NoAI:1,ActiveEffects:[{Id:14,Amplifier:1,Duration:199999980,ShowParticles:0b}]}");
						if (!world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
							entity.startRiding(((Entity) world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)));
						}
					} else if ((new Object() {
						public Direction getDirection(BlockPos pos) {
							BlockState _bs = world.getBlockState(pos);
							Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (property != null && _bs.getValue(property) instanceof Direction _dir)
								return _dir;
							property = _bs.getBlock().getStateDefinition().getProperty("axis");
							if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
								return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
							return Direction.NORTH;
						}
					}.getDirection(new BlockPos(x, y, z))) == Direction.WEST) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"summon ponders_roleplay_mod:seat ~0.5 ~ ~0.5 {Rotation:[90f,0f],Invulnerable:1,NoAI:1,ActiveEffects:[{Id:14,Amplifier:1,Duration:199999980,ShowParticles:0b}]}");
						if (!world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
							entity.startRiding(((Entity) world.getEntitiesOfClass(SeatEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)));
						}
					}
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PondersRoleplayModModBlocks.METAL_FOLDED_UP_CHAIR.get()) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = PondersRoleplayModModBlocks.METAL_FOLD_UP_CHAIR.get().defaultBlockState();
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
