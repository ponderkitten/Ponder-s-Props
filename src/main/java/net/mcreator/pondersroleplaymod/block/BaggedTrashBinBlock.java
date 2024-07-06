
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

import net.mcreator.pondersroleplaymod.procedures.TrashBinOnBlockRightClickedProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlockEntities;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

public class BaggedTrashBinBlock extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BaggedTrashBinBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return PondersRoleplayModModBlockEntities.BAGGED_TRASH_BIN.get().create(blockPos, blockState);
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
			default -> Shapes.or(box(1, 0, 1, 15, 2, 15), box(2, 2, 14, 15, 16, 15), box(1, 2, 2, 2, 16, 15), box(1, 2, 1, 14, 16, 2), box(14, 2, 1, 15, 16, 14), box(15, 14, 0, 16, 21, 15), box(0, 14, 0, 15, 21, 1), box(0, 14, 1, 1, 21, 16),
					box(0, 14, 15, 16, 21, 16));
			case NORTH -> Shapes.or(box(1, 0, 1, 15, 2, 15), box(1, 2, 1, 14, 16, 2), box(14, 2, 1, 15, 16, 14), box(2, 2, 14, 15, 16, 15), box(1, 2, 2, 2, 16, 15), box(0, 14, 1, 1, 21, 16), box(1, 14, 15, 16, 21, 16), box(15, 14, 0, 16, 21, 15),
					box(0, 14, 0, 16, 21, 1));
			case EAST -> Shapes.or(box(1, 0, 1, 15, 2, 15), box(14, 2, 1, 15, 16, 14), box(2, 2, 14, 15, 16, 15), box(1, 2, 2, 2, 16, 15), box(1, 2, 1, 14, 16, 2), box(0, 14, 0, 15, 21, 1), box(0, 14, 1, 1, 21, 16), box(1, 14, 15, 16, 21, 16),
					box(15, 14, 0, 16, 21, 16));
			case WEST -> Shapes.or(box(1, 0, 1, 15, 2, 15), box(1, 2, 2, 2, 16, 15), box(1, 2, 1, 14, 16, 2), box(14, 2, 1, 15, 16, 14), box(2, 2, 14, 15, 16, 15), box(1, 14, 15, 16, 21, 16), box(15, 14, 0, 16, 21, 15), box(0, 14, 0, 15, 21, 1),
					box(0, 14, 0, 1, 21, 16));
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

		TrashBinOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
