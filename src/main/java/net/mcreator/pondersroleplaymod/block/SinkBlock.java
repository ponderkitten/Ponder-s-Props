
package net.mcreator.pondersroleplaymod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.procedures.SinkDrainOnBlockRightClickedProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlockEntities;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

public class SinkBlock extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public SinkBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return PondersRoleplayModModBlockEntities.SINK.get().create(blockPos, blockState);
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(5, 0, 0, 11, 10, 4), box(2, 10, 0, 14, 11, 10), box(2, 11, 3, 3, 13, 10), box(13, 11, 0, 14, 13, 9), box(2, 11, 0, 13, 13, 3), box(7, 13, 1, 9, 16, 2), box(7, 15, 2, 9, 16, 5), box(3, 11, 9, 14, 13, 10));
			case NORTH ->
				Shapes.or(box(5, 0, 12, 11, 10, 16), box(2, 10, 6, 14, 11, 16), box(13, 11, 6, 14, 13, 13), box(2, 11, 7, 3, 13, 16), box(3, 11, 13, 14, 13, 16), box(7, 13, 14, 9, 16, 15), box(7, 15, 11, 9, 16, 14), box(2, 11, 6, 13, 13, 7));
			case EAST -> Shapes.or(box(0, 0, 5, 4, 10, 11), box(0, 10, 2, 10, 11, 14), box(3, 11, 13, 10, 13, 14), box(0, 11, 2, 9, 13, 3), box(0, 11, 3, 3, 13, 14), box(1, 13, 7, 2, 16, 9), box(2, 15, 7, 5, 16, 9), box(9, 11, 2, 10, 13, 13));
			case WEST ->
				Shapes.or(box(12, 0, 5, 16, 10, 11), box(6, 10, 2, 16, 11, 14), box(6, 11, 2, 13, 13, 3), box(7, 11, 13, 16, 13, 14), box(13, 11, 2, 16, 13, 13), box(14, 13, 7, 15, 16, 9), box(11, 15, 7, 14, 16, 9), box(6, 11, 3, 7, 13, 14));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(ANIMATION, FACING);
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
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
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

		SinkDrainOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
