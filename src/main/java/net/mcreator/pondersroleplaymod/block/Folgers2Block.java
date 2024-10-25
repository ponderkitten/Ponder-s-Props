
package net.mcreator.pondersroleplaymod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.procedures.FolgersOnBlockRightClickedProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

import java.util.List;
import java.util.Collections;

public class Folgers2Block extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public Folgers2Block() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(3, 0, 3, 13, 6, 13), box(3, 6, 12, 13, 7, 13), box(3, 6, 3, 13, 7, 4), box(12, 6, 4, 13, 7, 12), box(3, 6, 4, 4, 7, 12));
			case NORTH -> Shapes.or(box(3, 0, 3, 13, 6, 13), box(3, 6, 3, 13, 7, 4), box(3, 6, 12, 13, 7, 13), box(3, 6, 4, 4, 7, 12), box(12, 6, 4, 13, 7, 12));
			case EAST -> Shapes.or(box(3, 0, 3, 13, 6, 13), box(12, 6, 3, 13, 7, 13), box(3, 6, 3, 4, 7, 13), box(4, 6, 3, 12, 7, 4), box(4, 6, 12, 12, 7, 13));
			case WEST -> Shapes.or(box(3, 0, 3, 13, 6, 13), box(3, 6, 3, 4, 7, 13), box(12, 6, 3, 13, 7, 13), box(4, 6, 12, 12, 7, 13), box(4, 6, 3, 12, 7, 4));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(PondersRoleplayModModBlocks.FOLGERS_1.get());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(PondersRoleplayModModBlocks.FOLGERS_1.get()));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		FolgersOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
